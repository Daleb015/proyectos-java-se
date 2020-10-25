package graficos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class EventoRaton {

	public static void main(String[] args) {
		MarcoRaton marco1 = new MarcoRaton();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoRaton extends JFrame
{
	public MarcoRaton()
	{
		setBounds(500,400,710,360);
		setVisible(true);
		Raton mouse1 = new Raton();
		addMouseMotionListener(mouse1);
		
	}
}

class Raton implements MouseMotionListener
{

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Estas arrrastrando");
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Estas moviendo");
	}
	
	
}