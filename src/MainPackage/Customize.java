package MainPackage;

import MainPackage.OregonRoadMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Customize extends JFrame implements ActionListener {

    ImageIcon TOP_PIC = new ImageIcon("top_part_real.jpg");
    ImageIcon BOTTOM_PIC = new ImageIcon("bottom_part_real.jpg");
    ImageIcon image = new ImageIcon("Wagon.png");

    JLabel ICON_LABEL_TOP = new JLabel();
    JLabel ICON_LABEL_BOTTOM = new JLabel();
    JLabel CUSTOMIZE_LABEL = new JLabel("CUSTOMIZE...");
    JLabel SEASON_LABEL = new JLabel("Which Season Will You Start With...");
    JLabel FOOD_LABEL = new JLabel("How Much Food Will You Start With...");
    JLabel MONEY_LABEL = new JLabel("How Much Money Will You Start With...");

    JButton CONTINUE_BUTTON  = new JButton("CONTINUE...");


    String[] seasons = {"spring(normal)", "winter(hard)", "summer(normal)", "autumn(easy)"};
    String[] money = {"rich", "poor", "wealthy"};
    String[] food = {"normal", "to much", "not enough"};

    JComboBox SEASON_BOX = new JComboBox(seasons);
    JComboBox MONEY_BOX = new JComboBox(money);
    JComboBox FOOD_BOX = new JComboBox(food);

    JLayeredPane MainGamePanel;

    JPanel BACKGROUND_PANEL = new JPanel();

    static final int GAME_WIDTH = 1000;
    static final int GAME_HEIGHT = (int) (GAME_WIDTH * (0.5555));
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);

    Customize(){
        MainGamePanel = new JLayeredPane();
        MainGamePanel.setPreferredSize(SCREEN_SIZE);

        this.setPreferredSize(SCREEN_SIZE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("MainPackage.Customize");
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
       // this.setIconImage(image.getImage());

        BACKGROUND_PANEL.setOpaque(true);
        BACKGROUND_PANEL.setSize(SCREEN_SIZE);
        BACKGROUND_PANEL.setBackground(Color.BLACK);

        ICON_LABEL_TOP.setVisible(true);
        ICON_LABEL_TOP.setIcon(TOP_PIC);
        ICON_LABEL_TOP.setBounds(-200,-70,1500,300);

        SEASON_BOX.setBounds(700,150,150,50);
        SEASON_BOX.setBackground(new Color(0,250,0));
        SEASON_BOX.setForeground(new Color(0,0,0));

        MONEY_BOX.setBounds(700,250,150,50);
        MONEY_BOX.setBackground(new Color(0,250,0));
        MONEY_BOX.setForeground(new Color(0,0,0));

        FOOD_BOX.setBounds(700,350,150,50);
        FOOD_BOX.setBackground(new Color(0,250,0));
        FOOD_BOX.setForeground(new Color(0,0,0));

        ICON_LABEL_BOTTOM.setVisible(true);
        ICON_LABEL_BOTTOM.setIcon(BOTTOM_PIC);
        ICON_LABEL_BOTTOM.setBounds(-200,300,1500,300);

        CUSTOMIZE_LABEL.setVisible(true);
        CUSTOMIZE_LABEL.setBounds(75,-50,800,200);
        CUSTOMIZE_LABEL.setForeground(new Color(0,250,0));
        CUSTOMIZE_LABEL.setFont(new Font("Arial", Font.ITALIC, 35));

        SEASON_LABEL.setVisible(true);
        SEASON_LABEL.setBounds(75,75,800,200);
        SEASON_LABEL.setForeground(new Color(0,250,0));
        SEASON_LABEL.setFont(new Font("Arial", Font.ITALIC, 35));

        MONEY_LABEL.setVisible(true);
        MONEY_LABEL.setBounds(75,175,800,200);
        MONEY_LABEL.setForeground(new Color(0,250,0));
        MONEY_LABEL.setFont(new Font("Arial", Font.ITALIC, 35));

        FOOD_LABEL.setVisible(true);
        FOOD_LABEL.setBounds(75,225,500,300);
        FOOD_LABEL.setForeground(new Color(0,250,0));
        FOOD_LABEL.setFont(new Font("Arial", Font.ITALIC, 35));

        CONTINUE_BUTTON.setVisible(true);
        CONTINUE_BUTTON.setBounds(800,460,100,50);
        CONTINUE_BUTTON.setBackground(new Color(0,250,0));
        CONTINUE_BUTTON.setFocusable(false);
        CONTINUE_BUTTON.setFont(new Font("Arial", Font.BOLD, 10));
        CONTINUE_BUTTON.addActionListener(this);

        MainGamePanel.add(BACKGROUND_PANEL, Integer.valueOf(0));
        MainGamePanel.add(ICON_LABEL_BOTTOM, Integer.valueOf(1));
        MainGamePanel.add(ICON_LABEL_TOP, Integer.valueOf(1));
        MainGamePanel.add(CUSTOMIZE_LABEL, Integer.valueOf(2));
        MainGamePanel.add(FOOD_BOX, Integer.valueOf(1));
        MainGamePanel.add(MONEY_BOX, Integer.valueOf(1));
        MainGamePanel.add(SEASON_BOX, Integer.valueOf(1));
        MainGamePanel.add(SEASON_LABEL, Integer.valueOf(2));
        MainGamePanel.add(FOOD_LABEL, Integer.valueOf(2));
        MainGamePanel.add(MONEY_LABEL, Integer.valueOf(2));
        MainGamePanel.add(CONTINUE_BUTTON, Integer.valueOf(3));

        this.add(MainGamePanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == CONTINUE_BUTTON){
            Object Season_choice = SEASON_BOX.getSelectedItem();
            Object Food_choice = FOOD_BOX.getSelectedItem();
            Object Money_choice = MONEY_BOX.getSelectedItem();
            OregonRoadMain.JourneyStart(Season_choice, Food_choice, Money_choice);
            this.dispose();
        }
    }

}
