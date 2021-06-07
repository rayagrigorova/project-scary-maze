package main;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.sound.sampled.*;

public class LoadSound {
/**
 * Static file paths for each sound.
 */
InputStream is= LoadSound.class.getResourceAsStream("/resources/step.wav");

/**
 * Audio input stream for this sound.
 */
private AudioInputStream audioInputStream;

/**
 * Audio clip for this sound.
 */
private Clip clip;

/* -- Constructor -- */

/**
 * Creates a new sound at the specified file path.
 * 
 * @param   path    File path to sound file
 */
public LoadSound(String path) {
    // Get the audio from the file
    try {
        // Convert the file path string to a URL
        URL sound = getClass().getResource(path);
        System.out.println(sound);

        // Get audio input stream from the file
        audioInputStream = AudioSystem.getAudioInputStream(sound);

        // Get clip resource
        clip = AudioSystem.getClip();

        // Open clip from audio input stream
        clip.open(audioInputStream);
    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
        e.printStackTrace();
    }
}

/* -- Method -- */

/**
 * Play the sound.
 */
public void play() {
    // Stop clip if it's already running
    if (clip.isRunning())
        stop();

    // Rewind clip to beginning
    clip.setFramePosition(0);

    // Play clip
    clip.start();
}

/**
 * Stop the sound.
 */
public void stop() {
    clip.stop();
}
}
