package graficos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PruebaArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoPruebaArea mimarco = new MarcoPruebaArea();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}

class MarcoPruebaArea extends JFrame
{
	public MarcoPruebaArea()
	{
		setTitle("Probando area de texto");
		setBounds(500,300,500,300);
		setLayout(new BorderLayout());
		laminaBotones = new JPanel();
		botonInsertar=new JButton("Insertar");
		areaTexto=new JTextArea(8,20);
		
		botonInsertar.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				areaTexto.append("En un lugar de la mancha");
				
			}});
		
		 laminaBotones.add(botonInsertar);
		 
		 botonSalto=new JButton("Salto Linea");
		 botonSalto.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				boolean saltar = !areaTexto.getLineWrap();
				areaTexto.setLineWrap(saltar);
				/*if(saltar)
				{
					botonSalto.setText("Quitar Salto");
				}else{
					botonSalto.setText("Poner Salto");
				}*/
				
				botonSalto.setText(saltar ? "Quitar Salto":"Salto de linea");
			}
			 
		 });
		
		 laminaBotones.add(botonSalto);
		 add(laminaBotones,BorderLayout.SOUTH);
		 laminaConBarras = new JScrollPane(areaTexto);
		 add(laminaConBarras,BorderLayout.CENTER);
	}
	
	
	
	
	private JPanel laminaBotones;
	private JButton botonInsertar,botonSalto;
	private JTextArea areaTexto;
	private JScrollPane laminaConBarras;
}