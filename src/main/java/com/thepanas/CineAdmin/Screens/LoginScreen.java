package com.thepanas.CineAdmin.Screens;

import com.thepanas.CineAdmin.Main;
import com.thepanas.CineAdmin.Types.User;
import com.thepanas.CineAdmin.Utils.MakeDialog;
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



    public LoginScreen(Main mainFrame, ArrayList<User> dataBase){
        /*
        Se le da valor al objeto panel changer con el frame principal dado en el momento de la definicion del objeto en
        el main
         */
        this.mainFrame = mainFrame;

        this.setSize(1024, 768);
        this.setLayout(null);

        usernameField.setSize(200,30);
        usernameField.setLocation(412,241);
        usernameField.setPlaceholder("Nombre de Usuario");

        passwordField.setSize(200,30);
        passwordField.setLocation(412, 320);
        passwordField.setPlaceholder("Contraseña");

        loginButton.setSize(132,45);
        loginButton.setLocation(446,420);
        loginButton.setText("             Login");

        registerButton.setSize(132,45);
        registerButton.setLocation(446,505);
        registerButton.setText("            Register");



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

        if (loginButton.evenListener(e)){
            for (User user: mainFrame.userDataBase){
                if (user.getNickName().equals(usernameField.getText()) && user.getPassword().equals(passwordField.getText())) {
                    MakeDialog.makeInfoDialog("Acceso Correcto","Info");
                    mainFrame.currentUser = user;
                    int accesLevel = mainFrame.currentUser.getAccessLevel();
                    switch (accesLevel){
                        case 0:
                            mainFrame.panelChanger(1);
                    }
                }else {
                    MakeDialog.makeErrorDialog("Nombre de usuario o contraseña incorrecta", "Error");
                }
            }
        }

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
