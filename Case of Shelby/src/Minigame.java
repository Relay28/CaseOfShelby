import javax.swing.BorderFactory;

public class Minigame extends javax.swing.JFrame {
    
    private String firstPassword = "";
    private String secondPassword = "";
    private String thirdPassword = "";
    private String correctFirstPassword = "-- .- -.--";
    private String correctSecondPassword = ".---- ....- --..--";
    private String correctThirdPassword = ".---- ----. ----. .....";

    public Minigame() {
        initComponents();
        setSize(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        
        tabletBackground.add(buttonExitTablet);
        tabletBackground.add(buttonEnterPassword);
        tabletBackground.add(passwordOne);
        tabletBackground.add(passwordTwo);
        tabletBackground.add(passwordThree);
        
        buttonExitTablet.setContentAreaFilled(false);
        buttonExitTablet.setBorderPainted(false);
        buttonExitTablet.setBounds(85, 96, 34, 43);
        
        passwordOne.setOpaque(false);
        passwordOne.setBorder(BorderFactory.createEmptyBorder());
        passwordOne.setBounds(183, 207, 447, 49);
        
        passwordTwo.setOpaque(false);
        passwordTwo.setBorder(BorderFactory.createEmptyBorder());
        passwordTwo.setBounds(183, 282, 447, 49);
        
        passwordThree.setOpaque(false);
        passwordThree.setBorder(BorderFactory.createEmptyBorder());
        passwordThree.setBounds(183, 357, 447, 49);
        
        buttonEnterPassword.setContentAreaFilled(false);
        buttonEnterPassword.setBorderPainted(false);
        buttonEnterPassword.setBounds(333, 443, 131, 44);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordOne = new javax.swing.JTextField();
        passwordTwo = new javax.swing.JTextField();
        passwordThree = new javax.swing.JTextField();
        buttonEnterPassword = new javax.swing.JButton();
        buttonExitTablet = new javax.swing.JButton();
        tabletBackground = new javax.swing.JLabel();

        passwordOne.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N

        passwordTwo.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N

        passwordThree.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N

        buttonEnterPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonEnterPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEnterPasswordActionPerformed(evt);
            }
        });

        buttonExitTablet.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonExitTablet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitTabletActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(850, 480));
        setResizable(false);

        tabletBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Tablet Password GUI.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabletBackground)
                .addGap(0, 109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabletBackground)
                .addGap(593, 593, 593))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEnterPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEnterPasswordActionPerformed
        firstPassword = passwordOne.getText().trim();
        secondPassword = passwordTwo.getText().trim();
        thirdPassword = passwordThree.getText().trim();
        
        if(firstPassword.equals(correctFirstPassword) && secondPassword.equals(correctSecondPassword) && thirdPassword.equals(correctThirdPassword)){
            Tablet tablet = new Tablet();
            setVisible(false);
            tablet.setVisible(true);
            Login.acc.setIsTabletUnlocked();

        }
    }//GEN-LAST:event_buttonEnterPasswordActionPerformed

    private void buttonExitTabletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitTabletActionPerformed
        setVisible(false);
    }//GEN-LAST:event_buttonExitTabletActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Minigame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEnterPassword;
    private javax.swing.JButton buttonExitTablet;
    private javax.swing.JTextField passwordOne;
    private javax.swing.JTextField passwordThree;
    private javax.swing.JTextField passwordTwo;
    private javax.swing.JLabel tabletBackground;
    // End of variables declaration//GEN-END:variables
}
