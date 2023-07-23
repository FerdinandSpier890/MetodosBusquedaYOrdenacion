package edu.mx.uttt.Controlador;

import edu.mx.uttt.Modelo.ModeloInsercion;

import javax.swing.*;

public class ControlInsercion {

    public static int tamaño;

    public ControlInsercion(ModeloInsercion modeloInsercion) {
        tamaño = modeloInsercion.getTamaño();
    }

    public int[] metodoInsercion() {

        int arreglo[] = new int[tamaño];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del Arreglo " + (i + 1)));
        }

        double c;
        double m = arreglo.length;
        int i;

        for (int j = 1; j < m; j++) {

            c = arreglo[j];
            i = j - 1;

            while (i > -1 && arreglo[i] > c) {
                arreglo[i + 1] = arreglo[i];
                i = i - 1;
            }
            arreglo[i + 1] = (int) c;

        }
        return arreglo;
    }
}
