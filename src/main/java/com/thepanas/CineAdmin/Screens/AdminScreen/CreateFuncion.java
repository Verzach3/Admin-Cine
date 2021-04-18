package com.thepanas.CineAdmin.Screens.AdminScreen;

import com.thepanas.CineAdmin.GUILib.TButton;
import com.thepanas.CineAdmin.GUILib.TInputBox;
import com.thepanas.CineAdmin.GUILib.TLabel;
import com.thepanas.CineAdmin.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CreateFuncion extends JPanel implements MouseListener {

    Main mainFrame;
    TInputBox typeFunction = new TInputBox();
    TInputBox typeofSchedule = new TInputBox();
    TInputBox typeofRom = new TInputBox();
    TInputBox classificationType = new TInputBox();
    TInputBox chairType = new TInputBox();
    TLabel title = new TLabel();
    TButton createMovie = new TButton();
    TButton logout = new TButton();

    public CreateFuncion(Main mainFrame){
        this.mainFrame = mainFrame;
        this.setLayout(null);
        this.setSize(650,768);
        this.setLocation(300,0);

        //-------> Componentes
        typeFunction.setLocation(100,100);
        typeFunction.setSize(200,30);
        typeFunction.setPlaceholder("Hora");

        typeofSchedule.setLocation(100,200);
        typeofSchedule.setSize(200,30);
        typeofSchedule.setPlaceholder("Fecha inicio");

        typeofRom.setLocation(100,300);
        typeofRom.setSize(200,30);
        typeofRom.setPlaceholder("Fecha Fin");

        classificationType.setLocation(100,400);
        classificationType.setSize(200,30);
        classificationType.setPlaceholder("Sala");

        chairType.setLocation(100,500);
        chairType.setSize(200,30);
        chairType.setPlaceholder("Tipo de funcion");

        createMovie.setLocation(100,600);
        createMovie.setSize(200,30);
        createMovie.setText("Registrar Pelicula");

        title.setSize(32);
        title.setLocation(100,50);
        title.setText("Crear Pelicula");

        this.addMouseListener(this);
    }
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;

        //-------->Marco
        g2D.setColor(Color.DARK_GRAY);
        g2D.fillRect(400,100,350,400);
        typeFunction.paintComponent(g2D);
        typeofSchedule.paintComponent(g2D);
        typeofRom.paintComponent(g2D);
        classificationType.paintComponent(g2D);
        chairType.paintComponent(g2D);
        title.paintComponent(g2D);
        createMovie.paintComponent(g2D);
        logout.paintComponent(g2D);
    }
    @Override
    public void mouseClicked(MouseEvent e) {

        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        typeFunction.evenListener(e);
        typeofSchedule.evenListener(e);
        typeofRom.evenListener(e);
        classificationType.evenListener(e);
        chairType.evenListener(e);
        createMovie.evenListener(e);

        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        logout.onRelease();
        createMovie.onRelease();

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
