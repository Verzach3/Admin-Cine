package com.thepanas.CineAdmin.Screens;

import com.thepanas.CineAdmin.Main;
import com.thepanas.CineAdmin.Types.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class ScreenTemplate extends JPanel implements MouseListener {

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

        this.setSize(17,768);
        this.setLayout(null);

        this.addMouseListener(this);
    }

    //Aqui van los metodos .paintComponent de los componentes
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;


    }


    public void onExit(){
        this.setVisible(false);

        //El return se usa para decirle al mainframe que Panel deberia de estar mostrandose

    }

    //Eventos del mouse
    @Override
    public void mouseClicked(MouseEvent e) {


        this.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

        this.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

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
