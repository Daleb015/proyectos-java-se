package graficos;
import java.awt.*;
import javax.imageio.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.Toolkit;
import java.io.*;

import javax.swing.*;
public class PruebaImagenes {

	public static void main(String[] args) {

		MarcoConImagenes nuevoMarco = new MarcoConImagenes();
		
		nuevoMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		nuevoMarco.setVisible(true);
				
	}
	
	}

class MarcoConImagenes extends JFrame
{
	public MarcoConImagenes ()
	{
		setTitle("Marco con colores");
		
		setSize(400,400);
		
		setLocation(710,310);
		
		LaminaConImagenes milamina = new LaminaConImagenes();
		
		add(milamina);
		
				
		}
	
}


class LaminaConImagenes extends JPanel


{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		File  miimagen=new File("src/graficos/stark.jpg");
		
		try{
		imagen=ImageIO.read(miimagen);
		}
		catch(IOException e){ System.out.println("La imagen no está");}
		
		int anchoImagen=imagen.getWidth(this);
		int alturaImagen=imagen.getHeight(this);
		
		g.drawImage(imagen,50, 10,300,300, null,null);
		
		for(int i=0;i<300;i++)
		{
			for(int j=0;j<200;j++)
			{
				g.copyArea(0, 0, anchoImagen, alturaImagen, anchoImagen*i, alturaImagen*j);
			}
		}
		
		}
	
	private Image imagen;
	
	}