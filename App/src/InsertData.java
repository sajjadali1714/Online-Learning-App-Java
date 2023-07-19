import java.sql.PreparedStatement;

public class InsertData {
    public void InsertRecord(String Statement) {
        try {
            AccessConnectivity con = new AccessConnectivity();
            con.getConnection();
            // Using SQL Insert query to Insert data in the table            
            PreparedStatement preparedStatement = con.connection.prepareStatement(Statement);
            // Setting values for Each Parameter
            //preparedStatement.setStr(Statement);
            // Executing Query
            preparedStatement.executeUpdate();
            System.out.println("data inserted successfully");
        } catch (Exception e) {
            System.out.println("Error in connection during Insert");
        }
    }

}
