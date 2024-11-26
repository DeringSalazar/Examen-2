/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Inscripción;

import Modelo.Asistente.Asistente;
import Modelo.Evento.Evento;
import java.time.LocalDate;

public class Inscripción {
    int id;
    Evento evento;
    Asistente asistente;
    LocalDate fecha;
    boolean asistencia;

    public Inscripción(int id, Evento evento, Asistente asistente, LocalDate fecha, boolean asistencia) {
        this.id = id;
        this.evento = evento;
        this.asistente = asistente;
        this.fecha = fecha;
        this.asistencia = asistencia;
    }

    public int getId() {
        return id;
    }

    public Evento getEvento() {
        return evento;
    }

    public Asistente getAsistente() {
        return asistente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public boolean isAsistencia() {
        return asistencia;
    }
    
    
}
