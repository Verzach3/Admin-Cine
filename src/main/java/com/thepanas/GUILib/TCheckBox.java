package com.thepanas.GUILib;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;

public class TCheckBox {

    int X = 0;
    int Y = 0;
    int SIZE = 0;
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

    public void setSize(int SIZE){
        this.SIZE = SIZE;
    }



    public void onClick(){
        clickStatus = !clickStatus;
    }

    public Boolean evenListener(MouseEvent e){
        if(e.getX() >= this.X && e.getX() <= this.SIZE + this.X && e.getY() >= this.Y && e.getY() <= this.SIZE + this.Y){
            clickStatus = !clickStatus;
    }
        return clickStatus;
    }

    public Color buttonColor(){
        if (clickStatus){
            return new Color(96, 125, 170);
        }else {
            return Color.WHITE;
        }
    }

    public void paintComponent(Graphics2D g){
        g.setColor(buttonColor());
        g.fillRoundRect(X, Y, SIZE, SIZE, 3,3);
        g.setColor(Color.BLACK);
        g.drawRoundRect(X, Y, SIZE, SIZE, 3,3);
        

    }

    TCheckBox() {

    }




}
