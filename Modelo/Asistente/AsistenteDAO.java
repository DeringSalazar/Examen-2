package Modelo.Asistente;

import Modelo.DAO.DaoCRUD;
import java.sql.SQLException;
import java.util.List;
import java.sql.Connection;
import java.util.ArrayList;

public class AsistenteDAO extends DaoCRUD<AsistenteDTO>{

    public AsistenteDAO(Connection connection) {
        super(connection);
    }

    
    @Override
    public boolean create(AsistenteDTO dto) throws SQLException {
        stmt = connection.prepareStatement("call InsertarAsistente(?,?,?,?)");
        stmt.setString(1, dto.getCedula());
        stmt.setString(2, dto.getNombre());
        stmt.setString(3, dto.getTelefono());
        stmt.setString(4, dto.getCorreo());
        return stmt.executeUpdate()>0;
    }



    @Override
    public List<AsistenteDTO> readAll() throws SQLException {
        stmt = connection.prepareStatement("call ReadAllAsistente()");
        rs = stmt.executeQuery();
        List<AsistenteDTO> dtos = new ArrayList();
        while(rs.next()){
            dtos.add(new AsistenteDTO(
                    rs.getString(1),
                    rs.getString(2), 
                    rs.getString(3), 
                    rs.getString(4)
            ));
        }
        return dtos;
    }

    @Override
    public boolean Update(AsistenteDTO dto) throws SQLException {
        stmt = connection.prepareStatement("call UpdateAsistentes(?,?,?)");
        stmt.setString(1, dto.getCedula());
        stmt.setString(2, dto.getTelefono());
        stmt.setString(3, dto.getCorreo());
        return stmt.executeUpdate()>0;
    }

    @Override
    public boolean Delete(Object id) throws SQLException {
        stmt = connection.prepareStatement("call DeleteAsistente(?)");
        stmt.setString(1, (String) id);
        return stmt.executeUpdate()>0;
    }

    @Override
    public AsistenteDTO read(Object id) throws SQLException {
        stmt = connection.prepareStatement("call ReadAsistente(?)");
        stmt.setString(1, (String) id);
        rs = stmt.executeQuery();
        if(rs.next()){
            return new AsistenteDTO(
                    rs.getString(1), 
                    rs.getString(2), 
                    rs.getString(3), 
                    rs.getString(4)
            );
        }
        return null;
    }
    
}
