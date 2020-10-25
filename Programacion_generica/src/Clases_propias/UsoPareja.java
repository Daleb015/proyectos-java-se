package Clases_propias;

public class UsoPareja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pareja<String> uno = new Pareja<String>();
		uno.setPrimero("Juan");
		System.out.println(uno.getPrimero());
		Persona persona1 = new Persona("Ana");
		Pareja<Persona> nombre1=new Pareja<Persona>();
		nombre1.setPrimero(persona1);
		System.out.println(nombre1.getPrimero().toString());
		}
}
	class Persona{
		public Persona(String nombre){
			this.nombre=nombre;
			
		}
		
		public String toString(){
			return nombre;
		}
		private String nombre;
	}


