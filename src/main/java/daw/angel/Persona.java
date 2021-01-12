/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.angel;

/**
 *
 * @author Ángel
 */
public class Persona {
    
    private String nombre;
    private int edad;

    // Constructor parametrizado
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método llamar(Animal pet)
    public void llamar(Animal pet) {
        pet.setEstado("despierto/reposo");
    }

    // Método alimentar(Animal pet, double cantidadGramos)
    public void alimetar(Animal pet, double cantidadGramos) {
        pet.setPeso(cantidadGramos);
    }

    // Método jugar(Animal pet, int cantidadMinutos)
    public void jugar(Animal pet, int cantidadMinutos) {
        try { // Intenta lo siguiente 
            pet.jugar(cantidadMinutos);
            // Y si coges esta excepción 
        } catch (IllegalArgumentException IAE) {
            // cantidadMinutos será 180
            cantidadMinutos = 180;
        }
        // Y se inenta otra vez
        pet.jugar(cantidadMinutos);
    }
    
}
