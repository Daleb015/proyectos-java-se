package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;



public class CampoPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoPassword mimarco = new MarcoPassword();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoPassword extends JFrame
{
	public MarcoPassword()
	{
		setBounds(400,300,550,400);
		LaminaPassword milamina = new LaminaPassword();
		add(milamina);
		setVisible(true);
	}
}

class LaminaPassword extends JPanel
{
	public LaminaPassword()
	{
		setLayout(new BorderLayout());
		JPanel milamina2 = new JPanel();
		milamina2.setLayout(new GridLayout(2,2));
		add(milamina2,BorderLayout.NORTH);
		
		JLabel nombre = new JLabel("Usuario",JLabel.CENTER);
		JLabel contra = new JLabel("Contraseña",JLabel.CENTER);
		Comprueba_pass nuevo = new Comprueba_pass();
		
		JTextField c_usuario=new JTextField(20);
		c_contra=new JPasswordField(20);
		Document archivo = c_contra.getDocument();
		archivo.addDocumentListener(nuevo);
		milamina2.add(nombre);
		milamina2.add(c_usuario);
		milamina2.add(contra);
		milamina2.add(c_contra);
		JButton enviar = new JButton("Enviar");
		add(enviar,BorderLayout.SOUTH);
		
	}
	
	private class Comprueba_pass implements DocumentListener
	{

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			char[] contrasena;
			contrasena = c_contra.getPassword();
			if(contrasena.length<8 || contrasena.length>12)
			{
				c_contra.setBackground(Color.RED);
			}else{
				c_contra.setBackground(Color.WHITE);
			}
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			char[] contrasena;
			contrasena = c_contra.getPassword();
			if(contrasena.length<8 || contrasena.length>12)
			{
				c_contra.setBackground(Color.RED);
			}else{
				c_contra.setBackground(Color.WHITE);
			}
		}
		
	}
	
	JPasswordField c_contra;
}