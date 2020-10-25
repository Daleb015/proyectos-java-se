package arraylist;
import java.io.*;
public class UsoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayLists archivos = new ArrayLists(5);
		archivos.add("Juan");
		archivos.add("Daniel");
		archivos.add("Lina");
		archivos.add("Sandra");
		archivos.add(new File("Archivo.txt"));
		String nombrePersona=(String)archivos.get(4);
		
		System.out.println(nombrePersona);
	}

}
