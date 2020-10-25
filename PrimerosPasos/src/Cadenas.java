
public class Cadenas {

	public static void main(String[] args) {
		
		String nombre = "Daniel Lineros Bermúdez";
		System.out.println("Mi nombres es "+nombre);
		System.out.println("Mi nombre tiene "+nombre.length()+" Letras");
		System.out.println("La primera letra de mi nombre es "+nombre.charAt(0));
		System.out.println("Las primeras tres letras de mi nombre son "+nombre.substring(0,3));
		System.out.println("La ultima letra de mi nombre es "+nombre.charAt((nombre.length()-1)));
	}

}
