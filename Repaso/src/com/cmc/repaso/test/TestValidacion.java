package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {
    public static void main(String[] args) {
        Validacion validador = new Validacion();

        double montoPrueba1 = 150.50;
        double montoPrueba2 = -10.00;

        System.out.println("¿El monto " + montoPrueba1 + " es válido? " + validador.validarMonto(montoPrueba1));
        System.out.println("¿El monto " + montoPrueba2 + " es válido? " + validador.validarMonto(montoPrueba2));
    }
}