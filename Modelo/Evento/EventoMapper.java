/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Evento;

import Modelo.Mapper.Mapper;
import UtilDate.UtilDate;

/**
 *
 * @author Student
 */
public class EventoMapper implements Mapper<Evento,EventoDTO>{

    @Override
    public EventoDTO toDto(Evento ent) {
        if (ent == null) return null;
        return new EventoDTO(
                ent.getId(),
                ent.getNombre(),
                UtilDate.tosqlDate(ent.getFecha()),
                ent.getLugar(),
                ent.getCapacidad()
        );

    }

    @Override
    public Evento toEntity(EventoDTO dto) {
        if (dto == null)return null;
        return new Evento(
                dto.id,
                dto.nombre,
                UtilDate.tolocalDate(dto.getFecha()),
                dto.getLugar(),
                dto.getCapacidad()
        );
        
    

}
}
