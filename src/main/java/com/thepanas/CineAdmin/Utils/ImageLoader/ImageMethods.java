package com.thepanas.CineAdmin.Utils.ImageLoader;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


@SuppressWarnings("serial")
public class ImageMethods extends JPanel {
            
    ImageIcon img;
    boolean acepto;
    String nomArchivo;
    String nomArchivoCopiado;

    public ImageMethods(){
        setSize(700, 500);
        setLocation(45, 40);        
        setBackground(Color.WHITE);
        setBorder(new LineBorder(Color.BLACK));
        setLayout(null);

        img = null;
        acepto = false;
        nomArchivo = nomArchivoCopiado = "";
        
        File directorio = new File("img_seleccionadas");
        if (!directorio.exists()) {
            directorio.mkdirs();//crear la carpeta para almacenar las imagenes seleccionadas
        }
    }
    
    public void paint(Graphics g){
        super.paint(g);
        g.drawRect(50, 80, 200, 50);
        g.drawString("Seleccionar imagen", 95, 110);
        
        if(img != null){
            g.drawImage(img.getImage(), 300, 80, 128, 128, this);
            
        }
    }
    
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
                
        if(x >= 50 && x <= 250 && y >= 80 && y <= 130){
            mostrarDialogo();
            if(acepto){
                copiarImg();
                img = new ImageIcon("img_seleccionadas/" + nomArchivoCopiado);  
            
                   
            }
        }
        
        repaint();
    }
    
    
    public void mostrarDialogo() {
        String ext[] = {"gif", "jpg", "jpeg", "png"};

        nomArchivo = "";
        JFileChooser fc = new JFileChooser(new File("."));

        FileFilrter filter = new FileFilrter(ext, "GIF, JPG, JPEG & PNG Imagenes");
        fc.setFileFilter(filter);

        int returnVal = fc.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            nomArchivo = file.getAbsolutePath();
            acepto = true;
        } else acepto = false;
    }
    
    public void copiarImg() {        
        try {
            nomArchivoCopiado = "nom_img " + getFecha() + "." + nomArchivo.substring(nomArchivo.indexOf('.') + 1, nomArchivo.length());
            System.out.println(nomArchivo);
            System.out.println(nomArchivoCopiado);
                        
            FileInputStream fis = new FileInputStream(nomArchivo); //Ubicación del la imagen a copiar
            FileChannel inChannel = fis.getChannel();
                        
            FileOutputStream fos = new FileOutputStream("img_seleccionadas/" + nomArchivoCopiado); //Ubicación donde se copiara la imagen                    
            FileChannel outChannel = fos.getChannel();
                        
            inChannel.transferTo(0, inChannel.size(), outChannel);
            fis.close();
            fos.close();
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Error al copiar la imagen" , 
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public String getFecha() {
        String fecha = "";
        Calendar cal = Calendar.getInstance();//obtener una instancia del calendario del sistema
        int dia = cal.get(Calendar.DATE);
        int mes = cal.get(Calendar.MONTH) + 1;//Para Java los meses comienza cero, es decir Enero es 0, Febrero 1, .... Diciembre 11
        int year = cal.get(Calendar.YEAR);

        if (dia < 10) {
            fecha += "0" + dia + "_";
        } else {
            fecha += dia + "_";
        }

        if (mes < 10) {
            fecha += "0" + mes + "_";
        } else {
            fecha += mes + "_";
        }

        fecha += year + "_";
        
        fecha += cal.get(Calendar.HOUR_OF_DAY) + "_";
        int min = cal.get(Calendar.MINUTE);
        int seg = cal.get(Calendar.SECOND);
        
        if (min < 10) {
            fecha += "0" + min + "_";
        } else {
            fecha += min + "_";
        }
        
        if (seg < 10) {
            fecha += "0" + seg;
        } else {
            fecha += seg;
        }

        return fecha;
    }


}
