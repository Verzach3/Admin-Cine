package com.thepanas.CineAdmin.Screens.AdminScreen;

import com.thepanas.CineAdmin.GUILib.TButton;
import com.thepanas.CineAdmin.GUILib.TInputBox;
import com.thepanas.CineAdmin.GUILib.TLabel;
import com.thepanas.CineAdmin.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CreateMovieX extends JPanel implements MouseListener {

    Main mainFrame;
    TInputBox nameMovie = new TInputBox();
    TInputBox genderType = new TInputBox();
    TInputBox duration = new TInputBox();
    TInputBox classificationType = new TInputBox();
    TLabel title = new TLabel();
    TButton createMovie = new TButton();
    TButton logout = new TButton();

    public CreateMovieX(Main mainFrame){
        this.mainFrame = mainFrame;
        this.setLayout(null);
        this.setSize(650,768);
        this.setLocation(300,0);

        //-------> Componentes
        nameMovie.setLocation(100,100);
        nameMovie.setSize(200,30);
        nameMovie.setPlaceholder("Nombre");

        genderType.setLocation(100,200);
        genderType.setSize(200,30);
        genderType.setPlaceholder("Genero");

        duration.setLocation(100,300);
        duration.setSize(200,30);
        duration.setPlaceholder("Duracion");

        classificationType.setLocation(100,400);
        classificationType.setSize(200,30);
        classificationType.setPlaceholder("Clasificacion");

        createMovie.setLocation(100,500);
        createMovie.setSize(200,30);
        createMovie.setText("Crear Pelicula");

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
        nameMovie.paintComponent(g2D);
        genderType.paintComponent(g2D);
        duration.paintComponent(g2D);
        classificationType.paintComponent(g2D);
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
        nameMovie.evenListener(e);
        genderType.evenListener(e);
        duration.evenListener(e);
        classificationType.evenListener(e);
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
