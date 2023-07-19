/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sajjad.ali
 */
package DBConnection;
import java.sql.Statement;

public class create_Alter_Statement extends DeleteData{

    public void Statement(String Statement) {
        try {
            AccessConnectivity con = new AccessConnectivity();
            con.getConnection();
            Statement stmt = con.connection.createStatement();        
            stmt.execute(Statement); //create table quiz222w (id text, LastName text)
            System.out.println("Operation Completed");
con.connection.close();
        } catch (Exception e) {
            System.out.println("Error in connection creating or altring table");

        }

    } 
}