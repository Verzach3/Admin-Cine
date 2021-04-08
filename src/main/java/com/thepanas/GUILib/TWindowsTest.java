package com.thepanas.GUILib;
//Librerias
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
/*
Prueba del TBarGraphics Recordar que el TBarGraphics recibe un Array
 y lo grafica con los valores asignados o guardados
 */
public class TWindowsTest{
    public static void main(String[] argv) {
    	
        JFrame f = new JFrame();
        f.setSize(400, 300); //---------------->Tamaño definido de la ventana de prueba
        double[] values = new double[5]; //--------------------> Bucle con valores que quiero graficar

        //----------------------->Valores
        values[0] = 9;

        values[1] = 7;

        values[2] = 4;

        values[3] = 5;

        values[4] = 2;
        //---------------------------------------------------->

        //---->ContentPane y ---> se ingresa -->Array ----->Titulo
        f.getContentPane().add(new TBarGraphics(values, "TBarGraphics"));
        f.setVisible(true);
    }
}




