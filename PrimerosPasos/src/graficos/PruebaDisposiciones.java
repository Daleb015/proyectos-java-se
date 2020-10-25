package graficos;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PruebaDisposiciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCaja mimarco = new MarcoCaja();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}
class MarcoCaja extends JFrame
{
	public MarcoCaja()
	{
		setTitle("Marco en la caja");
		setBounds(600,350,200,200);
		JLabel rotula1 = new JLabel("nombre");
		JTextField texto1 = new JTextField(10);
		texto1.setMaximumSize(texto1.getPreferredSize());
		Box cajah1=Box.createHorizontalBox();
		cajah1.add(rotula1);
		cajah1.add(Box.createHorizontalStrut(10));
		cajah1.add(texto1);
		JLabel rotulo2 = new JLabel("contraseña");
		JTextField texto2 = new JTextField(10);
		texto2.setMaximumSize(texto2.getPreferredSize());
		Box cajah2 = Box.createHorizontalBox();
		cajah2.add(rotulo2);
		cajah2.add(Box.createHorizontalStrut(10));
		cajah2.add(texto2);
		JButton boton1=new JButton("Ok");
		JButton boton2=new JButton("Cancelar");
		Box cajah3 = Box.createHorizontalBox();
		cajah3.add(boton1);
		cajah3.add(Box.createGlue());
		cajah3.add(boton2);
		Box cajavertical=Box.createVerticalBox();
		cajavertical.add(cajah1);
		cajavertical.add(cajah2);
		cajavertical.add(cajah3);
		add(cajavertical,BorderLayout.CENTER);
		
	}
}

