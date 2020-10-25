package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PruebaCombo {

	public static void main(String[] args) {
		MarcoCombo mimarco = new MarcoCombo();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}

class MarcoCombo extends JFrame
{
	public MarcoCombo()
	{
		setBounds(500,300,500,300);
		LaminaCombo milamina = new LaminaCombo();
		add(milamina);
		
	}
}

class LaminaCombo extends JPanel
{
	public LaminaCombo()
	{
		setLayout(new BorderLayout());
		texto=new JLabel("En un lugar de lamancha",JLabel.CENTER);
		texto.setFont(new Font("Serif",Font.PLAIN,18));
		add(texto,BorderLayout.SOUTH);
		JPanel lamina_norte = new JPanel();
		micombo=new JComboBox();
		micombo.setEditable(true);
		micombo.addItem("Serif");
		micombo.addItem("SansSerif");
		micombo.addItem("Monospaced");
		micombo.addItem("Dialog");
		lamina_norte.add(micombo);
		add(lamina_norte,BorderLayout.NORTH);
		micombo.addActionListener(new eventoCombo());
	}
	
	private class eventoCombo implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			texto.setFont(new Font((String)micombo.getSelectedItem(),Font.PLAIN,18));
		}
		
	}
	private JLabel texto;
	private JComboBox micombo;
}