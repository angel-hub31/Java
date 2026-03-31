package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {
    public static void main(String[] args) {
        Producto p1 = new Producto("Laptop", 1000.0);

        p1.setPrecio(-850.0);
        System.out.println("Producto: " + p1.nombre);
        System.out.println("Precio validado: " + p1.precio);

        double descuentoPorcentaje = 20.0;
        double precioConPromo = p1.calcularPrecioPromo(descuentoPorcentaje);
        
        System.out.println("Precio con " + descuentoPorcentaje + "% de descuento: " + precioConPromo);
    }
}