package com.thepanas.CinemaFilms;

public class seatManager {

    /*
    Definicion de las salas de cine:
        --Para las salas 2D y 3D--
        Si una posicion en la matriz es true significa que el asiento ha sido ocupado
        en caso contrario significa que el asiento esta libre

        --Para las salas VIP--
        Como son 10 balcones y cada uno tiene 3 sillas reclinables entonces:
            el primer numero en el index de la matriz define el balcon y el segundo numero la silla
            los valores almacenados en la matriz solo son 0 y 1 usados como false y true respactivamente
    */

    static Boolean[] sala2D_1 = new Boolean[80];
    static Boolean[] sala2D_2 = new Boolean[80];
    static Boolean[] sala2D_3 = new Boolean[80];

    static Boolean[] sala3D_1 = new Boolean[50];
    static Boolean[] sala3D_2 = new Boolean[50];

    static Boolean[] salaVIP = new Boolean[30];

    //Obtiene las sillas libres de la sala seleccionada
    public static Boolean[] getSeats(int sala) {
        if (sala == 0) {
            return sala2D_1;
        }else if (sala == 1) {
            return sala2D_2;
        }else if (sala == 2) {
            return sala2D_3;
        }else if (sala == 3) {
            return sala3D_1;
        }else if (sala == 4) {
            return sala3D_2;
        }else if (sala == 5) {
            return salaVIP;
        }

        
        
        return null;
    }

    public static void setSeats() {
        
    }

    //Herramienta para manejar al seat manager mediante comandos (Solo para pruebas durante el desarrollo)
    public static void seatmanagercli() {
        boolean exit = false;
        while (exit == false) {
            System.out.println("------------------|Seatmanager CLI|------------------");
            


        }
    }


    //Constructor
    seatManager(boolean enable_cli){
        
        if (enable_cli == true) {
            seatmanagercli();
            System.exit(0);
        }


    }

}