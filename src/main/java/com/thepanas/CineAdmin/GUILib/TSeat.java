package com.thepanas.CineAdmin.GUILib;
import java.awt.Graphics2D;
import java.awt.Color;

public class TSeat{
  int x = 100;
  int y = 100;

  Color color1 = new Color(66, 137, 193);
  Color color2 = new Color(93, 173, 236);
  Color color3 = new Color(42, 103, 151);

  Color checkedColor = new Color(61, 80, 83);

  public Boolean checked = false;

  TSeat(){
    
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void setLocation(int x, int y){
    this.x = x;
    this.y = y;
  }

  public void onClick(){
    checked = !checked;
  }

  public void paintComponent(Graphics2D g){

    //Viga izquierda
    if (!checked){
      g.setColor(color1);}
    else {
      g.setColor(checkedColor);
    }
    g.fillRect(x - 1, y + 17, 31, 90);
    //Borde redondo superior viga izquierda
    g.fillArc(x - 2, y - 6, 35, 35, 360, 360);
    //Borde redonde inferior viga izquierda
    g.fillArc(x - 2, y + 90, 35, 35, 360, 360);

    //Espaldar
    g.fillRect(x + 22, y -5, 67, 130);

    //viga derecha
    g.fillRect(x + 81, y + 17, 31, 90);
    //Borde redondo superior viga derecha
    g.fillArc(x + 77, y - 6, 35, 35, 360, 360);
    //Borde redondo inferior viga derecha
    g.fillArc(x + 77, y + 90, 35, 35, 360, 360);

    //Adorno Espaldar
    g.setColor(Color.WHITE);
    g.fillRect(x + 33, y - 5, 45, 40);

//--------------------------------------------------------------
  //Mmm Patas
  if (!checked){
    g.setColor(Color.GRAY);}
  else {
    g.setColor(checkedColor);
  }
  g.fillRect(x - 2, y + 133, 30, 60);
  g.fillRect(x + 82, y + 133, 30, 60);

  //Bordes redondos
  g.fillArc(x - 2, y + 178, 30, 30, 180, 180);
  g.fillArc(x + 82, y + 178, 30, 30, 180, 180);

  //--------------------------------------------------------------
  //ASIENTO
    if (!checked) {
      g.setColor(color2);
    }else {
      g.setColor(checkedColor);
    }
    //Borde redondo izquierda
    g.fillArc(x - 2, y + 116, 34, 34, 90, 90);
    //Parte superior del asiento
    g.fillRect(x + 10, y + 117, 90, 16);
    //Borde redondo derecha
    g.fillArc(x + 77, y + 116, 34, 34, 0, 90);

    g.setColor(color3);
    g.fillRect(x - 2, y + 133, 114, 30);
  }
}