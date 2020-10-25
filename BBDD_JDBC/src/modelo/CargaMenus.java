package modelo;
import java.sql.*;

public class CargaMenus {
	public CargaMenus(){
		miconexion=new Conexion();
	}
	
	public void ejecutaConsulta(){
				
		accesoBBDD=miconexion.dameConexion();
		try{
		
		Statement secciones=accesoBBDD.createStatement();
		Statement paises=accesoBBDD.createStatement();
		rs = secciones.executeQuery("SELECT DISTINCTROW SECCIÓN FROM PRODUCTOS");
		rs2 = paises.executeQuery("SELECT DISTINCTROW PAÍSDEORIGEN FROM PRODUCTOS");
		
		
		
		}catch(Exception e){
			
		}
		
		
	}
	
	public ResultSet daSecciones(){
		return rs;
		
	}
	public ResultSet daPaises(){
		return rs2;
		
	}
	
	public void cerrarResulset(){
		try {
			rs.close();
			rs2.close();
			accesoBBDD.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	private Conexion miconexion;
	private Connection accesoBBDD;
	private ResultSet rs;
	private ResultSet rs2;
}
