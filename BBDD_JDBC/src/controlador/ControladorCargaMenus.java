package controlador;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.ResultSet;

import vista.Marco;
import modelo.CargaMenus;

public class ControladorCargaMenus extends WindowAdapter {

	public ControladorCargaMenus(Marco elMarco){
		this.elMarco=elMarco;
		
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		obj.ejecutaConsulta();
		rs=obj.daSecciones();
		rs1=obj.daPaises();
		try{
		while(rs.next()){
		elMarco.secciones.addItem((String)rs.getString(1));
		}
		while(rs1.next()){
		elMarco.paises.addItem((String)rs1.getString(1));
		}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		obj.cerrarResulset();
	}
	CargaMenus obj=new CargaMenus();
	private Marco elMarco;
	private ResultSet rs,rs1;
}
