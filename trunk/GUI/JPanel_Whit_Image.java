package GUI;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class JPanel_Whit_Image extends JPanel {
 
    private Image image;
 
    public JPanel_Whit_Image(){
    	
    }
 
    public JPanel_Whit_Image(String nameImage) {
        if (nameImage != null) {
            image = new ImageIcon(getClass().getResource(nameImage)).getImage();
        }
    }
    
    public JPanel_Whit_Image(Image initialImage) {
        if (initialImage != null) {
            image = initialImage;
        }
    }
    
    public void setImage(String nameImage) {
        if (nameImage != null) {
            image = new ImageIcon(getClass().getResource(nameImage)).getImage();
        } else {
            image = null;
        }

        repaint();
    }

    public void setImage(Image newImage) {
        image = newImage;

        repaint();
    }

    @Override
    public void paint(Graphics g) {
        if (image != null) {
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);
        } else {
            setOpaque(true);
        }

        super.paint(g);
    }
 
    //...
}