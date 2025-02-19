import javax.swing.*;

public class Tablet extends javax.swing.JFrame {

    public boolean eventTrigger = false;


    public Tablet() {
        initComponents();
        setSize(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);

        tabletMessagesBackground.add(buttonMessage1);
        tabletMessagesBackground.add(buttonMessage2);
        tabletMessagesBackground.add(buttonMessage3);
        tabletMessagesBackground.add(buttonMessagesExit);

        buttonMessagesExit.setContentAreaFilled(false);
        buttonMessagesExit.setBorderPainted(false);
        buttonMessagesExit.setBounds(86, 97, 33, 42);

        buttonMessage1.setContentAreaFilled(false);
        buttonMessage1.setBorderPainted(false);
        buttonMessage1.setBounds(232, 177, 445, 61);

        buttonMessage2.setContentAreaFilled(false);
        buttonMessage2.setBorderPainted(false);
        buttonMessage2.setBounds(232, 269, 445, 61);

        buttonMessage3.setContentAreaFilled(false);
        buttonMessage3.setBorderPainted(false);
        buttonMessage3.setBounds(232, 363, 445, 61);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonMessage1 = new javax.swing.JButton();
        buttonMessage2 = new javax.swing.JButton();
        buttonMessage3 = new javax.swing.JButton();
        buttonMessagesExit = new javax.swing.JButton();
        tabletMessagesBackground = new javax.swing.JLabel();

        buttonMessage1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMessage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMessage1ActionPerformed(evt);
            }
        });

        buttonMessage2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMessage2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMessage2ActionPerformed(evt);
            }
        });

        buttonMessage3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMessage3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMessage3ActionPerformed(evt);
            }
        });

        buttonMessagesExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMessagesExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMessagesExitActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        tabletMessagesBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Tablet Messages GUI_1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(tabletMessagesBackground)
                                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tabletMessagesBackground)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMessagesExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMessagesExitActionPerformed
        //ibutang diri ang code sa pag start sa countdown sa killer, himoang true ang triggerEvent
        MusicPlayer.stopMusic();

        MusicPlayer.playMusic("C:/Users/Rae Addison Duque/Documents/CaseOfShelbyVersions/CaseOfShelby_v2.0/ProjTemp/src//image/glassbreak.wav");
        MusicPlayer.setVolume((float) -20.0f);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        MusicPlayer.stopMusic();
        if(Login.acc.getIsTabletUnlocked()==true){
            BedRoom.setBg();
            Kitchen.setBtn();
        }

        JOptionPane.showMessageDialog(null,"Hide to the Bathroom before the killer catches you!","Warning",JOptionPane.WARNING_MESSAGE);


        MusicPlayer.playMusic("C:/Users/Rae Addison Duque/Documents/CaseOfShelbyVersions/CaseOfShelby_v2.0/ProjTemp/src/image/chase.wav");
        LoadingScr.tm.startEvent();
        dispose();
    }//GEN-LAST:event_buttonMessagesExitActionPerformed

    private void buttonMessage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMessage1ActionPerformed
        MessageOne msg1 = new MessageOne();
        msg1.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_buttonMessage1ActionPerformed

    private void buttonMessage2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMessage2ActionPerformed
        MessageTwo msg2 = new MessageTwo();
        msg2.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_buttonMessage2ActionPerformed

    private void buttonMessage3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMessage3ActionPerformed
        MessageThree msg3 = new MessageThree();
        msg3.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_buttonMessage3ActionPerformed

    public void updateEventTrigger(boolean updateTrigger){
        this.eventTrigger = updateTrigger;
    }

    //eventTrigger kay pag abli sa contents sa message 2

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonMessage1;
    private javax.swing.JButton buttonMessage2;
    private javax.swing.JButton buttonMessage3;
    private javax.swing.JButton buttonMessagesExit;
    private javax.swing.JLabel tabletMessagesBackground;
    // End of variables declaration//GEN-END:variables
}