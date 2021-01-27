package com.thepanas.cineadmin;

import java.awt.*;

import javax.swing.JPanel;

public class TButton extends  JPanel {
  int X;
  int Y;
  int Width;
  int Height;
  boolean Raised;
  String BUTTON_TEXT;

  public String getBUTTON_TEXT(){
    return this.BUTTON_TEXT;
  }


  public void paint (Graphics g) {
    g.draw3DRect(this.X, this.Y, this.Width, this.Height, this.Raised);
    g.drawString(this.BUTTON_TEXT, this.Width/2, this.Height/2);

  }
}
