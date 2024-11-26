/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Inscripción;

import Modelo.DAO.DaoCRUD;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InscripciónDAO extends DaoCRUD<InscripciónDTO> {

    public InscripciónDAO(Connection connection) {
        super(connection);
    }
    
    @Override
    public boolean create(InscripciónDTO dto) throws SQLException {
        stmt = connection.prepareStatement("Call InsertarInscripcion(?, ?, ?, ?)");
        stmt.setInt(1, dto.getEvento());
        stmt.setString(2, dto.getAsistente());
        stmt.setDate(3, dto.getFecha());
        stmt.setBoolean(4, dto.isAsistencia());
        return stmt.executeUpdate()>0;
    }

    @Override
    public InscripciónDTO read(Object id) throws SQLException {
        stmt = connection.prepareStatement("Call ReadInscripcion(?)");
        stmt.setInt(1, Integer.parseInt(String.valueOf(id)));
        rs = stmt.executeQuery();
        if (rs.next()){
            return new InscripciónDTO(
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getString(3),
                    rs.getDate(4),
                    rs.getBoolean(5)
            );
        }
        return null; 
    }

    @Override
    public List<InscripciónDTO> readAll() throws SQLException {
        stmt = connection.prepareStatement("Call ReadALLInscripcion()");
        rs = stmt.executeQuery();
        List<InscripciónDTO> dtos = new ArrayList();
        while (rs.next()) {
            dtos.add(new InscripciónDTO(
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getString(3),
                    rs.getDate(4),
                    rs.getBoolean(5)
            ));
        }
        return dtos;
    }

    @Override
    public boolean Update(InscripciónDTO dto) throws SQLException {
        stmt = connection.prepareStatement("Call UpdateInscripcion(?, ?)");
        stmt.setInt(1, dto.getId());
        stmt.setBoolean(2, dto.isAsistencia());
        return stmt.executeUpdate()>0;
    }

    @Override
    public boolean Delete(Object id) throws SQLException {
        stmt = connection.prepareStatement("Call DeleteInscripcion(?)");
        stmt.setInt(1, Integer.parseInt(String.valueOf(id)));
        return stmt.executeUpdate()>0;
    }
    
}
