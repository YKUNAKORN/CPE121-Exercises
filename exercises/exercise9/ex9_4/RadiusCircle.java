package exercises.exercise9.ex9_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;

public class RadiusCircle extends JPanel {
    private final int RADIUS = 15;
    private double x1, y1, x2, y2;

    public RadiusCircle() {
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                randomizePositions();
                repaint();
            }
        });
    }

    private void randomizePositions() {
        Random rand = new Random();
        int w = getWidth();
        int h = getHeight();

        if (w > 0 && h > 0) {
            x1 = rand.nextInt(w - 2 * RADIUS) + RADIUS;
            y1 = rand.nextInt(h - 2 * RADIUS) + RADIUS;
            x2 = rand.nextInt(w - 2 * RADIUS) + RADIUS;
            y2 = rand.nextInt(h - 2 * RADIUS) + RADIUS;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.RED);

        g2.draw(new Ellipse2D.Double(x1 - RADIUS, y1 - RADIUS, 2 * RADIUS, 2 * RADIUS));
        g2.draw(new Ellipse2D.Double(x2 - RADIUS, y2 - RADIUS, 2 * RADIUS, 2 * RADIUS));

        g2.drawString("1", (int) x1 - 4, (int) y1 + 5);
        g2.drawString("2", (int) x2 - 4, (int) y2 + 5);

        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        if (d > 0) {
            double startX = x1 + RADIUS * (x2 - x1) / d;
            double startY = y1 + RADIUS * (y2 - y1) / d;
            double endX = x2 - RADIUS * (x2 - x1) / d;
            double endY = y2 - RADIUS * (y2 - y1) / d;

            g2.draw(new Line2D.Double(startX, startY, endX, endY));
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercise09_04");
        RadiusCircle panel = new RadiusCircle();
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}