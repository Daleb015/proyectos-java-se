package modelo;
import java.sql.*;
public class ejecutaConsultas {
	public ejecutaConsultas(){
		miconexion5=new Conexion();
	}
	public ResultSet filtraBBDD(String seccion, String pais){
		accesoBBDD=miconexion5.dameConexion();
		try{
		if(!seccion.equals("Todos")&& pais.equals("Todos")){
			query1=accesoBBDD.prepareStatement("SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO,PAÍSDEORIGEN FROM PRODUCTOS WHERE SECCIÓN=?");
			query1.setString(1, seccion);
			rs3=query1.executeQuery();
		}else if(seccion.equals("Todos")&& !pais.equals("Todos")){
			query1=accesoBBDD.prepareStatement("SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO,PAÍSDEORIGEN FROM PRODUCTOS WHERE PAÍSDEORIGEN=?");
			query1.setString(1, pais);
			rs3=query1.executeQuery();
		}else if(!seccion.equals("Todos")&& !pais.equals("Todos")){
			query1=accesoBBDD.prepareStatement("SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO,PAÍSDEORIGEN FROM PRODUCTOS WHERE PAÍSDEORIGEN=? AND SECCIÓN=?");
			query1.setString(1, pais);
			query1.setString(2, seccion);
			rs3=query1.executeQuery();
		}
		}catch(Exception ex){
			System.out.println("Algo pasa aqui");
		}
		
		return rs3;
	}
	
	private Conexion miconexion5;
	private Connection accesoBBDD;
	private ResultSet rs3;
	private PreparedStatement query1;
}
