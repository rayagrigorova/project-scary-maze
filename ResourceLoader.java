package resources;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.InputStream;

public class ResourceLoader  {
	static ResourceLoader rl = new ResourceLoader();
	
	public static Image loadImage(String imageName) {
		return Toolkit.getDefaultToolkit().getImage(rl.getClass().getResource("images/" + imageName));
	}
	
	public static InputStream loadFileAsInputStream(String fileName) {
		return rl.getClass().getResourceAsStream("configs/" + fileName);
	}
}
