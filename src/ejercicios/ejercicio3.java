package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio3 {
    /*
     * Realiza un programa que pida 10 números por teclado y que los almacene en un array. Seguidamente, el programa
     * pasará los números primos a las primeras posiciones, desplazando el resto de números (los que no son primos)
     * a las últimas posiciones, de tal forma que no se pierda ninguno. Al final se debe mostrar el array resultante.
     */

    public static void main(String[] args) {
        //Declaramos las variables
        int[] tabla = new int[10];          //Array principal donde guardaremos los 10 numeros
        int[] tablaPrimo = new int[10];
        int[] tablaNoPrimo = new int[10];
        boolean esPrimo = true;
        int primo = 0;
        int noPrimo = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Introduzca un numero: ");
            tabla[i]= sc.nextInt();

            for (int j=2; j< tabla[i]/2; j++){
                if (tabla[i]%j==0){
                    esPrimo=false;
                    break;
                }
            }

            if (esPrimo){
                tablaPrimo[primo++] = tabla[i];
            }else {
                tablaNoPrimo[noPrimo++] = tabla[i];
            }
        }

        //Mostramos por pantalla el array principal
        System.out.println("Array principal:");
        System.out.println(Arrays.toString(tabla));
        System.out.println();

        //Metemos los pares en las primeras posiciones del array original.
        if (primo >= 0) System.arraycopy(tablaPrimo, 0, tabla, 0, primo);

        //Metemos los impares en los huecos que quedan.
        if (10 - primo >= 0) System.arraycopy(tablaNoPrimo, primo, tabla, primo+1, 10 - primo);

        //Mostramos el resultado.
        System.out.println("Array con los numeros primos al principio:");
        System.out.println(Arrays.toString(tabla));
    }
}

