package com.thepanas.CineAdmin.Screens.Movies;

import com.thepanas.CineAdmin.Main;

import javax.swing.*;
import java.awt.*;

public class Movies extends JPanel {


    Main mainFrame;
    MoviesContainer moviesContainer;

    public Movies(Main mainFrame){
        this.mainFrame = mainFrame;
        moviesContainer = new MoviesContainer(mainFrame);
        this.setSize(1024,720);
        this.setFocusable(true);
        this.requestFocus();


        this.add(moviesContainer);
        this.repaint();



    }


    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
    }

}
