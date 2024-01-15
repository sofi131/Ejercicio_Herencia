package com.ceica.Modelos;

public class Persona {
    private String nombre;
    private String dni;
//generamos constructor
    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
//ejemplo protected -> como pilla de alumno, se hace con mostrarAlumno en el main
    protected void mostrarPersona() {
        System.out.println("Persona: "+nombre+" con dni "+dni);
//        info(); //accesible desde aquí
    }

//    protected void info(){
//        System.out.println("Info de alumno");
//    }
}
