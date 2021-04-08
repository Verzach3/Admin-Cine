package com.thepanas.GUILib;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Font;
import java.awt.event.MouseEvent;

public class TButton {
    /* RECOMENDACIONES Y REQUERIMIENTOS */
    /* Para cada boton se debe de llamar el metodo onRelease()
       en el mouseReleased de cada panel para que el cambio de
       color surta efecto
     */


    int x = 1;
    int y = 1;
    int width = 1;
    int height = 1;
    int fontSize = 12;
    String text = "Button";
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

    public void setSize(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }


    public void setText(String text){
        this.text = text;
    }

    public int centrarTextoH(){
        char[] chars = text.toCharArray();

        if(chars.length /2 == 0){
            return 1;
        }else {
            return chars.length /2;
        }
    }

    public void onRelease(){
        clickStatus = false;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }


    public Color buttonColor(){
        if (clickStatus){
            return new Color(91,109,135);
        }else {
            return new Color(96, 125, 170);
        }
    }

    public Boolean evenListener(MouseEvent e){
        if(e.getX() >= this.x && e.getX() <= this.width + this.x && e.getY() >= this.y && e.getY() <= this.height + this.y){
            clickStatus = true;
        }else {
            clickStatus = false;
        }
        return clickStatus;
    }

    public void paintComponent(Graphics2D g){
        g.setColor(buttonColor());
        g.fillRoundRect(x, y, width, height,6,6);
        g.setColor(Color.BLACK);
        g.drawRoundRect(x, y, width, height,6,6);

        g.setColor(Color.WHITE);
        Font font = new Font("Arial", 2, fontSize);
        g.setFont(font);
        g.drawString(text, x + (width /centrarTextoH())/2, y + (height /2 + fontSize/2));


    }

    public TButton() {

    }




}
