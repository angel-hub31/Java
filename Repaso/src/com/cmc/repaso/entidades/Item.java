package com.cmc.repaso.entidades;

public class Item {
    public String nombre;
    public int productosActuales;
    public int productosDevueltos;
    public int productosVendidos;

    public void imprimir() {
        System.out.println("--- Reporte de Item: " + nombre + " ---");
        System.out.println("Productos Actuales: " + productosActuales);
        System.out.println("Productos Devueltos: " + productosDevueltos);
        System.out.println("Productos Vendidos: " + productosVendidos);
        System.out.println("-----------------------------");
    }

    public void vender(int cantidadVendida) {
        this.productosActuales = this.productosActuales - cantidadVendida;
        this.productosVendidos = this.productosVendidos + cantidadVendida;
    }

    public void devolver(int cantidadDevuelta) {
        this.productosActuales = this.productosActuales + cantidadDevuelta;
        this.productosVendidos = this.productosVendidos - cantidadDevuelta;
        this.productosDevueltos = this.productosDevueltos + cantidadDevuelta;
    }
}