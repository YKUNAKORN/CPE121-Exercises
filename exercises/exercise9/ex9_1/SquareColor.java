package exercises.exercise9.ex9_1;

import javax.swing.*;
import java.awt.*;

public class SquareColor{
    public static void main (String[] args) {
        JFrame frame = new JFrame("Exercise09_01");
        frame.add(new drawrect());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,100);
        frame.setVisible(true);
    }
}

class drawrect extends JPanel {
    protected void paintComponent (Graphics g) {
        super.paintComponent(g);
        int gap = 5;
        int x =  (getWidth() / 9);
        int w =  (getWidth() / 9) - gap;
        int h =  (getHeight() - gap * 2);

        g.setColor(Color.ORANGE);
        g.fillRect(gap,gap,w,h);
        g.setColor(Color.RED);
        g.fillRect(x + gap, gap, w, h);
        g.setColor(Color.GREEN);
        g.fillRect(x * 2 + gap, gap, w, h);
        g.setColor(Color.BLUE);
        g.fillRect(x * 3 + gap, gap, w, h);
        g.setColor(Color.CYAN);
        g.fillRect(x * 4 + gap, gap, w, h);
        g.setColor(Color.MAGENTA);
        g.fillRect(x * 5 + gap, gap, w, h);
        g.setColor(Color.YELLOW);
        g.fillRect(x * 6 + gap, gap, w, h);
        g.setColor(Color.BLACK);
        g.fillRect(x * 7 + gap, gap, w, h);
        g.setColor(Color.WHITE);
        g.fillRect(x * 8 + gap, gap, w, h);
    }
}

