package com.cmc.repaso.entidades;

public class Estudiante {
    
    public String nombre;
    public double nota;
    public String resultado;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public void calificar(double notaRecibida) {
        this.nota = notaRecibida;
        
        if (this.nota < 8) {
            this.resultado = "F";
        } else {
            this.resultado = "A";
        }
    }
}
	
	
