package com.thepanas.GUILib;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;

public class TCheckBox {

    int x = 0;
    int y = 0;
    int size = 0;
    Boolean clickStatus = false;

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

    public void setSize(int SIZE){
        this.size = SIZE;
    }



    public void onClick(){
        clickStatus = !clickStatus;
    }

    public Boolean evenListener(MouseEvent e){
        if(e.getX() >= this.x && e.getX() <= this.size + this.x && e.getY() >= this.y && e.getY() <= this.size + this.y){
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
        g.fillRoundRect(x, y, size, size, 3,3);
        g.setColor(Color.BLACK);
        g.drawRoundRect(x, y, size, size, 3,3);
        

    }

    TCheckBox() {

    }




}
