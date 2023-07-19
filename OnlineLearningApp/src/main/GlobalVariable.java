/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author sajjad.ali
 */
public class GlobalVariable {
    static int userID;
    static String userName;
    static String userFullName;
    static String adminUser;
    static ResultSet resultSet;
    
    public static void setUserID(int P_UserID){
        userID = P_UserID;
    }
    
    public static int getUserID(){
        return userID;
    }
    
    public static void setUserName(String P_userName){
        userName = P_userName;
    }
    
    public static String getUserName(){
        return userName;
    }
    
    public static void setUserFullName(String P_userFullName){
        userFullName = P_userFullName;
    }
    
    public static String getUserFullName(){
        return userFullName;
    }
    
    public static void setAdminUser(String P_adminUser){
        adminUser = P_adminUser;
    }
    
    public static String getAdminUser(){
        return adminUser;
    }
    
    public static void setResultSet(ResultSet P_ResultSet){
        resultSet = P_ResultSet;        
    }
    
    public static ResultSet getResultSet(){        
        return resultSet;
    }   
    
}
