import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageDisplay extends JFrame {

    private BufferedImage image;
    private JPanel imagePanel;
    private String fileName = null;
    public ImageDisplay() {
        try {
            // Load the image from a file
        	fileName = "ct.jpeg";
            image = ImageIO.read(new File(fileName)); // Replace with your image file path
        } catch (IOException e) {
            e.printStackTrace();
        }

        setTitle("Image Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the image panel and set its layout to center the image
        imagePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int panelWidth = getWidth();
                int panelHeight = getHeight();
                int imageWidth = image.getWidth();
                int imageHeight = image.getHeight();

                // Calculate the position to center the image
                int x = (panelWidth - imageWidth) / 2;
                int y = (panelHeight - imageHeight) / 2;

                g.drawImage(image, x, y, imageWidth, imageHeight, this);
            }
        };
        
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(imagePanel, BorderLayout.CENTER);

        // Add a ComponentListener to repaint the image panel when the window is resized
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                imagePanel.repaint();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ImageDisplay imageDisplay = new ImageDisplay();
            imageDisplay.setSize(800, 600); // Initial size of the window
            imageDisplay.setVisible(true);
        });
    }
}