package com.thepanas.CineAdmin.Screens.AdminScreen.AdminScreens;

import com.thepanas.CineAdmin.GUILib.TButton;
import com.thepanas.CineAdmin.Main;
import com.thepanas.CineAdmin.Types.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class StatisticsUsers extends JPanel implements MouseListener {
    Main mainFrame;

    TButton generatorButton = new TButton();
    ArrayList<User> dataBase;

    public StatisticsUsers(Main mainFrame){
        this.mainFrame = mainFrame;
        this.setSize(1024,768);
        this.setLayout(null);
        generatorButton.setLocation(350,200);
        generatorButton.setText("Generar Datos");
        generatorButton.setSize(115,45);
        this.addMouseListener(this);
    }
    public void userGenerator(){

    }
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        generatorButton.paintComponent(g2D);
    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
       if(generatorButton.evenListener(e)){
           userGenerator();
       }
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        generatorButton.onRelease();
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
