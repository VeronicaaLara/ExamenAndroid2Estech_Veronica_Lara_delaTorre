package com.example.examen;



public class Enemigo {

    private String nombre, edad, ofensa;

    public Enemigo(){
        this.nombre = nombre;
        this.edad = edad;
        this.ofensa = ofensa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getOfensa() {
        return ofensa;
    }

    public void setOfensa(String ofensa) {
        this.ofensa = ofensa;
    }

    @Override
    public String toString() {
        return "Enemigo{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", ofensa='" + ofensa + '\'' +
                '}';
    }
}
