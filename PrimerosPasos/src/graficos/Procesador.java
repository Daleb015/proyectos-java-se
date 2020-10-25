package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class Procesador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuProcesador mimarco = new MenuProcesador();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MenuProcesador extends JFrame
{
	public MenuProcesador()
	{
		setBounds(500,300,550,400);
		LaminaProcesador milamina = new LaminaProcesador();
		add(milamina);
		setVisible(true);
	}
}
class LaminaProcesador extends JPanel
{
	public LaminaProcesador ()
	{ 
		setLayout(new BorderLayout());
		JPanel laminaMenu = new JPanel();
		JMenuBar mibarra=new JMenuBar();
		JMenu fuente = new JMenu("Fuente");
		JMenu estilo = new JMenu("Estilo");
		JMenu tamaño = new JMenu("Tamaño");
		JMenuItem arial = new JMenuItem("Arial");
		arial.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				miarea.setFont(new Font("Arial",Font.PLAIN,12));
				
			}
			
		});
		JMenuItem courier = new JMenuItem("Courier");
		courier.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				miarea.setFont(new Font("Courier",Font.PLAIN,12));
				
			}
			
		});
		JMenuItem verdana = new JMenuItem("Verdana");
		verdana.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				miarea.setFont(new Font("Verdana",Font.PLAIN,12));
				
			}
			
		});
		JMenuItem negrita = new JMenuItem("Negrita");
		JMenuItem cursiva = new JMenuItem("Cursiva");
		JMenuItem pequeño = new JMenuItem("12");
		JMenuItem mediano = new JMenuItem("16");
		JMenuItem grande = new JMenuItem("20");
		JMenuItem muyGrande = new JMenuItem("24");
		fuente.add(arial);
		fuente.add(courier);
		fuente.add(verdana);
		estilo.add(negrita);
		estilo.add(cursiva);
		tamaño.add(pequeño);
		tamaño.add(mediano);
		tamaño.add(grande);
		tamaño.add(muyGrande);
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamaño);
		laminaMenu.add(mibarra);
		add(laminaMenu, BorderLayout.NORTH);
		miarea = new JTextPane();
		add(miarea, BorderLayout.CENTER);
	}
	
		
	JTextPane miarea;
	
}