package com.thepanas.CineAdmin.Screens.ClientScreen;

import com.thepanas.CineAdmin.Main;
import com.thepanas.CineAdmin.Types.User;
import com.thepanas.CineAdmin.GUILib.TButton;
import com.thepanas.CineAdmin.GUILib.TInputBox;
import com.thepanas.CineAdmin.GUILib.TLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;


@SuppressWarnings("serial")
public class ClientPanel extends JPanel implements MouseListener{

    Main mainFrame;

    //Botones
    ArrayList<User>dataBase;
    TInputBox modifyName = new TInputBox();
    TInputBox modifyPassword = new TInputBox();
    TInputBox confirmPassword = new TInputBox();
    TInputBox modifyUser = new TInputBox();
    TLabel title = new TLabel();
    TButton confirm = new TButton();


    public ClientPanel(Main mainFrame){

        this.mainFrame = mainFrame;
        this.dataBase = mainFrame.userDataBase;
        this.setSize(1024,768);

        this.setLocation(300,0);
        this.setBackground(Color.cyan);
        this.setLayout(null);

        //componentes

            //InPuts
            modifyName.setSize(200,30);
            modifyName.setPlaceholder("Modificar Nombre");
            modifyName.setLocation(250,150);

            modifyUser.setSize(200,30);
            modifyUser.setPlaceholder("Modificar usuario");
            modifyUser.setLocation(250,250);

            modifyPassword.setSize(200,30);
            modifyPassword.setPlaceholder("Modificar Contraseña");
            modifyPassword.setLocation(250,350);

            confirmPassword.setSize(200,30);
            confirmPassword.setPlaceholder("Confirmar Contraseña");
            confirmPassword.setLocation(250,450);

            confirm.setSize(200,30);
            confirm.setText("CONFIRMAR");
            confirm.setLocation(250,550);
            confirm.setSize(15);


        //Titulo
            title.setText("Modificar Datos");
            title.setLocation(190,50);
            title.setSize(45);

        this.addMouseListener(this);
    }
    
    // ------> Probablemente este malo xd
    public void modificarDatos(){

        System.out.println("Nombre: "+modifyName.getText()+"||"+"Usuario: "+modifyUser.getText()+"||"+"Contraseña: "+modifyPassword.getText());
        System.out.println("Cuenta Modificada Exitosamente");
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

        if(confirm.evenListener(e)){
            try {
                modificarDatos();
            }catch (Exception f){
                System.out.println(f);
            }
        }
        this.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        confirm.onRelease();
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
