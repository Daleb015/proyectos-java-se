import java.awt.*;
import java.awt.Image;

import javax.swing.*;


public class Applet_Multimedia extends JApplet {
	
	public void init(){
		logo = getImage(getDocumentBase(),"Icono.jpg");
		
	}
	public void paint(Graphics g){
		g.drawImage(logo, 50, 50, this);
	}
	private Image logo;
}
