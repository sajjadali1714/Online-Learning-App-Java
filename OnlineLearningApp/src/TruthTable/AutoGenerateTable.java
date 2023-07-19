package TruthTable;


import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import main.MsgBox;

public class AutoGenerateTable {    
    public void auto_generated(int numOfVariables, JTable table, String lastColumn) {
        try {
            
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        
        if (numOfVariables == 1 || numOfVariables == 0) {
            model.setRowCount(0);
            model.setColumnCount(0);
            
        } else {
            // Clear the existing table
            model.setRowCount(0);
            model.setColumnCount(0);            

            
            // Generate column headers based on the number of variables
            char variableName = 'p';
            for (int i = 0; i < numOfVariables; i++) {
                model.addColumn(String.valueOf(variableName));
                variableName++;
            }
            
  
            // Generate truth table rows
            int numRows = (int) Math.pow(2, numOfVariables);
            for (int i = 0; i < numRows; i++) {
                String binary = Integer.toBinaryString(i);
                while (binary.length() < numOfVariables) {
                    binary = "0" + binary;
                }
                ArrayList<Object> row = new ArrayList<>();

                
                for (int j = 0; j < numOfVariables; j++) {
                    if (binary.charAt(j) == '0') {
                        row.add("True");
                    } else {
                        row.add("False");
                    }
                }               
               
                model.addRow(row.toArray());
            }
        }
    }  catch (Exception e) {
            MsgBox.showMsg(e.getMessage());
    }
  } 
    public void auto_generatedCondition(String Proposition_1,String Proposition_2,JTable table,String condition,int row,int column) {
        try {
            String PropositionValue = "";
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            if(condition == "Conjunction"){
                if(Proposition_1 == "True" && Proposition_2 == "True"){
                    PropositionValue = "True";
                } else {
                    PropositionValue = "False";
                }
            } else if(condition == "Disjunction") {
                if(Proposition_1 == "False" && Proposition_2 == "False"){
                    PropositionValue = "False";
                } else {
                    PropositionValue = "True";
                }
                
            }else if(condition == "Exclusive-OR") {
                if(Proposition_1 == "False" && Proposition_2 == "False"){
                    PropositionValue = "False";
                } else if(Proposition_1 == "True" && Proposition_2 == "True"){
                    PropositionValue = "False";
                }                
                else {
                    PropositionValue = "True";
                }
                
            }else if(condition == "Implication") {
                if(Proposition_1 == "True" && Proposition_2 == "False"){
                    PropositionValue = "False";
                } else {
                    PropositionValue = "True";
                }
                
            }else if(condition == "Bi-Implication") {
                if(Proposition_1 == "False" && Proposition_2 == "False"){
                    PropositionValue = "True";
                } else if(Proposition_1 == "True" && Proposition_2 == "True"){
                    PropositionValue = "True";
                }                
                else {
                    PropositionValue = "False";
                }
                
            } else {
                
            }
            // Value Row cloumn
            model.setValueAt(PropositionValue, row, column);
        } catch (Exception e) {
            MsgBox.showMsg(e.getMessage());
        }
    }
}
    
    
     