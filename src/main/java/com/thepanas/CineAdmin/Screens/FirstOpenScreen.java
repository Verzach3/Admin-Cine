package com.thepanas.CineAdmin.Screens;

import com.thepanas.CineAdmin.Types.Usuario;
import com.thepanas.GUILib.TButton;
import com.thepanas.GUILib.TLabel;

import com.thepanas.CineAdmin.Main;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;

public class FirstOpenScreen extends JPanel implements MouseListener {
    Main mainFrame;
    /**
     * Los componentes tambien se definen como variables globales por la misma razon
     * que el objeto main.
     */
    TButton continueButton = new TButton();
    TLabel welcomeText = new TLabel();
    CreateAdminScreen createAdminScreen;

   public FirstOpenScreen(Main mainFrame,ArrayList<Usuario> userDatabase) {
        this.mainFrame = mainFrame;

        // Tamaño del panel
        this.setSize(1024, 768);
        // Layout manager del panel
        this.setLayout(null);
        // Tamaño de el boton
        continueButton.setSize(110, 40);
        // Unicacion del boton
        continueButton.setLocation(500, 400);
        // Texto de el boton
        continueButton.setText("Comenzar");
        // Ubicacion de el label
        welcomeText.setLocation(400, 40);
        // Texto de el label
        welcomeText.setText("Bienvenido al Panel de Control de CinemaFilms");
        //Tamaño del texto
        welcomeText.setSize(25);

        this.addMouseListener(this);
    }

    // Aqui van los metodos .paintComponent de los componentes
    public void paint(Graphics g) {
       super.paint(g);
        // Se castea(convierte) de Graphics a Graphics2D
        Graphics2D g2D = (Graphics2D) g;

        // Dibujo de los componentes
        continueButton.paintComponent(g2D);
        welcomeText.paintComponent(g2D);
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
}
