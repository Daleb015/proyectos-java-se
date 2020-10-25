package principal;

import javax.swing.JFrame;

import vista.Marco;

public class Ejecuta_Modelo_Vista_Controlador {

	public static void main(String[] args) {
		Marco mimarco = new Marco();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}
