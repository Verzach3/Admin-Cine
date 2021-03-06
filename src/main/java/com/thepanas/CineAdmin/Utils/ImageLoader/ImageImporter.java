package com.thepanas.CineAdmin.Utils.ImageLoader;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class ImageImporter {

    String filePath;
    String finalImagePath;
    File directory = new File("images");


    public ImageImporter(){

    }

    public void init(){
        if (!directory.exists()){
            System.out.println("Directorio no existente, creandolo...");
            if (directory.mkdir()){
                System.out.println("Directorio Creado");
            }
        }
    }

    public ImageIcon getImage(){
        String ext[] = {"gif", "jpg", "jpeg", "png"};
        filePath = "";
        JFileChooser fc = new JFileChooser(new File("."));

        FileFilrter filter = new FileFilrter(ext, "GIF, JPG, JPEG & PNG Image");
        fc.setFileFilter(filter);

        if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            filePath = fc.getSelectedFile().getAbsolutePath();
            try {
                finalImagePath = "img" + System.currentTimeMillis() + "." + filePath.substring(filePath.indexOf(".")) + 1;

                FileInputStream fis = new FileInputStream(filePath);
                FileChannel inChannel = fis.getChannel();

                FileOutputStream fos = new FileOutputStream("images/" + finalImagePath);
                FileChannel outChannel = fos.getChannel();

                inChannel.transferTo(0,inChannel.size(), outChannel);
                fis.close();
                fos.close();

                return new ImageIcon(finalImagePath);
            } catch (Exception i){
                System.out.println(i);
            }
        }
        return null;
    }
}
