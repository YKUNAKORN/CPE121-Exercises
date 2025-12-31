package exercises.exercise8.ex8_5;

import javax.swing.*;
import java.awt.*;

public class GUINumMatrix extends JFrame {
    public static void main (String[] args) {
        JFrame frame = new JFrame("Exercise08_v2_04_");
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(10,10));

        for(int i = 1; i <= 100; i++) {
            int ran = (int) (Math.random() * 2);
            p.add(new JLabel("" + ran, SwingConstants.CENTER));
        }

        frame.add(p);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,250);
        frame.setVisible(true);
    }
}