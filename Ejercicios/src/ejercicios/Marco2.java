package ejercicios;

import javax.swing.*;
import java.awt.*;

public class Marco2 extends JFrame
{
    public Marco2()
    {
    setBounds(420,300,600,400);
    setTitle("Pruebas JOptionPane");
    Lamina2 milamina = new Lamina2();
    add(milamina);
    }
}