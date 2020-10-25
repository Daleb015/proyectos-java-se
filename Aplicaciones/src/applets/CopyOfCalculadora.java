package applets;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CopyOfCalculadora extends JApplet {

	public void init() {

		//setTitle("Calculadora");
		//setBounds(810,290,300,500);
		JFrame mimarco=new JFrame();
		mimarco.setSize(500,300);
		
		Pantalla2 nuevapantalla = new Pantalla2();
		mimarco.add(nuevapantalla);
		JButton botonCrear = new JButton("Calculadora");
		botonCrear.addActionListener(new ActionListener(){

			
			public void actionPerformed(ActionEvent e) {
				mimarco.setVisible(!mimarco.isVisible());
				
			}});
		add(botonCrear);
	}

}

/*class Marco_Calculadora extends JFrame
{
	public Marco_Calculadora()
	{
		
		setTitle("Calculadora");
		setBounds(810,290,300,500);
		Pantalla1 nuevapantalla = new Pantalla1();
		add(nuevapantalla);
		
	}
}*/

class Pantalla2 extends JPanel
{
	public Pantalla2()
	{
		principio = true;
		setLayout(new BorderLayout());
		
		Display = new JButton("0");
		
		Display.setEnabled(false);
		
		add(Display,BorderLayout.NORTH);
		
		Pantalla2 = new JPanel();
		
		Pantalla2.setLayout(new GridLayout(4,4));
		ActionListener insertar = new InsertaNumero1();
		ActionListener orden=new AccionOrden1();
		ponerBoton1("7",insertar);
		ponerBoton1("8",insertar);
		ponerBoton1("9",insertar);
		ponerBoton1("X",orden);
		ponerBoton1("4",insertar);
		ponerBoton1("5",insertar);
		ponerBoton1("6",insertar);
		ponerBoton1("-",orden);
		ponerBoton1("1",insertar);
		ponerBoton1("2",insertar);
		ponerBoton1("3",insertar);
		ponerBoton1("+",orden);
		ponerBoton1("+-",orden);
		ponerBoton1("0",insertar);
		ponerBoton1(",",orden);
		ponerBoton1("=",orden);
		
		add(Pantalla2, BorderLayout.CENTER);
		
		ultimaOperacion="=";
		
		
		
	}
	
	private void ponerBoton1(String Rotulo, ActionListener oyente)
	{
		JButton boton = new JButton(Rotulo);
		boton.addActionListener(oyente);
		Pantalla2.add(boton);
		
	}
	
	private class InsertaNumero1 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String entrada=e.getActionCommand(); 
			
			if(principio)
			{
				Display.setText("");
				principio=false;
			}
			Display.setText(Display.getText()+entrada);
		}
		
	}
	
	private class AccionOrden1 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			String operacion = e.getActionCommand();
			
			calcular(Double.parseDouble(Display.getText()));
			
			ultimaOperacion=operacion;
			principio=true;
			
			
		}
		
		public void calcular (double x)
		{
			if(ultimaOperacion.equals("+"))
			{
				resultado+=x;
			}
			else if(ultimaOperacion.equals("-"))
			{resultado-=x;}
			else if(ultimaOperacion.equals("*"))
			{resultado*=x;}
			else if(ultimaOperacion.equals("/"))
			{resultado/=x;}
			else if(ultimaOperacion.equals("="))
			{resultado=x;}
			Display.setText(""+resultado);
		}
		
	}
	
	
	private JPanel Pantalla2;
	private JButton Display;
	private boolean principio;
	private double resultado;
	private String ultimaOperacion;
}



