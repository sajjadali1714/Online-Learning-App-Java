/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBConnection;

import java.sql.PreparedStatement;

public class DeleteData extends UpdateData{
    public void DeleteRecord(String Statement) {
        try {
            AccessConnectivity con = new AccessConnectivity();
            con.getConnection();
            // Using SQL DELETE query to delete data from the table
            PreparedStatement preparedStatement = con.connection.prepareStatement(Statement);
            preparedStatement.executeUpdate();
            System.out.println("Data deleted Successfully");
            con.connection.close();
        } catch (Exception e) {
            System.out.println("Error in connection");

        }
    }
}