package ejercicios;

import java.util.Arrays;

public class ejercicio2 {
    /*
     * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en un array.
     * El programa debe ser capaz de pasar todos los números pares a las primeras posiciones del array (del 0 en
     * adelante) y todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es necesario.
     */

    public static void main(String[] args) {
        //Declaramos las variables
        int[] tabla = new int[20];
        int[] tablaPares = new int[20];
        int[] tablaImpares = new int[20];

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 20; i++) {
            //Rellenamos el array principal con 20 numeros aleatorios
            tabla[i] = (int) (Math.random() * 101);

            // Separamos los números metiendo los pares en un array y los impares en otro.
            if (tabla[i] % 2 == 0) {
                tablaPares[pares++] = tabla[i];
            } else {
                tablaImpares[impares++] = tabla[i];
            }
        }

        // Muestra el array original
        System.out.println("Array original:");
        System.out.println(Arrays.toString(tabla));
        System.out.println();

        // Metemos los pares en las primeras posiciones del array original.
        for (int i = 0; i < pares; i++) {
            tabla[i] = tablaPares[i];
        }

        // Mete los impares en los huecos que quedan.
        for (int i = pares; i < 20; i++) {
            tabla[i] = tablaImpares[i - pares];
        }

        // Muestra el resultado.
        System.out.println("Array con los pares al principio:");
        System.out.println(Arrays.toString(tabla));
    }
}

