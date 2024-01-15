package com.ceica.Modelos;

public class Profesor extends Persona{

    private Double salario;
    private String especialidad;
    //array alumnos?

    public Profesor(String nombre, String dni) {
        super(nombre, dni);
    }

    public Profesor(String nombre, String dni, Double salario, String especialidad) {
        super(nombre, dni);
        this.salario = salario;
        this.especialidad = especialidad;
//        Alumno al=new Alumno("Raúl","12323567T", 3,"segunda");
//        al.info();
    }

    public void mostrarProfesor(){
        mostrarPersona();
        System.out.println("Salario "+salario+", especialidad "+especialidad);
    }
}
