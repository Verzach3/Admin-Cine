package com.thepanas.CineAdmin.Utils;

import javax.swing.*;

public class MakeDialog{

    public void makeInfoDialog(String message, String tittle){
        JOptionPane.showMessageDialog(null,message, tittle,JOptionPane.INFORMATION_MESSAGE);

    }

    public void makeErrorDialog(String message, String tittle){
        JOptionPane.showMessageDialog(null,message, tittle,JOptionPane.ERROR_MESSAGE);

    }

}
