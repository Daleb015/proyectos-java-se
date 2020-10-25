package ejercicios;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;

import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 * Muestra los diferentes tipos de ventana JOptionPane
 * 
 * @author (Daniel Lineros) 
 * @version (04/07/2019)
 */
public class Interfaz
{
    public static void main(String[] args)
    {
            Marco mimarco = new Marco();
            mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mimarco.setVisible(true);
    }
    
}
class Marco extends JFrame
{
  public Marco()
  {
     setBounds(420,300,600,400);
     setTitle("Prueba De Dialogos");
     Lamina milamina = new Lamina();
     add(milamina);
  }
}
class Lamina extends JPanel
{
  public Lamina()
     {
            
            setLayout(new BorderLayout());
            JPanel laminaBoton = new JPanel();
            JButton botonConfirma = new JButton("Genera");
            botonConfirma.addActionListener(new MuestraMensaje());
            laminaBoton.add(botonConfirma);
            add(laminaBoton,BorderLayout.SOUTH);
            laminaOpciones = new JPanel();
            laminaOpciones.setLayout(new GridLayout(2,3,10,10));
            String[] caja1={"Tipo","Mensaje","Confirmar","Opción","Entrada"};
            String[] caja2={"Tipo De Mensaje","ERROR_MESSAGE","INFORMATION_MESSAGE","WARNING_MESSAGE","QUESTION_MESSAGE","PLAIN_MESSAGE"};
            String[] caja3={"Mensaje","Cadena","Icono","Componente","Otros","Object[]"};
            String[] caja4={"Confirmar","DEFAULT_OPTION","YES_NO_OPTION","YES_NO_CANCEL_OPTION","OK_CANCEL_OPTION"};
            String[] caja5={"Opción","String[]","Icon[]","Object"};
            String[] caja6={"Entrada","Campo de Texto","Combo"};
            GestionaCajas(caja1);
            GestionaCajas(caja2);
            GestionaCajas(caja3);
            GestionaCajas(caja4);
            GestionaCajas(caja5);
            GestionaCajas(caja6);
            add(laminaOpciones,BorderLayout.CENTER);
                        
     }
     private void GestionaCajas(String[] textos)
     {
            
            ButtonGroup grupo = new ButtonGroup();
            Box caja = Box.createVerticalBox();
            
            for(int i = 1;i<textos.length;i++)
               {
                   JRadioButton elemento = new JRadioButton(textos[i]);
                   elemento.addActionListener(new GestionaEventosVariables());
                   grupo.add(elemento);
                   caja.add(elemento);
                   elemento.setSelected(i==1);
                   
               }
            caja.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), textos[0]));
                      
            laminaOpciones.add(caja);
     }
     private class GestionaEventosVariables implements ActionListener
     {
         public void actionPerformed(ActionEvent e)
         {
             JRadioButton origen=(JRadioButton)e.getSource();
             seleccion=0;
             if(origen.getText().equals("Mensaje"))
             {seleccion=1;}else
             if(origen.getText().equals("Confirmar"))
             {seleccion=2;}else
             if(origen.getText().equals("Opción"))
             {seleccion=3;}else
             if(origen.getText().equals("Entrada"))
             {seleccion=4;}
             if(origen.getText().equals("ERROR_MESSAGE"))
             {tipoMensaje=JOptionPane.ERROR_MESSAGE;}else
             if(origen.getText().equals("INFORMATION_MESSAGE"))
             {tipoMensaje=JOptionPane.INFORMATION_MESSAGE;}else
             if(origen.getText().equals("WARNING_MESSAGE"))
             {tipoMensaje=JOptionPane.WARNING_MESSAGE;}else
             if(origen.getText().equals("QUESTION_MESSAGE"))
             {tipoMensaje=JOptionPane.QUESTION_MESSAGE;}else
             if(origen.getText().equals("PLAIN_MESSAGE"))
             {tipoMensaje=JOptionPane.PLAIN_MESSAGE;}
             if(origen.getText().equals("Cadena"))
             {mensaje="Eligió Cadena";}else
             if(origen.getText().equals("Icono"))
             {mensaje=new ImageIcon("lampara.png");}else
             if(origen.getText().equals("Componente"))
             {mensaje=new JLabel("Componente tipo label");}else
             if(origen.getText().equals("Otros"))
             {mensaje=new JButton("Un boton");}else
             if(origen.getText().equals("Object[]"))
             {Object[] arreglo={"Eligió Cadena",new ImageIcon("lampara.png"),new JLabel("Componente tipo label"),new JButton("Un boton")};
              mensaje=arreglo;}
             if(origen.getText().equals("DEFAULT_OPTION"))
             {opcionConfirma=JOptionPane.DEFAULT_OPTION;}else
             if(origen.getText().equals("YES_NO_OPTION"))
             {opcionConfirma=JOptionPane.YES_NO_OPTION;}else
             if(origen.getText().equals("YES_NO_CANCEL_OPTION"))
             {opcionConfirma=JOptionPane.YES_NO_CANCEL_OPTION;}else
             if(origen.getText().equals("OK_CANCEL_OPTION"))
             {opcionConfirma=JOptionPane.OK_CANCEL_OPTION;}
         }
     }
     private class MuestraMensaje implements ActionListener
     {
         public void actionPerformed(ActionEvent e)
         {
             switch(seleccion)
             {
                 case 1:
                 JOptionPane.showMessageDialog(null,mensaje,"Tipo Mensaje",tipoMensaje);
                 break;
                 case 2:
                 JOptionPane.showConfirmDialog(null, mensaje, "Tipo Confirma",opcionConfirma );
                 break;
                 default:
                 JOptionPane.showMessageDialog(null,"No eligió opción");
             }
             
         }
     }
    private JPanel laminaOpciones;
    private Object mensaje;
    private int tipoMensaje;
    private int seleccion;
    private int opcionConfirma;
}
