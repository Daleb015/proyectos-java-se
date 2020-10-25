package IA;
import javax.swing.*;
import java.awt.*;
import java.net.*;
import java.awt.event.*;
import java.io.*;

public class Main2
{
    public Main2()
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
       principal=new File(".");
        
        File[] listado=principal.listFiles();
        ubicado=false;
        for(File tmp:listado){
            muestra.append(tmp.getName()+"\n");
            if(tmp.getName().equals(opcionUsuario)){
                ubicado=true;
                muestra.append("Archivo en contrado en:"+tmp.getAbsolutePath());
            }
        }
        if(ubicado==false){
            muestra.append("No encontrado");
        }
        
        
       
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
 
}


   
