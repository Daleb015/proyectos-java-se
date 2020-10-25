import java.util.*;
public class PruebaMapas {

	public static void main(String[] args) {
		HashMap<String,Empleado> personal=new HashMap<String,Empleado>();
		personal.put("145",new Empleado("Daniel"));
		personal.put("190",new Empleado("Pedro"));
		personal.put("230",new Empleado("Andrés"));
		System.out.println(personal);
		personal.remove("145");
		System.out.println(personal);
		personal.put("190",new Empleado("Carlos") );
		System.out.println(personal);
		//System.out.println(personal.entrySet());
		for(Map.Entry<String, Empleado>entrada:personal.entrySet()){
			String clave=entrada.getKey();
			Empleado valor=entrada.getValue();
			System.out.println("Clave="+clave+" Valor="+valor);
		}
	}

}

class Empleado{
	public Empleado(String n){
		nombre=n;
		sueldo=2000;
	}
	public String toString(){
		return "[Nombre="+nombre+" ,sueldo="+sueldo+"]";
	}
	private String nombre;
	private double sueldo;
}