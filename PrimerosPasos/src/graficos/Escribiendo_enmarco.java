package graficos;
import javax.swing.*;
import java.awt.*;


public class Escribiendo_enmarco {

	public static void main(String[] args) {
		
		Marcoprueba primerMarco = new Marcoprueba();
		
		primerMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

	}

}

class Marcoprueba extends JFrame
{
	public Marcoprueba ()
	{
		setVisible(true);
		
		setSize(500,300);
		
		setLocation(710,310);
		
		setResizable(false);
		
		Lamina miLamina1 = new Lamina();
		
		add(miLamina1);
		
		}
	
}

class Lamina extends JPanel
{
	
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawString("Daniel", 100, 100);
	}
	
}