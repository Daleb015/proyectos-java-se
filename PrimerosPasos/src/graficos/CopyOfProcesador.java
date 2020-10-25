package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.ItalicAction;

public class CopyOfProcesador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuProcesadorII mimarco = new MenuProcesadorII();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MenuProcesadorII extends JFrame
{
	public MenuProcesadorII()
	{
		setBounds(500,300,550,400);
		LaminaProcesadorII milamina = new LaminaProcesadorII();
		add(milamina);
		setVisible(true);
	}
}
class LaminaProcesadorII extends JPanel
{
	public LaminaProcesadorII ()
	{ 
		setLayout(new BorderLayout());
		JPanel laminaMenu = new JPanel();
		JMenuBar mibarra=new JMenuBar();
		fuente = new JMenu("Fuente");
		estilo = new JMenu("Estilo");
		tamagno = new JMenu("Tamaño");
		Configura_menu("Arial","fuente","Arial",9,10,"");
		Configura_menu("Courier","fuente","Courier",9,10,"");
		Configura_menu("Verdana","fuente","Verdana",9,10,"");
		Configura_menu("Negrita","estilo","",Font.BOLD,12,"bin/graficos/Negrita.png");
		Configura_menu("Cursiva","estilo","",Font.ITALIC,12,"bin/graficos/cursiva.gif");
		/*JCheckBoxMenuItem negrita = new JCheckBoxMenuItem(new ImageIcon("bin/graficos/Negrita.png"));
		JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem(new ImageIcon("bin/graficos/cursiva.png"));
		negrita.addActionListener(new StyledEditorKit.BoldAction());
		cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		estilo.add(negrita);
		estilo.add(cursiva);
		/*
		Configura_menu("Pequeño","tamagno","",9,12,"");
		Configura_menu("Mediano","tamagno","",9,16,"");
		Configura_menu("Grande","tamagno","",9,20,"");
		Configura_menu("Muy Grande","tamagno","",9,24,"");
		*/
		ButtonGroup tamañoLetra = new ButtonGroup();
		JRadioButtonMenuItem doce=new JRadioButtonMenuItem("Pequeña");
		JRadioButtonMenuItem diezyseis=new JRadioButtonMenuItem("Mediano");
		JRadioButtonMenuItem veinte=new JRadioButtonMenuItem("Grande");
		JRadioButtonMenuItem veinteycuatro=new JRadioButtonMenuItem("Muy Grande");
		
		//veinteycuatro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,InputEvent.CTRL_DOWN_MASK));
		tamañoLetra.add(doce);
		tamañoLetra.add(diezyseis);
		tamañoLetra.add(veinte);
		tamañoLetra.add(veinteycuatro);
		doce.addActionListener(new StyledEditorKit.FontSizeAction("cambia",12));
		diezyseis.addActionListener(new StyledEditorKit.FontSizeAction("cambia",16));
		veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambia",20));
		veinteycuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambia",24));
		tamagno.add(doce);
		tamagno.add(diezyseis);
		tamagno.add(veinte);
		tamagno.add(veinteycuatro);
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamagno);
		laminaMenu.add(mibarra);
		add(laminaMenu, BorderLayout.NORTH);
		miarea = new JTextPane();
		add(miarea, BorderLayout.CENTER);
		estado=new JLabel("Estado Letra");
		add(estado,BorderLayout.SOUTH);JPopupMenu emergente = new JPopupMenu();
		JMenuItem negritaE = new JMenuItem("Negrita");
		JMenuItem cursivaE = new JMenuItem("cursiva");
		negritaE.addActionListener(new StyledEditorKit.BoldAction());
		cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
		emergente.add(negritaE);
		emergente.add(cursivaE);
		
		miarea.setComponentPopupMenu(emergente);
		
		//************************************************************
		
