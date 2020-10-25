package ficheros_directorios;
import java.io.*;
public class Creando {

	public static void main(String[] args) {
		File ruta=new File("C:"+File.separator+File.separator+"Users"+File.separator+"daleb"+File.separator+"Documents"+File.separator+"HTML"+File.separator+"prueba.txt");
		//ruta.mkdir();
		try {
			ruta.createNewFile();
			FileWriter escribe=new FileWriter(ruta);
			escribe.write("Oe oe oeeee");
			escribe.flush();
			
		} catch (IOException e) {
			System.out.println("Fallo");
		}
	}

}

