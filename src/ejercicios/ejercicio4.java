package ejercicios;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio4 {
    /*
     * Escribir un programa que lea 10 valores enteros por teclado y los almacene en una tabla (tablaEnteros).
     * A continuación, debes construir una tabla que contenga los mismos elementos que tablaEnteros pero sin repetir.
     * Usa el algoritmo de búsqueda explicado en los apuntes.
     */

    public static void main(String[] args) {

        //Declaramos las variables
        int tablaEnteros[] = new int[10];
        int tablaSinRepes[] = new int[0];
        int numeroDeElementosSinRepetir = 0;

        Scanner sc = new Scanner(System.in);

        // Leer 10 valores enteros por teclado y almacenarlos en tablaEnteros
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa un valor entero: ");
            tablaEnteros[i] = sc.nextInt();
        }

        // Construir una tabla sin elementos repetidos
        for (int i = 0; i < 10; i++) {
            int elementoActual = tablaEnteros[i];
            int index = Arrays.binarySearch(tablaSinRepes, elementoActual);

            if (index < 0) {
                // El elemento no se encuentra en la tabla sin repetir
                tablaSinRepes = Arrays.copyOf(tablaSinRepes, tablaSinRepes.length+1);
                tablaSinRepes[numeroDeElementosSinRepetir] = elementoActual;
                numeroDeElementosSinRepetir++;
            }
        }

        // Imprimir la tabla sin elementos repetidos
        System.out.print("Tabla sin elementos repetidos: " + Arrays.toString(tablaSinRepes));
    }

}
