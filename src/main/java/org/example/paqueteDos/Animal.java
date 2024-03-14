package org.example.paqueteDos;

public class Animal {
   private Integer id;
    private String nombre;

//metodos especiales

    //1. para asignarle valores a los atributos, existe un metodo especial que se llama constructor

    public Animal() {

    }

    public Animal(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}
