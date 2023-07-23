package edu.mx.uttt.Controlador;

import edu.mx.uttt.Modelo.ModeloSecuencial;

import javax.swing.*;

public class ControlSecuencial {

    public static int tamaño, numero;

    public ControlSecuencial(ModeloSecuencial modeloSecuencial) {
        tamaño = modeloSecuencial.getTamaño();
        numero = modeloSecuencial.getNumero();
    }

    public String metodoSecuencial() {
        int dato = 0;
        int arreglo[] = new int[tamaño];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del Arreglo " + (i + 1)));
        }

        boolean bandera = false;//
        int i = 0;//3
        //mientras el iterador sea menor a 5 y bandera sea falso
        while (i < arreglo.length && bandera == false) {
            //Si
            if (arreglo[i] == numero) {
                dato = numero;
                bandera = true;
            }
            i++;
        }
        //Salimos del while
        if (bandera == false) {
            return ("Tu número no se encuentra en el arreglo");
        } else {
            return ("El número" + numero + " se encuentrra en la posición: " + (i + 1));

        }
    }
}
