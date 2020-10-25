package poo;

import java.util.Date;
import java.util.GregorianCalendar;

class Empleado implements Comparable, Trabajadores
{
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	private static int IdSiguiente;
	
	private int Id;
	
	public Empleado(String nom, double sue, int agno, int mes, int dia)
	{
		
		nombre=nom;
		sueldo=sue;
		GregorianCalendar fecha  =new GregorianCalendar(agno,mes,dia);
		altaContrato=fecha.getTime();
		
		++IdSiguiente;
		
		Id=IdSiguiente;
		
	}
	
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public void subirSueldo(double porcentaje)
	
	{
		sueldo=sueldo+(sueldo*porcentaje/100);
	}

	public Date getAltaContrato() {
		return altaContrato;
	}

	public void setAltaContrato(Date altaContrato) {
		this.altaContrato = altaContrato;
	}

	public int getId()
	{
		return Id;
	}
	
	public double estableceBonus(double gratificacion)
	{
		
		return Trabajadores.bonus_base+gratificacion;
	}
	
	
	public int compareTo(Object a)
	{
		Empleado otroEmpleado=(Empleado) a;
		
		if(this.sueldo<otroEmpleado.sueldo)
		{
			int result = -1;
			return result;
		}else {if(this.sueldo>otroEmpleado.sueldo)
			{
			int result = 1;
			return result;
			}else{int result = 0;
			return result;}}
		
		
			
	}
	
	
	
	}
