package com.thepanas.CineAdmin;

import com.thepanas.CineAdmin.Screens.FirstOpenScreen;
import com.thepanas.CineAdmin.Types.Usuario;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Tests extends JFrame{

    //Nota pa secho *= esto lo cambias por la definicion de el screen tuyo
    static FirstOpenScreen firstOpenScreen;

    public static void main(String[] args) {

      Main mainFrame = new Main();

      //jaja //remover
      //Nota pa secho = cambias esto por tu screen
      firstOpenScreen = new FirstOpenScreen(mainFrame, mainFrame.dataBase);

      //Se remueven todos los paneles del frame (Por precaucion)
      mainFrame.getContentPane().removeAll();
      //Se coloca el primer panel
        //Nota pa secho = donde dice firtOpenScreen pones el nombre de el screen

      mainFrame.setContentPane(firstOpenScreen);
      //Se pone visible el frame
      mainFrame.setVisible(true);
        
    }

    
    /*
    Metodo para forma alternativa de cambiar de paneles
    */
    public void panelChanger(JPanel panel, JFrame window){
        //Se remueven todos los paneles de el frame
        window.getContentPane().removeAll();
        //Se coloca el panel que se quiere mostrar
        window.setContentPane(panel);        
    }
}
