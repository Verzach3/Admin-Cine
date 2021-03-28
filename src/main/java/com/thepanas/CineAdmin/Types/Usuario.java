package com.thepanas.CineAdmin.Types;

public class Usuario {
    int accessLevel;
    String name;
    String nickName;
    String password;

    public Usuario(int setAccessLevel) {
        accessLevel = setAccessLevel;


    }

    public Usuario(int setAccessLevel, String setName, String setNickName, String setPassword){
        accessLevel = setAccessLevel;
        name = setName;
        nickName = setNickName;
        password = setPassword;
    }

    public String getName(){
        return name;
    }
}
