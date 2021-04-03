package com.thepanas.CineAdmin.Screens;

import com.thepanas.CineAdmin.Main;
import com.thepanas.CineAdmin.Types.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class ScreenTemplate extends JPanel{

    /*
    Se define un objeto main para poder acceder al metodo panelchanger
     */
    Main mainFrame;

    public ScreenTemplate(Main mainFrame,ArrayList<Usuario> dataBase){
        /*
        Se le da valor al objeto panel changer con el frame principal dado en el momento de la definicion del objeto en
        el main
         */
        this.mainFrame = mainFrame;

        this.setSize(1024,768);
        this.setLayout(null);

    }

    //Aqui van los metodos .paintComponent de los componentes
    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;

        //Remover
        g2D.drawString("Hello World", 0, 0);
    }


    public void onExit(){
        this.setVisible(false);

        //El return se usa para decirle al mainframe que Panel deberia de estar mostrandose

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
