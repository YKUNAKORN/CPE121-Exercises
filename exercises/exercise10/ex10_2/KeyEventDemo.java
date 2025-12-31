package exercises.exercise10.ex10_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventDemo extends JFrame {
    private KeyboardPanel keyboardPanel = new KeyboardPanel();
    public KeyEventDemo() {
        add(keyboardPanel);
        keyboardPanel.setFocusable(true);
    }

    public static void main (String[] args) {
        KeyEventDemo frame = new KeyEventDemo();
        frame.setTitle("Exercise10_02");
        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
  }
}