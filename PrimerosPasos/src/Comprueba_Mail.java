import java.io.EOFException;

import javax.swing.JOptionPane;


public class Comprueba_Mail {

	public static void main(String[] args) throws EOFException {
		
		
		
		int arroba = 0;
		boolean punto = false;
		
		while(arroba==0)
		{
		String correo = JOptionPane.showInputDialog("Ingresa un correo valido");
		if(correo.length()<3)
		{
			throw new EOFException();
		}else
		for(int i=0;i<correo.length();i++)
		{
			if(String.valueOf(correo.charAt(i)).equalsIgnoreCase("@"))
			{
				arroba++;
				
			}
			if(String.valueOf(correo.charAt(i)).equalsIgnoreCase("."))
			{
				punto=true;
				
			}
										
		}
		}
		if(arroba==1&&punto==true)
		{
			System.out.println("correo valido");
		}else
		{
			System.out.print("Correo invalido");
		}
			
				
	}

}
