package edu.mx.uttt.Controlador;

import edu.mx.uttt.Modelo.ModeloBinario;

import javax.swing.*;

public class ControlBinario {

    public static int tamaño, numero;

    public ControlBinario(ModeloBinario modeloBinario) {
        tamaño = modeloBinario.getTamaño();
        numero = modeloBinario.getNumero();
    }

    public String metodoBinario() {

        int arreglo[] = new int[tamaño];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del Arreglo " + (i + 1)));
        }

        int inicio = 0;
        int fin = arreglo.length - 1;
        int posicion = 0;
        int resultado = 0;

        while (inicio <= fin) {
            posicion = (inicio + fin) / 2;
            if (arreglo[posicion] == numero) {
                resultado = posicion;
                break;
            } else if (arreglo[posicion] < numero) {
                inicio = posicion + 1;
            } else {
                fin = posicion - 1;
            }
        }
        return ("El numero " + numero + " fue encontrado en la posicion \nNumero " + (resultado + 1));
    }
}
