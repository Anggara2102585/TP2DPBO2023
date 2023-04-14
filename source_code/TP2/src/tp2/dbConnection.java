/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Apri Anggara Yudha
 */
public class dbConnection {
    // Property
    private Statement stmt = null;
    private Connection conn = null;
    
    // Constructor
    public dbConnection() {
        String ConAddress = "jdbc:mysql://localhost/db_volcano";
        String user = "root";
        String pass = "";
        connect(ConAddress, user, pass);
    }
    
    private void connect(String ConAddress, String username, String pass) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(ConAddress, username, pass);
            stmt = conn.createStatement();
        } catch(ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    // for SELECT query
    public ResultSet selectQuery(String sql) {
        try {
            stmt.executeQuery(sql);
            return stmt.getResultSet();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
    
    // for INSERT, UPDATE, DELETE query
    public int updateQuery(String sql) {
        try {
            return stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            //Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        return 0;
    }
    
    public Statement getStatement() {
        return stmt;
    }
}
