import java.awt.Graphics;


import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class ImageTest extends JPanel{
private Image image;
    
    public ImageTest() {
        try {
            image = ImageIO.read(new File("123.PNG"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
    

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new ImageTest());
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

}