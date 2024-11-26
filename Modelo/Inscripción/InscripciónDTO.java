/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Inscripción;

import java.sql.Date;

public class InscripciónDTO {
    int id;
    private int evento;
    private String asistente;
    Date fecha;
    boolean asistencia;

    public InscripciónDTO(int id, int evento, String asistente, Date fecha, boolean asistencia) {
        this.id = id;
        this.evento = evento;
        this.asistente = asistente;
        this.fecha = fecha;
        this.asistencia = asistencia;
    }

    public int getId() {
        return id;
    }

    public int getEvento() {
        return evento;
    }

    public String getAsistente() {
        return asistente;
    }

    public Date getFecha() {
        return fecha;
    }

    public boolean isAsistencia() {
        return asistencia;
    }
    
    
}
