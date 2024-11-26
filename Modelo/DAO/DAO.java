/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class DAO<Dto> {
    protected Connection connection;
    protected PreparedStatement stmt;
    protected ResultSet rs;
    List<Dto> dtos;

    public DAO(Connection connection) {
        this.connection = connection;
    }
    
    public abstract boolean create(Dto dto) throws SQLException;
    public abstract boolean read(Object id) throws SQLException;
    public abstract List<Dto> readAll() throws SQLException;
    public abstract boolean Update(Dto dto) throws SQLException;
    public abstract boolean Delete(Object id) throws SQLException;
}
