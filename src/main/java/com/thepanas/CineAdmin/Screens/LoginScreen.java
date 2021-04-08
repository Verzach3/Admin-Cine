package com.thepanas.CineAdmin.Screens;

import com.thepanas.CineAdmin.Main;
import com.thepanas.CineAdmin.Types.Usuario;
import com.thepanas.GUILib.TButton;
import com.thepanas.GUILib.TInputBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class LoginScreen extends JPanel implements MouseListener {

    /*
    Se define un objeto main para poder acceder al metodo panelchanger
     */
    Main mainFrame;

    TInputBox usernameField = new TInputBox();
    TInputBox passwordField = new TInputBox();
    TButton loginButton = new TButton();
    TButton registerButton = new TButton();



    public LoginScreen(Main mainFrame, ArrayList<Usuario> dataBase){
        /*
        Se le da valor al objeto panel changer con el frame principal dado en el momento de la definicion del objeto en
        el main
         */
        this.mainFrame = mainFrame;

        this.setSize(1024, 768);
        this.setLayout(null);

        usernameField.setSize(200,20);
        usernameField.setLocation(446,241);
        usernameField.setPlaceholder("Nombre de Usuario");

        passwordField.setSize(200,20);
        passwordField.setLocation((446 + passwordField.getWidth()/3),340);
        passwordField.setPlaceholder("Contraseña");

        loginButton.setSize(132,45);
        loginButton.setLocation(446,439);
        loginButton.setText("Login");

        registerButton.setSize(132,45);
        registerButton.setLocation(446,505);
        registerButton.setText("Register");



        this.addMouseListener(this);


        //Leave here
    }

    //Aqui van los metodos .paintComponent de los componentes
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        usernameField.paintComponent(g2D);
        passwordField.paintComponent(g2D);
        loginButton.paintComponent(g2D);
        registerButton.paintComponent(g2D);


    }


    public void onExit(){
        this.setVisible(false);

        //El return se usa para decirle al mainframe que Panel deberia de estar mostrandose

    }


    @Override
    public void mouseClicked(MouseEvent e) {


        this.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        usernameField.evenListener(e);
        passwordField.evenListener(e);
        loginButton.evenListener(e);
        registerButton.evenListener(e);

        this.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

        loginButton.onRelease();
        registerButton.onRelease();

        System.out.println("released");
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
