
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Recursos_JAR {

	public static void main(String[] args) {
		Marco mimarco = new Marco();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}

class Marco extends JFrame
{
	public Marco()
	{
		setBounds(500,350,400,400);
		setTitle("Prueba Recursos");
		Lamina milamina = new Lamina();
		add(milamina);
	}
}
class Lamina extends JPanel
{
	public Lamina()
	{
		setLayout(new BorderLayout());
		JTextArea zonaTexto = new JTextArea();
		add(new JScrollPane(zonaTexto),BorderLayout.CENTER);
		URL ruta_boton=Lamina.class.getResource("icono.jpg");
		JButton  miboton = new JButton("Consultar",new ImageIcon(ruta_boton));
		miboton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("El botón funciona");
				
			}});
		JPanel laminaboton = new JPanel();
		laminaboton.add(miboton);
		add(laminaboton,BorderLayout.SOUTH);
		
	}
}