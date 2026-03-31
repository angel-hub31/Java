public class TestCarrito {
    public static void main(String[] args) {
        Carrito miCarrito = new Carrito("María López");

        miCarrito.agregarProducto("Audifonos Bluetooth", 89.99);
        miCarrito.agregarProducto("Cargador USB", 15.00);

        System.out.println("\n--- Verificando Cálculos ---");
        
        miCarrito.calcularTotal();

        System.out.println("\n--- Resumen Final ---");
        
        miCarrito.mostrarResumen();
    }
}