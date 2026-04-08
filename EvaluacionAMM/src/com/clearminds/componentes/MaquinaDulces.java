package com.clearminds.componentes;

public class MaquinaDulces {
    private Celda celda1;
    private Celda celda2;
    private Celda celda3;
    private Celda celda4;
    private double saldo; 

    public void configurarMaquina(String c1, String c2, String c3, String c4) {
        celda1 = new Celda(c1);
        celda2 = new Celda(c2);
        celda3 = new Celda(c3);
        celda4 = new Celda(c4);
    }

    public void mostrarConfiguracion() {
        System.out.println("CELDA 1:" + celda1.getCodigo());
        System.out.println("CELDA 2:" + celda2.getCodigo());
        System.out.println("CELDA 3:" + celda3.getCodigo());
        System.out.println("CELDA 4:" + celda4.getCodigo()); 
    }

    public Celda buscarCelda(String codigo) {
        if (celda1.getCodigo().equals(codigo)) return celda1;
        if (celda2.getCodigo().equals(codigo)) return celda2;
        if (celda3.getCodigo().equals(codigo)) return celda3;
        if (celda4.getCodigo().equals(codigo)) return celda4;
        return null; 
    }

    public void cargarProducto(Producto producto, String codigoCelda, int cantidad) {
        Celda celdaRecuperada = buscarCelda(codigoCelda);
        celdaRecuperada.ingresarProducto(producto, cantidad);
    }

    public void mostrarProductos() {
        imprimirCelda(celda1);
        imprimirCelda(celda2);
        imprimirCelda(celda3);
        imprimirCelda(celda4);
        System.out.println("Saldo: " + saldo); 
    }

    private void imprimirCelda(Celda celda) {
        // El formato de asteriscos varía en el PDF, ajustamos al promedio visual
        System.out.println("***********CELDA " + celda.getCodigo()); 
        System.out.println("Stock:" + celda.getStock()); 
        if (celda.getProducto() != null) {
            System.out.println("Nombre Producto: " + celda.getProducto().getNombre());
            System.out.println("Precio Producto:" + celda.getProducto().getPrecio());
            System.out.println("Código Producto:" + celda.getProducto().getCodigo()); 
        } else {
            System.out.println("La celda no tiene producto!!!"); 
        }
    }
    
    public double consultarPrecio(String codigoCelda) {
        Celda celda = buscarCelda(codigoCelda);
        return celda.getProducto().getPrecio();
    }

    public Celda buscarCeldaProducto(String codigoProd) {
        if (celda1.getProducto() != null && celda1.getProducto().getCodigo().equals(codigoProd)) return celda1;
        if (celda2.getProducto() != null && celda2.getProducto().getCodigo().equals(codigoProd)) return celda2;
        if (celda3.getProducto() != null && celda3.getProducto().getCodigo().equals(codigoProd)) return celda3;
        if (celda4.getProducto() != null && celda4.getProducto().getCodigo().equals(codigoProd)) return celda4;
        return null; 
    }

    public void incrementarProductos(String codigoProd, int cantidad) {
        Celda celdaEncontrada = buscarCeldaProducto(codigoProd);
        if (celdaEncontrada != null) {
            celdaEncontrada.setStock(celdaEncontrada.getStock() + cantidad);
        }
    }

    public void vender(String codigoCelda) {
        Celda c = buscarCelda(codigoCelda);
        if (c != null && c.getStock() > 0) {
            c.setStock(c.getStock() - 1);
            this.saldo += c.getProducto().getPrecio(); 
        }
    }

    public double venderConCambio(String codigoCelda, double valorIngresado) {
        Celda c = buscarCelda(codigoCelda);
        c.setStock(c.getStock() - 1);
        double cambio = valorIngresado - c.getProducto().getPrecio();
        this.saldo += c.getProducto().getPrecio();
        return cambio; 
    }
}