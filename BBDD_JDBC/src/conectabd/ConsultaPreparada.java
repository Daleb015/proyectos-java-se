package conectabd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultaPreparada {

	public static void main(String[] args) {
		try {
			Connection  miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas?useTimezone=true&serverTimezone=UTC", "root", "");
			PreparedStatement comando=miConexion.prepareStatement("select NOMBREARTÍCULO,SECCIÓN,PAÍSDEORIGEN FROM PRODUCTOS WHERE SECCIÓN=? AND PAÍSDEORIGEN=?");
			comando.setString(1,"DEPORTES");
			comando.setString(2,"USA");
		
			ResultSet rs = comando.executeQuery();
			
			while(rs.next()){
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
				System.out.println("Funciona");
			}
			rs.close();
			
			System.out.println("Ejecucion segunda consulta");
			System.out.println("");
			comando.setString(1,"CERÁMICA");
			comando.setString(2,"CHINA");
		
			rs = comando.executeQuery();
			
			while(rs.next()){
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
				System.out.println("Funciona");
			}
			rs.close();
		
		} catch (Exception e) {
			System.out.println("Fallo al conectar");
			e.getStackTrace();
		}
	}

}
