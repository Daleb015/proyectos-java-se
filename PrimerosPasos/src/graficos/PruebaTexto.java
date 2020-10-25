package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PruebaTexto {

	public static void main(String[] args) {
		MarcoTexto mimarco = new MarcoTexto();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoTexto extends JFrame
{
	public MarcoTexto()
	{
		setBounds(600,300,600,350);
		LaminaTexto milamina = new LaminaTexto();
		add(milamina);
		setVisible(true);
		
	}
}
	
class LaminaTexto extends JPanel
{
	public LaminaTexto()
	{
		
		setLayout(new BorderLayout());
		JPanel milamina2 = new JPanel();
		milamina2.setLayout(new FlowLayout());
		respuesta=new JLabel("",JLabel.CENTER);
		JLabel texto1 = new JLabel("correo");
		milamina2.add(texto1);
		campo1 = new JTextField(20);
		milamina2.add(campo1);
		JButton boton1 = new JButton("Captura Texto");
		Accion oyente = new Accion();
		boton1.addActionListener(oyente);
		milamina2.add(boton1);
		
		add(respuesta, BorderLayout.CENTER);
		
		add(milamina2,BorderLayout.NORTH);
		
		
		
	}
	private class Accion implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String correo = campo1.getText().trim();
			
			int cantidad = 0;
			for(int i=0;i<correo.length();i++)
			{
				if(correo.charAt(i)=='@')
				{
					
					cantidad++;
				}
			}
			
			if(cantidad!=1)
			{
				
				respuesta.setText("El correo es incorrecto");
				
			}else
			{
				
				respuesta.setText("El correo es correcto");
				
			}
			
			
		}
		
	}
	
	private JTextField campo1;
	private JLabel respuesta;
}


	