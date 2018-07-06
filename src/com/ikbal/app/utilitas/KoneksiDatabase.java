package com.ikbal.app.utilitas;

/**
 *
 * @author ikbal chahyadi
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KoneksiDatabase {
    private Connection connection;
    
    private String url = "http:mysql://localhost:3306/";
    private String username = "";
    private String password = "";
    
    
    public void connect() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
    }
    
    public Connection getConnection(){
        return this.connection;
    }
    
    public void closeConnection() throws SQLException{
        connection.close();
    }
    
    public void setConnection(String url, String username, String password) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
    }
}
