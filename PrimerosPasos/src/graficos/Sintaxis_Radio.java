package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;



public class Sintaxis_Radio {

	public static void main(String[] args) {
		Marco_Radio_Sintaxis mimarco = new Marco_Radio_Sintaxis();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}

class Marco_Radio_Sintaxis extends JFrame
{
	public Marco_Radio_Sintaxis()
	{
		setBounds(500,300,500,300);
		Lamina_Radio_Sintaxis milamina = new Lamina_Radio_Sintaxis();
		add(milamina);
		
	}
}

class Lamina_Radio_Sintaxis extends JPanel
{
	public Lamina_Radio_Sintaxis()
	{
		
		ButtonGroup grupo1 = new ButtonGroup();
		ButtonGroup grupo2 = new ButtonGroup();
		JRadioButton boton1 = new JRadioButton("Azul",false);
		JRadioButton boton2 = new JRadioButton("Rojo",false);
		JRadioButton boton3 = new JRadioButton("Verde",false);
		JRadioButton boton4 = new JRadioButton("Cafe",false);
		JRadioButton boton5 = new JRadioButton("Morado",false);
		grupo1.add(boton1);
		grupo1.add(boton2);
		grupo1.add(boton3);
		grupo2.add(boton4);
		grupo2.add(boton5);
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
		add(boton5);
		
		
	}
	
	
}