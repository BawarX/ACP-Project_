import java.awt.Color;

import javax.swing.Timer;
public class main {

	public static void main(String[] args) {
		
//		ImageDisplay imageDisplay = new ImageDisplay();
//        imageDisplay.setSize(700, 700);
//        imageDisplay.setVisible(true);
	
		ImageDisplay img = new ImageDisplay();
		img.setSize(700,700);
		 img.setVisible(true);
		while(true) {
			img.updateImage();
			img.updateArray(img.pixelBuffer);
			img.imagePanel.repaint();
		}
		
	}

}
