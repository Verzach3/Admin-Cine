package com.thepanas.cine;

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
        

    }

    public void paint(Graphics g){
        
<<<<<<< HEAD
        g.draw3DRect(0, 0, 100, 100, false);
=======
        g.drawLine(0, 0, 500, 500);
>>>>>>> main

    }

}
