import javax.swing.JOptionPane;


public class Factorial {
	
	public static void main(String[] args)
	{
		
		int numeroTemp=1;
		
		int base=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el factorial"));
		
		for(int i=1;i<=base;i++)
		{
			
			numeroTemp=numeroTemp*i;
			
		}
		
		System.out.println("El factorial es "+numeroTemp);
	}

}
