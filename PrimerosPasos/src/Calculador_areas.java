import javax.swing.JOptionPane;


public class Calculador_areas {

	public static void main(String[] args) {
		
		double lado=0.0;
		double base=0.0;
		double altura=0.0;
		double radio=0.0;
		final double pi=Math.PI;
		
		
		System.out.println("Que área desea calcular: ");
		
		int opcion=Integer.parseInt(JOptionPane.showInputDialog("1. Cuadrado \n 2. Rectangulo \n 3.Triangulo \n 4.Circulo"));
		switch(opcion)
		{
		case 1:
		{
			lado=Double.parseDouble(JOptionPane.showInputDialog("Digite la medida de uno de los lados en cms"));
			System.out.println("El area del cuadrado es "+(Math.pow(lado, 2.0))+" Cm^2");
			break;
		}
		
		case 2:
		{
			base=Double.parseDouble(JOptionPane.showInputDialog("Digite la medida de la base"));
			altura=Double.parseDouble(JOptionPane.showInputDialog("Digite la medida de la altura"));
			System.out.println("El área del rectangulo es "+(base*altura)+" Cm^2");
			break;
		}
		case 3:
		{
			base=Double.parseDouble(JOptionPane.showInputDialog("Digite la medida de la base"));
			altura=Double.parseDouble(JOptionPane.showInputDialog("Digite la medida de la altura"));
			System.out.println("El área del triangulo es "+((base*altura)/2)+" Cm^2");
			break;
		}	
		
		case 4:
		{
			radio=Double.parseDouble(JOptionPane.showInputDialog("Digite el radio del circulo"));
			System.out.println("El área del círculo es "+(pi*(Math.pow(radio, 2.0)))+" Cm^2");
			break;
		}	
		default:
			System.out.println("La opcion no es correcta");
	}

}
}