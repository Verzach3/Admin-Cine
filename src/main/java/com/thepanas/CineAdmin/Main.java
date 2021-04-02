package com.thepanas.CineAdmin;

import com.thepanas.CineAdmin.Screens.*;
import com.thepanas.CineAdmin.Types.Usuario;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Main extends JFrame {

    //Database donde se van a guardar los usuarios
    public ArrayList<Usuario> dataBase = new ArrayList<>();


    Main() {
        //Tamaño de la ventana
        this.setSize(new Dimension(1024, 768));
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

    public static void main(String[] args) {

        Main mainFrame = new Main();
        //Se pone visible el frame
        mainFrame.setVisible(true);

    }
}


