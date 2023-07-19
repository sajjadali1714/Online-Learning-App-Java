import java.sql.Connection;
import java.sql.DriverManager;

public class AccessConnectivity {
    public Connection connection;

    public void getConnection() {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");// Loading Driver
            connection = DriverManager.getConnection("jdbc:ucanaccess://D:\\Project\\DiscreteStructures.accdb");// Establishing Connection
            System.out.println("Database Connected Successfully");
        } catch (Exception e) {
            System.out.println("Error in connection");
        }
    }

}
