package com.thepanas.CineAdmin.Utils;

import com.thepanas.GUILib.TButton;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class UIDesigner extends JFrame implements MouseInputListener {

    int width;
    int height;
    int round;

    TButton plusRound = new TButton();
    TButton lessRound = new TButton();
    TButton plusSizeH = new TButton();
    TButton lessSizeH = new TButton();
    TButton plusSizeW = new TButton();
    TButton lessSizeW = new TButton();
    UIDesigner(){

        this.setSize(new Dimension(1024, 768));
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        this.setVisible(true);
    }

    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;

        plusRound.paintComponent(g2D);
        lessRound.paintComponent(g2D);
        plusSizeH.paintComponent(g2D);
        lessSizeH.paintComponent(g2D);
        plusSizeW.paintComponent(g2D);
        lessSizeH.paintComponent(g2D);
    }

    public static void main(String[] args) {

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
}
