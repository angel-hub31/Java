package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.nombre = "Camisetas";
        item1.productosActuales = 20; 

        System.out.println("VALORES INICIALES:");
        item1.imprimir();

        item1.vender(5);
        System.out.println("Después de vender 5:");
        item1.imprimir();

        item1.devolver(2);
        System.out.println("Después de devolver 2:");
        item1.imprimir();

        Item item2 = new Item();
        item2.nombre = "Zapatos";
        item2.productosActuales = 50;

        item2.vender(10);
        item2.devolver(3);
        System.out.println("ESTADO SEGUNDO PRODUCTO:");
        item2.imprimir();
    }
}