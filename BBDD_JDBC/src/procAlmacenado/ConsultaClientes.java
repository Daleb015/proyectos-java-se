package procAlmacenado;
import java.sql.*;
public class ConsultaClientes {

	public static void main(String[] args) {
		try{
			Connection accesoBD=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas?useTimezone=true&serverTimezone=UTC","root","");
			CallableStatement miprocedimiento = accesoBD.prepareCall("{call MUESTRA_PRODUCTOS}");
			ResultSet rs = miprocedimiento.executeQuery();
			while(rs.next()){
				System.out.print(rs.getString(1)+" ");
				System.out.print(rs.getString(2)+" ");
				System.out.print(rs.getString(3)+" \n");
			}
		}catch(Exception e){
			
		}
	}

}
