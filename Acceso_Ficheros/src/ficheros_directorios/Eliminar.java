package ficheros_directorios;

import java.io.File;

public class Eliminar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File borrar = new File("C:"+File.separator+File.separator+"Users"+File.separator+"daleb"+File.separator+"Documents"+File.separator+"HTML"+File.separator+"prueba.txt");
		borrar.delete();
	}

}
