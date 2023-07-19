package TableDesign;

import CustomAndUpdates.ScrollBarCustom;     // importing my custom Scroll bar
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

public class TableDark extends JTable {
    public TableDark()
    {
       getTableHeader().setDefaultRenderer(new TableDarkHeader());
       getTableHeader().setPreferredSize(new Dimension(0,35));
       setDefaultRenderer(Object.class, new TableDarkCell());
       setRowHeight(30);
       
    }
  
    private class TableDarkHeader extends DefaultTableCellRenderer {
        
        @Override
        public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
            Component com = super.getTableCellRendererComponent(jtable,o,bln,bln1,i,i1);
            com.setBackground(new Color(30,30,30));
            com.setForeground(Color.white);
            com.setFont(com.getFont().deriveFont(Font.BOLD,14));
            com.setFont(com.getFont().deriveFont(Font.ITALIC,14));
            return com;
        }
    }
    private class TableDarkCell extends DefaultTableCellRenderer {
          @Override
          public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int row, int column) {
           Component com = super.getTableCellRendererComponent(jtable,o,bln,bln1,row,column);
           com.setForeground(Color.black);
           com.setFont(com.getFont().deriveFont(Font.PLAIN,14));
           setBorder(new EmptyBorder(0,5,0,5));
           return com;
    }
}
      //Removing ScrollBar and Row Color error
    public void fixTable(JScrollPane scroll) {
        scroll.setVerticalScrollBar (new ScrollBarCustom());
        JPanel panel = new JPanel();
        panel.setBackground(new Color(30,30,30));
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER,panel);
        scroll.getViewport().setBackground(new Color(30,30,30));
    }
}
