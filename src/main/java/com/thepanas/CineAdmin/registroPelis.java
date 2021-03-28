package com.thepanas.CineAdmin;

import java.util.Scanner;

public class registroPelis {
    static Scanner sc = new Scanner(System.in);

    public static void imprimir() {

        System.out.println("Registro de peliculas\r\n" + "1.Ingresar Película nueva\r\n" + "2.Salir");
        int opcion = sc.nextInt();
        
        switch (opcion) {
            case 2:
                System.exit(0);
                break;
            case 1:

               registro();
                break;
            default:
                break;
        }
    }


    public static Pelicula registro() {
        Pelicula nueva = new Pelicula();
        String titulo, genero, duracion, clasificacion, afiche, tipo;

        System.out.println("Titulo:");
        titulo = sc.nextLine();
        nueva.setTitulo(titulo);

        System.out.println("Genero:");
        genero = sc.nextLine();
        nueva.setGenero(genero);

        System.out.println("Duracion:");
        duracion = sc.nextLine();
        nueva.setDuracion(duracion);

        System.out.println("Clasificacion:");
        clasificacion = sc.nextLine();
        nueva.setClasificacion(clasificacion);

        System.out.println("Afiche:");
        afiche = sc.nextLine();
        nueva.setAfiche(afiche);

        System.out.println("Tipo(2D / 3D):");
        tipo = sc.nextLine();
        nueva.setTipo(tipo);

        String[] datos = {titulo, genero, duracion, clasificacion, afiche, tipo};
        nueva.setDatos(datos);
        return nueva;
    }
}


    