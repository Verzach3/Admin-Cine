package com.thepanas.GUILib;

import java.awt.*;

public class MovieCard extends TComponent{

   int round = 5;

  /* MovieCard(){
       this.
   }
   */

   public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawRoundRect(this.x, this.y, this.width, this.height, this.round, this.round);

   }



}
