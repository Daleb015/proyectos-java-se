package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;



public class PruebaChecks {

	public static void main(String[] args) {
		MarcoCheck mimarco = new MarcoCheck();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}

class MarcoCheck extends JFrame
{
	public MarcoCheck()
	{
		setBounds(500,300,500,300);
		LaminaCheck milamina = new LaminaCheck();
		add(milamina);
		
	}
}

class LaminaCheck extends JPanel
{
	public LaminaCheck()
	{
		setLayout(new BorderLayout());
		Font letra = new Font("serif",Font.PLAIN,24);
		texto = new JLabel("en un lugar de la mancha");
		texto.setFont(letra);
		JPanel laminaTexto = new JPanel();
		laminaTexto.add(texto);
		add(laminaTexto,BorderLayout.CENTER);
		check1 = new JCheckBox("Negrita");
		check2 = new JCheckBox("Cursiva");
		check1.addActionListener(new ManejaChecks());
		check2.addActionListener(new ManejaChecks());
		JPanel laminaChecks = new JPanel();
		laminaChecks.add(check1);
		laminaChecks.add(check2);
		add(laminaChecks, BorderLayout.SOUTH);
	}
	
	private class ManejaChecks implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int tipo=0;
			if(check1.isSelected())tipo+=Font.BOLD;

			if(check2.isSelected()) tipo+=Font.ITALIC;
			
			texto.setFont(new Font("Serif",tipo,24));
		}
		
	}
	
	private JLabel texto;
	private JCheckBox check1,check2;
}