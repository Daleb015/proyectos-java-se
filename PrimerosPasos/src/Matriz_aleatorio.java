import java.util.Random;

public class Matriz_aleatorio {

	public static void main(String[] args) {
		
		int[] matriz_aleatoria = new int[150];
		Random aleatorio = new Random();
		
		for(int i=0;i<matriz_aleatoria.length;i++)
		{
			matriz_aleatoria[i]=aleatorio.nextInt(100);
		}
		
		for(int aux:matriz_aleatoria)
		{
			System.out.print("  "+aux);
		}

	}

}
