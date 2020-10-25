package conectabd;
import java.sql.*;

import javax.swing.JOptionPane;
public class Actualiza_Productos {

	public static void main(String[] args) {
		String nPrecio=JOptionPane.showInputDialog("Introduce Precio");
		String nArticulo=JOptionPane.showInputDialog("Introduce nombre Artículo");
		try {
			Connection accesoBD=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas?useTimezone=true&serverTimezone=UTC","root","");
			CallableStatement misentencia=accesoBD.prepareCall("{call ACTUALIZA_PROD(?,?)}");
			misentencia.setString(1, nPrecio);
			misentencia.setString(2, nArticulo);
			misentencia.executeQuery();
			Statement prueba = accesoBD.createStatement();
			ResultSet rs=prueba.executeQuery("SELECT * FROM PRODUCTOS");
			while(rs.next()){
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
