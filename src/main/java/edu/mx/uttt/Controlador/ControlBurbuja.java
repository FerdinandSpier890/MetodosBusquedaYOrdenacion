package edu.mx.uttt.Controlador;

import edu.mx.uttt.Modelo.ModeloBurbuja;

import javax.swing.*;

public class ControlBurbuja {

    public static int tamaño;

    public ControlBurbuja(ModeloBurbuja modeloBurbuja) {
        tamaño = modeloBurbuja.getTamaño();
    }

    public int[] metodoBurbuja() {

        int arreglo[] = new int[tamaño];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del Arreglo " + (i+1)));
        }

        /* Bucle desde 0 hasta la longitud del array -1 */
        for (int i = 0; i < arreglo.length - 1; i++) {
            /* Bucle anidado desde 0 hasta la longitud del array -1 */
            for (int j = 0; j < arreglo.length - 1; j++) {
                /* Si el número almacenado en la posición j es mayor que el de la posición j+1 (el siguiente del array) */
                if (arreglo[j] > arreglo[j + 1]) {
                    /* guardamos el número de la posicion j+1 en una variable (el menor) */
                    double temp = arreglo[j + 1];
                    /* Lo intercambiamos de posición */
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = (int) temp;
                    /* y volvemos al inicio para comparar los siguientes hasta que todos se hayan comparado*/
                    /* de esta forma vamos dejando los números mayores al final del array en orden*/
                }
            }
        }

        return arreglo;
    }

}
