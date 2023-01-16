package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5 {
    /*
     * Escribir un programa que lea 10 valores enteros por teclado y los almacene en una tabla (tablaEnteros).
     * A continuación, debes crear dos tablas: numPares y numImpares. En numPares almacenarás los números pares que se
     * encuentren en tablaEnteros y en numImpares almacenarás los números impares.
     */

    public static void main(String[] args) {
        //Declaramos las variables
        int[] tablaPares = new int[10];     //Array axuiliar donde vamos a guardar los numeros pares del array principal
        int[] tablaImpares = new int[10];   //Array auxiliar donde vamos a guardar los numeros impares del array principal
        int pares = 0;                      //Variable donde guardamos los numeros pares
        int impares = 0;                    //Variable donde guardamos los numeros impares
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca 10 numeros:");
        for (int i = 0; i < 10; i++) {
            //Rellenamos el array principal con 20 numeros aleatorios
            num = sc.nextInt();

            // Separamos los números metiendo los pares en un array y los impares en otro.
            if (num % 2 == 0) {                //Si el modulo de 2 del numero en el array es igual a 0
                tablaPares[pares++] = num;     //Añadimos el numero a la tabla de numeros pares
            } else {                           //Si ese no es el caso
                tablaImpares[impares++] = num; //Añadimos el numero a la tabla de numeros impares
            }
        }

        //Mostramos el resultado.
        System.out.println("Array de pares:");
        System.out.println(Arrays.toString(tablaPares));

        System.out.println("Array de impares:");
        System.out.println(Arrays.toString(tablaImpares));
    }
}
