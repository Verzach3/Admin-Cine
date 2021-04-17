package com.thepanas.CineAdmin.GUILib;
import com.thepanas.CineAdmin.Utils.ResourseLoader;

import javax.swing.*;
import java.awt.*;

public class TSeat {
  JPanel observer;
  ResourseLoader seats = new ResourseLoader();


  Image Blue = seats.loadImage("Blue.png");
  Image Gray = seats.loadImage("Gray.png");

  public Boolean checked = false;

  public Image getImage() {

    if (checked) {
      return Gray;
    } else {
      return Blue;
    }
  }

  public TSeat(JPanel observer){
    this.observer = observer;

  }

  public void paint(Graphics g){
    Graphics2D g2D =(Graphics2D) g;

    g2D.drawImage(getImage(), 0, 0, 100, 100, observer);

  }

  public void onClick() {

    checked = !checked;
  }

  public void paintComponent(Graphics2D g) {



  }
}