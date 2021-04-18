package com.thepanas.CineAdmin.Screens.AdminScreen.AdminScreens;

import com.thepanas.CineAdmin.GUILib.TBarGraphics;
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
    JFrame f = new JFrame();
    TButton generatorButton = new TButton();
    ArrayList<User> dataBase;

    public StatisticsUsers(Main mainFrame){
        this.mainFrame = mainFrame;
        this.setSize(650,768);
        this.setLocation(300,0);
        this.dataBase = mainFrame.userDataBase;
        this.setLayout(null);
        generatorButton.setLocation(350,200);
        generatorButton.setText("Generar Datos");
        generatorButton.setSize(115,45);
        this.addMouseListener(this);
    }
    //-----------------> no se alcanzo a implementar falto tiempo
    public void userGenerator() {
        int datos = 0;
        int x = 0;
        for (User user : dataBase) {
            if(user.getNickName().equals(user.getNickName())){
                datos++;

                double[]data = new double[datos];
                f.getContentPane().add(new TBarGraphics(data,"Usuarios registrados"));
                f.setVisible(true);
            }

        }
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
