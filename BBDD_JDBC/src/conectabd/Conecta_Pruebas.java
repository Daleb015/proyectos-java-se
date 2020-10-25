package conectabd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conecta_Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Connection  miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas?useTimezone=true&serverTimezone=UTC", "root", "");
			Statement miStatement = miConexion.createStatement();
			ResultSet miResulset = miStatement.executeQuery("select * from productos");
			while(miResulset.next()){
				System.out.println(miResulset.getString("NOMBRE ARTÍCULO")+""+miResulset.getString("CÓDIGO ARTÍCULO")+""+miResulset.getString("PRECIO"));
			}
			
		}catch(Exception e){
			System.out.println("No conecta!!");
			e.printStackTrace();
		}
	}

}
