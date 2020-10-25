import javax.swing.JOptionPane;
public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		
		String nombre_Usuario = JOptionPane.showInputDialog("Introduce tu nombre por favor");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad por favor"));
		System.out.println("Hola tu nombre es "+nombre_Usuario+" Tu edad es "+edad);
	}

}
