


public class testConsulta {
    public static void main(String[] args) {
        System.out.println(" Integrante 3 ");

        System.out.println("--- ---");
        Consulta c1 = new Consulta("15/10/2023", "Chequeo General", "Sano", 45.0, false);
        System.out.println(c1.toString());
        System.out.println("Categoría Costo: " + c1.calcularCategoriaCosto()); 
        System.out.println("¿Es Crítica?: " + c1.esCritica()); 
        System.out.println();

        System.out.println("---  ---");
        Consulta c2 = new Consulta("", null, "", -50.0, true);
        System.out.println("Fecha asignada: " + c2.getFecha()); 
        System.out.println("Motivo asignado: " + c2.getMotivo()); 
        System.out.println("Costo asignado: " + c2.getCosto()); 
        System.out.println();

        System.out.println("--- ---");
        Consulta medio = new Consulta("20/10/2023", "Vacuna", "OK", 100.0, false);
        Consulta alto = new Consulta("21/10/2023", "Fractura", "Grave", 300.0, false);
        System.out.println("Costo 100.0: " + medio.calcularCategoriaCosto()); 
        System.out.println("Costo 300.0: " + alto.calcularCategoriaCosto());   
        System.out.println();

        
    }
}