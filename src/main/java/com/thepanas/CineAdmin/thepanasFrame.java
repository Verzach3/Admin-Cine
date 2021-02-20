package com.thepanas.CineAdmin;

import javax.swing.JFrame;
import java.awt.*;


public class thepanasFrame extends JFrame{
    
    thepanasFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);




        this.setVisible(true);
    } 
    
    public void paint (Graphics g){
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawLine(0, 0, 500, 500);
        thepanasGUI panas = new thepanasGUI();
        panas.TButton(60, 60, 50, 25, "Hola", (Graphics2D) g);
    }
}