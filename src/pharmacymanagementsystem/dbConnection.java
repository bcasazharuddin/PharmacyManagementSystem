/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacymanagementsystem;
import java.sql.*;
public class dbConnection {
    static String url = "jdbc:mysql://localhost:3306/";
    static String db = "pharmadb";
    static String user = "root";
    static String pass = "tiger";
    static String Driver = "com.mysql.cj.jdbc.Driver";
    Connection con = null;
    public Connection getConn() {
        try {
            Class.forName(Driver);

            con = DriverManager.getConnection(url+db, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    
}
