import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class MusicPlayer {
    private static Clip clip;
    public static void playMusic(String musicFilePath) {
        try {
            File audioFile = new File(musicFilePath);
            if (!audioFile.exists()) {
                throw new IOException("Audio file not found: " + musicFilePath);
            }

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void setVolume(float volume) {
        if (clip != null) {
            try {
               ///  from -80.0 (mute) -- 6.0206 (maximum volume)
                FloatControl control = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);


                control.setValue(volume);
            } catch (IllegalArgumentException ex) {
                ex.printStackTrace();
            }
        }

    }

    public static  void playLoad(){

        stopMusic();
        playMusic("C:/Users/Rae Addison Duque/Documents/CaseOfShelbyVersions/CaseOfShelby_v2.0/ProjTemp/src/image/play.wav");
        setVolume(-15.0f);

    }
    public static void stopMusic() {
        if (clip != null) {
            clip.stop();
            clip.close();
        }
    }
    public static void playP() {
       stopMusic();
       playMusic("C:/Users/Rae Addison Duque/Documents/CaseOfShelbyVersions/CaseOfShelby_v2.0/ProjTemp/src/image/gem.wav");
        setVolume(-7.0f);


    }
    public static void playMain() {
        stopMusic();
        playMusic("C:/Users/Rae Addison Duque/Documents/CaseOfShelbyVersions/CaseOfShelby_v2.0/ProjTemp/src/image/mainM.wav");
        setVolume(5.0f);


    }

    public static void playDie(){
        stopMusic();
        playMusic("C:/Users/Rae Addison Duque/Documents/CaseOfShelbyVersions/CaseOfShelby_v2.0/ProjTemp/src/image/die.wav");
        setVolume(5.0f);
    }

}
