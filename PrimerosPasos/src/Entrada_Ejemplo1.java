import java.util.Scanner;
public class Entrada_Ejemplo1 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Ingresa tu nombre");
		String nombre=entrada.nextLine();
		System.out.println("ingresa tu edad");
		int edad=entrada.nextInt();
		System.out.println("tu nombre es "+nombre+" y tu edad es "+edad+" años");	
	}

}
