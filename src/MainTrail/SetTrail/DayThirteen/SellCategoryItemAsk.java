package MainTrail.SetTrail.DayThirteen;

import MainPackage.OregonRoadMain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SellCategoryItemAsk extends JFrame implements ActionListener {

    ImageIcon TOP_PIC = new ImageIcon("top_part_real.jpg");
    ImageIcon BOTTOM_PIC = new ImageIcon("bottom_part_real.jpg");
    //ImageIcon image=new ImageIcon("Wagon.png");
    JLabel ICON_LABEL_TOP = new JLabel();
    JLabel ICON_LABEL_BOTTOM = new JLabel();
    JButton ENTER_BUTTON = new JButton("ENTER...");
    JLayeredPane MainGamePanel;
    JPanel BACKGROUND_PANEL = new JPanel();

    JLabel CHOICE1 = new JLabel("1. Wagon Parts");
    JLabel CHOICE2 = new JLabel("2. Medicine");
    JLabel CHOICE3 = new JLabel("3. Food");
    JLabel CHOICE4 = new JLabel("4. Guns and Ammo");

    JLabel PROMPT = new JLabel();
    JLabel PROBLEM_BOX = new JLabel();
    JLabel DIRECTIONS = new JLabel();

    JTextField ANSWER = new JTextField();

    static final int GAME_WIDTH = 1000;
    static final int GAME_HEIGHT = (int) (GAME_WIDTH * (0.5555));
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);

    public SellCategoryItemAsk() {


        MainGamePanel = new JLayeredPane();
        MainGamePanel.setPreferredSize(SCREEN_SIZE);

        this.setPreferredSize(SCREEN_SIZE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Sell Shop Ask");
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
        ICON_LABEL_TOP.setBounds(-240, -70, 1500, 300);

        ICON_LABEL_BOTTOM.setVisible(true);
        ICON_LABEL_BOTTOM.setIcon(BOTTOM_PIC);
        ICON_LABEL_BOTTOM.setBounds(-240, 300, 1500, 300);

        ANSWER.setVisible(true);
        ANSWER.setBackground(new Color(250, 250, 250));
        ANSWER.setBounds(50, 460, 50, 50);
        ANSWER.setFont(new Font("ARIAL", Font.ITALIC, 35));

        DIRECTIONS.setVisible(true);
        DIRECTIONS.setForeground(new Color(0, 250, 0));
        DIRECTIONS.setBounds(150, 470, 800, 50);
        DIRECTIONS.setFont(new Font("ARIAL", Font.ITALIC, 30));
        DIRECTIONS.setText("click the enter continue when ready");

        ENTER_BUTTON.setVisible(true);
        ENTER_BUTTON.setBounds(850, 460, 100, 50);
        ENTER_BUTTON.setBackground(new Color(0, 250, 0));
        ENTER_BUTTON.setFocusable(false);
        ENTER_BUTTON.setFont(new Font("Arial", Font.BOLD, 10));
        ENTER_BUTTON.setText("CONTINUE...");
        ENTER_BUTTON.addActionListener(this);
//------------------------------------------------------------------------

        PROBLEM_BOX.setVisible(true);
        PROBLEM_BOX.setBorder(BorderFactory.createLineBorder(new Color(0, 250, 0)));
        PROBLEM_BOX.setForeground(new Color(250, 0, 0));
        PROBLEM_BOX.setBounds(10, 355, 975, 50);
        PROBLEM_BOX.setFont(new Font("Arial", Font.BOLD, 20));
        PROBLEM_BOX.setFocusable(false);

        PROMPT.setVisible(true);
        PROMPT.setBorder(BorderFactory.createLineBorder(new Color(0, 250, 0)));
        PROMPT.setBounds(10, 115, 975, 50);
        PROMPT.setForeground(new Color(0, 250, 0));
        PROMPT.setFont(new Font("Arial", Font.BOLD, 20));
        PROMPT.setFocusable(false);
        PROMPT.setText("What would you like to sell");
        PROMPT.setHorizontalAlignment(SwingConstants.CENTER);

        CHOICE1.setVisible(true);
        CHOICE1.setBounds(10, 200, 475, 50);
        CHOICE1.setBorder(BorderFactory.createLineBorder(new Color(250, 250, 250)));
        CHOICE1.setForeground(new Color(0, 250, 0));
        CHOICE1.setFont(new Font("Arial", Font.BOLD, 20));

        CHOICE2.setVisible(true);
        CHOICE2.setBounds(500, 200, 475, 50);
        CHOICE2.setBorder(BorderFactory.createLineBorder(new Color(250, 250, 250)));
        CHOICE2.setForeground(new Color(0, 250, 0));
        CHOICE2.setFont(new Font("Arial", Font.BOLD, 20));

        CHOICE3.setVisible(true);
        CHOICE3.setBounds(10, 275, 475, 50);
        CHOICE3.setBorder(BorderFactory.createLineBorder(new Color(250, 250, 250)));
        CHOICE3.setForeground(new Color(0, 250, 0));
        CHOICE3.setFont(new Font("Arial", Font.BOLD, 20));

        CHOICE4.setVisible(true);
        CHOICE4.setBounds(500, 275, 475, 50);
        CHOICE4.setBorder(BorderFactory.createLineBorder(new Color(250, 250, 250)));
        CHOICE4.setForeground(new Color(0, 250, 0));
        CHOICE4.setFont(new Font("Arial", Font.BOLD, 20));

        MainGamePanel.add(BACKGROUND_PANEL, Integer.valueOf(0));
        MainGamePanel.add(ICON_LABEL_BOTTOM, Integer.valueOf(1));
        MainGamePanel.add(ICON_LABEL_TOP, Integer.valueOf(1));
        MainGamePanel.add(ANSWER, Integer.valueOf(2));
        MainGamePanel.add(DIRECTIONS, Integer.valueOf(2));
        MainGamePanel.add(ENTER_BUTTON, Integer.valueOf(2));
        MainGamePanel.add(PROBLEM_BOX, Integer.valueOf(2));
        MainGamePanel.add(PROMPT, Integer.valueOf(2));
        MainGamePanel.add(CHOICE1, Integer.valueOf(2));
        MainGamePanel.add(CHOICE2, Integer.valueOf(2));
        MainGamePanel.add(CHOICE3, Integer.valueOf(2));
        MainGamePanel.add(CHOICE4, Integer.valueOf(2));

        this.add(MainGamePanel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int choice = 0;
        int NewDay = 1;

        if (e.getSource() == ENTER_BUTTON) {
            if (ANSWER.getText().equals("1")) {
                choice = 1;
                OregonRoadMain.CheckCategoryItemSellAsk(choice);
                this.dispose();
            } else if (ANSWER.getText().equals("2")) {
                choice = 2;
                OregonRoadMain.CheckCategoryItemSellAsk(choice);
                this.dispose();
            }
            if (ANSWER.getText().equals("3")) {
                choice = 3;
                OregonRoadMain.CheckCategoryItemSellAsk(choice);
                this.dispose();
            } else if (ANSWER.getText().equals("4")) {
                choice = 4;
                OregonRoadMain.CheckCategoryItemSellAsk(choice);
                this.dispose();
            }
            else {
                PROBLEM_BOX.setText("please only type 1, 2, or 4 in the answer box");
            }

        }
    }
}
