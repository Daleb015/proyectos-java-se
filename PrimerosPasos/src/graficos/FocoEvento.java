package graficos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FocoEvento {

	public static void main(String[] args) {
		MarcoFoco marco1 = new MarcoFoco();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MarcoFoco marco2 = new MarcoFoco();
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	

	}

}

class MarcoFoco extends JFrame
{
	public MarcoFoco()
	{
		setBounds(500,400,710,360);
		setVisible(true);
		LaminaFoco miLamina = new LaminaFoco();
		add(miLamina);
		
		
	}
}

class LaminaFoco extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		setLayout(null);
		cuadro1=new JTextField();
		cuadro2=new JTextField();
		cuadro1.setBounds(120, 10, 150, 20);
		cuadro2.setBounds(120, 50, 150, 20);
		add(cuadro1);
		add(cuadro2);
		LanzaFocos elFoco = new LanzaFocos();
		cuadro1.addFocusListener(elFoco);
		
	}
	
	private class LanzaFocos implements FocusListener
	{

		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("He ganado el foco");
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			// TODO Auto-generated method stub
			
			String email=cuadro1.getText();
			int arroba=0;
			boolean punto=false;
			for(int i=0;i<email.length();i++)
			{
				if(String.valueOf(email.charAt(i)).equalsIgnoreCase("@"))
				{
					arroba++;
					
				}
				if(String.valueOf(email.charAt(i)).equalsIgnoreCase("."))
				{
					punto=true;
					
				}
											
			}
			if(arroba==1&&punto==true)
			{
				System.out.println("correo valido");
			}else
			{
				System.out.print("Correo invalido");
			}
		}
		
	}
	JTextField cuadro1;
	JTextField cuadro2;
}

