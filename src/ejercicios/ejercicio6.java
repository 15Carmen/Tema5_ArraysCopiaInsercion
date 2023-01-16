package ejercicios;

import java.util.Arrays;

public class ejercicio6 {
    /*
     * Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el primer array todos los
     * valores del 1 al 100. Por último, deberá copiar todos los valores del primer array al segundo array en orden
     * inverso, y mostrar ambos por pantalla.
     */

    public static void main(String[] args) {
        //Declaramos variables
        int[] tabla = new int[100];
        int[] tablaInversa = new int[100];

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = i + 1;
        }
        for (int i = 0; i < tabla.length; i++) {
            tablaInversa[i] = tabla[tabla.length - 1 - i];
        }

        System.out.println(Arrays.toString(tabla));
        System.out.println(Arrays.toString(tablaInversa));

    }
}
