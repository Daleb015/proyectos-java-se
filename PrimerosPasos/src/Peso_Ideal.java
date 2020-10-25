import javax.swing.*;
public class Peso_Ideal {

	public static void main(String[] args) {
	
		String sexo = "";
		
		do{
			sexo=JOptionPane.showInputDialog("Introduce tu género H para hombre y M para mujer");
		}while(!sexo.equalsIgnoreCase("H")&&!sexo.equalsIgnoreCase("M"));
		if(sexo.equalsIgnoreCase("H"))
		{	
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu altura"));
			System.out.println("Tu peso ideal es "+(altura - 110)); 
		}
		else
		{
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu altura"));
			System.out.println("Tu peso ideal es "+(altura - 120));
		}
	}

}
