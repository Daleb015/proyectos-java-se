package transacciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class TransaccionProductos {

	public static void main(String[] args) {
Connection miConexion=null;
		
		try{					
				
			miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas?useTimezone=true&serverTimezone=UTC", "root", "");				
			miConexion.setAutoCommit(false);
			Statement miStatement =miConexion.createStatement();
			String instruccionSql_1="DELETE FROM PRODUCTOS WHERE PAÍSDEORIGEN='ITALIA'";
			String instruccionSql_2="DELETE FROM PRODUCTOS WHERE PRECIO>300";
		    String instruccionSql_3="UPDATE PRODUCTOS SET PRECIO=PRECIO*2"
		    		+ ""
		    		+ "";
		    
			boolean ejecutar=ejecutar_transaccion();
			if(ejecutar){
		    miStatement.executeUpdate(instruccionSql_1);
		    miStatement.executeUpdate(instruccionSql_2);
		    miStatement.executeUpdate(instruccionSql_3);
		    miConexion.commit();
		    System.out.println("Se ejecutó");
			}else{
				System.out.println("No se realizó");
			}
		    
		}catch(Exception e){
			e.printStackTrace();
			try {
				miConexion.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("Algo salió mal");
		}
		
	}
	
	static boolean ejecutar_transaccion(){
		String ejecucion=JOptionPane.showInputDialog("¿Ejecutamos");
		if(ejecucion.equals("Si")){
			return true;
		}else{
			return true;
		}
	}
}
