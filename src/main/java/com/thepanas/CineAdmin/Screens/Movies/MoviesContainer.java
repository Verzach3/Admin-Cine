package com.thepanas.CineAdmin.Screens.Movies;

import com.thepanas.CineAdmin.Main;
import com.thepanas.CineAdmin.GUILib.MovieCard;
import com.thepanas.CineAdmin.Types.Movie;
import com.thepanas.CineAdmin.Utils.ResourseLoader;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.ArrayList;

public class MoviesContainer extends JPanel implements MouseInputListener, MouseWheelListener, MouseMotionListener {

    //Demo movies
    ResourseLoader resourseLoader = new ResourseLoader();
    ArrayList<MovieCard> demoArray = new ArrayList<>();

    MovieCard movie1 = new MovieCard(this);
    MovieCard movie2 = new MovieCard(this);


    Main mainFrame;
    int superiorPanelX = 0;

    int superiorPanelY = 0;

    public MoviesContainer(Main mainFrame){
        //Demo movies

        movie1.setLocation(73,98);
        movie1.setName("  Mortal Kombat");
        movie1.setClassification("+18");
        movie1.setMovieImage(resourseLoader.loadImage("mk.jpg"));
        movie2.setName("     Joker");
        movie2.setMovieImage(resourseLoader.loadImage("joker.jpg"));
        demoArray.add(movie2);
        demoArray.add(movie1);
        demoArray.add(movie1);
        demoArray.add(movie1);
        demoArray.add(movie1);
        this.mainFrame = mainFrame;
        this.setSize(1024, 5000);

        this.setBackground(Color.CYAN);

        this.setFocusable(true);
        this.requestFocus();
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
        this.addMouseWheelListener(this);

        resourseLoader.init();


    }

    public void render(Graphics2D g){
        int defaultX = 73;
        int defaultY = 98;
        int counter = 0;
        for (MovieCard movieCard: demoArray){
            movieCard.paintComponent(g);
            movieCard.setLocation(defaultX, defaultY);
            defaultX += 46 + movieCard.getWidth();
            if (counter >= 2){
                defaultY += 42 + movieCard.getHeight();
                counter = 0;
                defaultX = 73;
            }else {
                counter ++;
            }

        }
    }



    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;

        System.out.println(demoArray.size());


        render(g2D);
        //Superior bar
        g2D.setColor(Color.BLACK);
        g2D.fillRect(superiorPanelX,superiorPanelY,1024,56);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        for (MovieCard movieCard: demoArray){
            movieCard.evenListener(e);
        }
        repaint();
        super.repaint();
    }


    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        System.out.println(e.getUnitsToScroll());

        System.out.println("Y: " + this.getY());

        if (!(this.getY() > 0)){
        this.setLocation(0, this.getY() + (e.getUnitsToScroll() * 10) * -1);
        superiorPanelY += (e.getUnitsToScroll()*10);
        }
        if (this.getY() >= 0){
            this.setLocation(this.getX(), 0);
            superiorPanelY = 0;
        }
        mainFrame.repaint();
        repaint();
    }
}
