package exercises.exercise8.ex8_1;

import javax.swing.*;
import java.awt.*;

public class GUI_A extends JFrame {
    public GUI_A() {
        setLayout(new FlowLayout(FlowLayout.LEFT,12,22));
        add(new JLabel("Name"));
        add(new JTextField(10));
        add(new JButton("OK"));
        add(new JButton("Cancel"));
        add(new JButton("Exit"));
    }
    public static void main (String[] args) {
        GUI_A frame = new GUI_A();
        frame.setTitle("Handle Event");
        frame.setSize(460,110);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}