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
     private static final String CONNECTION_STRING = "jdbc:mysql://computing.gfmat.org:3306/" + DB_NAME + "?user=TBruderer&useSSL=true";

     private static final String TABLE_SONGS = "SONGS";
     private static final String COLUMN_SONGNAME = "SONGNAME";
     private static final String COLUMN_SONGID = "SONG_ID";
     
     private static final String TABLE_ARTISTS = "ARTIST";
     private static final String COLUMN_ARTIST_NAME = "ARTIST_NAME";
     private static final String COLUMN_ARTIST_ID = "ARTIST_ID";
     
     private static final String TABLE_joinid = "jointable";
     private static final String COLUMN_joinid = "joinid";
     private static final String COLUMN_SONG_ID = "SONG_ID";
     
     
     private static final String TABLE_genre = "genre";
     private static final String COLUMN_genre_name = "genre_name";
     private static final String COLUMN_genreID = "genreID";
     
     private static final String TABLE_LABEL = "LABEL";
     private static final String COLUMN_LABELID = "LABELID";
     private static final String COLUMN_LABELNAME = "LABELNAME";
     
     private static final String TABLE_DEALS = "DEALS";
     private static final String COLUMN_DEALID = "DEALID";
     private static final String COLUMN_PERCENTAGE = "DEALPERCENTAGE";
     private static final String COLUMN_DEALTYPE = "DEALTYPE";
     
     private static final String TABLE_STAFF = "STAFF";
     private static final String COLUMN_staff_ID = "staff_ID";
     private static final String COLUMN_staffNAME = "staffNAME";
     private static final String COLUMN_phoneno = "phoneno";
     private static final String COLUMN_staffdob = "staffdob";
     private static final String COLUMN_staffnin = "staffnin";
     
     private static final String TABLE_DEALLINK = "DEALLINK";
     private static final String COLUMN_DEALLINKID = "DEALLINKID";
     
     private static final String TABLE_ALBUMS = "ALBUMS";
     private static final String COLUMN_STOCK = "STOCK";
     private static final String COLUMN_LOWSTOCK = "LOWSTOCK";
     private static final String COLUMN_RELEASEDATE = "RELEASEDATE";
     private static final String COLUMN_BESTSELLER = "BESTSELLER";
     private static final String COLUMN_PRICE = "PRICE";
     private static final String COLUMN_ALBNAME = "ALBNAME";
     private static final String COLUMN_ALBUMID = "ALBUMID";
     
     
     
       public static void main(String[] args) {
            try (   Connection conn = DriverManager.getConnection(CONNECTION_STRING, "TBruderer", "6NvLdLh4Pw");  
                Statement statement = conn.createStatement();) {
 try ( ResultSet results = statement.executeQuery("UPDATE STOCK FROM " + TABLE_ALBUMS + " WHERE " + COLUMN_ALBUMID + "" = SearchValue);) 
                {
                    while (results.next()) {
                        System.out.println(results.getString(COLUMN_ALBNAME) + " "
                                + results.getInt(COLUMN_LOWSTOCK) + " "
                                + results.getString(COLUMN_PRICE));
                    }
                }
                catch (SQLException e) 
                            
                                 {
            System.out.println("error:" + e.getMessage());
                            }

                        }
            catch(SQLException e){
            System.out.println("error" + e.getMessage());
        }
            }

        }


       
       
