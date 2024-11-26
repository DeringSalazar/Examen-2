/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Evento;

import Modelo.DAO.DAOCUD;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class EventoDAO extends DAOCUD <EventoDTO>{

    public EventoDAO(Connection connection) {
        super(connection);
    }

    @Override
    public EventoDTO read(Object id) throws SQLException {
        stmt = connection.prepareStatement("Call EventosRead(?)");
        stmt.setInt(1, Integer.parseInt(String.valueOf(id)));
        rs = stmt.executeQuery();
        if (rs.next()) {
            return new EventoDTO(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getDate(3),
                    rs.getString(4),
                    rs.getInt(5)
            );
        }
        return null;
    }

    @Override
    public List<EventoDTO> readAll() throws SQLException {
        stmt = connection.prepareStatement("Call EventosReadAll()");
        rs = stmt.executeQuery();
        List<EventoDTO> dtos = new ArrayList();
        while(rs.next()){
            dtos.add(new EventoDTO(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getDate(3),
                    rs.getString(4),
                    rs.getInt(5)
            ));
        }
        return dtos;
    }

}
