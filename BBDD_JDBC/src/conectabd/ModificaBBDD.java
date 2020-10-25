package conectabd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ModificaBBDD {

	public static void main(String[] args) {
		try{
			Connection  miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas?useTimezone=true&serverTimezone=UTC", "root", "");
			Statement miStatement = miConexion.createStatement();
			//String instruccionSql="INSERT INTO PRODUCTOS (CÓDIGOARTÍCULO,NOMBREARTÍCULO,PRECIO) VALUES ('AR77','PANTALÓN','25.35')";
			//String instruccionSql="UPDATE PRODUCTOS SET PRECIO=PRECIO*2 WHERE CÓDIGOARTÍCULO='AR77'";
			String instruccionSql="DELETE FROM PRODUCTOS WHERE CÓDIGOARTÍCULO='AR77'";
			miStatement.executeUpdate(instruccionSql);
			System.out.println("fUE CORRECTA");
		}catch(Exception e){
			System.out.println("No conecta!!");
			e.printStackTrace();
		}
	}

}
