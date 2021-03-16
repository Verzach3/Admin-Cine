package com.thepanas.GUILib;

import java.awt.Graphics2D;
import java.awt.Font;

public class TLabel {
    int X = 0;
    int Y = 0;
    int fontSize = 15;
    String TEXT = "Button";

    public int getX(){
      return X;
    }

    public int getY(){
      return Y;
    }

    public void setLocation(int x, int y){
        this.X = x;
        this.Y = y;
    }


    public void setText(String text){
        this.TEXT = text;
    }

    public void setSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public void paintComponent(Graphics2D g){

        Font font = new Font("Arial", Font.PLAIN, fontSize);
        g.setFont(font);
        g.drawString(TEXT,X,Y);


    }

    TLabel() {

    }




}