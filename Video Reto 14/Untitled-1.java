
public class Carrito {
    private String nombreCliente;
    private String[] productos;
    private double[] precios;
    private int cantidad;

    public Carrito(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        this.productos = new String[10];
        this.precios = new double[10];
        this.cantidad = 0;
    }

    public void agregarProducto(String nombre, double precio) {
        if (cantidad < 10) {
            productos[cantidad] = nombre;
            precios[cantidad] = precio;
            cantidad++;
            System.out.println("Producto agregado: " + nombre + " ($" + precio + ")");
        } else {
            System.out.println("El carrito está lleno.");
        }
    }

    public void calcularTotal() {
        double total = 0;
        for (int i = 0; i < cantidad; i++) {
            total += precios[i];
        }
        System.out.println("Total del carrito: $" + total);
    }

    public void mostrarResumen() {
        System.out.println("Carrito de " + nombreCliente);
        System.out.println("===");
        for (int i = 0; i < cantidad; i++) {
            System.out.println((i + 1) + ". " + productos[i] + " $" + precios[i]);
        }
        
        double total = 0;
        for (int i = 0; i < cantidad; i++) {
            total += precios[i];
        }
        System.out.println("Total: $" + total);
    }
}