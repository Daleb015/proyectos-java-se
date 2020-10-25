package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class EjemploArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoArea mimarco = new MarcoArea();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoArea extends JFrame
{
	public MarcoArea()
	{
		setBounds(500,300,500,300);
		LaminaArea milamina = new LaminaArea();
		add(milamina);
		setVisible(true);
	}
}
class LaminaArea extends JPanel
{
	public LaminaArea()
	{
		area = new JTextArea(8,20);
		JScrollPane laminabarras = new JScrollPane(area);  
		area.setLineWrap(true);
		
		add(laminabarras);
		
		JButton miboton = new JButton("dale");
		miboton.addActionListener(new GestionaArea());
		add(miboton);
	}
	
	private class GestionaArea implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(area.getText());
		}
		
	}
	
	private JTextArea area;
}