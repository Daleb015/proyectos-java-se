import java.util.Scanner;
public class Evalua_edad {

	public static void main(String[] args) {
		
		Scanner dato = new Scanner(System.in);
		System.out.println("introduce tu edad: ");
		int edad = dato.nextInt();
		
		if(edad>=18)
		{
			System.out.println("Es mayor de edad");
		}
		else
		{
			System.out.println("Es menor ");
		}
	}

}
