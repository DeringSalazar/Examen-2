/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Evento;

import Modelo.Evento.Evento;
import Modelo.Inscripción.Inscripción;
import java.util.List;

/**
 *
 * @author Student
 */
public class EventoController {
    Evento evento;
    List<Inscripción> list;

    public EventoController(Evento evento) {
        this.evento = evento;
    }
    
    public int getCapacidad(){
        return evento.getCapacidad();
    }
    
    public void inscribirse(){
        evento.setCapacidad(evento.getCapacidad()-1);
    }
    
    public boolean set
    
}
