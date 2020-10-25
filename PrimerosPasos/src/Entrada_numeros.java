import java.util.Scanner;
public class Entrada_numeros {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		double num1=Double.parseDouble(numero.nextLine());
		double raiz=Math.sqrt(num1);
		System.out.print("La raiz de "+num1+" es ");
		System.out.printf("%1.4f", raiz);
	}

}
