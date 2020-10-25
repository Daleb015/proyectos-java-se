
public class Ejercicio_Intereses {

	public static void main(String[] args) {
		
		double acumulado;
		double tasa=0.10;
		
		double[][] interes = new double[6][5];
		
		for(int i=0;i<6;i++)
		{
			interes[i][0]=10000;
			acumulado=10000;
			for(int j=1;j<5;j++)
			{
				acumulado=acumulado+(acumulado*tasa);
				interes[i][j]=acumulado;
			}
			
			tasa=tasa+0.1;
		}
		
		for(double[] tmp:interes)
		{
			System.out.println();
			for(double tmp2:tmp)
			{
				System.out.print(" "+tmp2);
			}
		}
		

	}

}
