package com.thepanas.CineAdmin.Screens;

import com.thepanas.CineAdmin.Main;
import com.thepanas.CineAdmin.Types.User;
import com.thepanas.CineAdmin.GUILib.TButton;
import com.thepanas.CineAdmin.GUILib.TInputBox;
import com.thepanas.CineAdmin.GUILib.TLabel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

@SuppressWarnings("serial")
public class CreateAdminScreen extends JPanel implements MouseListener {

    Main mainFrame;
    TButton confirmButton = new TButton();
    TButton backButton = new TButton();
    TInputBox nameField = new TInputBox();
    TInputBox userName = new TInputBox();
    TInputBox passWord = new TInputBox();
    TInputBox confirmPassWord = new TInputBox();
    TLabel titleLabel = new TLabel();

    public CreateAdminScreen(Main mainFrame) {
        this.mainFrame = mainFrame;
        this.setSize(1024, 768);
        this.setLayout(null);
        nameField.setLocation(402, 150);
        nameField.setSize(200, 30);
        nameField.setPlaceholder("Nombre");
        userName.setLocation(402, 200);
        userName.setSize(200, 30);
        userName.setPlaceholder("Usuario");
        passWord.setLocation(402, 250);
        passWord.setSize(200, 30);
        passWord.setPlaceholder("Contraseña");
        confirmPassWord.setLocation(402, 300);
        confirmPassWord.setSize(200, 30);
        confirmPassWord.setPlaceholder("Confirmar Contraseña");
        confirmButton.setLocation(442, 350);
        confirmButton.setSize(110, 40);
        confirmButton.setText("Crear Usuario");
        backButton.setLocation(30, 625);
        backButton.setSize(40, 40);
        backButton.setText("<");
        titleLabel.setLocation(320, 80);
        titleLabel.setSize(30);
        titleLabel.setText("CREAR ADMINISTRADOR");

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
        backButton.paintComponent(g2D);
        titleLabel.paintComponent(g2D);



    }

    public void createAdmin() {
        User newAdmin;
        String finalPassword;

        if (!nameField.getText().equals("") || !userName.getText().equals("") || !passWord.getText().equals("") || !confirmPassWord.getText().equals("")) {

            System.out.println(passWord.getText());
            if (passWord.getText().equals(confirmPassWord.getText())) {
                finalPassword = passWord.getText();
                newAdmin = new User(0, nameField.getText(), userName.getText().trim(), finalPassword);
                
                /*
                 * Imprimir el admin recien creado
                 */
                System.out.println("Nombre: "+ newAdmin.getName()+ " || " + "Usuario: " + newAdmin.getNickName() + " || " + "Contraseña: " + newAdmin.getPassword());
                MakeDialog.makeInfoDialog("La Creacion del Administrador ha sido exitosa"," ");
                /*
                 * Avisa de la creacion correcta
                 */
                mainFrame.userDataBase.add(newAdmin);
                JOptionPane.showMessageDialog(null,"Administrador Creado Correctamente","",JOptionPane.INFORMATION_MESSAGE);
                mainFrame.panelChanger(2);
            } else {
                JOptionPane.showMessageDialog(null, "La contraseña no es igual", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Uno o mas campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
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
                createAdmin();
            } catch (Exception f) {
                System.out.println(f);
            }

        }

        if (backButton.evenListener(e)){
            mainFrame.panelChanger(0);
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
