/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmobil;

/**
 *
 * @author Iqbal
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class loginConfig {
    private static Connection mysqlconfig;
    public static Connection configDB() throws SQLException{
        try{    
            String url = "jdbc:mysql://localhost:3306/logreg";
            String username = "root";
            String password = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, username, password);
            
        }
        catch (Exception e){
            System.err.println("koneksi gagal"+e.getMessage());
        }
        return mysqlconfig;
    }
}
