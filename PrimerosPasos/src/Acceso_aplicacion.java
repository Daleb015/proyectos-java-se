import javax.swing.*;
public class Acceso_aplicacion {

	public static void main(String[] args) {
	
		String clave="daniel";
		String pass="";
		
		while(clave.equals(pass)==false)
		{
			System.out.println("La clave es incorrecta.");
			pass=JOptionPane.showInputDialog("Introduce la contraseña correcta");
			if(pass.equals(clave)==false)
			{
				System.out.println("Contraseña incorrecta");
			}
		
		}
		
		System.out.println("Contraseña correcta");
	}

}
