package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {
    public static void main(String[] args) {
        Telefono t1 = new Telefono(101, "movi", "0995556667");
        Contacto c1 = new Contacto("Carlos", "Andrade", t1, 82.3);

        Telefono t2 = new Telefono(102, "movi", "0998887774");
        Contacto c2 = new Contacto("Beatriz", "Luna", t2, 95.0);

        AdminContactos admin = new AdminContactos();

        Contacto masPesado = admin.buscarMasPesado(c1, c2);
        System.out.println("--- Resultado: Contacto Más Pesado ---");
        masPesado.imprimir();

        boolean resultadoOperadoras = admin.compararOperadoras(c1, c2);
        System.out.println("¿Tienen la misma operadora?: " + resultadoOperadoras);
    }
}