import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class GameTm extends javax.swing.JFrame {
    private int timeElapsed = 0;
    private int totalElapsedTime = 0;
    private Timer countUpTimer;
    private javax.swing.Timer countDownTimer;
    private int countdownDuration = 10;
    public  int remainingTime;
    static boolean isGameOver =false;
    static boolean gameOver =false;
    public int totalTime;
    public GameTm() {
        initComponents();

        // Initializing the count up timer, kato ni ato pang leaderboard na time
        countUpTimer = new javax.swing.Timer(1000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                timeElapsed++;
                updateTimerText();


            }
        });
        //This will automatically start the timer when the program runs
        countUpTimer.start();
        MusicPlayer.playP();

    }
/*
    public static void gameOver(JFrame a){
        GameOver g = new GameOver();
        if(gameOver)
                isGameOver=true;
        if(isGameOver){
            g.setVisible(true);
            a.setVisible(false);

        }
    }*/

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        labelTimer = new javax.swing.JLabel();
        textTimer = new javax.swing.JLabel();
        buttonStartEvent = new javax.swing.JButton();
        buttonStopEvent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTimer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTimer.setText("Time:");

        textTimer.setText("0");
        textTimer.setToolTipText("");

        buttonStartEvent.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonStartEvent.setText("Start Event");
        buttonStartEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStartEventActionPerformed(evt);
            }
        });

        buttonStopEvent.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonStopEvent.setText("Stop Event");
        buttonStopEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStopEventActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(140, 140, 140)
                                                .addComponent(labelTimer)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(textTimer))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(150, 150, 150)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(buttonStopEvent)
                                                        .addComponent(buttonStartEvent))))
                                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelTimer)
                                        .addComponent(textTimer))
                                .addGap(89, 89, 89)
                                .addComponent(buttonStartEvent)
                                .addGap(18, 18, 18)
                                .addComponent(buttonStopEvent)
                                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>
    public void reset() {
        gameOver=false;
        timeElapsed = 0;
        updateTimerText();
    }
    private void buttonStartEventActionPerformed(java.awt.event.ActionEvent evt) {
        startEvent();
    }

    private void buttonStopEventActionPerformed(java.awt.event.ActionEvent evt) {
        stopEvent();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameTm().setVisible(true);
            }
        });
    }
    private void updateTimerText(){
        textTimer.setText(String.valueOf(timeElapsed));
    }
    private void updateTimerText(int time){
        textTimer.setText(String.valueOf(time));
    }
    public void startEvent(){
        countUpTimer.stop();
        countDownTimer = new javax.swing.Timer(1000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                labelTimer.setText("Remaining Time: ");
                remainingTime--;
                if(remainingTime == 0){
                    labelTimer.setText("Sorry: ");
                    gameOver=true;
                    textTimer.setText("Game Over");
                    stopCountDownTimer();
                }
                else{
                    updateTimerText(remainingTime);
                }
            }
        });
        remainingTime = countdownDuration;
        countDownTimer.start();
    }
    public boolean getrTime(){
        if(gameOver) {
            gameOver=false;
            return true;
        }
            return false;
    }
    public void stopEvent(){
        stopCountDownTimer();
        totalTime = timeElapsed + countdownDuration - remainingTime;
        labelTimer.setText("Total Time Spent: ");
        updateTimerText(totalTime);
    }
    public int getTotal(){
        return totalTime;
    }
    private void stopCountDownTimer(){
        if(countDownTimer != null && countDownTimer.isRunning()){
            countDownTimer.stop();
            totalElapsedTime += timeElapsed;
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JButton buttonStartEvent;
    private javax.swing.JButton buttonStopEvent;
    private javax.swing.JLabel labelTimer;
    private javax.swing.JLabel textTimer;
    // End of variables declaration
}