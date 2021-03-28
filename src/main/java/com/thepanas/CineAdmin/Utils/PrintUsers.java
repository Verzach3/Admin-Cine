package com.thepanas.CineAdmin.Utils;

import java.util.ArrayList;

import com.thepanas.CineAdmin.Types.Usuario;

public class PrintUsers {
    ArrayList<Usuario> a;
    public PrintUsers(ArrayList<Usuario> a){
        this.a = a;
    }

    public void print(){
        for (Usuario usuario : a) {
            System.out.println("Nombre: " + usuario.getName());
        }
    }
}
