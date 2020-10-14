package week4;

import acm.graphics.*;
import acm.program.*;

public class ImageProcessing extends GraphicsProgram {

	public static final int APPLICATION_WIDTH = 800;
	public static final int APPLICATION_HEIGHT = 800;
	
			public void run() {
				
				GImage image = new GImage("Dali.jpeg");
				GImage flippedImage =  flipImage(image);
				
				image.scale(1.0);
				add(image, 10, 10);
			}
			
			private GImage flipImage(GImage image) {
				int[][] array = image.getPixelArray();
				
				int height = array.length;
				int width = array[0].length;
				
				
				
				return null;
			}
}
