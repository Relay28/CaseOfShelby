import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
//import java.util.logging.Logger;

public class Login extends javax.swing.JFrame {
    Connection con; //variable for databse connection
    Statement st; //variable for the sql

    public ArrayList<Account> accounts = new ArrayList<>(); //arraylist for the table
    public static Account acc =null;
    static boolean isPlayed =false;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        //  fetch();
        setTitle("Login");
        setPreferredSize(new java.awt.Dimension(950, 580));
        setResizable(false);
        setLocationRelativeTo(null);

        lblbg.add(btnLogin);
        lblbg.add(txtPassword);
        lblbg.add(txtUsername);
        lblbg.add(btnRegister);

        txtUsername.setBounds(402, 235, 310, 55);
        txtUsername.setOpaque(false);
        txtUsername.setBorder(null);
        txtUsername.setBackground(new Color(0, 0, 0, 0));
        //btnLogin.setText("Login");
        txtPassword.setOpaque(false);
        txtPassword.setBorder(null);
        txtPassword.setBackground(new Color(0, 0, 0, 0));
        txtPassword.setBounds(400, 307, 310, 55);


        btnRegister.setOpaque(false);
        btnRegister.setContentAreaFilled(false);
        btnRegister.setBorderPainted(false);
        btnRegister.setBounds(550, 405, 160, 50);

        btnLogin.setOpaque(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setBorderPainted(false);
        btnLogin.setText("Login");
        btnLogin.setBounds(398, 405, 160, 50);
        MusicPlayer.playMain();
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        btnLogin = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        lblbg = new javax.swing.JLabel();

        btnLogin.setFont(new java.awt.Font("Tempus Sans ITC", 1, 28)); // NOI18N
        btnLogin.setBorderPainted(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtUsername.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N

        btnRegister.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register?");
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/log.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(lblbg)
                                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblbg)
        );

        pack();
    }// </editor-fold>

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {
        String us = txtUsername.getText().trim();
        String pas = txtPassword.getText().trim();
        login(us,pas);
    }

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {
        Register r = new Register();
        r.setVisible(true);
        setVisible(false);
    }



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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    private void login(String userName, String password) {
        try {
            // Establish database connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acccos", "root", ""); // Database connection parameters

            // SQL query to check if the user exists
            String sql = "SELECT * FROM acc WHERE userName = '" + userName + "' AND password = '" + password + "'";
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            // Check if the ResultSet has any rows
            if (rs.next()) {
                MainMenu m =new MainMenu();
                acc = new Account(userName,password,0);

                setVisible(false);
                m.setVisible(true);



            } else {
                // If no rows are returned, the user does not exist or the credentials are incorrect
                // Display an error message
                JOptionPane.showMessageDialog(this, "Invalid Username or Password!");
            }

            // Close the ResultSet, Statement, and Connection
            rs.close();
            st.close();
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            // Handle any exceptions
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // Variables declaration - do not modify
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel lblbg;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration
}
