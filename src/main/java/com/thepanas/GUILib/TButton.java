package com.thepanas.GUILib;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.color.*;
import java.awt.*;
import java.awt.Font;

public class TButton {

    int X = 0;
    int Y = 0;
    int WIDTH = 0;
    int HEIGHT = 0;
    int fontSize = 15;
    String TEXT = "Button";
    Boolean clickStatus = false;

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

    public void setSize(int width, int height){
        this.WIDTH = width;
        this.HEIGHT = height;
    }

    public void setText(String text){
        this.TEXT = text;
    }

    public int centrarTextoH(){
        char[] chars = TEXT.toCharArray();

        return chars.length / 2;
    }

    public void onClick(){
        clickStatus = true;
    }

    public void onRelease(){
        clickStatus = false;
    }

    public Color buttonColor(){
        if (clickStatus){
            return new Color(91,109,135);
        }else {
            return new Color(96, 125, 170);
        }
    }

    public void paintComponent(Graphics2D g){
        g.setColor(buttonColor());
        g.fillRect(X, Y, WIDTH, HEIGHT);
        g.setColor(Color.BLACK);
        g.drawRect(X, Y, WIDTH, HEIGHT);

        g.setColor(Color.WHITE);
        Font font = new Font("Arial", 2, fontSize);
        g.drawString(TEXT, X + WIDTH/centrarTextoH(), Y + (HEIGHT/2 + fontSize/2));


    }

    TButton() {

    }




}
