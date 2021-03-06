package com.thepanas.CineAdmin.Screens.AdminScreen.AdminScreens;

import com.thepanas.CineAdmin.GUILib.TButton;
import com.thepanas.CineAdmin.GUILib.TInputBox;
import com.thepanas.CineAdmin.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class StatisticsScreen extends JPanel implements MouseListener {

    Main mainFrame;
    TButton statisticsButton = new TButton();
    TInputBox dataRoom = new TInputBox();
    TButton generatorButton = new TButton();
    //--->Paneles Hijo
    StatisticsUsers statisticsUsers;

    public StatisticsScreen(Main mainFrame){
        this.mainFrame = mainFrame;
        this.setSize(1024,768);
        this.setLayout(null);
        statisticsUsers = new StatisticsUsers(mainFrame);
        //----->Componentes
        statisticsButton.setLocation(50,250);
        statisticsButton.setText("Estadistica de usuarios");
        statisticsButton.setSize(170,45);


        this.addMouseListener(this);
    }
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g.setColor(Color.black);
        g2D.fillRect(0, 0, 258, this.getHeight());
        statisticsButton.paintComponent(g2D);
    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
    if(statisticsButton.evenListener(e)){
        this.add(statisticsUsers);
    }
    repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    statisticsButton.onRelease();
    repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
