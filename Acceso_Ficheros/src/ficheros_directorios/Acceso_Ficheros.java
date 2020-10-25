package ficheros_directorios;
import java.io.*;
public class Acceso_Ficheros {

	public static void main(String[] args) {
		File ruta = new File("C:"+File.separator+File.separator+"Users"+File.separator+"daleb"+File.separator+"Documents"+File.separator+"HTML");
		String[] nombre=ruta.list();
		for(String elem:nombre)
		{
			File f=new File(ruta.getAbsolutePath(),elem);
			System.out.println(f);
			if(f.isDirectory()){
				String[] archivos_subcarpeta=f.list();
				for(String elemnn:archivos_subcarpeta)
				{
					System.out.println(elemnn);
				}
			}
		}
	}

}
