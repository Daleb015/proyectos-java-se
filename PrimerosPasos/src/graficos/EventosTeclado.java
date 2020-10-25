package graficos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EventosTeclado {

	public static void main(String[] args) {
		MarcoTeclado marco1 = new MarcoTeclado();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoTeclado extends JFrame
{
	public MarcoTeclado()
	{
		setBounds(500,400,710,360);
		setVisible(true);
		EventoTeclado tecla = new EventoTeclado();
		addKeyListener(tecla);
	}
}

class EventoTeclado implements KeyListener
{

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int codigo =e.getKeyCode();
		
		System.out.println(codigo);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());
	}
	
}