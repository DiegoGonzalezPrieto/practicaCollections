/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.practicacollections;

import java.util.Formatter;

/**
 *
 * @author di3
 */
public class Persona {
    private long dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private String celular;
    private int edad;

    public Persona(long dni, String nombre, String apellido, String direccion, String celular, int edad){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.celular = celular;
        this.edad = edad;
    }
    
    public void printInfo(){
        Formatter info = new Formatter();
        System.out.println(info.format("Mi nombre es %s %s, tengo %d años.", nombre, apellido, edad));
    }
    
    public String getApellido() {
        return apellido;
    }

    public String getCelular() {
        return celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public long getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
