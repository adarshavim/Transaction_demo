/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Adarsh Maurya
 */
public class createdb {
        // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "";
   
   public  void createDB() {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);

      //STEP 4: Execute a query
      System.out.println("Creating database...");
      stmt = conn.createStatement();
      
      String sql1 = "CREATE DATABASE T_Demo";
      stmt.executeUpdate(sql1);
      System.out.println("Database created successfully...");
      String sql2=" create table flag(ch varchar(1) not null,primary key(ch));";
      String sql3="insert into flag values('Y');";
      establishconnection ob=new establishconnection();
      int f1=ob.update(sql2);
      if(f1==0){
          JOptionPane.showMessageDialog(null,"database creation failed");
          System.out.println("error in creating flag of data base ");
      }
      else 
          System.out.println("flag table has been created");
      
      int f2=ob.update(sql3);
      if(f2==0){
          System.out.println("error in setting flag of data base ");
      }
      else 
          System.out.println("database has been flagged");
      String sql4="create table OWNER(Name_ID int not null auto_increment,Owner_Name varchar(15) not null,Contact_No varchar(15) not null,Address varchar(15) not null,primary key(Name_ID,Owner_Name));";
       int f3=ob.update(sql4);
      if(f3==0){
          System.out.println("error in creating table Owner ");
      }
      else 
          System.out.println("Owner table created");
      String sql5="create table Script(Script_ID int not null auto_increment,Script_Name varchar(15) not null,Field_2a varchar(15),Field_2b varchar(15),primary key(Script_ID,Script_Name));";  
       int f4=ob.update(sql5);
      if(f4==0){
          System.out.println("error in creating table script");
      }
      else 
          System.out.println("Script table has been created");
      String sql6="create table Transaction(Transaction_ID int auto_increment,Owner_Name varchar(15) not null,Script_Name varchar(15) not null,Bought_sold varchar(15) not null,Quantity decimal(9,3) not null,Rate decimal(9,2) not null,Brokerage decimal(9,2) not null,Expenses decimal(9,2) not null,field_3a varchar(15),field_3b varchar(15),primary key(Transaction_ID));";
       int f5=ob.update(sql6);
      if(f5==0){
          System.out.println("error in creating Transaction table ");
      }
      else 
          System.out.println("Transaction table has been created");
    
   }catch(Exception e){
      //Handle errors for JDBC
      System.err.println("Database creation failed...");
   }
   }
}
