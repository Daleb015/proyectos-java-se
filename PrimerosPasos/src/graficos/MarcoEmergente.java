package graficos;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;

public class MarcoEmergente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco_Emergente1 mimarco = new Marco_Emergente1();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class Marco_Emergente1 extends JFrame{
	public Marco_Emergente1(){
		setBounds(500,300,550,330);
		Lamina_Emergente milamina = new Lamina_Emergente();
		add(milamina);
		setVisible(true);
	}
}

class Lamina_Emergente extends JPanel{
	public Lamina_Emergente(){
		setLayout(new BorderLayout());
		JPanel laminaBotones = new JPanel();
		JMenuBar mibarra = new JMenuBar();
		JMenu fuente = new JMenu("Fuente");
		JMenu estilo = new JMenu("Estilo");
		JMenu tamagno = new JMenu("Tamaño");
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamagno);
		laminaBotones.add(mibarra);
		add(laminaBotones,BorderLayout.NORTH);
		JTextPane miarea=new JTextPane();
		add(miarea,BorderLayout.CENTER);
		JPopupMenu emergente = new JPopupMenu();
		JMenuItem opcion1 = new JMenuItem("Opcion 1");
		JMenuItem opcion2 = new JMenuItem("Opcion 2");
		JMenuItem opcion3 = new JMenuItem("Opcion 3");
		emergente.add(opcion1);
		emergente.add(opcion2);
		emergente.add(opcion3);
		miarea.setComponentPopupMenu(emergente);
	}
}