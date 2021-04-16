package com.thepanas.CineAdmin.Screens.AdminScreen.AdminScreens;

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
public class CreateMovie extends JPanel implements MouseListener {

    Main mainFrame;
    ArrayList<User> dataBase;
    TInputBox movieName = new TInputBox();
    TInputBox movieGenre = new TInputBox();
    TInputBox movieDuration = new TInputBox();
    TInputBox confirmPassWord = new TInputBox();
    TInputBox movieType = new TInputBox();
    TLabel welcomeLabel = new TLabel();

    public CreateMovie(Main mainFrame) {
        this.mainFrame = mainFrame;
        this.dataBase = mainFrame.userDataBase;
        this.setSize(650, 768);
        this.setLocation(300, 0);
        this.setLayout(null);
        movieName.setLocation(202, 150);
        movieName.setSize(200, 30);
        movieName.setPlaceholder("Nombre");
        movieGenre.setLocation(202, 200);
        movieGenre.setSize(200, 30);
        movieGenre.setPlaceholder("Genero");
        movieDuration.setLocation(202, 250);
        movieDuration.setSize(200, 30);
        movieDuration.setPlaceholder("Duración");
        confirmPassWord.setLocation(202, 300);
        confirmPassWord.setSize(200, 30);
        confirmPassWord.setPlaceholder("Clasificación");
        movieType.setLocation(202, 350);
        movieType.setSize(200, 30);
        movieType.setPlaceholder("Tipo");


            this.addMouseListener(this);
    }

    // Aqui van los metodos .paintComponent de los componentes
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;

        movieName.paintComponent(g2D);
        movieGenre.paintComponent(g2D);
        movieDuration.paintComponent(g2D);
        confirmPassWord.paintComponent(g2D);

    }

    public void createSupervisor() {
        User newUser;
        String finalPassword;

    }


    @Override
    public void mouseClicked(MouseEvent e) {

        this.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        movieGenre.evenListener(e);
        movieName.evenListener(e);
        movieType.evenListener(e);
        movieDuration.evenListener(e);
        confirmPassWord.evenListener(e);


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
