/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Inscripción;

import Modelo.Mapper.Mapper;
import UtilDate.UtilDate;

public class InscripcionMapper implements Mapper<Inscripción, InscripciónDTO>{

    @Override
    public InscripciónDTO toDto(Inscripción ent) {
        if (ent == null) return null;
        return new InscripciónDTO(
                    ent.getId(),
                    ent.getEvento().getId(),
                    ent.getAsistente().getCedula(),
                    UtilDate.tosqlDate(ent.getFecha()),
                    ent.isAsistencia()
        );
    }

    @Override
    public Inscripción toEntity(InscripciónDTO dto) {
        if (dto == null) return null;
        return new Inscripción(
                    dto.getId(),
                    new InscripcionMapper().toEntity(new InscripciónDAO(DataBase.getConnection()).read(dto.getEvento())),
                    dto.getAsistente(),
                    UtilDate.tolocalDate(dto.getFecha()),
                    dto.isAsistencia()
        );
    }
}
