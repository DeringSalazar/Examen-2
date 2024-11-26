/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Evento;

import java.time.LocalDate;

public class Evento {
    int id;
    String nombre;
    LocalDate fecha;
    String lugar;
    int capacidad;

    public Evento(int id, String nombre, LocalDate fecha, String lugar, int capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.capacidad = capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public int getCapacidad() {
        return capacidad;
    }
    
    
}
