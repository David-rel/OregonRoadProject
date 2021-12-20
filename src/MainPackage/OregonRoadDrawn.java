package MainPackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.*;

public class OregonRoadDrawn extends JFrame implements ActionListener {

    JLayeredPane MainGamePanel;
    JButton START_BUTTON = new JButton("...START...");
    JLabel OREGON_NAME = new JLabel("OREGON TRAIL");
    JLabel ICON_LABEL = new JLabel();
    JPanel BLACK_OUT_PANEL = new JPanel();
    JPanel BACKGROUND_PANEL = new JPanel();
    JPanel START_BUTTON_PANEL = new JPanel();
    ImageIcon WAGON_ICON = new ImageIcon("Wagon.png");
    ImageIcon image = new ImageIcon("Wagon.png");

    static final int GAME_WIDTH = 1000;
    static final int GAME_HEIGHT = (int) (GAME_WIDTH * (0.5555));
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);

    OregonRoadDrawn(){
        MainGamePanel = new JLayeredPane();
        MainGamePanel.setPreferredSize(SCREEN_SIZE);

        this.setPreferredSize(SCREEN_SIZE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Oregon Road");
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
       // this.setIconImage(image.getImage());

        BACKGROUND_PANEL.setOpaque(true);
        BACKGROUND_PANEL.setSize(SCREEN_SIZE);
        BACKGROUND_PANEL.setBackground(Color.BLACK);

        START_BUTTON_PANEL.setOpaque(true);
        START_BUTTON_PANEL.setBounds(300,300,400,400);
        START_BUTTON_PANEL.setBackground(Color.BLACK);


        START_BUTTON.setVisible(true);
        START_BUTTON.setBounds(150,350,675,100);
        START_BUTTON.setBackground(new Color(0,250,0));
        START_BUTTON.setFocusable(false);
        START_BUTTON.setFont(new Font("Arial", Font.ITALIC, 75));
        START_BUTTON.addActionListener(this);

        OREGON_NAME.setVisible(true);
        OREGON_NAME.setBounds(150,0,700,200);
        OREGON_NAME.setForeground(new Color(0,250,0));
        OREGON_NAME.setFont(new Font("Arial", Font.ITALIC, 90));

        ICON_LABEL.setVisible(true);
        ICON_LABEL.setIcon(WAGON_ICON);
        ICON_LABEL.setBounds(400,165,195,127);

        BLACK_OUT_PANEL.setVisible(true);
        BLACK_OUT_PANEL.setBackground(new Color(0,0,0));
        BLACK_OUT_PANEL.setBounds(395,165,15,150);

        MainGamePanel.add(BACKGROUND_PANEL, Integer.valueOf(0));
        MainGamePanel.add(START_BUTTON, Integer.valueOf(1));
        MainGamePanel.add(OREGON_NAME, Integer.valueOf(1));
        MainGamePanel.add(ICON_LABEL, Integer.valueOf(1));
        MainGamePanel.add(BLACK_OUT_PANEL, Integer.valueOf(2));
        this.add(MainGamePanel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == START_BUTTON){
            boolean START = true;
            OregonRoadMain.DrawFirstPicture();
            this.dispose();
        }
    }
}
