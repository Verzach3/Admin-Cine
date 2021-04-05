package com.thepanas.CineAdmin;

import com.thepanas.CineAdmin.Screens.*;
import com.thepanas.CineAdmin.Types.Usuario;

import javax.swing.JFrame;

import java.awt.*;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Main extends JFrame {

    //Database donde se van a guardar los usuarios
    public ArrayList<Usuario> userDataBase = new ArrayList<>();

    static Main mainFrame = new Main();

///////////////////////////////////////// Definicion de los screens de la aplicacion ///////////////////////////////////
    CreateAdminScreen createAdminScreen = new CreateAdminScreen(this,userDataBase);
    FirstOpenScreen firstOpenScreen = new FirstOpenScreen(this ,userDataBase);
    ScreenTemplate screenTemplate = new ScreenTemplate(this, userDataBase);
    AdminLateralPanel adminLateralPanel = new AdminLateralPanel(this, userDataBase);
    MainScreenAdmin mainScreenAdmin = new MainScreenAdmin(this, userDataBase);

///////////////////

    public Main() {
        //Tamaño de la ventana
        this.setSize(new Dimension(1024, 792));
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
            case 1:
                mainFrame.add(createAdminScreen);
                break;
            case 2:
                mainFrame.add(adminLateralPanel);
                mainFrame.add(mainScreenAdmin);
                break;
            case 0:
                mainFrame.add(firstOpenScreen);
                break;
        }
    }

    public static void main(String[] args) {
        //Se pone visible el frame
        mainFrame.panelChanger(2);
        mainFrame.setVisible(true);
    }

}


