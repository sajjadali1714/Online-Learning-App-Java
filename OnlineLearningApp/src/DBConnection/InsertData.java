/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBConnection;


import java.sql.PreparedStatement;
import org.hsqldb.Statement;
import org.hsqldb.result.ResultConstants;
import java.sql.*;
import main.GlobalVariable;

public class InsertData extends GetData {
    boolean v_return = false;
    public boolean InsertRecord(String Sql) {
        try {
            AccessConnectivity con = new AccessConnectivity();
            con.getConnection();
            // Using SQL Insert query to Insert data in the table            
//            PreparedStatement preparedStatement = con.connection.prepareStatement(Statement);
            PreparedStatement preparedStatement = con.connection.prepareStatement(Sql,ResultConstants.RETURN_GENERATED_KEYS);
            // Executing Query
            preparedStatement.executeUpdate();            
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            generatedKeys.next();
            GlobalVariable.setUserID(generatedKeys.getInt(1));
            v_return = true;
            con.connection.close();
        } catch (Exception e) {
            System.out.println("Error in connection during Insert \n" + e.getMessage());
        } 
        return v_return;
    }
}

