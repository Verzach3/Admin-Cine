package com.thepanas.CineAdmin.Utils;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Arrays;

public class ResourseLoader {
    File f = new File(".");
    File resourceFolder = new File("Resources");

    public void init(){
        if (!resourceFolder.exists()){
            resourceFolder.mkdirs();
        }
    }

    public Image loadImage(String name){

        ImageIcon image = new ImageIcon(resourceFolder.getAbsoluteFile() +"\\"+ name);
        System.out.println(Arrays.toString(f.listFiles()));
        System.out.println(resourceFolder.getAbsolutePath());
        System.out.println(image.getDescription());
        return image.getImage();
    }

}
