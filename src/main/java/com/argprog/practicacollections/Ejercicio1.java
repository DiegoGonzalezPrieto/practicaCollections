/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.practicacollections;
import com.argprog.practicacollections.Mascota;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * 1.      Crear una clase Mascota, que tenga los siguientes atributos: nombre, especie, sexo, color, pelaje y raza (tener en cuenta todos sus atributos, constructores y métodos getters y setters). A partir de ello:
a.      Crear un ArrayList de tipo Mascota. Crear 5 mascotas y guardarlas en la lista.
b.      Recorrer la lista creada y mostrar por pantalla el nombre, especie y pelaje de las mascotas almacenadas.
c.       Durante el recorrido, cambiar el nombre de dos mascotas. Volver a recorrer la lista y mostrar los nuevos datos
d.      Agregar dos nuevas mascotas a la lista.
e.      Recorrer la lista pero solo mostrando las mascotas que sean de la especie “perro”.
 */
public class Ejercicio1 {
    
    List<Mascota> pets;

    public Ejercicio1() {
        pets = new ArrayList<Mascota>();
    }
    
    public void addPets(){
        
        pets.add(new Mascota("Miguel", "Perro", 'M', "Beige", "Largo", "Callejero"));
        pets.add(new Mascota("Joaquín", "Gato", 'M', "Negro", "Corto", "Callejero"));
        pets.add(new Mascota("Anastasia", "Perro", 'H', "Moteada", "Corto", "Callejera"));
        pets.add(new Mascota("Roberta", "Perro", 'H', "Castaño", "Lacio", "Pastor"));
        pets.add(new Mascota("Jacinta", "Perro", 'H', "Blanco", "Rizado", "Poodle"));
    }
    
    public void showPets(){
        for (Mascota pet : pets) {
            System.out.println("Mascota " + pet.getNombre() + ", raza " + pet.getEspecie() + ", pelaje " + pet.getPelaje());
        }
    }
    
    public void showPetsAndChange(){
        for (int i = 0; i < pets.size(); i++) {
            Mascota pet = pets.get(i);
            System.out.println("Mascota " + pet.getNombre() + ", raza " + pet.getEspecie() + ", pelaje " + pet.getPelaje());
            if (i==1) {
                pet.setNombre("Ernesto");
            } else if (i==2) {
                pet.setNombre("Reinalda");
            }
            
        }
    }
    
    public void addTwoPets(){
        pets.add(new Mascota("Estela", "Gata", 'H', "Beige", "Corto", "Siamés"));
        pets.add(new Mascota("Richard", "Loro", 'M', "Verde", "Plumas", "Desconocida"));
    }
    public void filterDogs(){
        System.out.println("Los y las perros/as son:");
        for (Mascota pet : pets) {
            if (Pattern.matches("Perr(o|a)", pet.getEspecie())) {
                System.out.println("Mascota " + pet.getNombre() + ", raza " + pet.getEspecie());
            }
        }
    }
    
}
