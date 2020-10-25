import java.util.Scanner;
public class Uso_tallas {
	
	
	//enum Talla {Mini, mediano, grande, muy_grande};
	
	enum Talla{
		
		MINI("S"),MEDIANO("N"),GRANDE("L"),MUYGRANDE("XL");
		
		private Talla(String abreviatura){
			
			this.abreviatura=abreviatura;
			
		}
		
		public String getTalla()
		{
			return abreviatura;
		}
		
		private String abreviatura;
	}

	public static void main(String[] args) {
	
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe una talla: Mini, Mediano, Grande, Muy_Grande");
		
		String entradaDatos=entrada.next().toUpperCase();
		
		Talla la_talla=Enum.valueOf(Talla.class, entradaDatos);
		
		System.out.println("Talla= "+la_talla);
		System.out.println("Abreviatura "+la_talla.getTalla());
		
		
		
	}

}
