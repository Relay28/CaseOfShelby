import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class
LivingRoom extends javax.swing.JFrame {

    /**
     * Creates new form LivingRoom
     */
    private static Timer timer;

    public LivingRoom() {

        initComponents();
        setTitle("Living Room");
        setPreferredSize(new java.awt.Dimension(950, 580));
        setResizable(false);
        setLocationRelativeTo(null);

        lblbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Living room.png")));
        lblbg.add(btnBook);
        lblbg.add(btnGoKitchen);
        lblbg.add(lblGoKitchen);
        lblbg.add(btnGoBedRoom);

        btnGoBedRoom.setOpaque(false);
        btnGoBedRoom.setContentAreaFilled(false);
        btnGoBedRoom.setBorderPainted(false);
        btnGoBedRoom.setBounds(870, 250, 70, 50);

        btnGoKitchen.setOpaque(false);
        btnGoKitchen.setContentAreaFilled(false);
        btnGoKitchen.setBorderPainted(false);
        btnGoKitchen.setBounds(10, 250, 70, 50);

        btnBook.setOpaque(false);
        btnBook.setContentAreaFilled(false);
        btnBook.setBorderPainted(false);
        btnBook.setBounds(360, 370, 100, 92);
        lineReader.gameOver(this);
/*
        timer = new Timer(5, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (LoadingScr.tm.getrTime()) {
                    //lblbg.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(BedRoom.class.getResource("/image/died.png"))));
                    //MainMenu m = new MainMenu();

                    dispose();
                    timer.stop();

                    GameOver g = new GameOver();
                    g.setVisible(true);
                }
            }
        });
        timer.start();*/



    }


    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        btnGoBedRoom = new javax.swing.JButton();
        lblGoKitchen = new javax.swing.JLabel();
        btnBook = new javax.swing.JButton();
        btnGoKitchen = new javax.swing.JButton();
        lblbg = new javax.swing.JLabel();

        btnGoBedRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/GoBed.png"))); // NOI18N
        btnGoBedRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGoBedRoom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnGoBedRoomFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnGoBedRoomFocusLost(evt);
            }
        });

        btnGoBedRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBedRoomActionPerformed(evt);
            }
        });
        btnGoBedRoom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnGoBedRoomKeyPressed(evt);
            }
        });

        lblGoKitchen.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        lblGoKitchen.setForeground(new java.awt.Color(255, 255, 255));
        lblGoKitchen.setText("Kitchen");

        btnBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bookbook.png"))); // NOI18N
        btnBook.setBorder(null);
        btnBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBook.setHideActionText(true);
        btnBook.setIconTextGap(0);
        btnBook.setInheritsPopupMenu(true);

        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });
        btnBook.getAccessibleContext().setAccessibleParent(lblbg);

        btnGoKitchen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/goKit.png"))); // NOI18N
        btnGoKitchen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGoKitchen.setMaximumSize(new java.awt.Dimension(70, 50));
        btnGoKitchen.setMinimumSize(new java.awt.Dimension(70, 50));
        btnGoKitchen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnGoKitchenFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnGoKitchenFocusLost(evt);
            }
        });

        btnGoKitchen.addMouseListener(new java.awt.event.MouseAdapter() {

        });
        btnGoKitchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoKitchenActionPerformed(evt);
            }
        });
        btnGoKitchen.getAccessibleContext().setAccessibleParent(lblbg);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Living room.png"))); // NOI18N
        lblbg.addContainerListener(new java.awt.event.ContainerAdapter() {

        });

        lblbg.add(btnBook);

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
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblbg)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>



    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {
        Page1 p = new Page1();
        p.setVisible(true);
    }

    private void btnGoKitchenActionPerformed(java.awt.event.ActionEvent evt) {

        Kitchen k = new Kitchen();
        dispose();
        k.setVisible(true);
    }

    private void btnGoBedRoomActionPerformed(java.awt.event.ActionEvent evt) {
        BedRoom b = new BedRoom();
        dispose();
        b.setVisible(true);
    }

    private void btnGoBedRoomKeyPressed(java.awt.event.KeyEvent evt) {

    }


    private void btnGoBedRoomFocusGained(java.awt.event.FocusEvent evt) {
        btnGoBedRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/goBedv2.png")));
    }

    private void btnGoKitchenFocusGained(java.awt.event.FocusEvent evt) {

        btnGoKitchen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/goKitv2.png")));
        // TODO add your handling code here:
    }
    private void btnGoKitchenFocusLost(java.awt.event.FocusEvent evt) {
        btnGoKitchen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/goKit.png")));
    }

    private void btnGoBedRoomFocusLost(java.awt.event.FocusEvent evt) {
        btnGoBedRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/goBed.png")));
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
            java.util.logging.Logger.getLogger(LivingRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LivingRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LivingRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LivingRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LivingRoom().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnGoBedRoom;
    private javax.swing.JButton btnGoKitchen;
    private javax.swing.JLabel lblGoKitchen;
    private javax.swing.JLabel lblbg;
    // End of variables declaration
}
