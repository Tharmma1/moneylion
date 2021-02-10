/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author tharm
 */
public class Phpmyadmin {
    Connection con = null;
    public static Connection ConnectDB()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/moneylion?useTimezone=true&serverTimezone=UTC", "root", "");
            //JOptionPane.showMessageDialog(null, "Successfully Connected to Database");
            return con;
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Cannot Conenct to Database");
            return null;
        }
    }
}
