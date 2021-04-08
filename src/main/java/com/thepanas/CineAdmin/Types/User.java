package com.thepanas.CineAdmin.Types;

public class User {
    int accessLevel;
    String name;
    String nickName;
    String password;

    public User(int setAccessLevel) {
        accessLevel = setAccessLevel;


    }

    /**
     * 
     * Objeto usuario
     * @param setAccessLevel
     * @param setName
     * @param setNickName
     * @param setPassword
     */
    public User(int setAccessLevel, String setName, String setNickName, String setPassword){
        accessLevel = setAccessLevel;
        name = setName;
        nickName = setNickName;
        password = setPassword;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
