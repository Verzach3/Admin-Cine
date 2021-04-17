package com.thepanas.CineAdmin.Screens.ClientScreen;

import com.thepanas.CineAdmin.Main;
import com.thepanas.CineAdmin.GUILib.TButton;
import com.thepanas.CineAdmin.Screens.EditDataScreen;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class ClientLateralPanel extends JPanel implements MouseInputListener {

    Main mainFrame;
    TButton logoutButton = new TButton();
    TButton bookTickets = new TButton();
    TButton buyTickets = new TButton();
    TButton movieConsultation = new TButton();
    TButton modifyData = new TButton();
    boolean affiliated;

   //Paneles hijo
    EditDataScreen editDataScreen;

    public ClientLateralPanel(Main mainFrame, boolean affiliated) {

        editDataScreen = new EditDataScreen(mainFrame);
        this.affiliated = affiliated;
        this.mainFrame = mainFrame;

        this.setSize(1024, 768);
        this.setLayout(null);

        /// Componentes///
        logoutButton.setLocation(50,500);
        logoutButton.setSize(150,45);
        logoutButton.setText("Cerrar Sesion");

        bookTickets.setLocation(50, 100);
        bookTickets.setSize(150, 45);
        bookTickets.setText("Reservar tiquetes");

        buyTickets.setLocation(50, 200);
        buyTickets.setSize(150, 45);
        buyTickets.setText("Comprar tiquetes");

        movieConsultation.setLocation(50, 300);
        movieConsultation.setSize(150, 48);
        movieConsultation.setText("Consulta de peliculas");

        modifyData.setLocation(50, 400);
        modifyData.setSize(150, 48);
        modifyData.setText("Modificar datos");

        this.addMouseListener(this);


        this.addMouseListener(this);


        logoutButton.setLocation(50, 600);
        logoutButton.setSize(100, 48);
        logoutButton.setText("Cerrar Sesion");






    }


    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;



        g2D.fillRect(0,0,300,this.getHeight());

        g2D.fillRect(0,0,258,this.getHeight());

        if(mainFrame.currentUser.getAccessLevel() == 2){
            bookTickets.setLocation(-100,-100);
        }




        bookTickets.paintComponent(g2D);
        buyTickets.paintComponent(g2D);
        movieConsultation.paintComponent(g2D);
        modifyData.paintComponent(g2D);
        logoutButton.paintComponent(g2D);

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

       if(mainFrame.currentUser.getAccessLevel() == 2){
           bookTickets.evenListener(e);
       }
       buyTickets.evenListener(e);
       movieConsultation.evenListener(e);

        if(modifyData.evenListener(e)){
            this.add(editDataScreen);
        }

        if(logoutButton.evenListener(e)){
            mainFrame.currentUser = null;
            mainFrame.panelChanger(2);
        }

        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        modifyData.onRelease();
        logoutButton.onRelease();

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
