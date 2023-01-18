package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio8 {
    /*
     * Crea un programa que permita al usuario almacenar una secuencia aritmética en un array y luego mostrarla.
     * Una secuencia aritmética es una serie de números que comienza por un valor inicial V, y continúa con incrementos
     * de I. Por ejemplo, con V=1 e I=2, la secuencia sería 1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería
     * 7, 17, 27, 37… El programa solicitará al usuario el valor inicial V, el incremento I y el número de valores a
     * crear N.
     */

    public static void main(String[] args) {

        //Declaramos las variables
        int N;
        int I;
        int V;
        int[] tabla;


        //Declaramos el scanner par apoder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca el tamaño del array, un valor inicial y el incremento
        System.out.println("Indique que longitud va a tener el array: ");
        N = sc.nextInt();
        tabla = new int[N]; //Indicamos que el tamaño del array previamente declarado sea N
        System.out.println("Introduzca el valor inicial: ");
        V= sc.nextInt();
        System.out.println("Introduzca el incremento de la secuencia: ");
        I=sc.nextInt();

        for (int i = 0; i < tabla.length; i++) {    //Recorremos el array
            tabla[i]=V;                             //En cada vuelta de bucle colocamos en el indice i el valor introducido por el usuario
            V+=I;                                   //Incrementamos V con el valor de incremento introducido por el usuario
        }

        //Imprimimos por pantalla el array
        System.out.println(Arrays.toString(tabla));

        //Cerramos el scanner
        sc.close();


    }
}
