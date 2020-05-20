package mayintarlasison;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class MuzikAc {

    Clip clip;
    boolean muzikAcikMi = true;

     public void playMusic(String musicLocation) {
        try {
            if (muzikAcikMi) {
                System.out.println("dd");
            } else {
                musicDurdur();
                System.out.println("erse");
            }
            muzikAcikMi = false;
            File musicPath = new File(musicLocation);
            if (musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                
                clip.start();
                //   clip.loop(Clip.LOOP_CONTINUOUSLY);

            } else {
                JOptionPane.showMessageDialog(null, "Müziği bulamadım :(");

            }

        } catch (Exception ex) {

            ex.printStackTrace();
        }

    }

    public void musicDurdur() {
        clip.stop();
    }
}
