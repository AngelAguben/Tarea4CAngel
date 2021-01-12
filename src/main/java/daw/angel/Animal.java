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
    private double peso;
    private static int contadorIns = 0;

    public Animal() {
        this.tipo = "gato";
        this.FechaNaci = LocalDate.now();
        this.nombre = "Turrón";
        this.peso = 2200;
        this.estado = "durmiendo";
        contadorIns++;
    }

    public Animal(LocalDate FechaNaci, String nombre, String tipo, String estado, double peso) {
        // No entiendo muy bien donde poner el try catch
        try {
            this.FechaNaci = FechaNaci;
            this.nombre = nombre;
            this.tipo = tipo;
            this.estado = estado;
            this.peso = peso;
            contadorIns++;
        } catch (NullPointerException npe) {
            System.out.println("Hay valores nulos");
        }
    }

    // Método comer()
    public void comer(double cantidadGramos) {
        // Si el peso es negativo
        if (cantidadGramos < 0) {
            // Se multiplizará por -1 para que se ponga en positivo
            cantidadGramos *= -1;
            // Y se sumará al peso
            this.peso += cantidadGramos;
        } else {
            // Si no, se sumará al peso.
            this.peso += cantidadGramos;
        }
    }

    // Método dormir()
    public void dormir() {
        this.estado = "durmiendo";
    }

    // Método despertar()
    public void despertar() {
        this.estado = "despierto";
    }

    // Método descansar()
    public void descansar() {
        this.estado = "despierto/reposo";
    }

    // Método jugar()
    public void jugar(int cantidadMinutos) {
        this.estado = "jugando";
        if (cantidadMinutos < 0) {
            cantidadMinutos *= -1;
        }
        // Si la cantidad de minutos es mayor o igual a 30...
        if (cantidadMinutos >= 30 && cantidadMinutos <= 180) {
            // Si el resto de 30 es 0, es decir que es 30 ...
            if (cantidadMinutos % 30 == 0) {
                do {
                    // se añadirá un valor más a c
                    cantidadMinutos -= 30;
                    this.peso -= 20;
                } while (cantidadMinutos >= 30);
                this.peso -= 10;
            } else if (cantidadMinutos % 30 != 0) {
                do {
                    cantidadMinutos -= 30;
                } while (cantidadMinutos > 30);
                this.peso -= 10;
            }
            // Si supera los 180 minutos
        } else if (cantidadMinutos > 180) {
            // Lanzará esta excepción
            throw new IllegalArgumentException("IAE");
        }
    }

    @Override
    // Este es el método toString
    public String toString() {
        return "Animal{" + "FechaNaci=" + FechaNaci + ", nombre=" + nombre + ", tipo=" + tipo + ", estado=" + estado + ", peso=" + peso + '}';
    }

    // Método clonar
    public Animal clonar(Animal pet) {
        Animal CoPet = new Animal(pet.FechaNaci, pet.nombre, pet.tipo, pet.estado, pet.peso);
        return CoPet;
    }

    // ¿Devolverá el número de objetos? Esto tengo que preguntar
    public int getContadorInstancias() {
        return contadorIns;
    }

    // GETTERS Y SETTERS
    public LocalDate getFechaNaci() {
        return FechaNaci;
    }

    public void setFechaNaci(LocalDate FechaNaci) {
        this.FechaNaci = FechaNaci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static int getContadorIns() {
        return contadorIns;
    }

    public static void setContadorIns(int contadorIns) {
        Animal.contadorIns = contadorIns;
    }

}
