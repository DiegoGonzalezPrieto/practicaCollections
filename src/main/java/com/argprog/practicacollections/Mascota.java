/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.practicacollections;

/**
 *
 * Mascota: nombre, especie, sexo, color, pelaje y raza 
 * (tener en cuenta todos sus atributos, constructores y métodos getters y setters).
 */
public class Mascota {
    private String nombre;
    private String especie;
    private char sexo;
    private String color;
    private String pelaje;
    private String raza;

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public String getEspecie() {
        return especie;
    }

    public String getPelaje() {
        return pelaje;
    }

    public String getRaza() {
        return raza;
    }

    public char getSexo() {
        return sexo;
    }

    
    public void setColor(String colour) {
        color = colour;
    }

    public void setEspecie(String species) {
        especie = species;
    }

    public void setNombre(String name) {
        nombre = name;
    }

    public void setPelaje(String coat) {
        pelaje = coat;
    }

    public void setRaza(String breed) {
        raza = breed;
    }

    public void setSexo(char sex) {
        sexo = sex;
    }

    public Mascota(String name, String species, char sex, String colour, String coat, String breed) {
        nombre = name;
        especie = species;
        sexo = sex;
        color = colour;
        pelaje = coat;
        raza = breed;
    }
    
    
    
    
}
