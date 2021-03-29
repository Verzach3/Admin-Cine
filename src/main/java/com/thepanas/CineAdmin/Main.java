package com.thepanas.CineAdmin;

import com.thepanas.CineAdmin.Screens.*;
import com.thepanas.CineAdmin.Types.Usuario;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Main extends JFrame{

    public ArrayList<Usuario> dataBase = new ArrayList<>();
    //Los screens tienen que definirse como variables globales
    static FirstOpenScreen firstOpenScreen;
    //static CreateAdminScreen createAdminScreen = new CreateAdminScreen(); // No se utilizo aqui   

    Main(){
      firstOpenScreen = new FirstOpenScreen(this, dataBase);
      this.setSize(new Dimension(1024, 768));
      this.setLayout(null);
      this.setName("Cinema Films");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
      Main mainFrame = new Main();

      /*
        Aqui se creara una instancia de cada una
        de los JPanels que tenemos para ocultarlas
        o mostrarlas a disposicion
       */

    /**
     * Aqui elimino todo y le hago set es pensando en que quizas mas adelante
     * tenga la opcion de devolver al inicio o algo por el estilo solo por eso
     */
      mainFrame.getContentPane().removeAll();
      mainFrame.setContentPane(firstOpenScreen);
      mainFrame.setVisible(true);
        
    }

    
    /*
    La deje publica sin el estatico por lo que no la utilizo en el mani y porque necesito
    que sea visible para otras clases
    */
    public void panelChanger(JPanel panel, JFrame window){
        window.getContentPane().removeAll();
        window.setContentPane(panel);        
    }
}
