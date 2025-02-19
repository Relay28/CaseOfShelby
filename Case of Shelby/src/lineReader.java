import javafx.embed.swing.JFXPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class lineReader {
    private static Timer timer;
    public static void dialouge(String[] lines, JTextArea storybox) {
        new Thread(() -> {
            SwingUtilities.invokeLater(() -> {
                storybox.setVisible(true);
            });
            for (String line : lines) {
                try {
                    String dia = "";
                    for (int i = 0; i < line.length(); i++) {
                        dia += line.charAt(i);
                        Thread.sleep(48); //70 for presentation
                        final String displayText = dia;
                        SwingUtilities.invokeLater(() -> {
                            storybox.setText(displayText);
                        });
                        Thread.sleep(5);
                    }
                    Thread.sleep(1000); // Delay between dialogues
                } catch (InterruptedException e) {
                    // throw new RuntimeException(e);
                }
            }
            SwingUtilities.invokeLater(() -> {


                // storybox.setBackground(new Color(0, 0, 0, 0));
                //  storybox.setVisible(false);

            });
        }).start();
    }

    public static void loading(JFrame a, JFrame b, int time) {
        new Thread(() -> {
            try {
                Thread.sleep(time);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            b.setVisible(true);
            LoadingScr.tm.reset();
           // tm.setVisible(true);
            a.dispose();

        }).start();
    }

    public static void loading(JLabel a, String img2, int time) {

        new Thread(() -> {
            try {
                Thread.sleep(time);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }


            a.setIcon(new javax.swing.ImageIcon(lineReader.class.getResource(img2)));


        }).start();
    }

    public static void loading(ImageIcon a, String img2, int time) {
        new Thread(() -> {
            try {
                Thread.sleep(time); // Sleep for the specified time
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            // Load the image icon after the delay
            a.setImage(new ImageIcon(lineReader.class.getResource("/image/loadingg.gif")).getImage());

        }).start();
    }
    public static void gameOver(JFrame a){

        timer = new Timer(5, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (LoadingScr.tm.getrTime()) {
                    //lblbg.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(BedRoom.class.getResource("/image/died.png"))));
                    //MainMenu m = new MainMenu();


                    timer.stop();
                    a.dispose();
                    GameOver g = new GameOver();
                    g.setVisible(true);
                }
            }
        });
        timer.start();


    }

}
