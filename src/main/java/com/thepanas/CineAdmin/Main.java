package com.thepanas.CineAdmin;

import com.thepanas.CineAdmin.Screens.FirstOpenScreen;

import javax.swing.JFrame;
import java.awt.Dimension;

public class Main extends JFrame{

    Main(){
      this.setPreferredSize(new Dimension(1024, 768));
      this.setName("Cinema Films");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLayout(null);
      this.setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
      Main mainFrame = new Main();
      FirstOpenScreen screen1 = new FirstOpenScreen();
      mainFrame.add(screen1);
      mainFrame.setVisible(true);
        
    }
}
