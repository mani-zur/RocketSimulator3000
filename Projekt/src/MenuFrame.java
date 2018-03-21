import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class MenuFrame extends JFrame{
    JButton playButton, recordButton, creditsButton, exitButton;
    JLabel nameLabel;

    public MenuFrame ()
    {
        super("Rocket Simulator 3000");
        this.setSize(800,600);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);


        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

 
        
        ImageIcon imageIcon = new ImageIcon("E:\\Moje Dokumenty\\Studia\\Programowanie Obiektowe\\Projekt\\img\\eloelo.jpg"); // load the image to a imageIcon
		Image image = imageIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(this.getWidth(), this.getHeight(),java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		imageIcon = new ImageIcon(newimg);  // transform it back
		setContentPane(new JLabel(imageIcon));
        
		nameLabel = new JLabel("ROCKET SIMULATOR 3000");
		nameLabel.setBounds(165, 50, 500, 75);
		nameLabel.setFont(new Font("moje", Font.BOLD,36));
		nameLabel.setForeground(Color.WHITE);
        playButton = new JButton("Nowa gra");
        playButton.setBounds(285, 150, 200, 75);
        recordButton = new JButton("Ranking");
        recordButton.setBounds(285, 250, 200, 75);
        creditsButton = new JButton("Twórrcy");
        creditsButton.setBounds(285, 350, 200, 75);
        exitButton = new JButton("Zakończ");
        exitButton.setBounds(285, 450, 200, 75);
        this.add(nameLabel);
        this.add(playButton);
        this.add(recordButton);
        this.add(creditsButton);
        this.add(exitButton);


    }

}
