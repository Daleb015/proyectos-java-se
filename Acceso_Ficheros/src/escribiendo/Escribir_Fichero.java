package escribiendo;
import java.io.*;
public class Escribir_Fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Escribiendo escribe = new Escribiendo();
		escribe.Escribir();
	}

}

class Escribiendo{
	public void Escribir(){
		String frase = "Esto es un aprueba Daniellllll";
		try {
			FileWriter escritura = new FileWriter("C:/Users/daleb/Desktop/prueba.txt");
			BufferedWriter mibuffer = new BufferedWriter(escritura);
			mibuffer.write(frase);
			mibuffer.close();
		} catch (IOException e) {
			System.out.println("No se encuentra el archivo");
		}
	}
}