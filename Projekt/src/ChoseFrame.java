import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ChoseFrame extends JFrame{
    static final int SLIDER_MAX = 1000;
    static final int SLIDER_INIT = 0;
    static final int SLIDER_MIN = 0;

    ImagePanel centerPanel;

    JSlider fuelBar;

    JButton engineLeftButton, engineRightButton, redButton, greenButton, blueButton;

    ChoseFrame()
    {
        super("Rocket Simulator 3000");
        this.setSize(800,600);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

        //LEFT PANEL
        fuelBar = new JSlider(JSlider.VERTICAL,SLIDER_MIN,SLIDER_MAX,SLIDER_INIT);
        fuelBar.setBounds(25,25,150,400);
        fuelBar.setBackground(null);
        engineLeftButton = new JButton("<--------");
        engineLeftButton.setBounds(25,450,150,100);
        this.add(fuelBar);
        this.add(engineLeftButton);


        //CENTRAL PANEL
        centerPanel = new ImagePanel(new ImageIcon("E:\\Moje Dokumenty\\Studia\\Programowanie Obiektowe\\Projekt\\img\\rocket.jpg").getImage(),400,400);
        centerPanel.setBounds(200,25,400,525);
        this.add(centerPanel);

        //RIGHT PANEL
        redButton = new JButton("Red");
        redButton.setBackground(Color.RED);
        redButton.setBounds(625,25,150,75);
        greenButton = new JButton("Green");
        greenButton.setBounds(625,125,150,75);
        greenButton.setBackground(Color.GREEN);
        blueButton = new JButton("Blue");
        blueButton.setBackground(Color.BLUE);
        blueButton.setBounds(625,225,150,75);
        engineRightButton = new JButton("-------->");
        engineRightButton.setBounds(625,450,150,100);
        this.add(redButton);
        this.add(greenButton);
        this.add(blueButton);
        this.add(engineRightButton);





    }

}
