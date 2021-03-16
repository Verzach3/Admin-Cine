package com.thepanas.GUILib;



import java.awt.Color;
import java.awt.Graphics2D;

import javax.swing.JOptionPane;

import java.awt.Font;

public class TInputBox {
    int X = 0;
    int Y = 0;
    int WIDTH = 0;
    int HEIGHT = 0;
    int fontSize = 15;
    String TEXT = "";
    String PLACEHOLDER = "PLACEHOLDER";

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
        if (TEXT == null || TEXT.equals("")){
            TEXT = PLACEHOLDER;
        }else {
            this.TEXT = text;
        }
    }

    public void setPLACEHOLDER(String placeholder){
        this.PLACEHOLDER = placeholder;
    }

    public void onClick(){
        String input;
        input = JOptionPane.showInputDialog(null, "Ingrese el texto: ");
        try{
            if (input == null){
                this.TEXT = TEXT;
            }else if (TEXT.equals("")){
                TEXT = PLACEHOLDER;
            }else {
                TEXT = input;
            }
        }catch (NullPointerException e){

        }


    }



    public void paintComponent(Graphics2D g){
        this.setText(this.TEXT);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRoundRect(X, Y, WIDTH, HEIGHT,3,3);
        g.setColor(Color.BLACK);
        g.drawRoundRect(X, Y, WIDTH, HEIGHT,3,3);

        g.setColor(Color.WHITE);
        Font font = new Font("Arial", 2, fontSize);
        g.setFont(font);
        g.drawString(TEXT, X + WIDTH/20, Y + (HEIGHT/2 + fontSize/2));


    }

    TInputBox() {

    }




}
