/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package login;

import DBConnection.DBOperations;
import java.awt.Color;
import java.sql.ResultSet;
import main.GlobalVariable;
import main.MsgBox;
import swing.EventLogin;

public class Login extends javax.swing.JPanel {

  private static EventLogin event;
    public Login() {
        initComponents();
        setBackground(new Color(244,244,244,70));
    }
    
    public void setEventLogin(EventLogin event){
        this.event = event;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();

        setBackground(new java.awt.Color(244, 244, 244));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("USER NAME");

        txtUserName.setBackground(new java.awt.Color(244, 244, 244));
        txtUserName.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(56, 56, 56));
        txtUserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUserName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 56, 56), 1, true));
        txtUserName.setCaretColor(new java.awt.Color(56, 56, 56));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PASSWORD");

        txtPassword.setBackground(new java.awt.Color(244, 244, 244));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(56, 56, 56));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 56, 56), 1, true));
        txtPassword.setCaretColor(new java.awt.Color(56, 56, 56));

        btnLogin.setBackground(new java.awt.Color(51, 153, 255));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(242, 242, 242));
        btnLogin.setText("LOGIN");
        btnLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(txtUserName)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try {
            if(txtUserName.getText().length() > 4 && txtPassword.getPassword().length > 4){
               if (userLogin(txtUserName.getText(), 
                       String.valueOf(txtPassword.getPassword())) == true){
                        if(fillUserGlobalVariable() == true){
                            event.loginDone();
                        } else {
                            MsgBox.showMsg("Invalid User ID and Passowrd..");
                        }                   
               } else {
                   MsgBox.showMsg("Invalid User ID and Passowrd..");
               }
            } else { 
                MsgBox.showMsg("Invalid User ID and Passowrd..");
            }
        } catch (Exception e) {
            MsgBox.showMsg(e.getMessage());
        }
    }//GEN-LAST:event_btnLoginActionPerformed
    
    public boolean userLogin(String user_name, String pwd) {
        boolean v_return = false;
        try {
            String sql = "";
            sql = "select * from tbl_user "
                    + " where user_name = '" + user_name + "'"
                    + " and pwd = '" + pwd + "'";
            DBOperations dbOperations = new DBOperations();
            v_return = dbOperations.getData(sql);
        } catch (Exception e) {
            System.out.println("Error in Register User " + e.getMessage());
        }
        return v_return;
    }
    
    private boolean fillUserGlobalVariable(){
        ResultSet resultSet = null;
        boolean v_return = false;
        try {
            resultSet = GlobalVariable.getResultSet();
            while (resultSet.next()){
                GlobalVariable.setUserID(Integer.parseInt(resultSet.getString("id")));                 
                GlobalVariable.setUserName(resultSet.getString("user_name"));
                GlobalVariable.setUserFullName(resultSet.getString("fullName"));
                GlobalVariable.setAdminUser(resultSet.getString("admin_user"));
                v_return = true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
      return v_return;
    }
    public static void LoginFromRegisterForm(){
        try {
            event.loginDone();
        } catch (Exception e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
