import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class EndScene extends javax.swing.JFrame  {

    public EndScene() {
        initComponents();

        setTitle("Game Over");
        setPreferredSize(new java.awt.Dimension(950, 580));
        setResizable(false);
        setLocationRelativeTo(null);

        // Initialize JavaFX runtime
        initFX();

        JFXPanel videoPanel = new JFXPanel();
        getContentPane().add(videoPanel);
        videoPanel.setBounds(0, 0, 950, 580);

        playVideo(videoPanel, "src/image/end.mp4");

        MainMenu sz = new MainMenu();
        lineReader.loading(this,sz,32000);
        dispose();
    }


    // Initialize JavaFX runtime
    private void initFX() {
        new JFXPanel(); // Initializes the JavaFX runtime
        Platform.setImplicitExit(false); // Prevents JavaFX application from exiting when all stages are closed
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 580, Short.MAX_VALUE)
        );
        pack();
    }

    private void playVideo(JFXPanel videoPanel, String videoFile) {
        Media media = new Media(new File(videoFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);

        MediaView mediaView = new MediaView(mediaPlayer);
        Scene scene = new Scene(new Group(mediaView));
        videoPanel.setScene(scene);

        // Move the video panel to the back
        getContentPane().setComponentZOrder(videoPanel, 0);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EndScene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new EndScene().setVisible(true);
        });
    }
}
