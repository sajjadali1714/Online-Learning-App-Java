import java.sql.Statement;

public class create_Alter_Statement {

    public void Statement(String Statement) {
        try {
            AccessConnectivity con = new AccessConnectivity();
            con.getConnection();
            Statement stmt = con.connection.createStatement();        
            stmt.execute(Statement); //create table quiz222w (id text, LastName text)
            System.out.println("Operation Completed");

        } catch (Exception e) {
            System.out.println("Error in connection creating or altring table");

        }

    } 
}
