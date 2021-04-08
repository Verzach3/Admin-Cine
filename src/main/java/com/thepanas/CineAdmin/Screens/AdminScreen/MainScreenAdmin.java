package com.thepanas.CineAdmin.Screens.AdminScreen;

import com.thepanas.CineAdmin.Main;
import com.thepanas.CineAdmin.Screens.CreateAdminScreen;
import com.thepanas.CineAdmin.Types.Usuario;
import com.thepanas.GUILib.TButton;
import com.thepanas.GUILib.TLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;

public class MainScreenAdmin extends JPanel {
    Boolean debugOverlay = false;
    Main mainFrame;
    /**
     * Los componentes tambien se definen como variables globales por la misma razon
     * que el objeto main.
     */
    TButton startButton = new TButton();
    TLabel welcomeMessage = new TLabel();
    CreateAdminScreen createAdminScreen;

   public MainScreenAdmin(Main mainFrame, ArrayList<Usuario> userDatabase) {
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
        //Tamaño del texto
        welcomeMessage.setSize(25);

        this.setDebugOverlay(true);

        eventosMouse();
    }

    //Activa el overlay si el status es true
    public void setDebugOverlay(Boolean status){
       debugOverlay = status;
    }

    // Aqui van los metodos .paintComponent de los componentes
    public void paint(Graphics g) {
        // Se castea(convierte) de Graphics a Graphics2D
        Graphics2D g2D = (Graphics2D) g;

        // Dibujo de los componentes
        startButton.paintComponent(g2D);
        welcomeMessage.paintComponent(g2D);

        if (debugOverlay){
            g2D.fillRect(466,768,132,300);
        }
    }

    // Mouse Handler // Maneja los eventos del mouse
    public void eventosMouse() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (startButton.evenListener(e)){
                    mainFrame.panelChanger(1);

                }
                // Leave here
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                startButton.evenListener(e);
                // Leave here
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                // Leave here
                repaint();
                startButton.evenListener(e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

                // Leave here
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);

                // Leave here
                repaint();
            }

            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                super.mouseWheelMoved(e);

                // Leave here
                repaint();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);

                // Leave here
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);

                // Leave here
                repaint();
            }
        });
    }
}