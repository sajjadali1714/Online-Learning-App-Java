/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import DBConnection.DBOperations;
import Dashboard.Dashboard;
import static java.awt.Frame.MAXIMIZED_BOTH;
import swing.EventLogin;



public class Main extends javax.swing.JFrame {
    private Dashboard dashboard;
    public Main() {
        initComponents();
        dashboard = new Dashboard();
        EventLogin event = new EventLogin() {
            @Override
            public void loginDone() {
                main.removeAll();
                main.add(dashboard);
                main.revalidate();
                main.repaint();   
            }

            @Override
            public void logOut() {
                
            }
        };
        loginAndRegistor1.setEventLogin(event);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        loginAndRegistor1 = new login.LoginAndRegistor();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setLayout(new java.awt.BorderLayout());
        main.add(loginAndRegistor1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private login.LoginAndRegistor loginAndRegistor1;
    private javax.swing.JPanel main;
    // End of variables declaration//GEN-END:variables
}
