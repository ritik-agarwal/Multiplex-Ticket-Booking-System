/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author SUNNY
 */
public class dbconnection {
    public Statement stmt=null;
    public Connection con=null;
    public PreparedStatement pstmt=null;
    public ResultSet rst=null;
    public dbconnection()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticket","root","1703");
        }
    catch(Exception e){
    e.getMessage();
    }}
    }

/**
 *
 * @author SUNNY
 */