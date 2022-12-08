/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 1-tbruderer
 */
public class DBconnection {
     private static final String DB_NAME = "TBruderer_test"; //the final keyword is a costant//
     private static final String CONNECTION_STRING = "jdbc:mysql://computing.gfmat.org:3306/" + DB_NAME + "?user=TBruderer&useSSL=false";

     private static final String TABLE_NAMES = "contacts";
     private static final String COLUMN_EMAIL = "email";
     private static final String COLUMN_PHONE = "phone";
     private static final String COLUMN_NAME = "name";
     
     
     
       public static void main(String[] args) {

/**        try ( Connection conn = DriverManager.getConnection(CONNECTION_STRING, "TBruderer", "6NvLdLh4Pw");  Statement statement = conn.createStatement();) {
*
*           {
*                System.out.println("error:" + e.getMessage());
 *           }
*
 *       } catch (SQLException e) {
  *          System.out.println("error" + e.getMessage());
   *     }
   * }
*
**/ 

       
       }}
