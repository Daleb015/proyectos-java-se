package inteligencia;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Main3
{
    public static void main(String[] args)
    {
        Marco mimarco = new Marco();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
    }
   
}

    class Marco extends JFrame{
    public Marco(){
        Toolkit sistema = Toolkit.getDefaultToolkit();
        medidas = sistema.getScreenSize();
        setBounds(((int)medidas.getWidth()/4),((int)medidas.getHeight()/4),((int)medidas.getWidth()/2),((int)medidas.getHeight()/2));
        setTitle("Buscar Archivo");
        setResizable(false);
        CustomPanel mipanel = new CustomPanel();
        add(mipanel);
    }
       
    
    class CustomPanel extends JPanel{   
        
        public CustomPanel(){
            setLayout(new BorderLayout());
            texto1=new JLabel("Ingresa el archivo a buscar: ");
            ingresa=new JTextField(15);
            texto2=new JLabel("");
            muestra=new CustomTextArea();
            muestra.setLineWrap(true);
            muestra.setWrapStyleWord(true);
            muestra.setEditable(false);
            JScrollPane scroll = new JScrollPane(muestra);
            consultar=new JButton("Buscar");
            consultar.addActionListener(new EventoConsulta());
            limpiar=new JButton("Limpiar");
            limpiar.addActionListener(new EventoLimpia());
            JPanel arriba = new JPanel();
            JPanel abajo = new JPanel();
            arriba.add(texto1);
            arriba.add(ingresa);
            arriba.add(texto2);
            add(arriba,BorderLayout.NORTH);
            add(scroll,BorderLayout.CENTER);
            abajo.add(consultar);
            abajo.add(limpiar);
            add(abajo,BorderLayout.SOUTH);
        }
       
    
}

class CustomTextArea extends JTextArea{
    
       
        
        @Override
        public void paint(Graphics g){
        g.drawImage(image, 0, 0,getWidth(),getHeight(),null,this);
        setOpaque(false);
        super.paint(g);
        }
    }
    
class EventoConsulta implements ActionListener{
    
   public void actionPerformed(ActionEvent e){
       opcionUsuario=ingresa.getText();
       ruta = System.getProperty("user.dir");
       principal=new File(ruta);
        
        File[] listado=principal.listFiles();
       
        
        for(File tmp:listado){
            muestra.append("\n"+tmp.getName());
        }
        
        ubicado=false;
        ubicacion=0;
        for(int i=0;i<listado.length;i++) {
        	if(listado[i].getName().equals(opcionUsuario)) {
        		ubicado=true;
        		ubicacion=i;
        	}
        }
        
        if(ubicado) {
        	muestra.append("\n Archivo encontrado en: "+listado[ubicacion].getAbsolutePath());
        }else {
        	muestra.append("\n Archivo no encontrado ");
        	
        }
        
       
    }
   
}

class EventoLimpia implements ActionListener{
    
	   public void actionPerformed(ActionEvent e){
		   muestra.setText("");
	        }
	        
	        
	   
	}


    private URL url = getClass().getResource("descarga.jpeg");
    private Image image = new ImageIcon(url).getImage();
    private Dimension medidas;
    private JButton consultar, limpiar;
    private JLabel texto1, texto2;
    private CustomTextArea muestra;
    private JTextField ingresa;
    private File principal;
    private String opcionUsuario,ruta;
    private boolean ubicado;
    private int ubicacion;
 
}


   