		/*JToolBar barra = new JToolBar();
		
		JButton negritaBarra = new JButton(new ImageIcon("bin/graficos/negrita.png"));
		JButton cursivaBarra = new JButton(new ImageIcon("bin/graficos/cursiva.png"));
		JButton subrayarBarra = new JButton(new ImageIcon("bin/graficos/subrayar.png"));
		JButton azulBarra = new JButton(new ImageIcon("bin/graficos/azul.png"));
		JButton amarilloBarra = new JButton(new ImageIcon("bin/graficos/amarillo.png"));
		JButton rojoBarra = new JButton(new ImageIcon("bin/graficos/rojo.png"));
		JButton izquierda = new JButton(new ImageIcon("bin/graficos/izquierda.png")); 
		JButton derecha = new JButton(new ImageIcon("bin/graficos/derecha.png"));
		JButton centrar = new JButton(new ImageIcon("bin/graficos/centrar.png"));
		JButton justificar = new JButton(new ImageIcon("bin/graficos/justificar.png"));
		negritaBarra.addActionListener(new StyledEditorKit.BoldAction());
		cursivaBarra.addActionListener(new StyledEditorKit.ItalicAction());
		subrayarBarra.addActionListener(new StyledEditorKit.UnderlineAction());
		azulBarra.addActionListener(new StyledEditorKit.ForegroundAction("cambia",Color.BLUE));
		amarilloBarra.addActionListener(new StyledEditorKit.ForegroundAction("cambia",Color.YELLOW));
		rojoBarra.addActionListener(new StyledEditorKit.ForegroundAction("cambia",Color.RED));
		izquierda.addActionListener(new StyledEditorKit.AlignmentAction("cambia",0));
		derecha.addActionListener(new StyledEditorKit.AlignmentAction("cambia",2));
		centrar.addActionListener(new StyledEditorKit.AlignmentAction("cambia",1));
		justificar.addActionListener(new StyledEditorKit.AlignmentAction("cambia",3));
		barra.add(negritaBarra);
		barra.add(cursivaBarra);
		barra.add(subrayarBarra);
		barra.add(azulBarra);
		barra.add(amarilloBarra);
		barra.add(rojoBarra);
		barra.add(izquierda);
		barra.add(derecha);
		barra.add(centrar);
		barra.add(justificar);*/
		
		
		barra=new JToolBar();
		configuraBarra("bin/graficos/negrita.png").addActionListener(new StyledEditorKit.BoldAction());
		configuraBarra("bin/graficos/cursiva.png").addActionListener(new StyledEditorKit.ItalicAction());
		configuraBarra("bin/graficos/subrayar.png").addActionListener(new StyledEditorKit.UnderlineAction());
		barra.addSeparator();
		configuraBarra("bin/graficos/azul.png").addActionListener(new StyledEditorKit.ForegroundAction("cambia",Color.BLUE));
		configuraBarra("bin/graficos/amarillo.png").addActionListener(new StyledEditorKit.ForegroundAction("cambia",Color.YELLOW));
		configuraBarra("bin/graficos/rojo.png").addActionListener(new StyledEditorKit.ForegroundAction("cambia",Color.RED));
		barra.addSeparator();
		configuraBarra("bin/graficos/izquierda.png").addActionListener(new StyledEditorKit.AlignmentAction("cambia",0));
		configuraBarra("bin/graficos/derecha.png").addActionListener(new StyledEditorKit.AlignmentAction("cambia",2));
		configuraBarra("bin/graficos/centrar.png").addActionListener(new StyledEditorKit.AlignmentAction("cambia",1));
		configuraBarra("bin/graficos/justificar.png").addActionListener(new StyledEditorKit.AlignmentAction("cambia",3));
		barra.setOrientation(1);
		add(barra,BorderLayout.WEST);
		
		
		
	}
	
	public JButton configuraBarra(String ruta){
		JButton boton = new JButton(new ImageIcon(ruta));
		barra.add(boton);
		return boton;
	}
	
	
	
	public void Configura_menu(String rotulo, String menu, String tipo_Letra, int estilos, int tam,String ruta){
	
		JMenuItem elem_menu = new JMenuItem(rotulo,new ImageIcon(ruta));
		
		if(menu=="fuente")
		{
			fuente.add(elem_menu);
			if(tipo_Letra=="Arial"){
			elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia","Arial"));
			}else if(tipo_Letra=="Courier"){
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia","Courier"));
				}else if(tipo_Letra=="Verdana"){
					elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia","Verdana"));
				}
		}else if(menu == "estilo")
		{
			estilo.add(elem_menu);
			if(estilos==Font.BOLD){
			elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
			elem_menu.addActionListener(new StyledEditorKit.BoldAction());
			}else if(estilos==Font.ITALIC){
				elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K,InputEvent.CTRL_DOWN_MASK));
				elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
			}
			}else if(menu=="tamagno")
		{
			tamagno.add(elem_menu);
			
			elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia",tam));
		}
		
		//elem_menu.addActionListener(new Gestiona_Evento(rotulo,tipo_Letra,estilos,tam));
		
	}
	
	/*private class Gestiona_Evento  implements ActionListener{

		String tipo_texto, menu;
		int estilo_letra, tamagno_letra;
		
		public Gestiona_Evento(String elemento, String texto2, int estilo2, int tam_letra){
			tipo_texto=texto2;
			estilo_letra=estilo2;
			tamagno_letra=tam_letra;
			menu=elemento;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			letras=miarea.getFont();
			if(menu=="Arial"||menu=="Courier"||menu=="Verdana"){
				estilo_letra=letras.getStyle();
				tamagno_letra=letras.getSize();
			}else if(menu=="Cursiva"||menu=="Negrita"){
				if(letras.getStyle()==1||letras.getStyle()==2){
					estilo_letra=3;
				}
				tipo_texto=letras.getFontName();
				tamagno_letra=letras.getSize();
			}else if(menu=="Pequeño"||menu=="Mediano"||menu=="Grande"||menu=="Muy Grande"){
				estilo_letra=letras.getStyle();
				tipo_texto=letras.getFontName();
			}
			miarea.setFont(new Font(tipo_texto,estilo_letra,tamagno_letra));
			estado.setText("Tipo: "+tipo_texto+" Estilo: "+estilo_letra+" Tamaño: "+tamagno_letra);
		}
		
	}*/

	
	
	JTextPane miarea;
	JMenu fuente, estilo, tamagno;
	Font letras;
	JLabel estado;
	JButton negritaBarra, cursivaBarra, subrayarBarra, azulBarra, amarilloBarra, rojoBarra, izquierda, derecha, centrar, justificar;
	JToolBar barra;
}