/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Inscripción;

import Database.Database;
import Modelo.Asistente.AsistenteDAO;
import Modelo.Asistente.AsistenteMapper;
import Modelo.Evento.EventoDAO;
import Modelo.Evento.EventoMapper;
import Modelo.Mapper.Mapper;
import UtilDate.UtilDate;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        try {
            if (dto == null) return null;
            return new Inscripción(
                    dto.getId(),
                    new EventoMapper().toEntity(new EventoDAO(Database.getConnection()).read(dto.getEvento())),
                    new AsistenteMapper().toEntity(new AsistenteDAO(Database.getConnection()).read(dto.getAsistente())),
                    UtilDate.tolocalDate(dto.getFecha()),
                    dto.isAsistencia()
            );
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionMapper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InscripcionMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
