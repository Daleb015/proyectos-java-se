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



public class Ejemplo_Radio {

	public static void main(String[] args) {
		Marco_Radio mimarco = new Marco_Radio();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}

class Marco_Radio extends JFrame
{
	public Marco_Radio()
	{
		setBounds(500,300,500,300);
		Lamina_Radio milamina = new Lamina_Radio();
		add(milamina);
		
	}
}

class Lamina_Radio extends JPanel
{
	public Lamina_Radio()
	{
		setLayout(new BorderLayout());
		
		texto = new JLabel("En un lugar de la mancha",JLabel.CENTER);
	
		add(texto, BorderLayout.CENTER);
		
		lamina_botones=new JPanel();
		migrupo=new ButtonGroup();
		
		texto.setFont(new Font("Serif",Font.PLAIN,10));
		
		colocarBotones("1",false,10);
		colocarBotones("2",true,15);
		colocarBotones("3",false,20);
		colocarBotones("4",false,30);
		
		add(lamina_botones,BorderLayout.SOUTH);
		
		/*ButtonGroup migrupo = new ButtonGroup();
		boton1=new JRadioButton("Pequeño",false);
		boton2=new JRadioButton("Mediano",true);
		boton3=new JRadioButton("Grande",false);
		boton4=new JRadioButton("Muy Grande",false);
		migrupo.add(boton1);
		migrupo.add(boton2);
		migrupo.add(boton3);
		migrupo.add(boton4);
		boton1.addActionListener(new Evento_Radio());
		boton2.addActionListener(new Evento_Radio());
		boton3.addActionListener(new Evento_Radio());
		boton4.addActionListener(new Evento_Radio());
		JPanel laminaBotones = new JPanel();
		laminaBotones.add(boton1);
		laminaBotones.add(boton2);
		laminaBotones.add(boton3);
		laminaBotones.add(boton4);
		add(laminaBotones,BorderLayout.SOUTH);*/
	}
	
	public void colocarBotones(String nombre, boolean seleccionado, int tamagno)
	{
		JRadioButton boton = new JRadioButton(nombre, seleccionado);
		migrupo.add(boton);
		lamina_botones.add(boton);
		ActionListener mievento = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				texto.setFont(new Font("Serif",Font.PLAIN,tamagno));
			}
			
		};
		boton.addActionListener(mievento);
	}
	/*private class Evento_Radio implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==boton1)
			{
				texto.setFont(new Font("Serif",Font.PLAIN,10));
			}else if(e.getSource()==boton2)
			{
				texto.setFont(new Font("Serif",Font.PLAIN,15));
			}else if(e.getSource()==boton3)
			{
				texto.setFont(new Font("Serif",Font.PLAIN,20));
			}else {texto.setFont(new Font("Serif",Font.PLAIN,30));}
		}
		
	}*/
	private JPanel lamina_botones;
	private ButtonGroup migrupo;
	private JLabel texto;
	private JRadioButton boton1, boton2, boton3 , boton4;
}