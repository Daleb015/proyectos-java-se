

public class Pruebas {

	public static void main(String[] args) {
		
		Empleados empleado1 = new Empleados("Daniel");
		
		Empleados empleado2 = new Empleados("juan");
		
		empleado1.cambiarSeccion(" Tecnologia");
		
		empleado2.cambiarSeccion(" Comercial");
		
		empleado1.getDatos();
		
		empleado2.getDatos();
		
		System.out.println(Empleados.dameIdSiguiente());
		
				
		
		
		
		
		
	}

}

class Empleados
{
	public Empleados(String nom)
	{
		nombre=nom;
		
		Id=idNuevo;
		
		idNuevo++;
		
		seccion="Administrativa";
	}
	
	public void cambiarSeccion(String seccion)
	{
		this.seccion=seccion;
	}
	
	public String getNombre()
	{
		return nombre; 
	}
	
	public String getSeccion()
	{
		return seccion;
	}
	
	public int getId()
	{
		return Id;
	}
	
	public void getDatos()
	{
		System.out.println(" Los datos del trabajador: Nombre "+getNombre()+ " Area empresa: "+getSeccion()+" Id: "+getId());
	}
	
	public static String dameIdSiguiente()
	{
		return "El id siguientes es: "+idNuevo;
	}
	
		
	private final String nombre;
	private String seccion;
	private int Id;
	private static int idNuevo=1;
	
	}

