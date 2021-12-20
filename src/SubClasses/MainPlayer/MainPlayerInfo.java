package SubClasses.MainPlayer;

import javax.swing.*;
import java.awt.*;

public class MainPlayerInfo extends JFrame{

    ImageIcon Character1Pic = new ImageIcon("cowboy.png");
    JLabel Character1 = new JLabel();

    JLabel Character1AttributesName = new JLabel();
    JLabel Character1AttributesGender = new JLabel();
    JLabel Character1Attributes = new JLabel();
    JLabel Character1Attributes2 = new JLabel();

    JButton EXIT_BUTTON = new JButton("EXIT");
    JLayeredPane MainGamePanel;
    JPanel BACKGROUND_PANEL = new JPanel();

    static final int GAME_WIDTH = 700;
    static final int GAME_HEIGHT = 500;
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);

    public MainPlayerInfo(){
        MainGamePanel = new JLayeredPane();
        MainGamePanel.setPreferredSize(SCREEN_SIZE);

        this.setPreferredSize(SCREEN_SIZE);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Player Profile");
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);



        Character1.setVisible(true);
        Character1.setBorder(BorderFactory.createLineBorder(new Color(0,250,0)));
        Character1.setBounds(487,30,95,200);
        Character1.setFocusable(false);
        Character1.setIcon(Character1Pic);

        Character1AttributesName.setVisible(true);
        Character1AttributesName.setBounds(425,250,275,50);
        Character1AttributesName.setFocusable(false);
        Character1AttributesName.setForeground(new Color(0,250,0));
        Character1AttributesName.setFont(new Font("Arial", Font.ITALIC, 20));
        Character1AttributesName.setText("Name: Leo The Great");
        
        Character1AttributesGender.setVisible(true);
        Character1AttributesGender.setBounds(425,300,275,50);
        Character1AttributesGender.setFocusable(false);
        Character1AttributesGender.setForeground(new Color(0,250,0));
        Character1AttributesGender.setFont(new Font("Arial", Font.ITALIC, 20));
        Character1AttributesGender.setText("Gender: Male");

        Character1Attributes.setVisible(true);
        Character1Attributes.setBounds(425,350,275,50);
        Character1Attributes.setFocusable(false);
        Character1Attributes.setForeground(new Color(0,250,0));
        Character1Attributes.setFont(new Font("Arial", Font.ITALIC, 20));
        Character1Attributes.setText("Attributes: Handsome,");

        Character1Attributes2.setVisible(true);
        Character1Attributes2.setBounds(425,400,275,50);
        Character1Attributes2.setFocusable(false);
        Character1Attributes2.setForeground(new Color(0,250,0));
        Character1Attributes2.setFont(new Font("Arial", Font.ITALIC, 20));
        Character1Attributes2.setText("Hard Worker");


        BACKGROUND_PANEL.setOpaque(true);
        BACKGROUND_PANEL.setSize(SCREEN_SIZE);
        BACKGROUND_PANEL.setBackground(new Color(32,38,34));

        MainGamePanel.add(BACKGROUND_PANEL, Integer.valueOf(0));
        MainGamePanel.add(Character1, Integer.valueOf(1));
        MainGamePanel.add(Character1Attributes, Integer.valueOf(1));
        MainGamePanel.add(Character1AttributesName, Integer.valueOf(1));
        MainGamePanel.add(Character1AttributesGender, Integer.valueOf(1));
        MainGamePanel.add(Character1Attributes2, Integer.valueOf(1));

        this.add(MainGamePanel);
    }
}
