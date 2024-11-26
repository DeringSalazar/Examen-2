/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo.DAO;

import java.sql.SQLException;
import java.sql.Connection;


public abstract class DaoCRUD<Dto> extends DAOCUD<Dto>{ 

    public DaoCRUD(Connection connection) {
        super(connection);
    }
    
    public abstract boolean create(Dto dto) throws SQLException;
    public abstract boolean Update(Dto dto) throws SQLException;
    public abstract boolean Delete(Object id) throws SQLException;
}
