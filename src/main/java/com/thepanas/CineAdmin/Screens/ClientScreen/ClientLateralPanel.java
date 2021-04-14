package com.thepanas.CineAdmin.Screens.ClientScreen;

import com.thepanas.CineAdmin.Main;
import com.thepanas.GUILib.TButton;
import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class ClientLateralPanel extends JPanel implements MouseInputListener {

    Main mainFrame;
    TButton bookTickets = new TButton();
    TButton buyTickets = new TButton();
    TButton movieConsultation = new TButton();
    TButton modifyData = new TButton();
    boolean affiliated;

    public ClientLateralPanel(Main mainFrame, boolean affiliated) {

        this.affiliated = affiliated;
        this.mainFrame = mainFrame;

        this.setSize(258, 768);
        this.setLayout(null);

        /// Componentes///
        bookTickets.setLocation(73, 100);
        bookTickets.setSize(125, 45);
        bookTickets.setText("Reservar tiquetes");

        buyTickets.setLocation(73, 200);
        buyTickets.setSize(125, 45);
        buyTickets.setText("Comprar tiquetes");

        movieConsultation.setLocation(73, 300);
        movieConsultation.setSize(150, 48);
        movieConsultation.setText("Consulta de peliculas");

        modifyData.setLocation(73, 400);
        modifyData.setSize(115, 48);
        modifyData.setText("Modificar datos");

    }


    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        bookTickets.paintComponent(g2D);
        buyTickets.paintComponent(g2D);
        movieConsultation.paintComponent(g2D);
        modifyData.paintComponent(g2D);

    }

    public void onExit() {
        this.setVisible(false);

        // El return se usa para decirle al mainframe que Panel deberia de estar

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
       bookTickets.evenListener(e);
       buyTickets.evenListener(e);
       movieConsultation.evenListener(e);
       modifyData.evenListener(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       

        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {

        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {

        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        repaint();
    }
}
