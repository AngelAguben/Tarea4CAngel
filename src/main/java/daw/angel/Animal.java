/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.angel;

import java.time.LocalDate;
// DateTimeFormat

/**
 *
 * @author angel
 */
public class Animal {

    // Declararemos las variables y las iniciaremos
    private LocalDate FechaNaci;
    // TIPO = gato, perro, lagarto, cobaya o periquito
    // ESTADO = comiendo, durmiendo, despierto/reposo o reposo
    private String nombre, tipo, estado;
    // PESO en gramos
    private int peso;
    private static int contadorIns = 0;

    public Animal() {
        this.tipo = "gato";
        this.FechaNaci = LocalDate.now();
        this.nombre = "Turrón";
        this.peso = 2200;
        contadorIns++;
    }

    public Animal(LocalDate FechaNaci, String nombre, String tipo, String estado, int peso) {
        this.FechaNaci = FechaNaci;
        this.nombre = nombre;
        this.tipo = tipo;
        this.estado = estado;
        this.peso = peso;
        contadorIns++;
    }

    public void comer(double cantidadGramos) {
        if (cantidadGramos < 0) {
            cantidadGramos = cantidadGramos * -1;
            this.peso += cantidadGramos;
        } else {
            this.peso += cantidadGramos;
            contadorIns++;
        }
    }

    public void dormir() {
        this.estado = "durmiendo";
    }

    public void despertar() {
        this.estado = "despierto";
    }

    public void descansar() {
        this.estado = "despierto/reposo";
    }

    public void jugar(int cantidadMinutos) {
        this.estado = "jugando";
    }

    
}
