public class TestContacto {
    public static void main(String[] args) {
        Contacto contacto = new Contacto("Laura Torres", "BW-00456", "BilleteraXYZ");

        contacto.mostrarContacto();

        contacto.marcarFavorito();

        contacto.mostrarContacto();

        contacto.enviarDinero(120.00);
    }
}