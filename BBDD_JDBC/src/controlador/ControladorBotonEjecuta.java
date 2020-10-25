package controlador;
import modelo.ejecutaConsultas;
import vista.Marco;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ControladorBotonEjecuta implements ActionListener {
	public ControladorBotonEjecuta(Marco elmarco ){
		this.elmarco=elmarco;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		opcPaises=(String)elmarco.paises.getSelectedItem();
		opcSecciones=(String)elmarco.secciones.getSelectedItem();
		laconsulta= new ejecutaConsultas();
		rs4=laconsulta.filtraBBDD(opcSecciones, opcPaises);
		try{
			elmarco.resultado.setText("");
		while(rs4.next()){
			
			elmarco.resultado.append(rs4.getString(1));
			elmarco.resultado.append(", ");
			elmarco.resultado.append(rs4.getString(2));
			elmarco.resultado.append(", ");
			elmarco.resultado.append(rs4.getString(3));
			elmarco.resultado.append(", ");
			elmarco.resultado.append(rs4.getString(4));
			elmarco.resultado.append(", ");
			elmarco.resultado.append("\n");
		}
		}catch(Exception exc){
			exc.printStackTrace();
		}
		
	}
	private Marco elmarco;
	private ejecutaConsultas laconsulta;
	private String opcPaises,opcSecciones;
	private ResultSet rs4;
	
}
