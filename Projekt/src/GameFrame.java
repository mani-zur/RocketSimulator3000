import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class GameFrame extends JFrame{
	
	JProgressBar fuelbar;
	JLabel altlabel,fuellabel;
	
	
	public GameFrame() {
		super();
		this.setSize(800,600);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
	    this.setLayout(null);
	    this.setResizable(false);
	    
	    
        ImageIcon imageIcon = new ImageIcon("E:\\Moje Dokumenty\\Studia\\Programowanie Obiektowe\\Projekt\\img\\trawka.jpg");
		Image image = imageIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(this.getWidth(), this.getHeight(),java.awt.Image.SCALE_SMOOTH); 
		imageIcon = new ImageIcon(newimg);
		setContentPane(new JLabel(imageIcon));
	    
	    
	    fuelbar = new JProgressBar(JProgressBar.VERTICAL,0,100);
	    fuelbar.setValue(99);
	    fuelbar.setStringPainted(true);
	    fuelbar.setBounds(50,100,100,100);
	    fuelbar.setPreferredSize(new Dimension(300,300));
	    this.add(fuelbar);
	    
	    fuellabel= new JLabel("Fuel");
	    fuellabel.setFont(new Font("moje", Font.BOLD,18));
	    fuellabel.setBounds(80,120,200,200);
	    this.add(fuellabel);
	    
	    
	    altlabel = new JLabel("Altitude");
	    altlabel.setFont(new Font("moje", Font.BOLD,18));
	    altlabel.setBounds(700, 20, 72, 60);
	    altlabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	    this.add(altlabel);
	    
	    
	}
}
