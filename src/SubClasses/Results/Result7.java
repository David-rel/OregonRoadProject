package SubClasses.Results;

import MainPackage.OregonRoadMain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Result7 extends JFrame implements ActionListener {

    JLabel RESULTS1 = new JLabel();

    JButton NEXT_BUTTON = new JButton("NEXT");

    static int DayCheck = 0;

    JLayeredPane MainGamePanel;
    JPanel BACKGROUND_PANEL=new JPanel();

    static final int GAME_WIDTH=1000;
    static final int GAME_HEIGHT=(int)(GAME_WIDTH*(0.5555));
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);

    public Result7(String info, int TrailIdentifier) {
        MainGamePanel = new JLayeredPane();
        MainGamePanel.setPreferredSize(SCREEN_SIZE);

        this.setPreferredSize(SCREEN_SIZE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("bank ANSWER3");
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        // this.setIconImage(image.getImage());

        BACKGROUND_PANEL.setOpaque(true);
        BACKGROUND_PANEL.setSize(SCREEN_SIZE);
        BACKGROUND_PANEL.setBackground(Color.BLACK);

        RESULTS1.setVisible(true);
        RESULTS1.setBorder(BorderFactory.createLineBorder(new Color(0, 250, 0)));
        RESULTS1.setBounds(10, 10, 965, 300);
        RESULTS1.setForeground(new Color(0, 250, 0));
        RESULTS1.setFont(new Font("Arial", Font.BOLD, 20));
        RESULTS1.setFocusable(false);
        RESULTS1.setText(info);
        RESULTS1.setHorizontalAlignment(SwingConstants.CENTER);

        NEXT_BUTTON.setVisible(true);
        NEXT_BUTTON.setBounds(500, 400, 100, 50);
        NEXT_BUTTON.setBackground(new Color(0, 250, 0));
        NEXT_BUTTON.setFocusable(false);
        NEXT_BUTTON.setFont(new Font("Arial", Font.BOLD, 10));
        NEXT_BUTTON.addActionListener(this);

        MainGamePanel.add(BACKGROUND_PANEL, Integer.valueOf(0));
        MainGamePanel.add(NEXT_BUTTON, Integer.valueOf(1));
        MainGamePanel.add(RESULTS1, Integer.valueOf(1));

        this.add(MainGamePanel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        DayCheck = DayCheck + 1;

        if(e.getSource() == NEXT_BUTTON){
            OregonRoadMain.CallBank2Class();
            this.dispose();
        }
    }
}
