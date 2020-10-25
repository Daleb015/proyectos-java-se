package excepciones_J;
import javax.swing.*;

import java.awt.*;
import java.io.EOFException;
import java.io.IOException;
public class Comprueba_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String el_mail = JOptionPane.showInputDialog("Ingresa el mail");
		try{
		examina_mail(el_mail);
		}catch(Longitud_mail_erronea e){System.out.println("El mail no debe tener menos de "+el_mail.length()+" Caracteres");e.printStackTrace();}
	}

	static void examina_mail(String mail) throws Longitud_mail_erronea
	{
		int arroba=0;
		boolean punto=false;
		if(mail.length()<3)
		{
			//ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
			throw new Longitud_mail_erronea("El correo tiene una longitud menor a 3");
		}
		for(int i=0;i<mail.length();i++)
		{
			if(mail.charAt(i)=='@')
			{
				arroba++;
			}
			if(mail.charAt(i)=='.')
			{
				punto=true;
			}
		}
		if(arroba==1&&punto)
		{
			System.out.println("El correo es correcto");
		}else
		{
			System.out.println("El correo no es correcto");
		}
	}
}

class Longitud_mail_erronea extends Exception
{
	public Longitud_mail_erronea()
	{
		
	}
	
	public Longitud_mail_erronea(String msj_error)
	{
		super(msj_error);
	}
}
