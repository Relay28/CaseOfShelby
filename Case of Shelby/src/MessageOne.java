public class MessageOne extends javax.swing.JFrame {

    public MessageOne() {
        initComponents();
        setSize(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        
        messageOne.add(buttonMessageOneExit);
        
        buttonMessageOneExit.setContentAreaFilled(false);
        buttonMessageOneExit.setBorderPainted(false);
        buttonMessageOneExit.setBounds(86, 97, 35, 42);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonMessageOneExit = new javax.swing.JButton();
        messageOne = new javax.swing.JLabel();

        buttonMessageOneExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMessageOneExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMessageOneExitActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        messageOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Tablet Message 1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(messageOne)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(messageOne)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMessageOneExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMessageOneExitActionPerformed
        Tablet tablet = new Tablet();
        
        this.setVisible(false);
        tablet.setVisible(true);
    }//GEN-LAST:event_buttonMessageOneExitActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MessageOne().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonMessageOneExit;
    private javax.swing.JLabel messageOne;
    // End of variables declaration//GEN-END:variables
}
