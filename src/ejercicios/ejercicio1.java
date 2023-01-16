package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio1 {
    /*
     * Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota los elementos de ese
     * array, es decir, el elemento de la posición 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El número que
     * se encuentra en la última posición debe pasar a la posición 0. Finalmente, muestra el contenido del array.
     */

    public static void main(String[] args) {
        //Declaramos las variables
        int[] tabla = new int[15];
        int[] tabla2 = new int[15];
        int ultimaPos;

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Introduzca 15 numeros en el array");
            tabla[i]= sc.nextInt();
        }

        ultimaPos = tabla.length;

        tabla2[0] = ultimaPos;

        System.arraycopy(tabla, 0, tabla2, 1, tabla.length-1);

        System.out.println(Arrays.toString(tabla2));

        //Cerramos el scanner
        sc.close();
    }
}
