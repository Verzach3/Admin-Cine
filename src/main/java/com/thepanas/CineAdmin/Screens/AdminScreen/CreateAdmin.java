package com.thepanas.CineAdmin.Screens.AdminScreen;

import com.thepanas.CineAdmin.GUILib.TButton;
import com.thepanas.CineAdmin.GUILib.TInputBox;
import com.thepanas.CineAdmin.GUILib.TLabel;
import com.thepanas.CineAdmin.Main;
import com.thepanas.CineAdmin.Types.User;
import com.thepanas.CineAdmin.Utils.MakeDialog;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class CreateAdmin extends JPanel implements MouseListener {
    Main mainFrame;
    ArrayList<User> dataBase;
    TButton confirmButton = new TButton();
    TInputBox nameField = new TInputBox();
    TInputBox userName = new TInputBox();
    TInputBox passWord = new TInputBox();
    TInputBox confirmPassWord = new TInputBox();
    TLabel titleLabel = new TLabel();

    public CreateAdmin(Main mainFrame) {
        this.mainFrame = mainFrame;
        this.dataBase = mainFrame.userDataBase;
        this.setSize(650, 768);
        this.setLocation(300,0);
        this.setLayout(null);
        nameField.setLocation(220, 150);
        nameField.setSize(200, 30);

        nameField.setPlaceholder("Nombre");
        userName.setLocation(220, 200);
        userName.setSize(200, 30);

        userName.setPlaceholder("Usuario");
        passWord.setLocation(220, 250);
        passWord.setSize(200, 30);

        passWord.setPlaceholder("Contraseña");
        confirmPassWord.setLocation(220, 300);
        confirmPassWord.setSize(200, 30);

        confirmPassWord.setPlaceholder("Confirmar Contraseña");

        confirmButton.setLocation(260, 400);
        confirmButton.setSize(115, 40);
        confirmButton.setText("Crear Usuario");

        titleLabel.setLocation(125, 80);
        titleLabel.setSize(30);
        titleLabel.setText("CREAR USUARIO ADMIN");

        this.addMouseListener(this);
    }

    // Aqui van los metodos .paintComponent de los componentes
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;

        nameField.paintComponent(g2D);
        userName.paintComponent(g2D);
        passWord.paintComponent(g2D);
        confirmPassWord.paintComponent(g2D);
        confirmButton.paintComponent(g2D);
        titleLabel.paintComponent(g2D);

    }

    public void createSupervisor() {
        User newUser;
        String finalPassword;

        for (User user : dataBase) {
            if (!user.getNickName().equals(userName.getText().trim())) {
                if (!nameField.getText().equals("") || !userName.getText().equals("") || !passWord.getText().equals("") || !confirmPassWord.getText().equals("")) {

                    if (passWord.getText().equals(confirmPassWord.getText())) {
                        finalPassword = passWord.getText();
                        newUser = new User(0, nameField.getText(), userName.getText().trim(), finalPassword);

                        System.out.println("Nombre: "+ newUser.getName()+ " || " + "Usuario: " + newUser.getNickName() + " || " + "Contraseña: " + newUser.getPassword());

                        /*
                         * Avisa de la creacion correcta
                         */
                        mainFrame.userDataBase.add(newUser);
                        MakeDialog.makeInfoDialog("Usuario Administrador Creado Correctamente","");
                        nameField.setText("");
                        userName.setText("");
                        passWord.setText("");
                        confirmPassWord.setText("");

                    } else {
                        MakeDialog.makeErrorDialog("La contraseña no es igual", "Error");
                    }
                }else{
                    MakeDialog.makeErrorDialog("Uno o mas campos vacios", "Error");
                }
                break;
            } if (user.getNickName().equals(userName.getText().trim())){
                MakeDialog.makeErrorDialog("Usuario ya en uso", "Error");
                break;
            }

            System.out.println(user.getNickName() + "||" + userName.getText());
        }


    }


    @Override
    public void mouseClicked(MouseEvent e) {

        this.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        nameField.evenListener(e);
        userName.evenListener(e);
        passWord.evenListener(e);
        confirmPassWord.evenListener(e);


        if (confirmButton.evenListener(e)) {
            try {
                createSupervisor();
            } catch (Exception f) {
                System.out.println(f);
            }

        }

        this.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        confirmButton.onRelease();



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
