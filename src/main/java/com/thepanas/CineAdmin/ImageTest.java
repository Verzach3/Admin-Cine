package main.java.com.thepanas.CineAdmin;

import java.awt.Graphics2D;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.*;
/**
 * ImageTest
 */
public class ImageTest extends JFrame{

    ImageIcon image = new ImageIcon("./Resources/mk.jpg");

    public ImageTest(){
        this.setSize(new Dimension(800,600));
        this.setLocationRelativeTo(null);
        
    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(image.getImage(), 0, 0,400,400, this);
        
    }

    public static void main(String[] args) {

        ImageTest a = new ImageTest();
        a.setVisible(true);

    }
}