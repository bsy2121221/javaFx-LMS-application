/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BABLU YADAV
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class JavaConnect {
    Connection con;
    public static Connection ConnecrDb(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","");
         return con;
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e); 
        return null;
    }
}
    
    
}
