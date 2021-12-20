package SubClasses.InsideWagon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsideWagonStuff extends JFrame implements ActionListener{

    JLabel BANDAGES = new JLabel();
    JLabel MEASLES = new JLabel();
    JLabel DISSENTARY = new JLabel();
    JLabel FLU = new JLabel();
    JLabel WHEEL = new JLabel();
    JLabel HORSE = new JLabel();
    JLabel CLOTH= new JLabel();
    JLabel STEERING = new JLabel();
    JLabel SHOTGUN = new JLabel();
    JLabel SHOTGUN_AMMO = new JLabel();



    JButton EXIT_BUTTON = new JButton("EXIT");

    JLayeredPane MainGamePanel;

    JPanel BACKGROUND_PANEL = new JPanel();

    static final int GAME_WIDTH=275;
    static final int GAME_HEIGHT= 550;
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);

    public InsideWagonStuff(int Bandages, int Measles, int Dissentray, int Flu,
                            int Wheel, int Horse, int Cloth, int Steering,
                            int Shotgun, int Shotgun_ammo) {

        MainGamePanel = new JLayeredPane();

        this.setPreferredSize(SCREEN_SIZE);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Items");
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocation(0,62);


        BACKGROUND_PANEL.setOpaque(true);
        BACKGROUND_PANEL.setSize(SCREEN_SIZE);
        BACKGROUND_PANEL.setBackground(Color.BLACK);


        BANDAGES.setVisible(true);
        BANDAGES.setForeground(new Color(0,250,0));
        BANDAGES.setBounds(0,20,300,50);
        BANDAGES.setFont(new Font("ARIAL", Font.ITALIC, 25));
        BANDAGES.setText("BANDAGES: " + Bandages);

        MEASLES.setVisible(true);
        MEASLES.setForeground(new Color(0,250,0));
        MEASLES.setBounds(0,60,300,50);
        MEASLES.setFont(new Font("ARIAL", Font.ITALIC, 25));
        MEASLES.setText("MEASLES: " + Measles);

        DISSENTARY.setVisible(true);
        DISSENTARY.setForeground(new Color(0,250,0));
        DISSENTARY.setBounds(0,100,300,50);
        DISSENTARY.setFont(new Font("ARIAL", Font.ITALIC, 25));
        DISSENTARY.setText("DISSENTARY: " + Dissentray);

        FLU.setVisible(true);
        FLU.setForeground(new Color(0,250,0));
        FLU.setBounds(0,140,300,50);
        FLU.setFont(new Font("ARIAL", Font.ITALIC, 25));
        FLU.setText("FLU: " + Flu);

        WHEEL.setVisible(true);
        WHEEL.setForeground(new Color(0,250,0));
        WHEEL.setBounds(0,180,300,50);
        WHEEL.setFont(new Font("ARIAL", Font.ITALIC, 25));
        WHEEL.setText("WHEEL: "+ Wheel);

        HORSE.setVisible(true);
        HORSE.setForeground(new Color(0,250,0));
        HORSE.setBounds(0,220,300,50);
        HORSE.setFont(new Font("ARIAL", Font.ITALIC, 25));
        HORSE.setText("HORSE: " + Horse);

        CLOTH.setVisible(true);
        CLOTH.setForeground(new Color(0,250,0));
        CLOTH.setBounds(0,260,300,50);
        CLOTH.setFont(new Font("ARIAL", Font.ITALIC, 25));
        CLOTH.setText("CLOTH: "+ Cloth);

        STEERING.setVisible(true);
        STEERING.setForeground(new Color(0,250,0));
        STEERING.setBounds(0,300,300,50);
        STEERING.setFont(new Font("ARIAL", Font.ITALIC, 25));
        STEERING.setText("STEERING: ");

        SHOTGUN.setVisible(true);
        SHOTGUN.setForeground(new Color(0,250,0));
        SHOTGUN.setBounds(0,340,300,50);
        SHOTGUN.setFont(new Font("ARIAL", Font.ITALIC, 25));
        SHOTGUN.setText("SHOTGUN: "+ Shotgun);

        SHOTGUN_AMMO.setVisible(true);
        SHOTGUN_AMMO.setForeground(new Color(0,250,0));
        SHOTGUN_AMMO.setBounds(0,380,300,50);
        SHOTGUN_AMMO.setFont(new Font("ARIAL", Font.ITALIC, 25));
        SHOTGUN_AMMO.setText("SHOTGUN AMMO: " + Shotgun_ammo);

        EXIT_BUTTON.setVisible(true);
        EXIT_BUTTON.setBounds(100,430,100,50);
        EXIT_BUTTON.setBackground(new Color(0,250,0));
        EXIT_BUTTON.setFocusable(false);
        EXIT_BUTTON.setFont(new Font("Arial", Font.BOLD, 10));
        EXIT_BUTTON.addActionListener(this);


        MainGamePanel.add(BACKGROUND_PANEL,Integer.valueOf(0));
        MainGamePanel.add(EXIT_BUTTON, Integer.valueOf(2));
        MainGamePanel.add(BANDAGES, Integer.valueOf(2));
        MainGamePanel.add(DISSENTARY, Integer.valueOf(2));
        MainGamePanel.add(MEASLES, Integer.valueOf(2));
        MainGamePanel.add(FLU, Integer.valueOf(2));
        MainGamePanel.add(WHEEL, Integer.valueOf(2));
        MainGamePanel.add(HORSE, Integer.valueOf(2));
        MainGamePanel.add(CLOTH, Integer.valueOf(2));
        MainGamePanel.add(STEERING, Integer.valueOf(2));
        MainGamePanel.add(SHOTGUN, Integer.valueOf(2));
        MainGamePanel.add(SHOTGUN_AMMO, Integer.valueOf(2));

        this.add(MainGamePanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == EXIT_BUTTON){
            this.dispose();
        }
    }
}
