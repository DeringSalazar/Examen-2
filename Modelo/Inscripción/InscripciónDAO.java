/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Inscripción;

import Modelo.DAO.DAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InscripciónDAO extends DAO<InscripciónDTO> {

    public InscripciónDAO(Connection connection) {
        super(connection);
    }
    
    @Override
    public boolean create(InscripciónDTO dto) throws SQLException {
        stmt = connection.prepareStatement("Call InsertarInscripcion(?, ?, ?, ?)");
        stmt.setString(1, dto.getEvento());
        stmt.setString(2, dto.getAsistente());
        stmt.setDate(3, dto.getFecha());
        stmt.setBoolean(4, dto.isAsistencia());
        return stmt.executeUpdate()>0;
    }

    @Override
    public boolean read(Object id) throws SQLException {
        stmt = connection.prepareStatement("Call ReadInscripcion(?)");
    }

    @Override
    public List<InscripciónDTO> readAll() throws SQLException {
        stmt = connection.prepareStatement("Call ReadALLInscripcion()");
        rs = stmt.executeQuery();
        List<InscripciónDTO> dtos = new ArrayList();
        while (rs.next()) {
            dtos.add(new InscripciónDTO(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getDate(4),
                    rs.getBoolean(5)
            ));
        }
    }

    @Override
    public boolean Update(InscripciónDTO dto) throws SQLException {
        
    }

    @Override
    public boolean Delete(Object id) throws SQLException {
        
    }
    
}
