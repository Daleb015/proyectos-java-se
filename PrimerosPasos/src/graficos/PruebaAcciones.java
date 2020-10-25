package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class PruebaAcciones {

	public static void main(String[] args) {
		
		 MarcoAcciones marco1 = new MarcoAcciones();
		 marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 marco1.setVisible(true);

	}

}

class MarcoAcciones extends JFrame
{
	
	 public MarcoAcciones()
	 {
		 setSize(800,500);
		 setTitle("Marco");
		 setLocation(500,300);
		 LaminaAcciones miLamina = new LaminaAcciones();
		 add(miLamina);
		 
		 
	 }
	
}

class LaminaAcciones extends JPanel
{
	public LaminaAcciones()
	{
		
		AccionColor accionAmarillo=new AccionColor("Amarillo", new ImageIcon("Amarillo.gif"),Color.YELLOW);
		AccionColor accionRojo=new AccionColor("Rojo", new ImageIcon("Rojo.gif"),Color.RED);
		AccionColor accionAzul=new AccionColor("Azul", new ImageIcon("Azul.gif"),Color.BLUE);
		
		
		
		add(new JButton (accionAmarillo));
		add(new JButton (accionRojo));
		add(new JButton (accionAzul));
		
		
		
		InputMap mapa = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		//KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("crtl A");
		
		mapa.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillo");
		mapa.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
		mapa.put(KeyStroke.getKeyStroke("ctrl C"), "fondo_rojo");
		
		ActionMap mapaAccion=getActionMap();
		
		mapaAccion.put("fondo_amarillo", accionAmarillo);
		mapaAccion.put("fondo_azul", accionAzul);
		mapaAccion.put("fondo_rojo", accionRojo);
		
	}
	
	private class AccionColor extends AbstractAction
	{

		public AccionColor(String nombre, Icon icono,Color color_boton)
		{
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION,"Poner la lámina de color "+nombre);
			putValue("color_de_Fondo",color_boton);
		}
		
		public void actionPerformed(ActionEvent e) {
			
			Color c = (Color)getValue("color_de_Fondo");
			
			setBackground(c);
			
			System.out.println("El nombre del boton es"+getValue(Action.NAME));
			
		}
		
	}
}


