package graficos;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LibreDisposicion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoLibre mimarco = new MarcoLibre();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
class MarcoLibre extends JFrame{
	public MarcoLibre(){
		setBounds(450,350,600,400);
		LaminaLibre milamina = new LaminaLibre();
		add(milamina);
		setVisible(true);
	}
}
class LaminaLibre extends JPanel{
	public LaminaLibre(){
		setLayout(new EnColumnas());
		JLabel nombre = new JLabel("Nombre: ");
		JLabel telefono = new JLabel("Telefono: ");
		JLabel apellido = new JLabel("Apellido: ");
		JTextField c_nombre = new JTextField();
		JTextField c_telefono = new JTextField();
		JTextField c_apellido = new JTextField();
		JLabel edad= new JLabel("Edad: ");
		JTextField c_edad = new JTextField();
		/*nombre.setBounds(40,40,80,10);
		c_nombre.setBounds(100, 40, 100, 15);
		apellido.setBounds(40, 60, 80, 10);
		c_apellido.setBounds(100, 60, 100, 15);*/
		add(nombre);
		add(c_nombre);
		add(apellido);
		add(c_apellido);
		add(edad);
		add(c_edad);
		add(telefono);
		add(c_telefono);
		
		
	}
}

class EnColumnas implements LayoutManager{

	@Override
	public void addLayoutComponent(String arg0, Component arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void layoutContainer(Container micontenedor) {
		// TODO Auto-generated method stub
		int d=micontenedor.getWidth();
		x=d/2;
		y=20;
		int contador=0;
		int n=micontenedor.getComponentCount();
		for(int i=0;i<n;i++){
			contador++;
			Component c=micontenedor.getComponent(i);
			c.setBounds(x-100,y,100,20);
			x+=100;
			if(contador%2==0){
				x=d/2;
				y+=40;
			}
		}
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub
		
	}
	
	private int x;
	private int y;
}