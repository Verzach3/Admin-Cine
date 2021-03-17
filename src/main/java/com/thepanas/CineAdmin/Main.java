package com.thepanas.CineAdmin;

import com.thepanas.CineAdmin.Screens.*;

import javax.swing.JFrame;
import java.awt.Dimension;

public class Main extends JFrame{

    Main(){
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
      FirstOpenScreen screen1 = new FirstOpenScreen();
      mainFrame.add(screen1);
      mainFrame.setVisible(true);
        
    }
}
