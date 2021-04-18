package com.thepanas.CineAdmin.Utils;

import javax.swing.*;

public class MakeDialog{


    public static void makeInfoDialog(String message, String tittle){
        JOptionPane.showMessageDialog(null,message, tittle,JOptionPane.INFORMATION_MESSAGE);

    }

    public static void makeErrorDialog(String message, String tittle){
        JOptionPane.showMessageDialog(null,message, tittle,JOptionPane.ERROR_MESSAGE);

    }

    public static String makeMultiSelector(String[] options){
        return JOptionPane.showInputDialog(null, "Selecciona uno", "Seleccion", JOptionPane.QUESTION_MESSAGE,null, options, options[0]).toString();
    }

    public static int makeButtonSelector(String[] options){
        return JOptionPane.showOptionDialog(null, "Selecciona uno", "Seleccion", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null, options, options[0]);
    }
}
