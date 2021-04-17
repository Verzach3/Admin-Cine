package com.thepanas.CineAdmin.Screens;

import com.thepanas.CineAdmin.Utils.ResourseLoader;
import com.thepanas.GUILib.TButton;
import com.thepanas.GUILib.TLabel;

import com.thepanas.CineAdmin.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.event.*;

@SuppressWarnings("serial")
public class FirstOpenScreen extends JPanel implements MouseListener, MouseMotionListener{
    Main mainFrame;
    /**
     * Los componentes tambien se definen como variables globales por la misma razon
     * que el objeto main.
     */
    TButton continueButton = new TButton();
    TLabel welcomeText = new TLabel();
    CreateAdminScreen createAdminScreen;


   public FirstOpenScreen(Main mainFrame) {
        this.mainFrame = mainFrame;
        mainFrame.setTitle("Cinema Films");
        // Tamaño del panel
        this.setSize(1024, 768);
        // Layout manager del panel
        this.setLayout(null);
        // Tamaño de el boton
        continueButton.setSize(110, 40);
        // Unicacion del boton
        continueButton.setLocation(450, 300);
        // Texto de el boton
        continueButton.setText("Comenzar");
        //Tamaño del texto del boton
        continueButton.setFontSize(16);
        // Ubicacion de el label
        welcomeText.setLocation(200, 40);
        // Texto de el label
        welcomeText.setText("Bienvenido al Panel de Control de CinemaFilms");
        //Tamaño del texto
        welcomeText.setSize(30);

        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.setFocusable(true);
        this.requestFocus();
    }

    // Aqui van los metodos .paintComponent de los componentes
    public void paint(Graphics g) {
       super.paint(g);
        // Se castea(convierte) de Graphics a Graphics2D
        Graphics2D g2D = (Graphics2D) g;

        // Dibujo de los componentes
        continueButton.paintComponent(g2D);
        welcomeText.paintComponent(g2D);
        /*
        ResourseLoader rL = new ResourseLoader();
        rL.init();
        Image a = rL.loadImage("mk.jpg");
        g2D.drawImage(a, 50,50 , this);

         */





    }


    @Override
    public void mouseClicked(MouseEvent e) {


       this.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

        if (continueButton.evenListener(e)){
            mainFrame.panelChanger(1);
        }

       this.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       continueButton.onRelease();

       this.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

       this.repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {

       this.repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {


    }

    @Override
    public void mouseMoved(MouseEvent e) {


       this.repaint();

    }

}
