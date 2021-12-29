package MainTrail.SetTrail.DaySeventeen;

import MainPackage.OregonRoadMain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankClass2 extends JFrame implements ActionListener {

    ImageIcon TOP_PIC=new ImageIcon("top_part_real.jpg");
    ImageIcon BOTTOM_PIC=new ImageIcon("bottom_part_real.jpg");
    ImageIcon image=new ImageIcon("Wagon.png");
    JLabel ICON_LABEL_TOP=new JLabel();
    JLabel ICON_LABEL_BOTTOM=new JLabel();
    JButton ENTER_BUTTON=new JButton("ENTER...");
    JButton PLAYER_INFO_BUTTON=new JButton("PLAYER INFO");
    JButton MAP_BUTTON = new JButton("MAP");
    JLayeredPane MainGamePanel;
    JPanel BACKGROUND_PANEL=new JPanel();

    JLabel CHOICE1 = new JLabel("1. ");
    JLabel CHOICE2 = new JLabel("2. ");
    JLabel CHOICE3 = new JLabel("3. ");
    JLabel CHOICE4 = new JLabel("4. ");

    JButton WAGON_BUTTON = new JButton("WAGON");

    JLabel PROMPT = new JLabel();
    JLabel PROBLEM_BOX = new JLabel();
    JLabel DIRECTIONS = new JLabel();

    JTextField ANSWER = new JTextField();

    static final int GAME_WIDTH=1000;
    static final int GAME_HEIGHT=(int)(GAME_WIDTH*(0.5555));
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);

    static int MoneyOut = 0;
    static String info = "";


    public BankClass2(int choice, int Loans){


        MainGamePanel=new JLayeredPane();
        MainGamePanel.setPreferredSize(SCREEN_SIZE);

        this.setPreferredSize(SCREEN_SIZE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Bank2");
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
        ICON_LABEL_TOP.setBounds(-240,-70,1500,300);

        ICON_LABEL_BOTTOM.setVisible(true);
        ICON_LABEL_BOTTOM.setIcon(BOTTOM_PIC);
        ICON_LABEL_BOTTOM.setBounds(-240,300,1500,300);


        ANSWER.setVisible(true);
        ANSWER.setBackground(new Color(250,250,250));
        ANSWER.setBounds(30,460,50,50);
        ANSWER.setFont(new Font("ARIAL", Font.ITALIC, 35));
        ANSWER.addActionListener(this);

        DIRECTIONS.setVisible(true);
        DIRECTIONS.setForeground(new Color(0,250,0));
        DIRECTIONS.setBounds(100,470,800,50);
        DIRECTIONS.setFont(new Font("ARIAL", Font.ITALIC, 30));
        DIRECTIONS.setText("click the continue button to continue");

        ENTER_BUTTON.setVisible(true);
        ENTER_BUTTON.setBounds(870,460,100,50);
        ENTER_BUTTON.setBackground(new Color(0,250,0));
        ENTER_BUTTON.setFocusable(false);
        ENTER_BUTTON.setFont(new Font("Arial", Font.BOLD, 10));
        ENTER_BUTTON.setText("CONTINUE...");
        ENTER_BUTTON.addActionListener(this);

        WAGON_BUTTON.setVisible(true);
        WAGON_BUTTON.setBounds(675,460,75,50);
        WAGON_BUTTON.setBackground(new Color(0,250,0));
        WAGON_BUTTON.setFocusable(false);
        WAGON_BUTTON.setFont(new Font("Arial", Font.BOLD, 10));
        WAGON_BUTTON.addActionListener(this);

        PLAYER_INFO_BUTTON.setVisible(true);
        PLAYER_INFO_BUTTON.setBounds(760,460,100,50);
        PLAYER_INFO_BUTTON.setBackground(new Color(0,250,0));
        PLAYER_INFO_BUTTON.setFocusable(false);
        PLAYER_INFO_BUTTON.setFont(new Font("Arial", Font.BOLD, 10));
        PLAYER_INFO_BUTTON.addActionListener(this);

        MAP_BUTTON.setVisible(true);
        MAP_BUTTON.setBounds(600,460,60,50);
        MAP_BUTTON.setBackground(new Color(0,250,0));
        MAP_BUTTON.setFocusable(false);
        MAP_BUTTON.setFont(new Font("Arial", Font.BOLD, 10));
        MAP_BUTTON.addActionListener(this);
//------------------------------------------------------------------------

        PROBLEM_BOX.setVisible(true);
        PROBLEM_BOX.setBorder(BorderFactory.createLineBorder(new Color(0,250,0)));
        PROBLEM_BOX.setForeground(new Color(250,0,0));
        PROBLEM_BOX.setBounds(10,355,975,50);
        PROBLEM_BOX.setFont(new Font("Arial", Font.BOLD, 20));
        PROBLEM_BOX.setFocusable(false);

        PROMPT.setVisible(true);
        PROMPT.setBorder(BorderFactory.createLineBorder(new Color(0,250,0)));
        PROMPT.setBounds(10,115,975,50);
        PROMPT.setForeground(new Color(0,250,0));
        PROMPT.setFont(new Font("Arial", Font.BOLD, 20));
        PROMPT.setFocusable(false);
        if(choice == 1){
            if(Loans > 0){
                PROMPT.setText("you already have a loan you need to pay that off first");
                CHOICE1.setText("1. ok");
            }
            else {
                PROMPT.setText("how much money would you like to get");
                CHOICE1.setText("1. 50$");
                CHOICE2.setText("2. 100$");
                CHOICE3.setText("3. 200$");
                CHOICE4.setText("4. 250$");
            }
        }
        else{
            if(Loans == 0){
                PROMPT.setText("you don't have a loan to give back");
                CHOICE1.setText("1. ok");
            }
            else if(Loans > 0){
                PROMPT.setText("how much money would you like to return");
                CHOICE1.setText("1. 50$");
                CHOICE2.setText("2. 100$");
                CHOICE3.setText("3. 200$");
                CHOICE4.setText("4. 250$");
            }
        }
        PROMPT.setHorizontalAlignment(SwingConstants.CENTER);

        CHOICE1.setVisible(true);
        CHOICE1.setBounds(10,200,475,50);
        CHOICE1.setBorder(BorderFactory.createLineBorder(new Color(250,250,250)));
        CHOICE1.setForeground(new Color(0,250,0));
        CHOICE1.setFont(new Font("Arial", Font.BOLD, 20));

        CHOICE2.setVisible(true);
        CHOICE2.setBounds(500,200,475,50);
        CHOICE2.setBorder(BorderFactory.createLineBorder(new Color(250,250,250)));
        CHOICE2.setForeground(new Color(0,250,0));
        CHOICE2.setFont(new Font("Arial", Font.BOLD, 20));

        CHOICE3.setVisible(true);
        CHOICE3.setBounds(10,275,475,50);
        CHOICE3.setBorder(BorderFactory.createLineBorder(new Color(250,250,250)));
        CHOICE3.setForeground(new Color(0,250,0));
        CHOICE3.setFont(new Font("Arial", Font.BOLD, 20));

        CHOICE4.setVisible(true);
        CHOICE4.setBounds(500,275,475,50);
        CHOICE4.setBorder(BorderFactory.createLineBorder(new Color(250,250,250)));
        CHOICE4.setForeground(new Color(0,250,0));
        CHOICE4.setFont(new Font("Arial", Font.BOLD, 20));

        MainGamePanel.add(BACKGROUND_PANEL,Integer.valueOf(0));
        MainGamePanel.add(ICON_LABEL_BOTTOM,Integer.valueOf(1));
        MainGamePanel.add(ICON_LABEL_TOP,Integer.valueOf(1));
        MainGamePanel.add(ANSWER, Integer.valueOf(2));
        MainGamePanel.add(DIRECTIONS, Integer.valueOf(2));
        MainGamePanel.add(ENTER_BUTTON, Integer.valueOf(2));
        MainGamePanel.add(WAGON_BUTTON, Integer.valueOf(2));
        MainGamePanel.add(PLAYER_INFO_BUTTON, Integer.valueOf(3));
        MainGamePanel.add(MAP_BUTTON, Integer.valueOf(3));
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

        if(e.getSource() == ENTER_BUTTON){

            if(PROMPT.getText().equals("how much money would you like to get")){

                if(ANSWER.getText().equals("1")){
                    OregonRoadMain.DoBankThings(1, 1);
                }
                else if(ANSWER.getText().equals("2")){
                    OregonRoadMain.DoBankThings(1, 2);
                }
                else if(ANSWER.getText().equals("3")){
                    OregonRoadMain.DoBankThings(1, 3);
                }
                else if(ANSWER.getText().equals("4")){
                    OregonRoadMain.DoBankThings(1, 4);
                }
                else {
                    PROBLEM_BOX.setText("please only type 1, 2, 3 or 4 in the answer box");
                }

                this.dispose();
            }
            else if(PROMPT.getText().equals("you don't have a loan to give back")){
                if(ANSWER.getText().equals("1")){
                    OregonRoadMain.DoBankThings(2, 1);
                }
                else {
                    PROBLEM_BOX.setText("please only type 1 in the answer box");
                }
                this.dispose();

            }
            else if(PROMPT.getText().equals("you already have a loan you need to pay that off first")){
                if(ANSWER.getText().equals("1")){
                    OregonRoadMain.CallBank1Class();
                }
                else {
                    PROBLEM_BOX.setText("please only type 1 in the answer box");
                }
                this.dispose();
            }
            else if(PROMPT.getText().equals("how much money would you like to return")){
                if(ANSWER.getText().equals("1")){
                    OregonRoadMain.DoBankThings(3, 1);
                    this.dispose();
                }
                else if(ANSWER.getText().equals("2")){
                    OregonRoadMain.DoBankThings(3, 2);
                    this.dispose();
                }
                else if(ANSWER.getText().equals("3")){
                    OregonRoadMain.DoBankThings(3, 3);
                    this.dispose();
                }
                else if(ANSWER.getText().equals("4")){
                    OregonRoadMain.DoBankThings(3, 4);
                    this.dispose();
                }
                else {
                    PROBLEM_BOX.setText("please only type 1, 2, 3 or 4 in the answer box");
                }

            }
            else {
                PROBLEM_BOX.setText("please only type 1, 2, 3 or 4 in the answer box");
            }

        }

        if(e.getSource() == WAGON_BUTTON){
            OregonRoadMain.CallSubClassWagon();
        }

        else if(e.getSource() == MAP_BUTTON){
            OregonRoadMain.CallSubClassMap();
        }
        else if(e.getSource() == PLAYER_INFO_BUTTON){
            OregonRoadMain.CallSubClassPlayer();
        }
    }
}