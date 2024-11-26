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

public abstract class DAOCUD<Dto> {
    protected Connection connection;
    protected PreparedStatement stmt;
    protected ResultSet rs;
    List<Dto> dtos;  
    
    public DAOCUD(Connection connection) {
        this.connection = connection;
    }
    
    public abstract Dto read(Object id) throws SQLException;
    public abstract List<Dto> readAll() throws SQLException;
}
