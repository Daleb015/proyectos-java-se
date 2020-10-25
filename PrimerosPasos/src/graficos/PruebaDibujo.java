package graficos;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;
public class PruebaDibujo {

	public static void main(String[] args) {

		MarcoConDibujos nuevoMarco = new MarcoConDibujos();
		
		nuevoMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Lamina1 dibujar = new Lamina1();
		
		nuevoMarco.add(dibujar);

	}

}

class MarcoConDibujos extends JFrame
{
	public MarcoConDibujos ()
	{
		setTitle("Marco con dibujos");
		
		setVisible(true);
		
		setSize(400,400);
		
		setLocation(710,310);
		
		setResizable(false);
		
		}
	
}


class Lamina1 extends JPanel
{
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D g2 =(Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		
		g2.draw(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		g2.draw(elipse);
		
		g2.draw(new Line2D.Double(100,100,300,250));
		
		
		double centroenX=rectangulo.getCenterX();
		
		double CentroenY=rectangulo.getCenterY();
		
		double radio=150;
		
		Ellipse2D circulo=new Ellipse2D.Double();
		
		circulo.setFrameFromCenter(centroenX, CentroenY,centroenX+radio,CentroenY+radio);
		
		g2.draw(circulo);
	}
	
	}