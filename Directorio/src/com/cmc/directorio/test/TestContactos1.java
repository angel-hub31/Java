package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {
    public static void main(String[] args) {
        Telefono t1 = new Telefono(1, "movi", "0994123456");
        Contacto c1 = new Contacto("Juan", "Perez", t1, 75.5);

        Telefono t2 = new Telefono(2, "claro", "0987654321");
        Contacto c2 = new Contacto("Ana", "Gomez", t2, 60.2);

        AdminContactos admin = new AdminContactos();

        Contacto masPesado = admin.buscarMasPesado(c1, c2);
        System.out.println("--- Contacto más pesado ---");
        masPesado.imprimir();

        boolean sonIguales = admin.compararOperadoras(c1, c2);
        System.out.println("¿Tienen la misma operadora?: " + sonIguales);
    }
}