package graficos;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class MarcoSpinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			FrameSpinner mimarco = new FrameSpinner();
			mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			mimarco.setVisible(true);
	}

}

class FrameSpinner extends JFrame
{
	public FrameSpinner()
	{
		setBounds(550,350,550,350);
		setVisible(true);
		add(new LaminaSpinner());
	}
}

class LaminaSpinner extends JPanel
{
	public LaminaSpinner()
	{
		
		//String[]lista=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		JSpinner control = new JSpinner(new SpinnerNumberModel(5,0,10,1){
			
			public Object getNextValue()
			{
				return super.getPreviousValue();
			}
			public Object getPreviousValue()
			{
				return super.getNextValue();
			}
		});
		control.setPreferredSize(new Dimension(150,40));
		add(control);
		
		
		
	}
	
	/*private class MiModeloJSpinner extends SpinnerNumberModel
	{
		public MiModeloJSpinner()
		{
			super(5,0,10,1);
			
		}
		
		public Object getNextValue()
		{
			return super.getPreviousValue();
		}
		public Object getPreviousValue()
		{
			return super.getNextValue();
		}
	}*/
}