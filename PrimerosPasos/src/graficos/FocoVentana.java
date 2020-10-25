package graficos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

public class FocoVentana extends JFrame implements WindowFocusListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FocoVentana nuevo = new FocoVentana();
		nuevo.iniciar();
	}
	
	public void iniciar()
	{
				marco1=new FocoVentana();
				marco2=new FocoVentana();
				marco1.setVisible(true);
				marco2.setVisible(true);
				marco1.setBounds(300,100,600,350);
				marco2.setBounds(1000,100,600,350);
				marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				marco1.addWindowFocusListener(this);
				marco2.addWindowFocusListener(this);
	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		
		Object evento = e.getSource();
		if(evento==marco1)
		{
			marco1.setTitle("Tengo el foco");
		}else{marco2.setTitle("Tengo ahora el foco");}
		
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		Object evento = e.getSource();
		if(evento==marco2)
		{
			marco2.setTitle("Perdi el foco");
		}else{marco1.setTitle("Perdi el foco");}
	}
	
	FocoVentana marco1;
	FocoVentana marco2;

}
