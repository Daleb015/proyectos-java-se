package graficos;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MarcoSliders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame_Sliders mimarco = new Frame_Sliders();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}

class Frame_Sliders extends JFrame
{
	public Frame_Sliders()
	{
		setBounds(550,400,550,350);
		Lamina_Sliders milamina=new Lamina_Sliders();
		add(milamina);
		setVisible(true);
	}
}

class Lamina_Sliders extends JPanel
{
	public Lamina_Sliders()
	{
		setLayout(new BorderLayout());
		rotulo = new JLabel("En un lugar de la mancha",JLabel.CENTER);
		add(rotulo,BorderLayout.CENTER);
		control = new JSlider(10,50,10);
		control.setMajorTickSpacing(20);
		control.setMinorTickSpacing(5);
		control.setPaintLabels(true);
		control.setPaintTicks(true);
		control.setFont(new Font("Serif",Font.ITALIC,10));
		control.addChangeListener(new EventoSlider());
		JPanel lamina_Slider = new JPanel();
				
		lamina_Slider.add(control);
		add(lamina_Slider,BorderLayout.NORTH);
	}
	
	private class EventoSlider implements ChangeListener
	{

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			
			rotulo.setFont(new Font("Serif",Font.BOLD,control.getValue()));
			
		}
		
	}
	private static int contador;
	private JLabel rotulo;
	private JSlider control;
}