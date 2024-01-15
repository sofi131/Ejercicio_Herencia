package com.ceica;

import com.ceica.Modelos.Alumno;
import com.ceica.Modelos.Profesor;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Pedro", "12123123S",342,"primera");
        alumno1.mostrarAlumno();
        Profesor profesor1 = new Profesor("Paco","12987123D", 1250.90, "Matemáticas");
        profesor1.mostrarProfesor();
    }
}