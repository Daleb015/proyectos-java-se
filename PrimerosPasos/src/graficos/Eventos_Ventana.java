package graficos;

import javax.swing.JFrame;

import java.awt.event.*;

public class Eventos_Ventana {

	public static void main(String[] args) {
		
		 MarcoVentana marco1 = new MarcoVentana();
		 marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 MarcoVentana marco2 = new MarcoVentana();
		 marco1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}

class MarcoVentana extends JFrame
{
	public MarcoVentana()
	{
		setTitle("Marco");
		setSize(500,300);
		setLocation(710,310);
		setVisible(true);
		/*M_Ventana oyente = new M_Ventana();
		addWindowListener(oyente);*/
		
		addWindowListener(new M_Ventana());
	}
}

class M_Ventana extends WindowAdapter
{

	
	public void windowIconified(WindowEvent e) {
		
		System.out.println("Se ha cerrado la ventana");
		
	}

	
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana abierta");
	}

	
}