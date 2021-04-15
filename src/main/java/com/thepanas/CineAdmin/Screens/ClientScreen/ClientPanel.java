package com.thepanas.CineAdmin.Screens.ClientScreen;

import com.thepanas.CineAdmin.Main;
import com.thepanas.GUILib.TButton;
import com.thepanas.GUILib.TInputBox;
import com.thepanas.GUILib.TLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


@SuppressWarnings("serial")
public class ClientPanel extends JPanel implements MouseListener{

    Main mainFrame;

    //Botones
    TInputBox modifyName = new TInputBox();
    TInputBox modifyPassword = new TInputBox();
    TInputBox confirmPassword = new TInputBox();
    TInputBox modifyUser = new TInputBox();
    TLabel title = new TLabel();
    TButton confirm = new TButton();


    public ClientPanel(Main mainFrame){

        this.mainFrame = mainFrame;



        this.setSize(1024,768);
        this.setBackground(Color.darkGray);
        this.setLayout(null);

        //componentes

            //InPuts

            modifyName.setSize(200,30);
            modifyName.setPlaceholder("Modificar Nombre");
            modifyName.setLocation(400,150);

            modifyUser.setSize(200,30);
            modifyUser.setPlaceholder("Modificar usuario");
            modifyUser.setLocation(400,250);

            modifyPassword.setSize(200,30);
            modifyPassword.setPlaceholder("Modificar Contraseña");
            modifyPassword.setLocation(400,350);

            confirmPassword.setSize(200,30);
            confirmPassword.setPlaceholder("Confirmar Contraseña");
            confirmPassword.setLocation(400,450);

            confirm.setSize(200,30);
            confirm.setText("CONFIRMAR");
            confirm.setLocation(400,550);
            confirm.setSize(15);


        //Titulo
            title.setText("Modificar Datos");
            title.setLocation(350,50);
            title.setSize(45);

        this.addMouseListener(this);
    }

    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        modifyName.paintComponent(g2D);
        modifyUser.paintComponent(g2D);
        modifyPassword.paintComponent(g2D);
        confirmPassword.paintComponent(g2D);
        title.paintComponent(g2D);
        confirm.paintComponent(g2D);

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
        confirmPassword.evenListener(e);
        confirm.evenListener(e);
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
