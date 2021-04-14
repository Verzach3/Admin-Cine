package com.thepanas.CineAdmin.Utils.ImageLoader;


import java.awt.Color;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Ventana extends JFrame{
    
    public Ventana(){
        super("Este el texto de la barra de titulo");
        setSize(800, 600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.GRAY);
        setLocationRelativeTo(null);
        setLayout(null);
        
        ImageMethods area = new ImageMethods();
        add(area);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Ventana obj = new Ventana();
    }
}
