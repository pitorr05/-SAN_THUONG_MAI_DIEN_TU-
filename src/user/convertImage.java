
package user;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class convertImage {
    
    public convertImage(){};
    
    public ImageIcon convertImageFitToLabel (File f, JLabel label) {
            int labelWidth = label.getWidth();
            int labelHeight = label.getHeight();

            ImageIcon icon = new ImageIcon(f.getAbsolutePath());
            Image img = icon.getImage();
            int imgWidth = img.getWidth(null);
            int imgHeight = img.getHeight(null);

            double scale = Math.min((double) labelWidth / imgWidth, (double) labelHeight / imgHeight);
            int newWidth = (int) (imgWidth * scale);
            int newHeight = (int) (imgHeight * scale);

            Image scaled = img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
            return new ImageIcon(scaled);
    }
    
}
