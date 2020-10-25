package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Varios_oyentes {

	public static void main(String[] args) {

		Marco_Principal mimarco = new Marco_Principal();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}

class Marco_Principal extends JFrame
{
	public Marco_Principal()
	{
		setTitle("Prueba varios");
		setBounds(300,400,600,300);
		Lamina_Principal lamina = new Lamina_Principal();
		add(lamina);
		
	}
	}

class Lamina_Principal extends JPanel
{
	public Lamina_Principal()
	{
		JButton boton_nuevo = new JButton("Nuevo");
		add(boton_nuevo);
		boton_cerrar=new JButton("Cerrar todo");
		add(boton_cerrar);
		OyenteNuevo mioyente = new OyenteNuevo();
		boton_nuevo.addActionListener(mioyente);
		
	}
	
	private class OyenteNuevo implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Marco_Emergente marco = new Marco_Emergente(boton_cerrar);
			marco.setVisible(true);
			
		}
		
	}
	
	JButton boton_cerrar;
}

class Marco_Emergente extends JFrame
{
	public Marco_Emergente(JButton boton_de_Principal)
	{
		contador++;
		setTitle("Ventana "+contador);
		setBounds(40*contador,40*contador,300,150);
		CierraTodos oyenteCerrar = new CierraTodos();
		boton_de_Principal.addActionListener(oyenteCerrar);
	}
	
	private class CierraTodos implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			dispose();
			
		}
		
	}
	private static int contador=0;
}



