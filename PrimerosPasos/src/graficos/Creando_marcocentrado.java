package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class Creando_marcocentrado {

	public static void main(String[] args) {

		Marcocentrado nuevo = new Marcocentrado();
		nuevo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		}

}


class Marcocentrado extends JFrame
{
	public Marcocentrado()
	{
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanoPantalla=miPantalla.getScreenSize();
		
		int anchoPantalla =tamanoPantalla.width;
		int altoPantalla =tamanoPantalla.height;
		
		setSize(anchoPantalla/2, altoPantalla/2);
		
		setLocation(anchoPantalla/4,altoPantalla/4);
		
		setVisible(true);
		
		setTitle("Prueba");
		
		Image imagen=miPantalla.getImage("src/graficos/icono.jpg");
		
		setIconImage(imagen);
		
		
		
	}
}