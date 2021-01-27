package com.thepanas.cineadmin;

import java.awt.*;

import javax.swing.JPanel;

public class TButton extends  JPanel {
  int X;
  int Y;
  int Width;
  int Height;
  boolean Raised;

  public void paint (Graphics g) {
    g.draw3DRect(this.X, this.Y, this.Width, this.Height, this.Raised);

  }
}
