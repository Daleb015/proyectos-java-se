package leyendo;
import java.io.*;
public class Acceso_Fichero {

	public static void main(String[] args) {
		
		Leer_Fichero mistream=new Leer_Fichero();
		mistream.Lee();
	}

}

class Leer_Fichero{
	
	
	public void Lee()
	{
		try {
			entrada = new FileReader(new File("C:/Users/daleb/Desktop/ejemplo.txt"));
			BufferedReader mibuffer=new BufferedReader(entrada);
			//int c=0;
			
			String linea="";
			while(linea!=null){
				System.out.println(linea);
				linea=mibuffer.readLine();
				//c=entrada.read();
				//char letra=(char)c;
				
			}
			//entrada.close();
		} catch (IOException e) {
			System.out.println("No se ha encontrado el archivo");
		} finally{
			try {
				entrada.close();
			} catch (IOException e) {
				System.out.println("No se pudo cerrar");
			}
		}
		
	}
	private FileReader entrada;
}