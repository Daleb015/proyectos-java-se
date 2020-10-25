package graficos;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.Toolkit;

import javax.swing.*;
public class MarcoConColor {

	public static void main(String[] args) {

		Marcos nuevoMarco = new Marcos();
		
		nuevoMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		nuevoMarco.setVisible(true);
		
		Toolkit leerSistema = Toolkit.getDefaultToolkit();
		
		nuevoMarco.setIconImage(leerSistema.getImage("icono.jpg"));

		nuevoMarco.setResizable(false);
	}

}

class Marcos extends JFrame
{
	public Marcos ()
	{
		setTitle("Marco con colores");
		
		setSize(400,400);
		
		Laminas milamina = new Laminas();
		
		add(milamina);
		
		milamina.setBackground(SystemColor.window);
		
		}
	
}


class Laminas extends JPanel
{
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D g2 =(Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		
		g2.setPaint(Color.BLUE.darker());
		
		g2.fill(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		Color micolor = new Color(125,85,70);
		
		
		
		g2.setPaint(micolor);
		
		g2.fill(elipse);
		
		
	}
	
	}