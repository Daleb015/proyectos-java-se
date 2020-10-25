package Clases_propias;

public class Empleado implements Comparable {
	
	
	
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
	
	public int compareTo(Object o){
		return 1;
	}
}
