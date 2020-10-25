package graficos;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculadora {

	public static void main(String[] args) {

		Marco_Calculadora calculadora = new Marco_Calculadora();
		calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculadora.setVisible(true);
	}

}

class Marco_Calculadora extends JFrame
{
	public Marco_Calculadora()
	{
		
		setTitle("Calculadora");
		setBounds(810,290,300,500);
		Pantalla1 nuevapantalla = new Pantalla1();
		add(nuevapantalla);
		
	}
}

class Pantalla1 extends JPanel
{
	public Pantalla1()
	{
		principio = true;
		setLayout(new BorderLayout());
		
		Display = new JButton("0");
		
		Display.setEnabled(false);
		
		add(Display,BorderLayout.NORTH);
		
		Pantalla2 = new JPanel();
		
		Pantalla2.setLayout(new GridLayout(4,4));
		ActionListener insertar = new InsertaNumero();
		ActionListener orden=new AccionOrden();
		ponerBoton("7",insertar);
		ponerBoton("8",insertar);
		ponerBoton("9",insertar);
		ponerBoton("X",orden);
		ponerBoton("4",insertar);
		ponerBoton("5",insertar);
		ponerBoton("6",insertar);
		ponerBoton("-",orden);
		ponerBoton("1",insertar);
		ponerBoton("2",insertar);
		ponerBoton("3",insertar);
		ponerBoton("+",orden);
		ponerBoton("+-",orden);
		ponerBoton("0",insertar);
		ponerBoton(",",orden);
		ponerBoton("=",orden);
		
		add(Pantalla2, BorderLayout.CENTER);
		
		ultimaOperacion="=";
		
		
		
	}
	
	private void ponerBoton(String Rotulo, ActionListener oyente)
	{
		JButton boton = new JButton(Rotulo);
		boton.addActionListener(oyente);
		Pantalla2.add(boton);
		
	}
	
	private class InsertaNumero implements ActionListener
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
	
	private class AccionOrden implements ActionListener
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



