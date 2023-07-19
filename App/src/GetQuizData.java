import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetQuizData {
    public void getData(String Statement) {
        try {
            AccessConnectivity con = new AccessConnectivity();
            con.getConnection();
            // Using SQL SELECT Query
            PreparedStatement preparedStatement = con.connection.prepareStatement(Statement);
            // Creaing Java ResultSet object
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("ID");
                String question = resultSet.getString("question");
                String Option1 = resultSet.getString("Option_1");
                String Option2 = resultSet.getString("Option_2");
                String Option3 = resultSet.getString("Option_3");
                String Option4 = resultSet.getString("Option_4");
                String Answare = resultSet.getString("answare");
                // Printing Results
                System.out.println(question + "\n");
                System.out.println("1 : " + Option1);
                System.out.println("2 : " + Option2);
                System.out.println("3 : " + Option3);
                System.out.println("4 : " + Option4);
                System.out.println("Correct Answare : " + Answare + "\n");
            }

        } catch (Exception e) {
            System.out.println("Error in connection");

        }

    }

}
