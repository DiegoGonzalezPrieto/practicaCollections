/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.practicacollections;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * 2.      Crear una clase persona que tenga los siguientes atributos: dni, 
 * nombre, apellido, dirección, celular, edad (tener en cuenta todos sus 
 * atributos, constructores y métodos getters y setters). A partir de ello:
 * 
 * a. Crear una LinkedList de tipo Persona y agregar 20 personas distintas.
 * 
 * b.  Crear dos LinkedLists de tipo Persona diferentes a la primera, 
 * una para almacenar a los menores de edad y otra para los mayores.
 * 
 * c. Recorrer la lista principal buscando a las personas que sean mayores 
 * de 18 años. En caso que una persona tenga o sea mayor a 18 años, agregarla
 * a la lista de mayores, caso contrario agregarla a una lista de menores.
 * 
 * d.  Una vez realizada la separación, recorrer ambas nuevas listas y mostrar 
 * por pantalla el nombre, apellido y edad de cada una de las personas 
 * contenidas en cada lista.
 * 
 */
public class Ejercicio2 {
    List<Persona> personas = new LinkedList<Persona>();
    List<Persona> personasMayores = new LinkedList<Persona>();
    List<Persona> personasMenores = new LinkedList<Persona>();
    
    public Ejercicio2(){
        personas.add(new Persona(38274620, "Carlos", "Tomasetti", "Arapagué 1125", "2348573674", 29));
        personas.add(new Persona(30274620, "Ricina", "Altolaloma", "Convoy Cargado 578", "1543563470", 40));
        personas.add(new Persona(8539285, "Martín", "Perseo", "Arzabistán 826", "3847362728", 74));
        personas.add(new Persona(47467034, "Roberto", "Fargo", "Iridiscente 88763", "8594837859", 23));
        personas.add(new Persona(42894723, "Carla", "Gurruchi", "Hermes 9003", "8594837859", 13));
        personas.add(new Persona(57923466, "Edelmira", "Mastropiero", "Inflador 112", "9684736385", 60));
        personas.add(new Persona(42047473, "Iñaki", "Maslapo", "Eternauta 9846", "9475849575", 7));
        personas.add(new Persona(234872, "Hugo", "Quiquerón", "Cormorán 1990", "1904573947", 17));
        personas.add(new Persona(23492479, "Estuardo", "Miristia", "Atalaya 21", "3614832587", 31));
        personas.add(new Persona(24348705, "Maracalí", "Etuka", "Pierce 1999", "2938475543", 44));
        personas.add(new Persona(21374575, "Savia", "Collogan", "Zelensky 6325", "3485349574", 11));
        personas.add(new Persona(32147904, "Gonzalo", "Sépare", "Bataille 9973", "2394855435", 20));
        personas.add(new Persona(12037290, "Miriam", "Verdeo", "Merleau-Ponty 1832", "2348723554", 50));
        personas.add(new Persona(23470432, "Parapeto", "Valadin", "Ricoeur 433", "2349872598", 70));
        personas.add(new Persona(21746493, "Congola", "Úrez", "Carlos Alberto Schmitt 7635", "3573593852", 60));
        personas.add(new Persona(23472346, "Pedro", "Morietti", "Urano 1009", "2394732598", 50));
        personas.add(new Persona(21764327, "Ester", "Reginaldo", "Libertad 7732", "2984738556", 40));
        personas.add(new Persona(24376493, "Iris", "Jerez", "San Martín 10098", "2347239855", 30));
        personas.add(new Persona(23476234, "Pablo", "Aries", "Amalia Fortabat 1534", "2344735666", 20));
        personas.add(new Persona(23474332, "Buba", "Ricci", "Ricardo Rubén 27", "3234235985", 10));
    }
    
    public void filterbyAge(){
        for (Persona persona : personas) {
            if (persona.getEdad()>=18) {
                personasMayores.add(persona);
            } else {
                personasMenores.add(persona);
            }
        }
    }

    public void showLists(){
        System.out.println("Personas Mayores");
        for (Persona persona : personasMayores) {
            persona.printInfo();
        }
        System.out.println("#################################################");
        System.out.println("Personas Menores");
        for (Persona persona : personasMenores) {
            persona.printInfo();
        }

    }
}
    
