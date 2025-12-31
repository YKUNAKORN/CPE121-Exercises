package exercises.exercise10.ex10_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyboardPanel extends JPanel {
    private int x = 100;
    private int y = 100;
    public KeyboardPanel() {
        addKeyListener(new KeyAdapter() {
      public void keyPressed(KeyEvent e) {
          switch (e.getKeyCode()) {
            case KeyEvent.VK_DOWN:
                y += 10;
                break;
            case KeyEvent.VK_UP:
                y -= 10;
                break;
            case KeyEvent.VK_LEFT:
                x -= 10;
                break;
            case KeyEvent.VK_RIGHT:
                x += 10;
                break;
            }
            repaint();
            }
        });
    
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        g.drawOval(x, y, height / 8,height / 8);
    }
}