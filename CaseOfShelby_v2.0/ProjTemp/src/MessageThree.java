public class MessageThree extends javax.swing.JFrame {

    public MessageThree() {
        initComponents();
        setSize(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        
        messageThree.add(buttonMessageThreeExit);
        
        buttonMessageThreeExit.setContentAreaFilled(false);
        buttonMessageThreeExit.setBorderPainted(false);
        buttonMessageThreeExit.setBounds(86, 97, 35, 42);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonMessageThreeExit = new javax.swing.JButton();
        messageThree = new javax.swing.JLabel();

        buttonMessageThreeExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMessageThreeExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMessageThreeExitActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        messageThree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Tablet Message 3.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(messageThree, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(messageThree)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMessageThreeExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMessageThreeExitActionPerformed
        Tablet tablet = new Tablet();
        
        this.setVisible(false);
        tablet.setVisible(true);
    }//GEN-LAST:event_buttonMessageThreeExitActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MessageThree().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonMessageThreeExit;
    private javax.swing.JLabel messageThree;
    // End of variables declaration//GEN-END:variables
}
