

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BathRoom extends javax.swing.JFrame implements Scene{
    Connection con; //variable for databse connection
    Statement st; //variable for the sql

    /**
     * Creates new form BathRoom
     */


    public BathRoom() {
        initComponents();

        setPreferredSize(new java.awt.Dimension(950, 580));
        setResizable(false);
        setLocationRelativeTo(null);
        LoadingScr.tm.stopEvent();
        InsertScore();
        playScene();



    }
    public void InsertScore() {
        try {
            // Establish database connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acccos", "root", ""); // Database connection parameters

            // SQL query to update the score for the current user
            String sql1 = "UPDATE acc SET time='" + LoadingScr.tm.getTotal() + "' WHERE userName = '" + Login.acc.getUserName() + "' AND password = '" + Login.acc.getPassword() + "'";
            st = con.createStatement();

            // Execute the update query
            int rowsAffected = st.executeUpdate(sql1);
            if (rowsAffected > 0) {
                System.out.println("Score updated successfully!");
            } else {
                System.out.println("No rows updated. User not found or no change in score.");
            }

            // Close the Statement and Connection
            st.close();
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            // Handle any exceptions
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    public void playScene(){
        dispose();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        lblbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Bathroom.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(lblbg)
                                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(lblbg)
                                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BathRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BathRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BathRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BathRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BathRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel lblbg;
    // End of variables declaration
}
