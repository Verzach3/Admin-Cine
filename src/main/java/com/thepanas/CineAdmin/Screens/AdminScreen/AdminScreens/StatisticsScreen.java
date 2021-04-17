package com.thepanas.CineAdmin.Screens.AdminScreen.AdminScreens;

import com.thepanas.CineAdmin.GUILib.TButton;
import com.thepanas.CineAdmin.GUILib.TInputBox;
import com.thepanas.CineAdmin.Main;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class StatisticsScreen extends JPanel implements MouseListener {

    Main mainFrame;
    TButton statisticsButton = new TButton();
    TInputBox dataRoom = new TInputBox();
    TButton generatorButton = new TButton();

    public StatisticsScreen(Main mainFrame){
        this.mainFrame = mainFrame;
        this.setSize(1024,768);
        this.setLayout(null);
        //----->Componentes

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
