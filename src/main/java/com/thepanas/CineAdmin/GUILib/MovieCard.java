package com.thepanas.CineAdmin.GUILib;

import java.awt.*;
import java.awt.event.MouseEvent;

public class MovieCard extends TComponent {

   int round = 18;
   String movieDescription = "Change This";
   boolean hoverStatus = false;
   Image movieImage = null;

   public MovieCard(){

       this.height = 343;
       this.width = 262;

   }

   public void setMovieImage(Image image){
       movieImage = image;

   }

   public void paintComponent(Graphics g){
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.GRAY);


        if (!hoverStatus) {
            g2D.fillRoundRect(this.x, this.y, this.width, this.height, 9, this.round);
        }
        if (hoverStatus){
        }

   }

   public Boolean evenListener(MouseEvent e){
        if(e.getX() >= this.x && e.getX() <= this.width + this.x && e.getY() >= this.y && e.getY() <= this.height + this.y){
            hoverStatus = true;
        }else {
            hoverStatus = false;
        }
        return hoverStatus;
   }

}
