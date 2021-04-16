package com.thepanas.GUILib;

public class TComponent {

    int x = 1;
    int y = 1;
    int width = 1;
    int height = 1;
    int size = 1;
    int fontSize = 15;
    String text = "";
    String placeholder = "PLACEHOLDER";
    Boolean clickStatus = false;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setText(String text) {
        if (this.text == null || this.text.equals("")) {
            this.text = placeholder;
        } else {
            this.text = text;
        }
    }

    public String getText() {
        if (text.equals(placeholder)) {
            return "";
        } else {
            return text;
        }
    }

    public void setSize(int SIZE) {
        this.size = SIZE;
    }

    public void setSize(int width, int height){
        this.width = width;
        this.height = height;
    }
}

