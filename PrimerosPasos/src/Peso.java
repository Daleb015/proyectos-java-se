import javax.swing.JOptionPane;
public class Peso {

	public static void main(String[] args) {
		String genero="";
		
		do{
			
			genero=JOptionPane.showInputDialog("Ingresa el genero M para mujer, H para hombre");
			
		}while(genero.equalsIgnoreCase("M")==false && genero.equalsIgnoreCase("H")==false);
		
	}

}
