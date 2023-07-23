package edu.mx.uttt.Controlador;

import edu.mx.uttt.Modelo.ModeloSeleccion;

import javax.swing.*;

public class ControlSeleccion {

    public static int tamaño;

    public ControlSeleccion(ModeloSeleccion modeloSeleccion) {
        tamaño = modeloSeleccion.getTamaño();
    }

    public int[] metodoSelecion() {

        int arreglo[] = new int[tamaño];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del Arreglo " + (i+1)));
        }

        for (int i = arreglo.length - 1; i > 0; i--) {
            int maxValue = 0;
            for (int j = 0; j < i; j++) {
                if (arreglo[j + 1] > arreglo[maxValue]) {
                    maxValue = j + 1;
                }
            }
            swap(arreglo, i, maxValue);
        }

        return arreglo;
    }

    public void swap(int[] array, int a, int b) {
        double value = array[b];
        array[b] = array[a];
        array[a] = (int) value;
    }
}
