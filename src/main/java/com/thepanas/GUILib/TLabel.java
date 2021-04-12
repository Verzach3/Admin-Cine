package com.thepanas.GUILib;

import java.awt.*;

public class TLabel extends  TComponent{



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