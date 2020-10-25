package excepciones_J;
import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Leer_Imagenes {

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
		setBounds(750,300,300,200);
		LaminaConImagen milamina=new LaminaConImagen();
		add(milamina);
	}
}
class LaminaConImagen extends JPanel
{
	public LaminaConImagen(){
		try{
		imagen=ImageIO.read(new File("facebook.png"));
		}catch(IOException e){
			System.out.println("La imagen no se encuentra");
		}
	}
	public void paintComponent(Graphics e) throws NullPointerException
	{
		super.paintComponent(e);
		
			
		try{
		int anchuraImagen=imagen.getWidth(this);
		int alturaImagen=imagen.getHeight(this);
		e.drawImage(imagen,0,0,null);
		for(int i = 0;i<300;i++)
		{
			for(int j=0;j<300;j++)
			{
				if(i+j>0)
				{
					
				}
			}
		}
		}catch(NullPointerException g){
			e.drawString("No esta la imagen",10,10);
		}
		
	}
	
	private Image imagen;
}