package poo;


import java.util.Arrays;

import javax.swing.JOptionPane;

public class Uso_empleado {

	public static void main(String[] args) {
		
		Jefes jefe_Tecnologia=new Jefes("Daniel", 100000,1989,06,05);
		
		jefe_Tecnologia.establece_incentivo(10);
		
		Empleado[] misEmpleados = new Empleado[6];
		misEmpleados[0]=new Empleado("ana",38000,2000,07,07);
		misEmpleados[1]=new Empleado("Carlos",50000,1995,06,15);
		misEmpleados[2]=new Empleado("Paco",2500,2005,9,25);
		misEmpleados[3]=new Empleado("antonia",47500,2009,11,9);
		misEmpleados[4]=jefe_Tecnologia;
		misEmpleados[5]=new Jefes("Lina", 95000,1999,05,06);
		Jefes jefe_comercial = (Jefes) misEmpleados[5];
		jefe_comercial.establece_incentivo(50000);
		
		Empleado director_comercial=new Jefes("sandra",85000,1999,05,13);
		
		
		Comparable ejemplo = new Empleado("pepe",95000,2011,06,07);
		
		System.out.println(jefe_comercial.tomar_decisiones("Echar a todos"));
		
		System.out.println("El jefe comercial de nombre: "+jefe_comercial.getNombre()+" tiene un bonus de "+jefe_comercial.estableceBonus(5000));
		
		System.out.println(misEmpleados[3].estableceBonus(1200));
		
		for(Empleado tmp:misEmpleados)
		{
			tmp.subirSueldo(5);
		}
		
		Arrays.sort(misEmpleados);
		
		
		for(Empleado temp2:misEmpleados)
		{
			System.out.println("Nombr: "+temp2.getNombre()+" sueldo "+temp2.getSueldo()+" Fecha de alta "+
		temp2.getAltaContrato());
		}
		
		
	}
	
}
