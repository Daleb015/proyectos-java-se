package vista;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.*;

import javax.swing.*;

import controlador.ControladorBotonEjecuta;
import controlador.ControladorCargaMenus;



public class Marco extends JFrame{
	public Marco(){
		setTitle ("Consulta BBDD");
		setBounds(500,300,400,400);
		setLayout(new BorderLayout());
		JPanel menus=new JPanel();
		menus.setLayout(new FlowLayout());
		secciones=new JComboBox();
		secciones.setEditable(false);
		secciones.addItem("Todos");
		paises=new JComboBox();
		paises.setEditable(false);
		paises.addItem("Todos");
		resultado= new JTextArea(4,50);
		resultado.setEditable(false);
		add(resultado);
		menus.add(secciones);
		menus.add(paises);	
		add(menus, BorderLayout.NORTH);
		add(resultado, BorderLayout.CENTER);
		JButton botonConsulta=new JButton("Consulta");
		botonConsulta.addActionListener(new ControladorBotonEjecuta(this));
		add(botonConsulta, BorderLayout.SOUTH);
		addWindowListener(new ControladorCargaMenus(this));
		}
	public JComboBox secciones;
	public JComboBox paises;
	public JTextArea resultado;	
}