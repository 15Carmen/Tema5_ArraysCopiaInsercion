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
        int tablaSinRepes[];

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < tablaEnteros.length; i++) {
            System.out.println("Introduzca un numero: ");
            tablaEnteros[i]= sc.nextInt();
        }

        tablaSinRepes = quitarRepes(tablaEnteros);

        System.out.println("Tabla original: " + Arrays.toString(tablaEnteros));
        System.out.println("Tabla sin numeros repetidos: " + Arrays.toString(tablaSinRepes));
    }

    public static int[] quitarRepes(int[] array) {
        //Ordenamos el array
        Arrays.sort(array);
        int contador = 0;

        for (int i = 0; i < array.length; i++) {        //Recorremos el array original
            if (i == 0 || array[i] != array[i - 1]) {
                array[contador++] = array[i];
            }
        }
        return Arrays.copyOf(array, contador);
    }

}
