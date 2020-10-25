package arraylist;

import java.util.ArrayList;
import java.util.Iterator;



public class UsoEmpleado {

	public static void main(String[] args) {
		
		ArrayList<Empleado> listado=new ArrayList<Empleado>();
		//listado.ensureCapacity(3);
		listado.add(new Empleado("Ana",45,2500));
		listado.add(new Empleado("antonio",55,2000));
		listado.add(new Empleado("Maria",25,2680));
		listado.add(new Empleado("Ana",45,2500));
		//listado.add("Holi");
		
		
		//listado.trimToSize();
		//listado.set(1,new Empleado("Daniel",30,1530000 ));
		
		//System.out.println(listado.get(4).dameDatos());
		//for(Empleado e:listado)
		/*{
			System.out.println(e.dameDatos());
		}
		
		for(int i=0;i<listado.size();i++){
			System.out.println(listado.get(i).dameDatos());
		}*/
		
		
		/*Empleado arrayEmpleado[]=new Empleado[listado.size()];
		listado.toArray(arrayEmpleado);
		for(int i=0;i<arrayEmpleado.length;i++){
			System.out.println(arrayEmpleado[i].dameDatos());
		}*/
		
		Iterator<Empleado> e=listado.iterator();
		while(e.hasNext()){
		System.out.println(e.next().dameDatos());
		}
}
}
class Empleado {
	
	
	
	public Empleado(String nombre, int edad, double salario){
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
	}
	
	
	public String dameDatos(){
		return "Nombre="+nombre+", Edad="+edad+" ,Salario: ="+salario;
	}
	private String nombre;
	private double salario;
	private int edad;
	
}

