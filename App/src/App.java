
public class App {
    
    public static void main(String[] args) throws Exception {
        String sql;
        System.out.println("Quiz App!");
        // --------- Get Table Date -----------------------------------------
         GetQuizData GetQuizData = new GetQuizData();
         sql = "select * from tbl_Question where id = 1";
         GetQuizData.getData(sql); 
        
        //--------- Creating Table -----------------------------------------
        // sql = "create table tbl_Question (id AUTOINCREMENT PRIMARY KEY, question text,option_1 text,option_2 text,option_3 text,option_4 text,answare text)";
        // create_Alter_Statement create_Alter_Statement = new create_Alter_Statement();
        // create_Alter_Statement.Statement(sql);

        // --------- Insert Data -----------------------------------------
        // sql = "insert into tbl_Question (question ,option_1,option_2,option_3,option_4,answare) " +
        //                               "values ('Which of the following is not a valid logical connective?','AND','OR','XOR','NOT','option_3')";
        // InsertData InsertData = new InsertData();
        // InsertData.InsertRecord(sql);

        // --------- Update Data -----------------------------------------
        //  sql = "update tbl_Question set  " +
        //                 "question = 'Which of the following is not a valid logical connective?'";
        //  UpdateData UpdateData = new UpdateData();
        //  UpdateData.UpdateRecord(sql);

          // --------- Delete Data -----------------------------------------
        //   sql = "delete from tbl_Question ";
        //   DeleteData DeleteData = new DeleteData();
        //   DeleteData.DeleteRecord(sql);
        
          

    }
}
