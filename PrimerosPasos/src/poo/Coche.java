package poo;

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	private String color;
	
	public Coche()
	{
		
		ruedas=4;
		largo=100;
		ancho=150;
		motor=1;
		peso=12365;
		color="";
	}
	
	public String getRuedas()
	{
		return "El numero de llantas es "+ruedas;
	}
	
	public void setPeso(int nuevoValor)
	{
		peso=nuevoValor;
	}
	
	public void setColor(String nuevoColor)
	
	{
		color=nuevoColor;
	}
	
	public int getPeso()
	{
		return peso;
	}
	
	public String getColor()
	{
		return color;
	}
	
	
}
