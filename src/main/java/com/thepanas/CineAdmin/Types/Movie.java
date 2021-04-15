package com.thepanas.CineAdmin.Types;

import com.thepanas.CineAdmin.Utils.ImageLoader.ImageImporter;

import javax.swing.*;

public class Movie {

    ImageIcon poster;
    String name;
    String year;
    String lenght;
    String classification;
    String funcType;

    ImageImporter ip = new ImageImporter();
    Movie(){
        ip.init();
    }

    public ImageIcon getPoster() {
        return poster;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getLenght() {
        return lenght;
    }

    public void setLenght(String lenght) {
        this.lenght = lenght;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getFuncType() {
        return funcType;
    }

    public void setFuncType(String funcType) {
        this.funcType = funcType;
    }


}
