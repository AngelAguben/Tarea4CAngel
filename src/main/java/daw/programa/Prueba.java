/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.programa;

import daw.angel.Animal;
import daw.angel.Persona;
import java.time.LocalDate;

/**
 *
 * @author Ángel
 */
public class Prueba {

    public static void main(String[] args) {
        // Primer animal por defecto
        Animal a1 = new Animal();
        // Segundo animal con valores
        Animal a2 = new Animal(LocalDate.of(2021, 1, 1), "Dogo", "perro", "despierto", 5000);

        // Dos personas
        Persona p1 = new Persona("Juan", 22);
        Persona p2 = new Persona("Paco", 18);
        System.out.println("------------------");
        
        // Imprimir las dos mascotas
        System.out.println(a1);
        System.out.println(a2);
        System.out.println("------------------");
        
        // Imprimir el contador de instancias
        System.out.println(Animal.getContadorIns());

        // Clona al animal a2 en un nuevo animal a3
        Animal a3 = a2.clonar(a2);
        System.out.println("------------------");


        // Imprimir el contador de instancias
        System.out.println(Animal.getContadorIns());
        System.out.println("------------------");


        // p1 debe despertar a todos los animales.
        p1.llamar(a1);
        p1.llamar(a2);
        p1.llamar(a3);

        // p2 juega con a2 durante 120 minutos.
        p2.jugar(a2, 120);

        //p1 alimenta a a1 1000 gramos. Imprime el nuevo peso de a1.
        p1.alimetar(a1, 1000);
        System.out.println(a1.getPeso());
        System.out.println("------------------");

        // p1 debe jugar con a1 200 minutos. Imprime el nuevo peso de a1.
        p1.jugar(a1, 200);
        System.out.println(a1.getPeso());

    }
}
