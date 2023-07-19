/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import main.GlobalVariable;

public class GetData {
    public boolean getData(String Statement ) {
        boolean v_return = false;
        try {
            AccessConnectivity con = new AccessConnectivity();
            con.getConnection();
            // Using SQL SELECT Query
            PreparedStatement preparedStatement = con.connection.prepareStatement(Statement);
            // Creaing Java ResultSet object
            ResultSet resultSet = preparedStatement.executeQuery();
            GlobalVariable.setResultSet(resultSet);
            v_return = true;            
            con.connection.close();
            
        } catch (Exception e) {
            System.out.println("Error in GetData" + e.getMessage());

        }
        return v_return;

    }

}
