package graficos;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MarcoMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuFrame mimarco = new MenuFrame();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MenuFrame extends JFrame
{
	public MenuFrame()
	{
		setBounds(500,300,550,400);
		MenuLamina milamina = new MenuLamina();
		add(milamina);
		setVisible(true);
	}
}

class MenuLamina extends JPanel
{
	public MenuLamina()
	{
		JMenuBar barra = new JMenuBar(); 
		JMenu archivo = new JMenu("Archivo");
		JMenu edicion = new JMenu("Edicion");
		JMenu herramientas = new JMenu("Herramientas");
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem guardarComo = new JMenuItem("Guardar Como");
		JMenuItem cortar = new JMenuItem("Cortar",new ImageIcon("bin/graficos/cortar.gif"));
		JMenuItem copiar = new JMenuItem("Copiar",new ImageIcon("bin/graficos/copiar.gif"));
		copiar.setHorizontalTextPosition(SwingConstants.LEFT);
		JMenuItem pegar = new JMenuItem("Pegar",new ImageIcon("bin/graficos/pegar.gif"));
		JMenu opciones = new JMenu("Opciones");
		JMenuItem prueba = new JMenuItem("Prueba");
		JMenuItem generales = new JMenuItem("Generales");
		barra.add(archivo);
		barra.add(edicion); 
		barra.add(herramientas);
		archivo.add(guardar);
		archivo.add(guardarComo);
		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(pegar);
		edicion.addSeparator();
		edicion.add(opciones);
		opciones.add(prueba);
		herramientas.add(generales);
		
		add(barra);
		
	}
}