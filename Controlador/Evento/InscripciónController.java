/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Evento;

import Modelo.Inscripción.InscripcionMapper;
import Modelo.Inscripción.InscripciónDAO;
import Vistas.Vista;

public class InscripciónController {
    private InscripciónDAO dao;
    private Vista vista;
    private InscripcionMapper mapper;

    public InscripciónController(Vista vista) {
        this.vista = vista;
        mapper = new InscripcionMapper();
        
    }
    
    
}
