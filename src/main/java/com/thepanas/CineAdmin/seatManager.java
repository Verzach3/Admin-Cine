package com.thepanas.CineAdmin;
import java.util.Scanner;

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

    static boolean[] sala2D_1 = new boolean[80];
    static boolean[] sala2D_2 = new boolean[80];
    static boolean[] sala2D_3 = new boolean[80];

    static boolean[] sala3D_1 = new boolean[50];
    static boolean[] sala3D_2 = new boolean[50];

    static boolean[] salaVIP = new boolean[30];

    //Obtiene las sillas libres de la sala seleccionada
    public static boolean[] getSeats(int sala) {
        if (sala == 0) {
            //printSeats(sala2D_1);
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

    public static void setSeats(int bs,int index) {
        System.out.println("Ingrese el estado al que quiere cambiar la silla\n1.Libre\n2.Ocupado");
        Scanner scan = new Scanner(System.in);
        int estado = scan.nextInt();
        if (estado == 1) {
            getSeats(bs)[index] = false;
            seatmanagercli();
        }else if (estado == 2) {
            getSeats(bs)[index] = true;
            seatmanagercli();
        }else {
            System.out.println("Opcion incorrecta");
        }
    }

    //Herramienta para manejar al seat manager mediante comandos (Solo para pruebas durante el desarrollo)
    public static void seatmanagercli() {
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        while (exit == false) {
            System.out.println("------------------|Seatmanager CLI|------------------");
            System.out.println("Por favor ingrese la sala de la que desea obtener los asientos");
            int Seleccion = scan.nextInt();
            System.out.println("");
            if (Seleccion == 10){
              break;
            }else{ getSeats(Seleccion);
            }
            while (exit == false) {
                System.out.println("Sala seleccionada: " + Seleccion);
                printSeats(getSeats(Seleccion));
                System.out.println("\n1.Cambiar estado de una silla\n10.Salir");
                int Seleccion2 = scan.nextInt();
                if (Seleccion2 == 1) {
                    System.out.println("De que silla desea cambiar el estado");
                    int silla = scan.nextInt();
                    if (silla >= 0 && silla<= 79) {
                        setSeats(Seleccion, silla);
                    }
                }else if (Seleccion2 == 10) {
                    break;
                }



            }

        }

    }

    public static void printSeats(boolean[] sillas){
        if (sillas.length == 80) {
            int contador = 0;
            int contador2 = 0;
            for(int i = 0; i < sillas.length; i++){
                if (contador == 4) {
                    contador = 0;
                    contador2 ++;
                    System.out.print("        ");
                }else{
                    System.out.print(
                        "[" +
                        seatStatus(sillas, i) +
                        "]"
                    );
                    contador ++;

                }
                if (contador2 == 2) {
                    contador2 = 0;
                    System.out.print("\n");
                }

        
            }  
        }

        System.out.println("");
    }

    public static String seatStatus(boolean[] sillas, int silla) {
        if (sillas[silla] == true) {
            return "*";
        }else{
            return " ";
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
