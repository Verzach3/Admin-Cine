package com.thepanas.CineAdmin;

import com.thepanas.CineAdmin.Screens.*;
import com.thepanas.CineAdmin.Screens.AdminScreen.AdminLateralPanel;
import com.thepanas.CineAdmin.Screens.CreateAdminScreen;
import com.thepanas.CineAdmin.Types.User;

import javax.swing.JFrame;

import java.awt.*;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Main extends JFrame {

    //Database donde se van a guardar los usuarios
    public ArrayList<User> userDataBase = new ArrayList<>();
    public User currentUser;
    static Main mainFrame = new Main();

    ///////////////////////////////////////// Definicion de los screens de la aplicacion ///////////////////////////////////
    CreateAdminScreen createAdminScreen = new CreateAdminScreen(this,userDataBase);
    FirstOpenScreen firstOpenScreen = new FirstOpenScreen(this ,userDataBase);
    LoginScreen loginScreen = new LoginScreen(this,userDataBase);
    ScreenTemplate screenTemplate = new ScreenTemplate(this, userDataBase);
    AdminLateralPanel adminLateralPanel = new AdminLateralPanel(this, userDataBase);

///////////////////

    public Main() {
        //TamaÃ±o de la ventana
        this.setSize(new Dimension(1024, 720));


        //Sin layout manager
        this.setLayout(null);
        //Nombre de la ventana o frame
        this.setName("Cinema Films");
        //Operacion de cierre de la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Ubicacion relativa a ningun componente
        this.setLocationRelativeTo(null);
        //Impide expandir la ventana
        this.setResizable(false);


    }

    public void panelChanger(int panelNumber){
        mainFrame.getContentPane().removeAll();
        mainFrame.repaint();
        switch (panelNumber){
            case 0:
                mainFrame.add(firstOpenScreen);
                break;
            case 1:
                mainFrame.add(createAdminScreen);
                break;
            case 2:
                mainFrame.add(loginScreen);
                break;
            case 3:
                mainFrame.add(adminLateralPanel);
                break;

        }
    }

    public static void main(String[] args) {
        //Se pone visible el frame
        mainFrame.panelChanger(0);

        mainFrame.setVisible(true);


    }

}


