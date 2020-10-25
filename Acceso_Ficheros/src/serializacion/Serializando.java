package serializacion;
import java.util.*;
import java.io.*;
public class Serializando {

	public static void main(String[] args) {
		Administrador jefe = new Administrador("Juan",80000,2005,12,15);
		jefe.setIncentivo(5000);
		Empleado[] personal = new Empleado[3];
		personal[0]=jefe;
		personal[1]=new Empleado("Ana",25000,2008,10,1);
		personal[2]=new Empleado("Luis",18000,2012,9,15);
		
		try {
			ObjectOutputStream escribiendo = new ObjectOutputStream(new FileOutputStream("C:/Users/daleb/Documents/JAVA/workspace/Acceso_Ficheros/empleado.dat"));
			escribiendo.writeObject(personal);
			escribiendo.close();
			ObjectInputStream leyendo = new ObjectInputStream(new FileInputStream("C:/Users/daleb/Documents/JAVA/workspace/Acceso_Ficheros/empleado.dat"));
			Empleado[] nuevoarray =(Empleado[])leyendo.readObject();
			leyendo.close();
			for(Empleado elem:nuevoarray){
				System.out.println(elem);
			}
		} catch (Exception e) {
			System.out.println("No se encontró el archivo");
		} 
	}

}

class Empleado implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -965089988079125687L;
	public Empleado(String n, double s, int agno, int mes, int dia){
		nombre=n;
		sueldos=s;
		GregorianCalendar calendario=new GregorianCalendar(agno,mes,dia);
		fechaContrato=calendario.getTime();
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public double getSueldo(){
		return sueldos;
	}
	
	public Date getFechaContrato(){
		return fechaContrato;
	}
	
	public void subirSueldo(double porcentaje){
		double aumento = sueldos*porcentaje/100;
		sueldos+=aumento;
	}
	
	public String toString(){
		return "Nombre="+nombre+", Sueldo="+sueldos+" ,fecha de contrato="+fechaContrato;
	}
	private String nombre;
	private double sueldos;
	private Date fechaContrato;
	
}

class Administrador extends Empleado{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1881056236380136510L;

	public Administrador(String n, double s, int agno, int mes, int dia){
		super(n, s, agno, mes, dia);
		incentivo=0;
	}
	public double getSueldo(){
		double sueldoBase=super.getSueldo();
		return sueldoBase+incentivo;
		
	}
	public void setIncentivo(double b){
		incentivo=b;
	}
	public String toString(){
		return super.toString()+" Incentivo"+incentivo;
		
	}
	
	private double incentivo;
}