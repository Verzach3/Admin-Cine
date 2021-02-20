package com.thepanas.CineAdmin;

import java.awt.*;
import java.awt.color.*;
import java.awt.event.*;

import javax.swing.JPanel;
/*
    Aqui se definen los botones y los elementos que vayamos a hacer de la interfaz
    El mouse listener y las acciones solo pueden ir donde se define el JFrame
    por lo que toca definir una manera simple de obtener si se pulso el boton o no
*/

public class thepanasGUI {
    thepanasGUI(){


    }

    public void TButton(int x, int y, int width, int height, String text, Graphics2D g){
        g.setColor(new Color(52,73,94));
        g.fillRect(x, y, width, height);
        g.setColor(new Color(44,62,80));
        g.setStroke(new BasicStroke(2));
        g.drawRect(x, y, width, height);

    }


}

