import java.sql.PreparedStatement;

public class UpdateData {

    public void UpdateRecord(String Statement) {
        try {
            AccessConnectivity con = new AccessConnectivity();
            con.getConnection();
            // Using SQL UPDATE query to update data in the table
            PreparedStatement preparedStatement = con.connection.prepareStatement(Statement);
            // preparedStatement.setString(2, "Mehtab");
            preparedStatement.executeUpdate();
            System.out.println("data updated successfully");

        } catch (Exception e) {
            System.out.println("Error in connection during update");

        }
    }
}
