package com.thepanas.CineAdmin.Screens.Movies;

import com.thepanas.CineAdmin.Main;
import com.thepanas.CineAdmin.GUILib.MovieCard;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class MoviesContainer extends JPanel implements MouseInputListener, MouseWheelListener {

    MovieCard movieCard = new MovieCard();

    Main mainFrame;
    int superiorPanelX = 0;

    int superiorPanelY = 0;

    public MoviesContainer(Main mainFrame){
        this.mainFrame = mainFrame;
        this.setSize(1024, 720);

        this.setBackground(Color.CYAN);

        this.setFocusable(true);
        this.requestFocus();
        this.addMouseListener(this);
        this.addMouseWheelListener(this);

        movieCard.setLocation(80,98);
    }


    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;
        movieCard.paintComponent(g2D);

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

    }


    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        System.out.println(e.getUnitsToScroll());

        System.out.println("Y: " + this.getY());

        if (!(this.getY() > 0)){
        this.setLocation(0, this.getY() + (e.getUnitsToScroll() * 5) * -1);
        superiorPanelY += (e.getUnitsToScroll()*5);
        }
        if (this.getY() >= 0){
            this.setLocation(this.getX(), 0);
            superiorPanelY = 0;
        }
        mainFrame.repaint();
        repaint();
    }
}
