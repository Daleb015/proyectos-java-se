import java.util.Scanner;

import javax.swing.JOptionPane;
public class Adivina_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int numero=(int)(Math.random()*100.0);
		Scanner leer = new Scanner(System.in);
		int eleccion=0;
		int i=0;
		System.out.println("Se ha generado un numero aleatorio, intenta divinarlo");	
		eleccion=leer.nextInt();
		do{
			
		i++;
		if(eleccion<numero)
		{
			System.out.println("El numero es mayor, intentalo de nuevo");
			eleccion=leer.nextInt();
		}
		else
		{
			System.out.println("El numero es menor, intentalo de nuevo");
			eleccion=leer.nextInt();
		}
		}while(eleccion!=numero);
		System.out.println("Acertaste, lo conseguiste en "+i+" intentos");
		
	}

}
