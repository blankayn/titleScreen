package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Stairs extends SuperObject{
	public OBJ_Stairs() {
		name = "Stairs";
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/res/objects/stairs.png"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
