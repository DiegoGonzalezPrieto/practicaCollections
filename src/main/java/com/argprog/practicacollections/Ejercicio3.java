/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.practicacollections;

import java.util.List;
import java.util.Stack;

/**
 *
 * 3. Crear una stack que permita objetos de tipo Autos, donde cada objeto auto 
 * debe tener: num_patente, marca, modelo, color, chasis. Cargar la pila con 7 
 * autos diferentes luego hacer lo siguiente:
 * 
 * a.  Buscar un auto de color rojo.
 * 
 * b. Mostrar el auto que se encuentra en la cima de la pila.
 * 
 * c. Borrar el auto que se encuentra en la cima de la pila.
 * 
 * d. Agregar dos nuevos autos a la pila.
 */
public class Ejercicio3 {
    private Stack<Auto> autos = new Stack<Auto>();

    public Ejercicio3() {
        autos.push(new Auto(324, "Fiat", "Punto", "Verde", "AF304"));
        autos.push(new Auto(324, "Volkswagen", "Gol", "Azul", "CJ278"));
        autos.push(new Auto(324, "Ford", "Ranger", "Blanco", "KS274"));
        autos.push(new Auto(324, "Fiat", "Palio", "Rojo", "KV946"));
        autos.push(new Auto(324, "Chevrolet", "Corsa", "Violeta", "CB234"));
        autos.push(new Auto(324, "Renault", "Oroch", "Azul", "VH436"));
        autos.push(new Auto(324, "Peugeot", "208", "Negro", "FA534"));
    }
    
    public void findByColor(String color){
        for (Auto auto : autos) {
            if (auto.getColor() == color) {
                auto.printInfo();
            }
        }
    }

    public Stack<Auto> getAutos() {
        return autos;
    }
    
    public void showStack(){
        for (Auto auto : autos) {
            auto.printInfo();
        }
    }
    
    
    
    
}
