package com.thepanas.CineAdmin.Screens.ClientScreen;

import com.thepanas.CineAdmin.Main;
import com.thepanas.GUILib.TButton;
import com.thepanas.GUILib.TLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


@SuppressWarnings("serial")
public class ClientPanel extends JPanel implements MouseListener{

    Main mainFrame;

    //Botones
    TButton modifyName = new TButton();
    TButton modifyPassword = new TButton();
    TButton modifyUser = new TButton();
    TLabel title = new TLabel();

    public ClientPanel(Main mainFrame){

        this.mainFrame = mainFrame;



        this.setSize(258,768);
        this.setLayout(null);

        //componentes

            //Botones
            modifyName.setSize(150,48);
            modifyName.setText("Modificar Nombre");
            modifyName.setLocation(74,100);


            modifyPassword.setSize(150,45);
            modifyPassword.setText("Modificar Contraseña");
            modifyPassword.setLocation(74,200);

            modifyUser.setSize(150,45);
            modifyUser.setText("Modificar usuario");
            modifyUser.setLocation(74,300);


        this.addMouseListener(this);
    }

    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        modifyName.paintComponent(g2D);
        modifyUser.paintComponent(g2D);
        modifyPassword.paintComponent(g2D);
        title.paintComponent(g2D);
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
        modifyName.evenListener(e);
        modifyUser.evenListener(e);
        modifyPassword.evenListener(e);
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
