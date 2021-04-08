package com.thepanas.GUILib;

import java.awt.*;

public class TLabel {
    int x = 0;
    int y = 0;
    int fontSize = 15;
    String text = "Button";

    public int getX(){
      return x;
    }

    public int getY(){
      return y;
    }

    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }


    public void setText(String text){
        this.text = text;
    }

    public void setSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public void paintComponent(Graphics2D g){

        g.setColor(Color.BLACK);
        Font font = new Font("Arial", Font.PLAIN, fontSize);
        g.setFont(font);
        g.drawString(text, x, y);


    }

    public TLabel() {

    }




}