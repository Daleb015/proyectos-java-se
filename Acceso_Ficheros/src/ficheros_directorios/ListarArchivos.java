package ficheros_directorios;

import java.io.File;
import java.io.IOException;

public class ListarArchivos {

    public static void main(String[] args) {
    	String variable="..";
        File miDir = new File(variable); // directorio actual, cambiarlo si se quiere
        verContenidoFolder(miDir);
    }

    public static void verContenidoFolder(File dir) {
        try {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("directorio:" + file.getCanonicalPath());
                    verContenidoFolder(file);
                } else {
                    System.out.println("     archivo:" + file.getCanonicalPath());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}