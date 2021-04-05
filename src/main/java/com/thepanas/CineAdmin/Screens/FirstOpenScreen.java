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
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;

public class FirstOpenScreen extends JPanel {
    Main mainFrame;
    /**
     * Los componentes tambien se definen como variables globales por la misma razon
     * que el objeto main.
     */
    TButton button1 = new TButton();
    TLabel label1 = new TLabel();
    CreateAdminScreen createAdminScreen;

   public FirstOpenScreen(Main mainFrame,ArrayList<Usuario> userDatabase) {
        this.mainFrame = mainFrame;

        // Tamaño del panel
        this.setSize(1024, 768);
        // Layout manager del panel
        this.setLayout(null);
        // Tamaño de el boton
        button1.setSize(110, 40);
        // Unicacion del boton
        button1.setLocation(500, 400);
        // Texto de el boton
        button1.setText("Comenzar");
        // Ubicacion de el label
        label1.setLocation(400, 40);
        // Texto de el label
        label1.setText("Bienvenido al Panel de Control de CinemaFilms");
        //Tamaño del texto
        label1.setSize(25);

        eventosMouse();
    }

    // Aqui van los metodos .paintComponent de los componentes
    public void paint(Graphics g) {
       super.paint(g);
        // Se castea(convierte) de Graphics a Graphics2D
        Graphics2D g2D = (Graphics2D) g;

        // Dibujo de los componentes
        button1.paintComponent(g2D);
        label1.paintComponent(g2D);
    }

    // Mouse Handler // Maneja los eventos del mouse
    public void eventosMouse() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (button1.evenListener(e)){
                    mainFrame.panelChanger(1);

                }
                // Leave here
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                button1.evenListener(e);
                // Leave here
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                // Leave here
                repaint();
                button1.onRelease();
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
