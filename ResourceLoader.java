package resources;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
public class ResourceLoader {
 
    static ResourceLoader rl = new ResourceLoader();
     
    public static Image loadImage(String imageName)
    {
        return Toolkit.getDefaultToolkit().getImage(rl.getClass().getResource("images/"+imageName));
    }
    public static InputStream loadFileAsInputStream(String fileName){
    	return rl.getClass().getResourceAsStream("configs/" + fileName);
    }
    
    public static void PlaySound(String fileName) {
        try (InputStream in = loadFileAsInputStream(fileName)) {
            InputStream bufferedIn = new BufferedInputStream(in);
            try (AudioInputStream audioIn = AudioSystem.getAudioInputStream(bufferedIn)) {
                Clip clip = AudioSystem.getClip();
                clip.open(audioIn);
                clip.start();
            }
        } catch (Exception e) {
           e.printStackTrace();
       }
    }
}
