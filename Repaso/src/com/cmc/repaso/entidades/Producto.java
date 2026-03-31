package com.cmc.repaso.entidades;

public class Producto {
    public String nombre;
    public double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void setPrecio(double nuevoPrecio) {
        if (nuevoPrecio >= 0) {
            this.precio = nuevoPrecio;
        } else {
            this.precio = nuevoPrecio * -1;
        }
    }

    public double calcularPrecioPromo(double porcentajeDescuento) {
        double descuento = (this.precio * porcentajeDescuento) / 100;
        double precioFinal = this.precio - descuento;
        return precioFinal;
    }
}