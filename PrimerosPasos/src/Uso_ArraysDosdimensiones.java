
public class Uso_ArraysDosdimensiones {

	public static void main(String[] args) {
		
		int[][] matrix = {{10,12,11,18,25},
				{7,8,15,6,2},
				{59,14,82,86,91},
				{45,84,52,11,13}};
		
		/*for(int i=0;i<4;i++)
		{
			System.out.println();
			for(int j=0;j<5;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
		}*/
		
		
		for(int[]tmp:matrix)
		{
			for(int tmp2:tmp)
			{
				System.out.println(tmp2);
			}
		}
		
	}

}
