package graficos;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.Toolkit;

import javax.swing.*;
public class TrabajandoConFuentes {

	public static void main(String[] args) {

		MarcoConFuentes nuevoMarco = new MarcoConFuentes();
		
		nuevoMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		nuevoMarco.setVisible(true);
				
	}
	
	

}

class MarcoConFuentes extends JFrame
{
	public MarcoConFuentes ()
	{
		setTitle("Marco con colores");
		
		setSize(400,400);
		
		LaminaConFuentes milamina = new LaminaConFuentes();
		
		add(milamina);
		
		milamina.setForeground(Color.BLUE);
		
		}
	
}


class LaminaConFuentes extends JPanel
{
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D g2 =(Graphics2D) g;
		
		Font mifuente = new Font("Courier", Font.BOLD,26);
		
		g2.setFont(mifuente);
		
		g2.setColor(Color.BLUE);
		
		g2.drawString("Daniellll",100,100);
		
		g2.setFont(new Font("Comic Sans",Font.ITALIC,16));
		
		g2.setColor(new Color(125,40,180));
		
		g2.drawString("Estudiando para ser programar, yo puedo", 10, 120);
		
	}
	
	}