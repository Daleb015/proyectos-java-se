package poo;

public class Jefes extends Empleado implements Jefatura {
	
	private double incentivo;
	
	public Jefes(String nom, double sue, int agno, int mes, int dia)
	{
		super(nom, sue, agno, mes, dia);
		
		
	}
	
	public void establece_incentivo(double b)
	{
		incentivo=b;
	}
	
	public double getSueldo()
	{
		double sueldoJefe=super.getSueldo();
		
		return sueldoJefe+incentivo;
	}
	
	public String tomar_decisiones(String a)
	{
		return " "+a;
	}
	
	public double estableceBonus(double gratificacion)
	{
		double prima=2000;
		return Trabajadores.bonus_base+gratificacion+prima;
	}

}
