package com.thepanas.CineAdmin.Screens;

import com.thepanas.CineAdmin.Main;
import com.thepanas.CineAdmin.Types.User;
import com.thepanas.CineAdmin.Utils.MakeDialog;
import com.thepanas.GUILib.TButton;
import com.thepanas.GUILib.TInputBox;
import com.thepanas.GUILib.TLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class EditDataScreen extends JPanel implements MouseListener {

    Main mainFrame;
    ArrayList<User> dataBase;
    TButton confirmButton = new TButton();
    TInputBox nameField = new TInputBox();
    TInputBox userName = new TInputBox();
    TInputBox passWord = new TInputBox();
    TInputBox confirmPassWord = new TInputBox();
    TLabel titleLabel = new TLabel();
    Boolean isFirstPaint = true;

    public EditDataScreen(Main mainFrame) {
        this.mainFrame = mainFrame;
        this.dataBase = mainFrame.userDataBase;
        this.setSize(650, 768);
        this.setLocation(300,0);
        this.setLayout(null);
        nameField.setLocation(202, 150);
        nameField.setSize(200, 30);
        nameField.setPlaceholder("Nuevo Nombre");
        userName.setLocation(202, 200);
        userName.setSize(200, 30);
        userName.setPlaceholder("Nuevo Usuario");
        passWord.setLocation(202, 250);
        passWord.setSize(200, 30);
        passWord.setPlaceholder("Nueva Contraseña");
        confirmPassWord.setLocation(202, 300);
        confirmPassWord.setSize(200, 30);
        confirmPassWord.setPlaceholder("Confirmar Contraseña");
        confirmButton.setLocation(242, 400);
        confirmButton.setSize(110, 40);
        confirmButton.setText("Editar");
        titleLabel.setLocation(160, 80);
        titleLabel.setSize(30);
        titleLabel.setText("EDITAR DATOS");

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

        if (isFirstPaint){
            nameField.setText(mainFrame.currentUser.getName());
            userName.setText(mainFrame.currentUser.getNickName());
            isFirstPaint = false;
        }

    }

    public boolean checkUser(){

        for (User user : mainFrame.userDataBase){
            if (mainFrame.currentUser.getNickName().equals(userName.getText())){
                return true;
            }

            return !user.getNickName().equals(userName.getText());
        }
        return false;
    }

    public void editUser() {
        for (User user: mainFrame.userDataBase){

            if (!nameField.getText().equals("") && !userName.getText().equals("") && passWord.getText().equals(confirmPassWord.getText())){
            if (checkUser()){
                if (user == mainFrame.currentUser){
                user.setName(nameField.getText());
                nameField.setText("");
                user.setNickName(userName.getText().trim());
                userName.setText("");
                user.setPassword(passWord.getText());
                passWord.setText("");
                confirmPassWord.setText("");
                System.out.println();
                MakeDialog.makeInfoDialog("Todo listo!, por favor vuelva a iniciar sesión", "Todo listo");
                System.out.println("Logout");
                mainFrame.currentUser = null;
                isFirstPaint = true;
                mainFrame.panelChanger(2);

            }
            }
            }else {
                MakeDialog.makeErrorDialog("Uno o mas campos vacios, o las contraseñas no coinciden", "Error");
            }
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
                editUser();
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
