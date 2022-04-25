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
public class Auto {
    private int num_patente; 
    private String marca; 
    private String modelo; 
    private String color; 
    private String chasis;

    public Auto(int num_patente,
            String marca,
            String modelo,
            String color,
            String chasis) {
        
        this.num_patente = num_patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.chasis = chasis;
    }

    public void printInfo(){
        Formatter info = new Formatter();
        System.out.println(info.
                format("El %s %s, patente %s, tiene color %s y número de chasis %s.",
                        marca, modelo, num_patente, color, chasis));
    }

    public String getChasis() {
        return chasis;
    }

    /**
     * @return the num_patente
     */
    public int getNum_patente() {
        return num_patente;
    }

    /**
     * @param num_patente the num_patente to set
     */
    public void setNum_patente(int num_patente) {
        this.num_patente = num_patente;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @param chasis the chasis to set
     */
    public void setChasis(String chasis) {
        this.chasis = chasis;
    }
    
    
    
}
