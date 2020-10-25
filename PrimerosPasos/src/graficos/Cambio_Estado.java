package graficos;

import javax.swing.JFrame;

import java.awt.Frame;
import java.awt.event.*;



public class Cambio_Estado {

	public static void main(String[] args) {
		
		MarcoEstado marco1 = new MarcoEstado();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoEstado extends JFrame
{
	
	public MarcoEstado()
	{
		
		setBounds(500,400,731,360);
		setVisible(true);
		addWindowStateListener(new CambioEstado());
		addWindowListener(new Cambio());
		
		
	}

}

class CambioEstado implements WindowStateListener
{
	
	public void windowStateChanged(WindowEvent e)
	{
		System.out.println("Ha cambiado de estado");
		if(e.getNewState()==Frame.NORMAL)
		{
			System.out.println("El estado es normal");
		}else if(e.getNewState()==Frame.MAXIMIZED_BOTH)
		{
			System.out.println("La pantalla está maximizada");
		}
	}
	
}

class Cambio extends WindowAdapter
{
	
	public void windowActivated(WindowEvent e)
	{
		System.out.println("se ha activado la ventana");
	}
	
}