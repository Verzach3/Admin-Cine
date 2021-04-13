package com.thepanas.CineAdmin.Screens.AdminScreen;

import com.thepanas.CineAdmin.Main;
import com.thepanas.CineAdmin.Screens.CreateAdminScreen;
import com.thepanas.CineAdmin.Types.User;
import com.thepanas.GUILib.TButton;
import com.thepanas.GUILib.TLabel;

import javax.swing.*;
import javax.swing.event.MouseInputListener;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class MainScreenAdmin extends JPanel implements MouseInputListener {
    Boolean debugOverlay = false;
    Main mainFrame;
    /**
     * Los componentes tambien se definen como variables globales por la misma razon
     * que el objeto main.
     */
    TButton startButton = new TButton();
    TLabel welcomeMessage = new TLabel();
    CreateAdminScreen createAdminScreen;

    public MainScreenAdmin(Main mainFrame, ArrayList<User> userDatabase) {
        this.mainFrame = mainFrame;

        // Tamaño del panel
        this.setSize(767, 768);
        // Layout manager del panel
        this.setLayout(null);
        // Tamaño de el boton
        startButton.setSize(110, 40);
        // Unicacion del boton
        startButton.setLocation(500, 400);
        // Texto de el boton
        startButton.setText("Comenzar");
        // Ubicacion de el label
        welcomeMessage.setLocation(400, 40);
        // Texto de el label
        welcomeMessage.setText("Bienvenido al Panel de Control de CinemaFilms");
        // Tamaño del texto
        welcomeMessage.setSize(25);

        this.setDebugOverlay(true);

    }

    // Activa el overlay si el status es true
    public void setDebugOverlay(Boolean status) {
        debugOverlay = status;
    }

    // Aqui van los metodos .paintComponent de los componentes
    public void paint(Graphics g) {
        // Se castea(convierte) de Graphics a Graphics2D
        Graphics2D g2D = (Graphics2D) g;

        // Dibujo de los componentes
        startButton.paintComponent(g2D);
        welcomeMessage.paintComponent(g2D);

        if (debugOverlay) {
            g2D.fillRect(466, 768, 132, 300);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (startButton.evenListener(e)) {
            mainFrame.panelChanger(1);

        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        startButton.onRelease();
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
