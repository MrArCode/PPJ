package LOTR;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class Music {

    public static void main(String[] args) {
        playMusic("C:\\Users\\czuro\\IdeaProjects\\Nowe\\src\\LOTR\\SongofDurin.wav"); // Podaj ścieżkę do swojego pliku dźwiękowego
    }

    public static void playMusic(String filePath) {
        try {

            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());


            Clip clip = AudioSystem.getClip();


            clip.open(audioInputStream);


            clip.start();


            Thread.sleep(clip.getMicrosecondLength() / 1000);

            clip.close();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
