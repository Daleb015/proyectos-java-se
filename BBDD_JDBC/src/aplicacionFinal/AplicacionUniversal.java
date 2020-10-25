package aplicacionFinal;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;






public class AplicacionUniversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoBBDD mimarco=new MarcoBBDD();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}
	
	

}

class MarcoBBDD extends JFrame{

	public MarcoBBDD(){
		
		setBounds(300,300,700,700);
		
		LaminaBBDD milamina=new LaminaBBDD();
		
		add(milamina);
		
	}	
	
}

class LaminaBBDD extends JPanel{
	
	public LaminaBBDD(){
		
		setLayout(new BorderLayout());
		
		comboTablas=new JComboBox();
		
		conectarBBDD();
		obtenerTablas();
		
		comboTablas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String nombreTabla=(String)comboTablas.getSelectedItem();
				mostrarInfoTabla(nombreTabla);
			}
			
		});
		
		areaInformacion=new JTextArea();
		
		add(areaInformacion,BorderLayout.CENTER);		
		
		add(comboTablas, BorderLayout.NORTH);
		
		
		
		
		}
	
	public void conectarBBDD() {
		
		miconexion=null;
		
		String datos[]=new String[3];
		
			try {
				entrada=new FileReader("C:/Users/daleb/OneDrive/Documentos/Programación/JAVA/configuracionBD.txt");
				
				//}
			} catch ( IOException e1) {
				
				JFileChooser chooser = new JFileChooser();
			    FileNameExtensionFilter filter = new FileNameExtensionFilter(
			        "Archivos Text", "txt");
			    chooser.setFileFilter(filter);
			    int returnVal = chooser.showOpenDialog(this);
			    if(returnVal == JFileChooser.APPROVE_OPTION) {
			       try {
					entrada=new FileReader(chooser.getSelectedFile().getAbsolutePath());
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    }
			} 
			try {
			BufferedReader mibuffer=new BufferedReader(entrada);
			for(int i=0;i<=2;i++) {
			datos[i]=mibuffer.readLine();
			}
		
			
			miconexion=DriverManager.getConnection(datos[0],datos[1],datos[2]);
			entrada.close();
			
			
		
	}catch(Exception e) {
		e.printStackTrace();
	}}
	
	public void obtenerTablas() {
		ResultSet miresulset =null;
		try {
		DatabaseMetaData datosBBDD=miconexion.getMetaData();
		miresulset=datosBBDD.getTables("pruebas", null, null, null);
		while(miresulset.next()) {
			comboTablas.addItem(miresulset.getString("TABLE_NAME"));
		}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void mostrarInfoTabla(String tabla) {
		areaInformacion.setText("");
		ArrayList<String> campos=new ArrayList<String>();
		String consulta="SELECT * FROM "+tabla;
		try {
			Statement miStatement = miconexion.createStatement();
			ResultSet miResultSet=miStatement.executeQuery(consulta);
			ResultSetMetaData rsBBDD=miResultSet.getMetaData();
			for(int i=1;i<rsBBDD.getColumnCount();i++) {
				campos.add(rsBBDD.getColumnLabel(i));
			}
			while(miResultSet.next()) {
				for(String nombreCampo:campos) {
					areaInformacion.append(miResultSet.getString(nombreCampo)+" ");
				}
				areaInformacion.append("\n");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	
	private JComboBox comboTablas;

	private JTextArea areaInformacion;
	
	private Connection miconexion;
	
	private FileReader entrada;
	
}


		
