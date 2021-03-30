import java.awt.Graphics2D;
import java.awt.Color;

public class TSeat{
  int X = 100;
  int Y = 100;


  TSeat(){
    
  }

  public void setX(int X){
    this.X = X;
  }

  public void setY(int Y){
   this.Y = Y;
  }

  public void paintComponent(Graphics2D g){
    
    //Viga izquierda
    g.setColor(new Color(66, 137, 193));
    g.fillRect(X - 1, Y + 17, 31, 90);
    //Borde redondo superior viga izquierda
    g.fillArc(X - 2, Y - 6, 35, 35, 360, 360);
    //Borde redonde inferior viga izquierda
    g.fillArc(X - 2, Y + 90, 35, 35, 360, 360);

    //Espaldar
    g.fillRect(X + 22, Y-5, 67, 130);

    //viga derecha
    g.fillRect(X + 81, Y + 17, 31, 90);
    //Borde redondo superior viga derecha
    g.fillArc(X + 77, Y - 6, 35, 35, 360, 360);
    //Borde redondo inferior viga derecha
    g.fillArc(X + 77, Y + 90, 35, 35, 360, 360);

    //Adorno Espaldar
    g.setColor(Color.WHITE);
    g.fillRect(X + 33, Y - 5, 45, 40);

//--------------------------------------------------------------
  //Mmm Patas

  g.setColor(Color.GRAY);
  g.fillRect(X - 2, Y + 133, 30, 60);
  g.fillRect(X + 82, Y + 133, 30, 60);

  //Bordes redondos
  g.fillArc(X - 2, Y + 178, 30, 30, 180, 180);
  g.fillArc(X + 82, Y + 178, 30, 30, 180, 180);

  //--------------------------------------------------------------
  //ASIENTO
    
    g.setColor(new Color(93, 173, 236));
    //Borde redondo izquierda
    g.fillArc(X - 2, Y + 116, 34, 34, 90, 90);
    //Parte superior del asiento
    g.fillRect(X + 10, Y + 117, 90, 16);
    //Borde redondo derecha
    g.fillArc(X + 77, Y + 116, 34, 34, 0, 90);

    g.setColor(new Color(42, 103, 151));
    g.fillRect(X - 2, Y + 133, 114, 30);
  }
}