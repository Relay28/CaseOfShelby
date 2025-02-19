import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;

public class VideoPlayer {

    public static void playVideo(JFXPanel videoPanel, String videoFile) {


        videoPanel.setBounds(0, 0, 950, 580);
      //  String videoFile = "images/1.mp4"; // Replace with your video file path
        Media media = new Media(new File(videoFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);

        MediaView mediaView = new MediaView(mediaPlayer);
        videoPanel.setScene(new Scene(new Group(mediaView)));
    }
}
