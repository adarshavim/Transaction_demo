

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Adarsh Maurya
 */
public class establishconnection {
    static final String DB_URL = "jdbc:mysql://localhost/T_Demo";
   static final String USER = "root"; 
   static final String PASS = "";
   Connection conn = null; 
   Statement stmt = null; 
   ResultSet rs=null;
   int flag=0;
   public  ResultSet execute(String sql){
             int flag=0;
   try{
       Class.forName("com.mysql.jdbc.Driver");
       System.out.println("Connecting to database..."); 
      conn = DriverManager.getConnection(DB_URL,USER,PASS);
      System.out.println("Creating statement....");
      stmt=conn.createStatement();
      rs=stmt.executeQuery(sql);
    }catch(Exception e ){
     System.out.println("error in conection");
   }
     return rs;
   }
   public int update(String sql){
       try{
       Class.forName("com.mysql.jdbc.Driver");
       System.out.println("Connecting to database..."); 
      conn = DriverManager.getConnection(DB_URL,USER,PASS);
      System.out.println("Creating statement....");
      stmt=conn.createStatement();
      flag=1;
     stmt.executeUpdate(sql);
    }catch(Exception e ){
     flag=0;
   }
       return flag;
   }
   
}
