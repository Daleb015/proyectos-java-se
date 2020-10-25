package graficos;
import java.awt.GraphicsEnvironment;
import javax.swing.*;


public class Pruebas {

	public static void main(String[] args) {
		
		String[] listaFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		String seleccion = JOptionPane.showInputDialog("Que fuente quieres consultar ");
		
		boolean encontrada=false;
		
		for(String tmp:listaFuentes)
			
		{
			if(tmp.equalsIgnoreCase(seleccion))
			{
				encontrada=true;
			}
		}
		if(encontrada)
		{
			
			System.out.println("La fuente si está");
			
		}else{System.out.println("La fuente no está");}
	}

}
