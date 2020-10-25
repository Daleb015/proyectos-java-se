package leyendo_escribiendo_bytes;
import java.io.*;
public class Lectura_Escritura {

	public static void main(String[] args) {
		int contador=0;
		int[] datos_entrada=new int[19937];
		try {
			FileInputStream lector = new FileInputStream("C:/Users/daleb/Documents/JAVA/workspace/Acceso_Ficheros/logo.jpg");
			
			boolean final_ar = false;
			
			while(!final_ar)
			{
				int byte_entrada=lector.read();
				if(byte_entrada!=-1)
					{datos_entrada[contador]=byte_entrada;}
				
				else{
					final_ar=true;}
					System.out.println(datos_entrada[contador]);
					contador++;
				
			}
			lector.close();
		} catch (IOException e) {
			System.out.println("No se encoentró el archivo");
		}
		crea_fichero(datos_entrada);
	}
	
	static void crea_fichero(int[] nuevo_fichero) {
		try {
			FileOutputStream escritor = new FileOutputStream("C:/Users/daleb/Documents/JAVA/workspace/Acceso_Ficheros/copia.jpg");
			for(int i=0;i<nuevo_fichero.length;i++)
			{
				escritor.write(nuevo_fichero[i]);
			}
			escritor.close();
		} catch (IOException e) {


		}
	}

}
