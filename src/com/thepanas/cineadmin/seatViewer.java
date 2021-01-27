package com.thepanas.cineadmin;

import javax.swing.JFrame;
import java.awt.*;

public class seatViewer extends JFrame {

    seatViewer( ){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);


        int sillas2D = 80;
        int sillas3D = 50;
        int sillasVip = 10;
        

        boolean arraySillas2D [] = new boolean[sillas2D];

        boolean arraySillas3D [] = new boolean[sillas3D];

        boolean arraySillasVip [] = new boolean[sillasVip];

        TButton button = new TButton();

        button.BUTTON_TEXT = "Hola mi so";
        button.Height = 455;
        button.Width = 455;

        button.setVisible(true);
        this.add(button);
        this.pack();

    }

    public void paint(Graphics g){

        //g.draw3DRect(0, 0, 100, 100, false);
    }

}
