package ejercicios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Lamina2 extends JPanel
{
    public Lamina2()
    {
        setLayout(new BorderLayout());
        JPanel laminaBoton = new JPanel();
        JButton botonConsulta = new JButton("Consultar");
        botonConsulta.addActionListener(new MuestraMensaje());
        laminaBoton.add(botonConsulta);
        add(laminaBoton,BorderLayout.SOUTH);
        laminaOpciones = new JPanel();
        laminaOpciones.setLayout(new GridLayout(2,3));
        String[] caja1={"Tipo","Mensaje","Confirmar","Opción","Entrada"};
        String[] caja2={"Tipo De Mensaje","ERROR_MESSAGE","INFORMATION_MESSAGE","WARNING_MESSAGE","QUESTION_MESSAGE","PLAIN_MESSAGE"};
        String[] caja3={"Mensaje","Cadena","Icono","Componente","Otros","Object[]"};
        String[] caja4={"Confirmar","DEFAULT_OPTION","YES_NO_OPTION","YES_NO_CANCEL_OPTION","OK_CANCEL_OPTION"};
        String[] caja5={"Opción","String[]","Icon[]","Object[]"};
        String[] caja6={"Entrada","Campo de Texto","Combo"};
        grupo1=new ButtonGroup();
        grupo2=new ButtonGroup();
        grupo3=new ButtonGroup();
        grupo4=new ButtonGroup();
        grupo5=new ButtonGroup();
        grupo6=new ButtonGroup();
        GestionaBotones(caja1,grupo1);
        GestionaBotones(caja2,grupo2);
        GestionaBotones(caja3,grupo3);
        GestionaBotones(caja4,grupo4);
        GestionaBotones(caja5,grupo5);
        GestionaBotones(caja6,grupo6);
        add(laminaOpciones,BorderLayout.CENTER);
        
  
    }
        
    private void GestionaBotones(String[] arreglo,ButtonGroup grupo)
    {
        
        Box caja = Box.createVerticalBox();
           
        for(int i = 1;i<arreglo.length;i++)
        {
                   JRadioButton elemento = new JRadioButton(arreglo[i]);
                   elemento.setActionCommand(arreglo[i]);
                   grupo.add(elemento);
                   caja.add(elemento);
                   elemento.setSelected(i==1);
                   
        }
            caja.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), arreglo[0]));
                     
            laminaOpciones.add(caja);
    }
    
    private void evalua()
    {
             if(grupo1.getSelection().getActionCommand().equals("Mensaje"))
             {seleccion=1;}else
             if(grupo1.getSelection().getActionCommand().equals("Confirmar"))
             {seleccion=2;}else
             if(grupo1.getSelection().getActionCommand().equals("Opción"))
             {seleccion=3;}else
             if(grupo1.getSelection().getActionCommand().equals("Entrada"))
             {seleccion=4;}
             if(grupo2.getSelection().getActionCommand().equals("ERROR_MESSAGE"))
             {tipoMensaje=JOptionPane.ERROR_MESSAGE;}else
             if(grupo2.getSelection().getActionCommand().equals("INFORMATION_MESSAGE"))
             {tipoMensaje=JOptionPane.INFORMATION_MESSAGE;}else
             if(grupo2.getSelection().getActionCommand().equals("WARNING_MESSAGE"))
             {tipoMensaje=JOptionPane.WARNING_MESSAGE;}else
             if(grupo2.getSelection().getActionCommand().equals("QUESTION_MESSAGE"))
             {tipoMensaje=JOptionPane.QUESTION_MESSAGE;}else
             if(grupo2.getSelection().getActionCommand().equals("PLAIN_MESSAGE"))
             {tipoMensaje=JOptionPane.PLAIN_MESSAGE;}
             if(grupo3.getSelection().getActionCommand().equals("Cadena"))
             {mensaje="Cadena";}else
             if(grupo3.getSelection().getActionCommand().equals("Icono"))
             {mensaje=new ImageIcon("lampara.png");}else
             if(grupo3.getSelection().getActionCommand().equals("Componente"))
             {mensaje=new JLabel("Componente tipo label");}else
             if(grupo3.getSelection().getActionCommand().equals("Otros"))
             {mensaje=new JButton("Un boton");}else
             if(grupo3.getSelection().getActionCommand().equals("Object[]"))
             {Object[] arreglo={"Eligió Cadena",new ImageIcon("lampara.png"),new JLabel("Componente tipo label"),new JButton("Un boton")};
              mensaje=arreglo;}
             if(grupo4.getSelection().getActionCommand().equals("DEFAULT_OPTION"))
             {opcionConfirma=JOptionPane.DEFAULT_OPTION;}else
             if(grupo4.getSelection().getActionCommand().equals("YES_NO_OPTION"))
             {opcionConfirma=JOptionPane.YES_NO_OPTION;}else
             if(grupo4.getSelection().getActionCommand().equals("YES_NO_CANCEL_OPTION"))
             {opcionConfirma=JOptionPane.YES_NO_CANCEL_OPTION;}else
             if(grupo4.getSelection().getActionCommand().equals("OK_CANCEL_OPTION"))
             {opcionConfirma=JOptionPane.OK_CANCEL_OPTION;}
             if(grupo5.getSelection().getActionCommand().equals("String[]"))
             {opcion=1;}else
             if(grupo5.getSelection().getActionCommand().equals("Icon[]"))
             {opcion=2;}else
             if(grupo5.getSelection().getActionCommand().equals("Object[]"))
             {opcion=3;}
             if(grupo6.getSelection().getActionCommand().equals("Campo de Texto"))
             {opcionInput=1;}else
             if(grupo6.getSelection().getActionCommand().equals("Combo"))
             {opcionInput=2;}
    }
    private class MuestraMensaje implements ActionListener
    
    {
         public void actionPerformed(ActionEvent e)
         {
             evalua();
            switch(seleccion)
             {
                 case 1:
                 JOptionPane.showMessageDialog(null,mensaje,"Tipo Mensaje",tipoMensaje);
                 break;
                 case 2:
                 JOptionPane.showConfirmDialog(null, mensaje, "Tipo Confirma",opcionConfirma );
                 break;
                 case 3:
                 if(opcion==1)
                 {String[] array = {"Primera","Segunda","Tercera"};
                 JOptionPane.showOptionDialog(null, mensaje, "Tipo Opcion", opcionConfirma, tipoMensaje, null,array, null);
                  }else
                 if(opcion==2)
                 {Icon[] arrayIconos ={new ImageIcon("facebook .png"),new ImageIcon("gorjeo.png"),new ImageIcon("instagram.png")};
                 JOptionPane.showOptionDialog(null, mensaje, "Tipo Opcion", opcionConfirma, tipoMensaje, null,arrayIconos, null);
                  }else{
                 Object[] arrayTodo={"Primera","Segunda","Tercera",new ImageIcon("facebook .png"),new ImageIcon("gorjeo.png"),new ImageIcon("instagram.png")};
                 JOptionPane.showOptionDialog(null, mensaje, "Tipo Opcion", opcionConfirma, tipoMensaje, null,arrayTodo, null);}
                 break;
                 case 4:
                 if(opcionInput==1)
                 {JOptionPane.showInputDialog(null, mensaje, "Tipo Entrada", tipoMensaje, null, null, null);
                 }else{
                  String[] array = {"Primera","Segunda","Tercera"};
                  JOptionPane.showInputDialog(null, mensaje, "Tipo Entrada", tipoMensaje, null, array, null);
                 }
                 break;
                 
             }
             
             
         }
    }
    
    private JPanel laminaOpciones;
    private ButtonGroup grupo1,grupo2,grupo3,grupo4,grupo5,grupo6;
    private int seleccion,tipoMensaje,opcionConfirma,opcion,opcionInput;
    private Object mensaje;
}