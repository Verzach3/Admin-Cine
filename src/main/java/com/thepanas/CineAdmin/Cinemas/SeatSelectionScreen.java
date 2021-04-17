package com.thepanas.CineAdmin.Cinemas;

import com.thepanas.CineAdmin.GUILib.TButton;
import com.thepanas.CineAdmin.GUILib.TSeat;
import com.thepanas.CineAdmin.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SeatSelectionScreen extends JPanel implements MouseListener{

    TSeat seat = new TSeat(this);

    Main mainFrame;

    public SeatSelectionScreen(Main mainFrame){

        this.mainFrame = mainFrame;

        this.setSize(1024,768);

        this.addMouseListener(this);
    }


    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        seat.paintComponent(g2D);


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
}
