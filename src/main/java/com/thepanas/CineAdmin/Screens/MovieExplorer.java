package com.thepanas.CineAdmin.Screens;

import com.thepanas.CineAdmin.Main;
import com.thepanas.GUILib.MovieCard;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class MovieExplorer extends JPanel implements MouseInputListener, MouseWheelListener {

    MovieCard movieCard = new MovieCard();

    Main mainFrame;

    public MovieExplorer(Main mainFrame){
        this.setSize(1024, 720);

        this.setBackground(Color.CYAN);

        this.setFocusable(true);
        this.requestFocus();
        this.addMouseListener(this);
        this.addMouseWheelListener(this);
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
        this.setLocation(0, this.getY() + (e.getUnitsToScroll()*5) * -1);
    }
}
