package SubClasses.map;

import javax.swing.*;


import java.awt.*;
import java.awt.event.*;


public class Map extends JFrame implements ActionListener{

    JButton EXIT_BUTTON = new JButton("EXIT");
    JLayeredPane MainGamePanel;
    JPanel BACKGROUND_PANEL = new JPanel();

    JLabel PopupLabel = new JLabel("Day: ");

    static final int GAME_WIDTH = 800;
    static final int GAME_HEIGHT = 570;
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);

//    JLabel MapDay1Label = new JLabel();
//    ImageIcon  Map = new ImageIcon("Map.png");
//
//    JLabel MapDay2Label = new JLabel();
//    ImageIcon  LongMap = new ImageIcon("LongMap.png");
//
//    JLabel MapDay3Label = new JLabel();
//    ImageIcon  MapByFour = new ImageIcon("MapByFour.png");
//
//    JLabel MapDay4Label = new JLabel();
//    ImageIcon  LongMapByFour = new ImageIcon("LongMapByFour.png");

    JLabel FullMap1Label = new JLabel();
    ImageIcon FullMap1 = new ImageIcon("FullMapPart1.png");

    JLabel MapIcon1Label = new JLabel();
    ImageIcon MapIcon1 = new ImageIcon("MapIcon.png");

    JLabel MapTest1 = new JLabel();

    JLabel MappingGridLabel = new JLabel();
    ImageIcon MappingGrid = new ImageIcon("MappingGrid.png");

    JPanel Day1 = new JPanel();

    JPanel Day2T1 = new JPanel();
    JPanel Day3T1 = new JPanel();
    JPanel Day4T1 = new JPanel();
    JPanel Day5T1 = new JPanel();
    JPanel Day6and7T1andT2 = new JPanel();

    JPanel Day2T2 = new JPanel();
    JPanel Day3T2 = new JPanel();
    JPanel Day4T2 = new JPanel();
    JPanel Day5T2 = new JPanel();
    JPanel Day6T2 = new JPanel();


    static int MapIconX;
    static int MapIconY;


    public Map(int MapData, int LRT1){

        MainGamePanel = new JLayeredPane();
        MainGamePanel.setPreferredSize(SCREEN_SIZE);

        this.setPreferredSize(SCREEN_SIZE);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Map");
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);




        switch(MapData) {

            case 0:
                MapIconX = 302;
                MapIconY = 435;
                // 319,480
                // 17, 45
                break;
                //start
            case 11:
                MapIconX = 246;
                MapIconY = 350;
                break;
                //left
            case 12:
                MapIconX = 480;
                MapIconY = 350;
                break;
                //right
            case 21, 22, 23, 24:
                if (LRT1 == 1){
                    MapIconX = 318;
                    MapIconY = 250;
                }
                if (LRT1 == 2){
                    MapIconX = 608;
                    MapIconY = 305;
                }
                break;
            case 31, 32, 33:
                if (LRT1 == 1){
                    MapIconX = 288;
                    MapIconY = 135;
                }
                if (LRT1 == 2){
                    MapIconX = 543;
                    MapIconY = 195;
                }
                break;
            case 41, 42:
                if (LRT1 == 1){
                    MapIconX = 402;
                    MapIconY = 45;
                }
                if (LRT1 == 2){
                    MapIconX = 583;
                    MapIconY = 85;
                }
                break;
            case 51, 52:
                if (LRT1 == 1){
                    MapIconX = 428;
                    MapIconY = -45;
                }
                if (LRT1 == 2){
                    MapIconX = 533;
                    MapIconY = 35;
                }
                break;
        }

        HandlerClass1T0 handlerDay1T0 = new HandlerClass1T0();

        HandlerClass2T1 handlerDay2T1 = new HandlerClass2T1();
        HandlerClass3T1 handlerDay3T1 = new HandlerClass3T1();
        HandlerClass4T1 handlerDay4T1 = new HandlerClass4T1();
        HandlerClass5T1 handlerDay5T1 = new HandlerClass5T1();
        HandlerClass6and7T1andT2 handlerDay6and7T1and2 = new HandlerClass6and7T1andT2();

        HandlerClass2T2 handlerDay2T2 = new HandlerClass2T2();
        HandlerClass3T2 handlerDay3T2 = new HandlerClass3T2();
        HandlerClass4T2 handlerDay4T2 = new HandlerClass4T2();
        HandlerClass5T2 handlerDay5T2 = new HandlerClass5T2();
        HandlerClass6T2 handlerDay6T2 = new HandlerClass6T2();


        Day1.setBounds(319,480,17,17);
        Day1.setVisible(true);
        Day1.setBackground(Color.RED);
        Day1.addMouseListener(handlerDay1T0);

        Day2T1.setBounds(263,382,17,17);
        Day2T1.setVisible(true);
        Day2T1.setBackground(Color.RED);
        Day2T1.addMouseListener(handlerDay2T1);

        Day3T1.setBounds(335,295,17,17);
        Day3T1.setVisible(true);
        Day3T1.setBackground(Color.RED);
        Day3T1.addMouseListener(handlerDay3T1);

        Day4T1.setBounds(305,180,17,17);
        Day4T1.setVisible(true);
        Day4T1.setBackground(Color.RED);
        Day4T1.addMouseListener(handlerDay4T1);

        Day5T1.setBounds(415,90,17,17);
        Day5T1.setVisible(true);
        Day5T1.setBackground(Color.RED);
        Day5T1.addMouseListener(handlerDay5T1);

        Day6and7T1andT2.setBounds(445,0,17,17);
        Day6and7T1andT2.setVisible(true);
        Day6and7T1andT2.setBackground(Color.RED);
        Day6and7T1andT2.addMouseListener(handlerDay6and7T1and2);

        Day2T2.setBounds(497,393,17,17);
        Day2T2.setVisible(true);
        Day2T2.setBackground(Color.RED);
        Day2T2.addMouseListener(handlerDay2T2);

        Day3T2.setBounds(625,350,17,17);
        Day3T2.setVisible(true);
        Day3T2.setBackground(Color.RED);
        Day3T2.addMouseListener(handlerDay3T2);

        Day4T2.setBounds(560,240,17,17);
        Day4T2.setVisible(true);
        Day4T2.setBackground(Color.RED);
        Day4T2.addMouseListener(handlerDay4T2);

        Day5T2.setBounds(600,130,17,17);
        Day5T2.setVisible(true);
        Day5T2.setBackground(Color.RED);
        Day5T2.addMouseListener(handlerDay5T2);

        Day6T2.setBounds(550,80,17,17);
        Day6T2.setVisible(true);
        Day6T2.setBackground(Color.RED);
        Day6T2.addMouseListener(handlerDay6T2);

        BACKGROUND_PANEL.setOpaque(true);
        BACKGROUND_PANEL.setSize(SCREEN_SIZE);
        BACKGROUND_PANEL.setBackground(new Color(50,50,50));

        EXIT_BUTTON.setVisible(true);
        EXIT_BUTTON.setBounds(680,475,100,50);
        EXIT_BUTTON.setBackground(new Color(0,250,0));
        EXIT_BUTTON.setFocusable(false);
        EXIT_BUTTON.setFont(new Font("Arial", Font.BOLD, 10));
        EXIT_BUTTON.addActionListener(this);

        PopupLabel.setVisible(true);
        PopupLabel.setBackground(new Color(0,0,0));
        PopupLabel.setForeground(new Color(0,0,0));
        PopupLabel.setLocation(25,350);
        PopupLabel.setSize(300, 300);
        PopupLabel.setFont(new Font("Arial", Font.BOLD, 25));

        MapTest1.setText(Integer.toString (MapData));
        MapTest1.setFont(new Font("Arial", Font.BOLD, 25));
        MapTest1.setBounds(10, -20, 100, 100);
        MapTest1.setVisible(true);
        MapTest1.setBackground(new Color(0,0,0));
        MapTest1.setForeground(new Color(0,0,0));

        FullMap1Label.setVisible(true);
        FullMap1Label.setIcon(FullMap1);
        FullMap1Label.setLocation(0,-100);
        FullMap1Label.setSize(1000, 800);

        MappingGridLabel.setVisible(true);
        MappingGridLabel.setIcon(MappingGrid);
        MappingGridLabel.setLocation(0,-100);
        MappingGridLabel.setSize(1000, 800);

        MapIcon1Label.setVisible(true);
        MapIcon1Label.setIcon(MapIcon1);
        MapIcon1Label.setLocation(MapIconX,MapIconY);
        MapIcon1Label.setSize(50, 50);


        MainGamePanel.add(MappingGridLabel, Integer.valueOf(3));
        MainGamePanel.add(MapIcon1Label, Integer.valueOf(4));
        MainGamePanel.add(BACKGROUND_PANEL,Integer.valueOf(0));
        MainGamePanel.add(EXIT_BUTTON, Integer.valueOf(4));
        MainGamePanel.add(FullMap1Label, Integer.valueOf(2));
        MainGamePanel.add(PopupLabel, Integer.valueOf(4));
        MainGamePanel.add(MapTest1, Integer.valueOf(4));
        MainGamePanel.add(Day1, Integer.valueOf(1));
        MainGamePanel.add(Day2T1, Integer.valueOf(1));
        MainGamePanel.add(Day3T1, Integer.valueOf(1));
        MainGamePanel.add(Day4T1, Integer.valueOf(1));
        MainGamePanel.add(Day5T1, Integer.valueOf(1));
        MainGamePanel.add(Day6and7T1andT2, Integer.valueOf(1));
        MainGamePanel.add(Day2T2, Integer.valueOf(1));
        MainGamePanel.add(Day3T2, Integer.valueOf(1));
        MainGamePanel.add(Day4T2, Integer.valueOf(1));
        MainGamePanel.add(Day5T2, Integer.valueOf(1));
        MainGamePanel.add(Day6T2, Integer.valueOf(1));

        this.add(MainGamePanel);


    }

    private class HandlerClass1T0 implements MouseListener {
        @Override public void mouseClicked(MouseEvent e) {}
        @Override public void mousePressed(MouseEvent e) {}
        @Override public void mouseReleased(MouseEvent e) {}
        @Override public void mouseEntered(MouseEvent e) {
            PopupLabel.setText(String.format("Day 1: Trail Chose"));}
        @Override public void mouseExited(MouseEvent e) {
            PopupLabel.setText(String.format("Day: "));}
    }
    private class HandlerClass2T1 implements MouseListener {
        @Override public void mouseClicked(MouseEvent e) {}
        @Override public void mousePressed(MouseEvent e) {}
        @Override public void mouseReleased(MouseEvent e) {}
        @Override public void mouseEntered(MouseEvent e) {
            PopupLabel.setText(String.format("Day 2: Stranger meet up"));}
        @Override public void mouseExited(MouseEvent e) {
            PopupLabel.setText(String.format("Day: "));}
    }
    private class HandlerClass3T1 implements MouseListener {
        @Override public void mouseClicked(MouseEvent e) {}
        @Override public void mousePressed(MouseEvent e) {}
        @Override public void mouseReleased(MouseEvent e) {}
        @Override public void mouseEntered(MouseEvent e) {
            PopupLabel.setText(String.format("Day 3: Stop Point"));}
        @Override public void mouseExited(MouseEvent e) {
            PopupLabel.setText(String.format("Day: "));}
    }
    private class HandlerClass4T1 implements MouseListener {
        @Override public void mouseClicked(MouseEvent e) {}
        @Override public void mousePressed(MouseEvent e) {}
        @Override public void mouseReleased(MouseEvent e) {}
        @Override public void mouseEntered(MouseEvent e) {
            PopupLabel.setText(String.format("Day 4: Flu Outbreak"));}
        @Override public void mouseExited(MouseEvent e) {
            PopupLabel.setText(String.format("Day: "));}
    }
    private class HandlerClass5T1 implements MouseListener {
        @Override public void mouseClicked(MouseEvent e) {}
        @Override public void mousePressed(MouseEvent e) {}
        @Override public void mouseReleased(MouseEvent e) {}
        @Override public void mouseEntered(MouseEvent e) {
            PopupLabel.setText(String.format("Day 5: Broken Wheel"));}
        @Override public void mouseExited(MouseEvent e) {
            PopupLabel.setText(String.format("Day: "));}
    }

    private class HandlerClass6T2 implements MouseListener {
        @Override public void mouseClicked(MouseEvent e) {}
        @Override public void mousePressed(MouseEvent e) {}
        @Override public void mouseReleased(MouseEvent e) {}
        @Override public void mouseEntered(MouseEvent e) {
            PopupLabel.setText(String.format("Day 6: Waterfall"));}
        @Override public void mouseExited(MouseEvent e) {
            PopupLabel.setText(String.format("Day: "));}
    }

    private class HandlerClass2T2 implements MouseListener {
        @Override public void mouseClicked(MouseEvent e) {}
        @Override public void mousePressed(MouseEvent e) {}
        @Override public void mouseReleased(MouseEvent e) {}
        @Override public void mouseEntered(MouseEvent e) {
            PopupLabel.setText(String.format("Day 2: Friend meet up"));}
        @Override public void mouseExited(MouseEvent e) {
            PopupLabel.setText(String.format("Day: "));}
    }
    private class HandlerClass3T2 implements MouseListener {
        @Override public void mouseClicked(MouseEvent e) {}
        @Override public void mousePressed(MouseEvent e) {}
        @Override public void mouseReleased(MouseEvent e) {}
        @Override public void mouseEntered(MouseEvent e) {
            PopupLabel.setText(String.format("Day 3: Waterfall"));}
        @Override public void mouseExited(MouseEvent e) {
            PopupLabel.setText(String.format("Day: "));}
    }
    private class HandlerClass4T2 implements MouseListener {
        @Override public void mouseClicked(MouseEvent e) {}
        @Override public void mousePressed(MouseEvent e) {}
        @Override public void mouseReleased(MouseEvent e) {}
        @Override public void mouseEntered(MouseEvent e) {
            PopupLabel.setText(String.format("Day 4: Flu Outbreak"));}
        @Override public void mouseExited(MouseEvent e) {
            PopupLabel.setText(String.format("Day: "));}
    }
    private class HandlerClass5T2 implements MouseListener {
        @Override public void mouseClicked(MouseEvent e) {}
        @Override public void mousePressed(MouseEvent e) {}
        @Override public void mouseReleased(MouseEvent e) {}
        @Override public void mouseEntered(MouseEvent e) {
            PopupLabel.setText(String.format("Day 5: Broken Wheel"));}
        @Override public void mouseExited(MouseEvent e) {
            PopupLabel.setText(String.format("Day: "));}
    }

    private class HandlerClass6and7T1andT2 implements MouseListener {
        @Override public void mouseClicked(MouseEvent e) {}
        @Override public void mousePressed(MouseEvent e) {}
        @Override public void mouseReleased(MouseEvent e) {}
        @Override public void mouseEntered(MouseEvent e) {
            PopupLabel.setText(String.format("Day 6/7: Food Gathering"));}
        @Override public void mouseExited(MouseEvent e) {
            PopupLabel.setText(String.format("Day: "));}
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == EXIT_BUTTON){
            this.dispose();
        }


    }

}