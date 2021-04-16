package com.thepanas.CineAdmin;

import com.thepanas.CineAdmin.Screens.*;
import com.thepanas.CineAdmin.Screens.AdminScreen.AdminLateralPanel;
import com.thepanas.CineAdmin.Screens.ClientScreen.ClientLateralPanel;
import com.thepanas.CineAdmin.Screens.ClientScreen.ClientPanel;
import com.thepanas.CineAdmin.Screens.CreateAdminScreen;
import com.thepanas.CineAdmin.Types.Movie;
import com.thepanas.CineAdmin.Types.User;
import com.thepanas.CineAdmin.Types.MovieFunction;


import javax.swing.JFrame;

import java.awt.*;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Main extends JFrame {

    //Database donde se van a guardar los usuarios
    public ArrayList<User> userDataBase = new ArrayList<>();
    public ArrayList<Movie> movieDataBase = new ArrayList<>();
    public ArrayList<MovieFunction> functionsDataBase = new ArrayList<>();
    public User currentUser;
    static Main mainFrame = new Main();

    ///////////////////////////////////////// Definicion de los screens de la aplicacion ///////////////////////////////////
    CreateAdminScreen createAdminScreen = new CreateAdminScreen(this);
    FirstOpenScreen firstOpenScreen = new FirstOpenScreen(this);
    LoginScreen loginScreen = new LoginScreen(this);
    ScreenTemplate screenTemplate = new ScreenTemplate(this);
    AdminLateralPanel adminLateralPanel = new AdminLateralPanel(this);
    RegisterScreen registerScreen = new RegisterScreen(this);
    ClientLateralPanel affiliatedClientLateralPanel = new ClientLateralPanel(this, true);
    ClientLateralPanel notAffiliatedClientLateralPanel = new ClientLateralPanel(this, false);
    ClientPanel clientPanel = new ClientPanel(this);
    MovieExplorer movieExplorer = new MovieExplorer(this);

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
            case 4:
                mainFrame.add(registerScreen);
                break;
            case 5:
                mainFrame.add(affiliatedClientLateralPanel);
                break;
            case 6:
                mainFrame.add(notAffiliatedClientLateralPanel);
                break;
            case 7:
                mainFrame.add(clientPanel);
                break;
            case 8:
                mainFrame.add(movieExplorer);
                break;
                


        }
    }

    public static void main(String[] args) {
        //Se pone visible el frame

        mainFrame.panelChanger(1);


        mainFrame.setVisible(true);


    }

}


