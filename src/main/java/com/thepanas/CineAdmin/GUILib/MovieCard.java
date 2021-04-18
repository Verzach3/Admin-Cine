package com.thepanas.CineAdmin.GUILib;

import com.thepanas.CineAdmin.Utils.ImageLoader.ImageImporter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class MovieCard extends TComponent {

   int round = 18;
   boolean hoverStatus = false;
   Image movieImage;
   String name = "";
   String year;
   String lenght;
   String classification;
   String funcType;
   JPanel observer;
   ImageImporter ip = new ImageImporter();
   TLabel nameLabel = new TLabel();

   public MovieCard(JPanel observer){
       ip.init();
       this.observer = observer;
       this.height = 343;
       this.width = 262;
       nameLabel.setSize(24);
   }

   public void setMovieImage(Image image){
       this.movieImage = image;

   }

   public void paintComponent(Graphics g){
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.GRAY);
        nameLabel.setLocation(this.x + 40,this.y + 38);


       g2D.fillRoundRect(this.x, this.y, this.width, this.height, 9, this.round);
       if (!hoverStatus) {
            g2D.drawImage(this.getImage(), this.getX() + 40, this.getY() + 38,180,268, this.observer);

        }
        if (hoverStatus){
            nameLabel.paintComponent(g2D);
        }

   }

   public Boolean evenListener(MouseEvent e){
        if(e.getX() >= this.x && e.getX() <= this.width + this.x && e.getY() >= this.y && e.getY() <= this.height + this.y){
            hoverStatus = true;
            System.out.println("Event True");
        }else {
            hoverStatus = false;
        }

        return hoverStatus;
   }

    public Image getImage() {
        return movieImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        nameLabel.setText(name);
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getLenght() {
        return lenght;
    }

    public void setLenght(String lenght) {
        this.lenght = lenght;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getFuncType() {
        return funcType;
    }

    public void setFuncType(String funcType) {
        this.funcType = funcType;
    }


}
