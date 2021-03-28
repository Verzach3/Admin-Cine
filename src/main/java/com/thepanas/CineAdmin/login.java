package com.thepanas.CineAdmin;
import java.util.Scanner;

public class login {

    public static int userrank = 0;

    public static void Login() {

        String[][] database = { { "Pepito", "TeAmoMami01", "1" }, { "Raul", "PanaFresco", "4" },
                { "Alejandro", "452", "4" },{ "Kahyberth", "098754", "1" },{ "Gabriel Correa", "874521", "1" },
                { "Camilo Varela", "45872", "1" },{ "Alejandro", "452", "4" } };

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese su usuario");
        String usuario = scan.nextLine();
        System.out.println("Ingrese su contraseña");
        String contraseña = scan.nextLine();

        for (int i = 0; i < database.length; i++) {
            if (usuario.equals(database[i][0]) && contraseña.equals(database[i][1])) {
                System.out.println("Usuario iniciado correctamente");
                String userlevel = "";

                if (Integer.parseInt(database[i][2]) == 1) {
                    System.out.println("Nivel de usuario administrador");
                    userrank = 1;
                } else if (Integer.parseInt(database[i][2]) == 4) {
                    System.out.println("Nivel de usuario: Usuario no registrado");
                    userrank = 4;
                }
            }
        }

        scan.close();
    }

}
