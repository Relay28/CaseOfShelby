public class MessageTwo extends javax.swing.JFrame {

    public MessageTwo() {
        initComponents();
        setSize(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        
        messageTwo.add(buttonMessageTwoExit);
        
        buttonMessageTwoExit.setContentAreaFilled(false);
        buttonMessageTwoExit.setBorderPainted(false);
        buttonMessageTwoExit.setBounds(86, 97, 35, 42);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonMessageTwoExit = new javax.swing.JButton();
        messageTwo = new javax.swing.JLabel();

        buttonMessageTwoExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMessageTwoExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMessageTwoExitActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        messageTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Tablet Message 2.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(messageTwo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(messageTwo)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMessageTwoExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMessageTwoExitActionPerformed
        Tablet tablet = new Tablet();
        
        tablet.updateEventTrigger(true);
        
        this.setVisible(false);
        tablet.setVisible(true);
    }//GEN-LAST:event_buttonMessageTwoExitActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MessageTwo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonMessageTwoExit;
    private javax.swing.JLabel messageTwo;
    // End of variables declaration//GEN-END:variables
}
