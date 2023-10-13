import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageDisplay extends JFrame {
	
	public static BufferedImage image;

	public static Panel imagePanel;
	public static Color[] pixelBuffer;
	public static int counter = 0;
	
	public ImageDisplay() {
		setTitle("Image Display");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		image = new BufferedImage(1000,1000, BufferedImage.TYPE_INT_RGB);
		pixelBuffer = new Color[image.getWidth()*image.getHeight()];
		 updateArray(pixelBuffer);


		   imagePanel = new Panel(image);
	        getContentPane().setLayout(new BorderLayout());
	        getContentPane().add(imagePanel, BorderLayout.CENTER);
	       
	        addComponentListener(new ComponentAdapter() {
	            @Override
	            public void componentResized(ComponentEvent e) {
	                updateImage();
	                imagePanel.repaint();
	            }
	        });
	        
//	        Timer timer = new Timer(0, new ActionListener() { //100millisecond
//	            @Override
//	            public void actionPerformed(ActionEvent e) {
//	                updateArray(pixelBuffer);
//	                updateImage();
//	                imagePanel.repaint();
//	            }
//	        });
	   
	       // timer.start();
	         //  pack();
	}
	
	private class updateClass implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			  updateArray(pixelBuffer);
              updateImage();
              imagePanel.repaint();
		}
		
	}
	
	public void update() {
		
	}
	
	 public void updateImage() {
	        for (int i = 0; i < image.getHeight(); i++) {
	            for (int j = 0; j < image.getWidth(); j++) {
	                image.setRGB(j, i, pixelBuffer[j + i * image.getWidth()].getRGB());
	            }
	        }
	    }
	 public static void updateArray(Color[] colors) {
		  System.out.println("every frame");
		   float x = (float) Math.sin(System.currentTimeMillis()/100);
		   int firstARg = (int) ((x+1)/2*77);
		   int sec = (int) ((x+1)/2*114);
		   int thi = (int) ((x+1)/2*45);
		    	for(int i=0; i<colors.length; i++) {
		    		colors[i] = new Color(firstARg,sec,thi);
		    	}
	    }
}
