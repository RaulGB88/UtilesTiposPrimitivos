/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.lib;

/**
 *
 * @author - Raúl Granel Blasco - raul.granel@gmail.com
 */
public class UtilesEnteros {

    // Valida si es PAR.
    public static boolean validarParidad(int num) {

        // Variable retorno.
        boolean valor;

        // Determina el valor boolean.
        if (num % 2 == 0) {
            valor = true;
        } else {
            valor = false;
        }
        // Devuelve el valor.
        return valor;
    }

    // Valida SIGNO.
    public static boolean validarSigno(int num) {

        // Variable retorno.
        boolean valor;

        // Determina el valor boolean.
        if (num <= 0) {
            valor = true;
        } else {
            valor = false;
        }
        // Devuelve el valor.
        return valor;
    }

    // Obtiene el MAYOR.
    public static int obtenerMayor(int n1, int n2) {

        // Variable retorno.
        int mayor;

        // Determina el número mayor.
        if (n1 > n2) {
            mayor = n1;
        } else {
            mayor = n2;
        }

        //Devuelve el valor.
        return mayor;
    }

    // Obtiene el MENOR.
    public static int obtenerMenor(int n1, int n2) {

        // Variable retorno.
        int menor;

        // Determina el número menor.
        if (n1 > n2) {
            menor = n1;
        } else {
            menor = n2;
        }

        //Devuelve el valor.
        return menor;
    }

    // Determina la RELACIÓN.
    public static int obtenerRelacion(double n1, double n2) {

        // Variable retorno.
        int relacion;

        // Determina la relación entre los números.
        if (n1 > n2) {
            relacion = 1;
        } else if (n1 < n2) {
            relacion = -1;
        } else {
            relacion = 0;
        }

        //Devuelve el valor.
        return relacion;
    }
}
