package com.thepanas.CineAdmin.Screens.AdminScreen.AdminScreens;

import com.thepanas.CineAdmin.GUILib.TButton;
import com.thepanas.CineAdmin.GUILib.TInputBox;
import com.thepanas.CineAdmin.GUILib.TLabel;
import com.thepanas.CineAdmin.Main;
import com.thepanas.CineAdmin.Types.MovieFunction;
import com.thepanas.CineAdmin.Types.User;
import com.thepanas.CineAdmin.Utils.MakeDialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class CreateMovieFunction extends JPanel implements MouseListener {

    Main mainFrame;
    ArrayList<User> dataBase;
    TInputBox functionTime = new TInputBox();
    TInputBox startDate = new TInputBox();
    TInputBox endDate = new TInputBox();
    TButton room = new TButton();
    TLabel titleLabel = new TLabel();
    TButton createButton = new TButton();

    public CreateMovieFunction(Main mainFrame) {
        this.mainFrame = mainFrame;
        this.setSize(650, 768);
        this.setLocation(300, 0);
        this.setLayout(null);

        functionTime.setLocation(202, 150);
        functionTime.setSize(200, 30);
        functionTime.setPlaceholder("Hora");

        startDate.setLocation(202, 200);
        startDate.setSize(200, 30);
        startDate.setPlaceholder("Fecha Inicio");

        endDate.setLocation(202, 250);
        endDate.setSize(200, 30);
        endDate.setPlaceholder("Fecha Fin");

        room.setLocation(202, 300);
        room.setSize(200, 30);
        room.setText("Sala");


        titleLabel.setLocation(150, 80);
        titleLabel.setSize(30);
        titleLabel.setText("REGISTRAR FUNCION");

        createButton.setLocation(250, 400);
        createButton.setSize(110, 40);
        createButton.setText("Registrar");


        this.addMouseListener(this);
    }

    // Aqui van los metodos .paintComponent de los componentes
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;

        functionTime.paintComponent(g2D);
        startDate.paintComponent(g2D);
        endDate.paintComponent(g2D);
        room.paintComponent(g2D);
        titleLabel.paintComponent(g2D);
        createButton.paintComponent(g2D);

    }


    @Override
    public void mouseClicked(MouseEvent e) {

        this.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        startDate.evenListener(e);
        functionTime.evenListener(e);

        endDate.evenListener(e);

        if(room.evenListener(e)){
            int selection = MakeDialog.makeButtonSelector(new String[]{"Sala 2D", "Sala 3D", "Sala VIP"});
            switch (selection){
                case 0:
                    int result0 = MakeDialog.makeButtonSelector(new String[]{"Sala 1", "Sala2", "Sala 3"});
                    switch (result0){
                        case 0:
                            room.setText("2D : Sala 1");
                            break;
                        case 1:
                            room.setText("2D : Sala 2");
                            break;
                        case 2:
                            room.setText("2D : Sala 3");

                    }
                    break;
                case 1:
                    int result1 = MakeDialog.makeButtonSelector(new String[]{"Sala 1", "Sala 2"});
                    switch (result1){
                        case 0:
                            room.setText("3D : Sala 1");
                            break;
                        case 1:
                            room.setText("3D : Sala 2");
                    }
                    break;
                case 2:
                    int result2 = MakeDialog.makeButtonSelector(new String[]{"2D", "3D"});
                    switch (result2){
                        case 0:
                            room.setText("2D : Sala VIP");
                            break;
                        case 1:
                            room.setText("3D : Sala VIP");
                            break;
                    }

                    break;
            }
        }

        if(createButton.evenListener(e)){
           if (!functionTime.getText().equals("") && !startDate.getText().equals("") && !endDate.getText().equals("") && !room.getText().equals("") ){
               MovieFunction newFunction = new MovieFunction();

               newFunction.setTime(functionTime.getText());
               newFunction.setStartDate(startDate.getText());
               newFunction.setEndDate(endDate.getText());
               newFunction.setRoomAndType(room.getText());

               mainFrame.functionsDataBase.add(newFunction);



           }else {
               System.out.println("Error");
               System.out.println(room.getText());
           }

        }


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
