package graficos;
import java.awt.*;
import java.awt.event.ActionEvent;

import javax.imageio.*;

import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.Toolkit;
import java.io.*;

import javax.swing.*;
public class PruebasEventos {

	public static void main(String[] args) {

		MarcoconBotones nuevoMarco = new MarcoconBotones();
		
		nuevoMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		nuevoMarco.setVisible(true);
				
	}
	
	}

class MarcoconBotones extends JFrame
{
	public MarcoconBotones ()
	{
		setTitle("Botones y eventos");
		
		setSize(400,400);
		
		setLocation(710,310);
		
		LaminaBotones milamina = new LaminaBotones();
		
		add(milamina);
		
				
		}
	
}


class LaminaBotones extends JPanel 


{
	
	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	
	public LaminaBotones()
	{
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		
		colorDeFondo amarillo = new colorDeFondo(Color.YELLOW);
		colorDeFondo Azul = new colorDeFondo(Color.BLUE);
		colorDeFondo Rojo = new colorDeFondo(Color.RED);
		botonAzul.addActionListener(Azul);
		botonAmarillo.addActionListener(amarillo);
		botonRojo.addActionListener(Rojo);
	}
	
	
	private class colorDeFondo implements ActionListener
	{
		
		public colorDeFondo(Color c)
		{
			colorDeFondo=c;
		}
		public void actionPerformed(ActionEvent e)
		{
			setBackground(colorDeFondo);
			
		}
		
		private Color colorDeFondo;
	}	
		
	}
	

	
	
	
