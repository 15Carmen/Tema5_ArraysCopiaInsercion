package ejercicios.ejercicio7;

import java.util.Arrays;
import java.util.Scanner;

public class Metodos {

    //Declaramos las variables
    static int[] array = new int[10];

    //Declaramos el scanner para poder leer por consola
    static Scanner sc = new Scanner(System.in);

    public static void mostrarValores() {
        System.out.println(Arrays.toString(array));
    }

    public static void introducirValores() {
        int valor;
        int posicion;

        System.out.println("Introduzca el valor que de sea introducir: ");
        valor = sc.nextInt();
        System.out.println("Introduzca en que posición del array desea introducirlo: ");
        posicion = sc.nextInt();

        if (posicion>=10){
            System.out.println("Posición no válida");
        }else{
            array[posicion]=valor;
        }
    }
}
