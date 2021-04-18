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
        this.setSize(1024,768);

        //-------> Componentes
        typeFunction.setLocation(300,100);
        typeFunction.setSize(200,30);
        typeFunction.setPlaceholder("Tipo de funcion");

        typeofSchedule.setLocation(300,200);
        typeofSchedule.setSize(200,30);
        typeofSchedule.setPlaceholder("Horario");

        typeofRom.setLocation(300,300);
        typeofRom.setSize(200,30);
        typeofRom.setPlaceholder("Sala");

        classificationType.setLocation(300,400);
        classificationType.setSize(200,30);
        classificationType.setPlaceholder("Clasificacion");

        chairType.setLocation(300,500);
        chairType.setSize(200,30);
        chairType.setPlaceholder("Sillas");

        createMovie.setLocation(300,600);
        createMovie.setSize(200,30);
        createMovie.setText("Crear Pelicula");

        title.setSize(32);
        title.setLocation(300,50);
        title.setText("Crear Pelicula");

        logout.setSize(115,30);
        logout.setLocation(50,250);
        logout.setText("Cerrar Sesion");


        this.addMouseListener(this);
    }
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.black);
        g2D.fillRect(0,0,250,this.getHeight());
        //-------->Marco
        g2D.setColor(Color.DARK_GRAY);
        g2D.fillRect(625,100,350,400);
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
        if(logout.evenListener(e)){
            mainFrame.currentUser = null;
            mainFrame.panelChanger(2);
        }

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
