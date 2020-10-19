package week4;

import acm.graphics.*;
import acm.program.*;

public class ImageProcessing extends GraphicsProgram {

			public void run() {
				
				GImage image = new GImage("Dali.jpeg");
				GImage flippedImage =  flipImage(image);
				
				
				add(image, 10, 10);
				add(flipImage(image), 600,10);
			}
			
			private GImage flipImage(GImage image) {
				int[][] array = image.getPixelArray();
				
				int width = array[0].length;
				int height = array.length;
			
				
				for(int i = 0; i < height; i ++) {
					for (int j = 0; j < width/2; j++) {
						int pxl = width - j - 1;
						int temp = array[i][j];
						 array[i][j] = array[i][pxl];
						 array[i][pxl] = temp;
					}
				}
				return new GImage(array);
			}
}
