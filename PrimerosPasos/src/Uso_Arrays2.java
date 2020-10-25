import javax.swing.*;
public class Uso_Arrays2 {

	public static void main(String[] args) {
		
		String[] paises = new String[8];
		
		
		for(int i=0;i<paises.length;i++)
		{
			String leer=JOptionPane.showInputDialog("Ingresa el pais "+i);
			paises[i]=leer;
		}
		
		
		for(String auxiliar:paises)
		{
			System.out.println("Pais "+auxiliar);
		}
		

	}

}
