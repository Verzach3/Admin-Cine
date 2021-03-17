package com.thepanas.CineAdmin.Screens;

import com.thepanas.GUILib.TButton;
import com.thepanas.GUILib.TLabel;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class FirstOpenScreen extends JPanel{

    //Component definition
    TButton button1 = new TButton();
    TLabel label1 = new TLabel();

    public FirstOpenScreen(){
        this.setSize(1024,768);
        this.setLayout(null);
        button1.setSize(110, 40);
        button1.setLocation(250, 100);
        button1.setText("A Comenzar");
        label1.setLocation(540,240);
        label1.setText("Bienvenido al Panel de Control de CinemaFilms");
    }

    //Aqui van los metodos .paintComponent de los componentes
    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;

        button1.paintComponent(g2D);
        label1.paintComponent(g2D);
    }


    //Mouse Handler // Maneja los eventos del mouse
    public void eventosMouse() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                
                //Leave here
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);

                //Leave here
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);

                //Leave here
                repaint();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

                //Leave here
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);

                //Leave here
                repaint();
            }

            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                super.mouseWheelMoved(e);

                //Leave here
                repaint();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);

                //Leave here
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);

                //Leave here
                repaint();
            }
        });
    }
}
