package poo;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;

public class Prueba_temporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DameLaHora oyente=new DameLaHora();
		
		Timer mitemporizador = new Timer(5000, oyente);
		
		mitemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Aceptar para detener");

		System.exit(0);
		
	}

}

class DameLaHora implements ActionListener

{
	
	
	
	
	
	public void actionPerformed(ActionEvent e)
	{
		
		Date ahora = new Date();
		
		System.out.println("Pongo la hora cada 5 segundos: "+ahora);
		
		Toolkit.getDefaultToolkit().beep();
		
	}
	
	
}