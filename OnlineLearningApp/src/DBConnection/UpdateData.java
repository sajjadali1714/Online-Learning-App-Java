/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBConnection;

/**
 *
 * @author sajjad.ali
 */

import java.sql.PreparedStatement;

public class UpdateData extends InsertData{

    public boolean UpdateRecord(String Statement) {
         boolean v_return = false;
        try {            
            AccessConnectivity con = new AccessConnectivity();
            con.getConnection();
            // Using SQL UPDATE query to update data in the table
            PreparedStatement preparedStatement = con.connection.prepareStatement(Statement);
            // preparedStatement.setString(2, "Mehtab");
            preparedStatement.executeUpdate();
            System.out.println("data updated successfully");
            con.connection.close();
            v_return = true;
        } catch (Exception e) {
            System.out.println("Error in connection during update");

        }
        return v_return;
    }
}

