package ejercicios.ejercicio7;

import java.util.Scanner;

public class Menu {

    public static Scanner sc = new Scanner(System.in);

    public static void pintarMenu() {

        System.out.println("Introduzca la opcion que desea realizar:  ");
        System.out.println("""
                [1] Mostrar valores
                [2] Ingresar valores
                [3] Salir
                """);
    }

    public static String leerOpcion() {
        return sc.nextLine();
    }

    public static void menu() {
        String opc;
        boolean salir = false;

        do {
            pintarMenu();
            opc = leerOpcion();

            switch (opc) {

                case "1":
                    System.out.println("Este es el array actualmente: ");
                    Metodos.mostrarValores();
                    break;

                case "2":
                    Metodos.introducirValores();
                    break;

                case "3":
                    System.out.println("Adiu");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (!salir);

        //Cerramos el scanner
        sc.close();
    }

}