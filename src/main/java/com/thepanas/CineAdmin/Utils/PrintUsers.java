package com.thepanas.CineAdmin.Utils;

import java.util.ArrayList;

import com.thepanas.CineAdmin.Types.User;

public class PrintUsers {
    ArrayList<User> a;
    public PrintUsers(ArrayList<User> a){
        this.a = a;
    }

    public void print(){
        for (User usuario : a) {
            System.out.println("Nombre: " + usuario.getName());
        }
    }
}
