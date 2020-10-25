package conectabd;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Aplicacion_Consulta {
	public static void main(String[] args) {
		JFrame mimarco=new Marco_Aplicacion();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}
}
class Marco_Aplicacion extends JFrame{
	public Marco_Aplicacion(){
		setTitle ("Consulta BBDD");
		setBounds(500,300,400,400);
		setLayout(new BorderLayout());
		JPanel menus=new JPanel();
		menus.setLayout(new FlowLayout());
		secciones=new JComboBox();
		secciones.setEditable(false);
		secciones.addItem("Todos");
		paises=new JComboBox();
		paises.setEditable(false);
		paises.addItem("Todos");
		resultado= new JTextArea(4,50);
		resultado.setEditable(false);
		add(resultado);
		menus.add(secciones);
		menus.add(paises);	
		add(menus, BorderLayout.NORTH);
		add(resultado, BorderLayout.CENTER);
		JButton botonConsulta=new JButton("Consulta");
		botonConsulta.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				ejecutaConsulta();
				
			}
			
		});
		add(botonConsulta, BorderLayout.SOUTH);
		//-----Conexión Base d Datos---//
		try {
			miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas?useTimezone=true&serverTimezone=UTC","root","");
			Statement mistatement=miconexion.createStatement();
			String consulta="SELECT DISTINCTROW SECCIÓN FROM PRODUCTOS";
			ResultSet rs=mistatement.executeQuery(consulta);
			while (rs.next()) {
				secciones.addItem(rs.getString(1));
			}
			rs.close();
			
			consulta = "SELECT DISTINCTROW PAÍSDEORIGEN FROM PRODUCTOS ";
			rs=mistatement.executeQuery(consulta);
			while(rs.next()){
				paises.addItem(rs.getString(1));
			}
			rs.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	private void ejecutaConsulta(){
		ResultSet rs=null;
		resultado.setText("");
		String seccion=(String)secciones.getSelectedItem();
		String pais=(String)paises.getSelectedItem();
		try{
		if(!seccion.equals("Todos")&&pais.equals("Todos"))
		{
		
			
			enviaConsultaSeccion=miconexion.prepareStatement(consultaSeccion); 
			enviaConsultaSeccion.setString(1, seccion);
			rs=enviaConsultaSeccion.executeQuery();
			while(rs.next()){
				resultado.append(rs.getString(1));
				resultado.append(", ");
				resultado.append(rs.getString(2));
				resultado.append(", ");
				resultado.append(rs.getString(3));
				resultado.append(", ");
				resultado.append(rs.getString(4));
				resultado.append(", ");
				resultado.append("\n");
			}
		
			}else if(seccion.equals("Todos")&&!pais.equals("Todos")){
				enviaConsultaPais=miconexion.prepareStatement(consultaSeccion2);
				enviaConsultaPais.setString(1, pais);
				rs=enviaConsultaPais.executeQuery();
				while(rs.next()){
					resultado.append(rs.getString(1));
					resultado.append(", ");
					resultado.append(rs.getString(2));
					resultado.append(", ");
					resultado.append(rs.getString(3));
					resultado.append(", ");
					resultado.append(rs.getString(4));
					resultado.append(", ");
					resultado.append("\n");
				}
			}else if(!seccion.equals("Todos")&&!pais.equals("Todos")){
				enviaConsultaTodos=miconexion.prepareStatement(consultaSeccion3);
				enviaConsultaTodos.setString(1, pais);
				enviaConsultaTodos.setString(2, seccion);
				rs=enviaConsultaTodos.executeQuery();
				while(rs.next()){
					resultado.append(rs.getString(1));
					resultado.append(", ");
					resultado.append(rs.getString(2));
					resultado.append(", ");
					resultado.append(rs.getString(3));
					resultado.append(", ");
					resultado.append(rs.getString(4));
					resultado.append(", ");
					resultado.append("\n");
				}
			}
			}catch(Exception e){
				
				}
		}
		
	
	private Connection miconexion;
	private JComboBox secciones;
	private JComboBox paises;
	private JTextArea resultado;	
	private PreparedStatement enviaConsultaSeccion;
	private PreparedStatement enviaConsultaPais;
	private PreparedStatement enviaConsultaTodos;
	private final String consultaSeccion="SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO,PAÍSDEORIGEN FROM PRODUCTOS WHERE SECCIÓN=?";
	private final String consultaSeccion2="SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO,PAÍSDEORIGEN FROM PRODUCTOS WHERE PAÍSDEORIGEN=?";
	private final String consultaSeccion3="SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO,PAÍSDEORIGEN FROM PRODUCTOS WHERE PAÍSDEORIGEN=? AND SECCIÓN=?";
}


