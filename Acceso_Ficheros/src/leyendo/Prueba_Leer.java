package leyendo;
import java.io.*;
public class Prueba_Leer {
	public static void main(String[] args)
	{
		
		try {
			FileReader lee = new FileReader("nuevoprueba.txt");
			FileWriter escribe = new FileWriter("nuevopruebaescribe.txt");
			int valor;
			while((valor=lee.read())!=-1)
			{
				
				char c=(char)valor;
				System.out.println(c);
				escribe.write(Character.toString(c));
				escribe.flush();
				
			}
		} catch (IOException e) {
			System.out.print("No se encontró");
		}
		
		
		
		
		
	}
}
