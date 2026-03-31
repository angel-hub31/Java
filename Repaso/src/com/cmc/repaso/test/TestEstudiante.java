package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {
    public static void main(String[] args) {
        Estudiante alumno = new Estudiante("Angel");

        alumno.calificar(7.5);
        System.out.println("Estudiante: " + alumno.nombre);
        System.out.println("Nota: " + alumno.nota);
        System.out.println("Resultado: " + alumno.resultado);

        System.out.println("-------------------------");

        alumno.calificar(9.0);
        System.out.println("Nueva Nota: " + alumno.nota);
        System.out.println("Nuevo Resultado: " + alumno.resultado);
    }
}