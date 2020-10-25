package graficos;


import java.awt.Frame;

import javax.swing.*;

import java.awt.Toolkit;

public class Creando_marcos {

	public static void main(String[] args) {
		
		miMarco marco1=new miMarco();
		
		
		marco1.setVisible(true);
		
		marco1.setTitle("Pruebaaaaaaaaa");
		
		
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}

class miMarco extends JFrame{
	
	public miMarco(){
		
		setBounds(730,310,500,300);
		
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		
		
		
		
	}
	
	
	
	
}