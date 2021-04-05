package com.thepanas.CineAdmin.Screens;

import com.thepanas.CineAdmin.Main;
import com.thepanas.CineAdmin.Types.Usuario;
import com.thepanas.CineAdmin.Utils.PrintUsers;
import com.thepanas.GUILib.TButton;
import com.thepanas.GUILib.TInputBox;
import com.thepanas.GUILib.TLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class CreateAdminScreen extends JPanel {

    Main mainFrame;
    ArrayList<Usuario> dataBase;
    TButton confirmButton = new TButton();
    TButton backButton = new TButton();
    TInputBox nameField = new TInputBox();
    TInputBox userName = new TInputBox();
    TInputBox passWord = new TInputBox();
    TInputBox confirmPassWord = new TInputBox();
    TLabel welcomeLabel = new TLabel();

    public CreateAdminScreen(Main mainFrame, ArrayList<Usuario> dataBase) {
        this.dataBase = dataBase;
        this.mainFrame = mainFrame;
        this.setSize(1024, 768);
        this.setLayout(null);
        nameField.setLocation(402, 150);
        nameField.setSize(200, 20);
        nameField.setPLACEHOLDER("Nombre");
        userName.setLocation(402, 200);
        userName.setSize(200, 20);
        userName.setPLACEHOLDER("Usuario");
        passWord.setLocation(402, 250);
        passWord.setSize(200, 20);
        passWord.setPLACEHOLDER("Contraseña");
        confirmPassWord.setLocation(402, 300);
        confirmPassWord.setSize(200, 20);
        confirmPassWord.setPLACEHOLDER("Confirmar Contraseña");
        confirmButton.setLocation(402, 350);
        confirmButton.setSize(110, 40);
        confirmButton.setText("Crear Usuario");
        backButton.setLocation(30, 670);
        backButton.setSize(40, 40);
        backButton.setText("<");
        eventosMouse();
    }

    // Aqui van los metodos .paintComponent de los componentes
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        nameField.paintComponent(g2D);
        userName.paintComponent(g2D);
        passWord.paintComponent(g2D);
        confirmPassWord.paintComponent(g2D);
        confirmButton.paintComponent(g2D);
        backButton.paintComponent(g2D);

    }

    public void createAdmin() {
        Usuario newAdmin;
        String finalPassword;

        if (!nameField.getText().equals("") || !userName.getText().equals("") || !passWord.getText().equals("") || !confirmPassWord.getText().equals("")) {

            System.out.println(passWord.getText());
            if (passWord.getText().equals(confirmPassWord.getText())) {
                finalPassword = passWord.getText();
                newAdmin = new Usuario(0, nameField.getText(), userName.getText().trim(), finalPassword);
                dataBase.add(newAdmin);
                
                /**
                 * Imprimir el admin recien creado
                 */
                Usuario a = dataBase.get(0);
                System.out.println("Nombre: "+ a.getName()+ " || " + "Usuario: " + a.getNickName() + " || " + "Contraseña: " + a.getPassword());

                /**
                 * Avisa de la creacion correcta
                 */
                JOptionPane.showMessageDialog(null,"Administrador Creado Correctamente","",JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "La contraseña no es igual", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Uno o mas campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }


    public int onHide() {
        this.setVisible(false);
        return 1;
    }

    // Mouse Handler // Maneja los eventos del mouse
    public void eventosMouse() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                // Leave here
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
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

                // Leave here
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                confirmButton.onRelease();
                // Leave here
                repaint();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

                // Leave here
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);

                // Leave here
                repaint();
            }

            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                super.mouseWheelMoved(e);

                // Leave here
                repaint();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);

                // Leave here
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);

                // Leave here
                repaint();
            }
        });
    }
}
