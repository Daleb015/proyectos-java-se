package metadatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;



public class Info_Metadatos {

	public static void main(String[] args) {
		//mostrarInfo_BBDD(); 
		mostrarInfo_Tablas();
	}
	static void mostrarInfo_BBDD(){
		Connection miConexion=null;
		try{
			miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas?useTimezone=true&serverTimezone=UTC","root","");
			//Obtención de metadatos
			DatabaseMetaData datosBBDD= miConexion.getMetaData();
			//Mostramos nformación de la BBDD
			System.out.println(datosBBDD.getDatabaseProductName());
			System.out.println(datosBBDD.getDatabaseProductVersion());
			System.out.println(datosBBDD.getDriverVersion());
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				miConexion.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	static void mostrarInfo_Tablas(){
		Connection miConexion=null;
		ResultSet miResultSet=null;
		try{
			miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas?useTimezone=true&serverTimezone=UTC","root","");
			//Obtención de metadatos
			DatabaseMetaData datosBBDD= miConexion.getMetaData();
			//Lista de tablas
			
			System.out.println("Lista Tablas");
			miResultSet=datosBBDD.getTables("pruebas", null, "p%", null);
			 
			while(miResultSet.next()){
				System.out.println(miResultSet.getString("TABLE_NAME"));
				
			}
			
			//Lista de columnas de productos
			
			System.out.println("");
			System.out.println("Campos de Productos");
			
			miResultSet=datosBBDD.getColumns("pruebas", null, "productos", null);
			 
			while(miResultSet.next()){
				System.out.println(miResultSet.getString("COLUMN_NAME"));
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				miConexion.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}
