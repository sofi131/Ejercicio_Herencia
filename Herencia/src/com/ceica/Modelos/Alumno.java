package com.ceica.Modelos;

import com.ceica.Modelos.Persona;

public class Alumno extends Persona {
//alumno hereda de persona
    private int codigo;
    private String aula;

    public Alumno(String nombre, String dni, int codigo, String aula) {
        //clase padre
        super(nombre, dni);
        this.codigo = codigo;
        this.aula = aula;
    }
    public void mostrarAlumno(){
        mostrarPersona();
        System.out.println("Código "+codigo+", aula "+aula);
        //info(); //solo se puede llamar desde dentro de la clase - en este archivo
    }

    //prueba - private info

}
