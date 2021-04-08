package com.thepanas.GUILib;



import java.awt.Color;
import java.awt.Graphics2D;

import javax.swing.*;

import java.awt.Font;
import java.awt.event.MouseEvent;

public class TInputBox{
    int x = 0;
    int y = 0;
    int width = 0;
    int height = 0;
    int fontSize = 15;
    String text = "";
    String placeholder = "PLACEHOLDER";

    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setSize(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void setText(String text){
        if (this.text == null || this.text.equals("")){
            this.text = placeholder;
        }else {
            this.text = text;
        }
    }

    public String getText(){
        if (text.equals(placeholder)){
            return "";
        }else {
            return text;
        }
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }


    public void evenListener(MouseEvent e){
        if(e.getX() >= this.x && e.getX() <= this.width + this.x && e.getY() >= this.y && e.getY() <= this.height + this.y){

            this.onClick();
        }
    }

    public void setPlaceholder(String placeholder){
        this.placeholder = placeholder;
    }

    public void onClick(){
        String input;
        input = JOptionPane.showInputDialog(null, "Ingrese el texto: ");
        try{
            if (input == null){
                System.out.println("No Effect");
            }else if (text.equals("")){
                text = placeholder;
            }else {
                text = input;
            }
        }catch (NullPointerException ignored){

        }


    }



    public void paintComponent(Graphics2D g){
        this.setText(this.text);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRoundRect(x, y, width, height,3,3);
        g.setColor(Color.BLACK);
        g.drawRoundRect(x, y, width, height,3,3);

        if (text.equals(placeholder)) {
            g.setColor(Color.WHITE);
        }else{
            g.setColor(Color.black);
        }
        
        Font font = new Font("Arial", Font.PLAIN, height -11);
        g.setFont(font);
        g.drawString(text, x + width /20, y + (height /2 + fontSize/2));


    }

    public TInputBox() {

    }




}
