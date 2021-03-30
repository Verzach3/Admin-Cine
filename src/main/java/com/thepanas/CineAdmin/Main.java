package com.thepanas.CineAdmin;

import com.thepanas.CineAdmin.Screens.*;
import com.thepanas.CineAdmin.Types.Usuario;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Main extends JFrame{

    //Database donde se van a guardar los usuarios
    public ArrayList<Usuario> dataBase = new ArrayList<>();

    //Los screens tienen que definirse como variables globales
    static FirstOpenScreen firstOpenScreen;

    Main(){
        //Se le da valor a la variable firstOpenScreen pasandole el JFrame(this) y el ArrayList(dataBase)
      firstOpenScreen = new FirstOpenScreen(this, dataBase);
      //Tamaño de la ventana
      this.setSize(new Dimension(1024, 768));
      //Sin layout manager
      this.setLayout(null);
      //Nombre de la ventana o frame
      this.setName("Cinema Films");
      //Operacion de cierre de la ventana
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //Ubicacion relativa a ningun componente
      this.setLocationRelativeTo(null);
<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream
      this.setResizable(false);
>>>>>>> Stashed changes
      
=======
      //Impide expandir la ventana
      this.setResizable(false);
>>>>>>> Stashed changes

    }

    public static void main(String[] args) {

      Main mainFrame = new Main();

      //Se remueven todos los paneles del frame (Por precaucion)
      mainFrame.getContentPane().removeAll();
      //Se coloca el primer panel
      mainFrame.setContentPane(firstOpenScreen);
      //Se pone visible el frame
      mainFrame.setVisible(true);
        
    }

    
    /*
    Metodo para forma alternativa de cambiar de paneles
    */
    public void panelChanger(JPanel panel, JFrame window){
        //Se remueven todos los paneles de el frame
        window.getContentPane().removeAll();
        //Se coloca el panel que se quiere mostrar
        window.setContentPane(panel);        
    }
}
