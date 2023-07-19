import java.sql.PreparedStatement;

public class DeleteData {
    public void DeleteRecord(String Statement) {
        try {
            AccessConnectivity con = new AccessConnectivity();
            con.getConnection();
            // Using SQL DELETE query to delete data from the table
            PreparedStatement preparedStatement = con.connection.prepareStatement(Statement);
            preparedStatement.executeUpdate();
            System.out.println("Data deleted Successfully");

        } catch (Exception e) {
            System.out.println("Error in connection");

        }
    }
}
