
public class Uso_Arrays {

	public static void main(String[] args) {
	
		int[] lista1 = new int[10];
		
		lista1[0]=15;
		lista1[1]=5;
		lista1[2]=1;
		lista1[3]=145;
		lista1[4]=152;

		for(int i=0;i<lista1.length;i++)
		{
			System.out.println("El espacio es "+i+" "+ lista1[i]);
		}
	}

}
