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
public class PruebaEventos {

	public static void main(String[] args) {

		MarcoBotones nuevoMarco = new MarcoBotones();
		
		nuevoMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		nuevoMarco.setVisible(true);
				
	}
	
	}

class MarcoBotones extends JFrame
{
	public MarcoBotones ()
	{
		setTitle("Botones y eventos");
		
		setSize(400,400);
		
		setLocation(710,310);
		
		LaminaConEventos milamina = new LaminaConEventos();
		
		add(milamina);
		
				
		}
	
}


class LaminaConEventos extends JPanel 


{
	
	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	
	public LaminaConEventos()
	{
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		ColorFondo Amarillo=new ColorFondo(Color.YELLOW);
		ColorFondo Azul=new ColorFondo(Color.BLUE);
		ColorFondo Rojo=new ColorFondo(Color.RED);
		botonAzul.addActionListener(Azul);
		botonAmarillo.addActionListener(Amarillo);
		botonRojo.addActionListener(Rojo);
		}
	
	private class ColorFondo implements ActionListener{

		public ColorFondo(Color c){
			colorDeFondo=c;
		}
		
		
	public void actionPerformed(ActionEvent e)
	{
		setBackground(colorDeFondo);
	}
	private Color colorDeFondo;
	}

}


	