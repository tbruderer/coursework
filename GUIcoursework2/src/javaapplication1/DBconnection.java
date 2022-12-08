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
     private static final String DB_NAME = "1-TBruderer"; //the final keyword is a costant//
     private static final String CONNECTION_STRING = "jdbc:mysql://172.16.0.28:3306/" + DB_NAME + "?user=1-TBruderer&useSSL=false";

     private static final String TABLE_CONTACTS = "contacts";
     private static final String COLUMN_EMAIL = "email";
     private static final String COLUMN_PHONE = "phone";
     private static final String COLUMN_NAME = "name";
}
