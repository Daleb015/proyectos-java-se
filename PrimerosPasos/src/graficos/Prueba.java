package graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;



public class Prueba {

	public static void main(String[] args) {
		MarcoPrueba1 mimarco = new MarcoPrueba1();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}

class MarcoPrueba1 extends JFrame
{
	public MarcoPrueba1()
	{
		setBounds(500,300,500,300);
		LaminaPrueba milamina = new LaminaPrueba();
		add(milamina);
		
	}
}

class LaminaPrueba extends JPanel
{
	public LaminaPrueba()
	{
		JTextField micampo = new JTextField(20);
		add(micampo);
		EscuchaTexto lector = new EscuchaTexto();
		Document d1 = micampo.getDocument();
		d1.addDocumentListener(lector);
	}
	private class EscuchaTexto implements DocumentListener
	{

		@Override
		public void changedUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("Has insertado texto");
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("GHas borrado texto");
		}
		
	}
}