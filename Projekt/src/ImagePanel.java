import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

class ImagePanel extends JPanel {

    private Image img, newimg;

    public ImagePanel(String img, int width, int height) {
        this(new ImageIcon(img).getImage(),width,height);

    }

    public ImagePanel(Image img, int width, int height) {


        //Image newimg = image.getScaledInstance(this.getWidth(), this.getHeight(),java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        //imageIcon = new ImageIcon(newimg);  // transform it back
        //setContentPane(new JLabel(imageIcon));
        Dimension size = new Dimension(width, height);
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);

        this.img = img;
        img = img.getScaledInstance(width, height,java.awt.Image.SCALE_SMOOTH);

        setLayout(null);
    }

    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }
}
