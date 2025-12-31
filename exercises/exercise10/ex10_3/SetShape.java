package exercises.exercise10.ex10_3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SetShape extends JFrame{
    private JRadioButton red = new JRadioButton("Red");
    private JRadioButton yellow = new JRadioButton("Yellow");
    private JRadioButton white = new JRadioButton("White");
    private JRadioButton gray = new JRadioButton("Gray");
    private JRadioButton green = new JRadioButton("Green");

    private JRadioButton rectangle = new JRadioButton("Rectangle");
    private JRadioButton oval = new JRadioButton("Oval");

    private static RectDraw rec = new RectDraw();
    private static int typeDraw = 0;
    private static int colorBG = 0;
    private static class RectDraw extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            switch(colorBG) {
                case 0: break;
                case 1:
                    rec.setBackground(Color.RED);
                    break;
                case 2:
                    rec.setBackground(Color.YELLOW);
                    break;
                case 3:
                    rec.setBackground(Color.WHITE);
                    break;
                case 4:
                    rec.setBackground(Color.GRAY);
                    break;
                case 5:
                    rec.setBackground(Color.GREEN);
                    break;
            }

            switch(typeDraw) {
                case 0: break;
                case 1:
                    g.drawRect(20,20,getWidth()-40,getHeight()-40);
                    break;
                case 2:
                    g.drawOval(20,20,getWidth()-40,getHeight()-40);
                    break;
            }
        }
    }

    public SetShape(){
        ButtonGroup bgNorth = new ButtonGroup();
        bgNorth.add(red); bgNorth.add(yellow); bgNorth.add(white); bgNorth.add(gray); bgNorth.add(green);

        JPanel p1 = new JPanel(new FlowLayout());
        p1.add(red); p1.add(yellow); p1.add(white); p1.add(gray); p1.add(green);

        JPanel p2 = new JPanel(new FlowLayout());
        p2.add(rectangle); p2.add(oval);

        add(p1, BorderLayout.NORTH);
        add(rec,BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);

        red.addActionListener(new ared());
        yellow.addActionListener(new ayellow());
        white.addActionListener(new awhite());
        gray.addActionListener(new agray());
        green.addActionListener(new agreen());

        ButtonGroup bgSouth = new ButtonGroup();
        bgSouth.add(rectangle); bgSouth.add(oval);

        rectangle.addActionListener(new arectangle());
        oval.addActionListener(new aoval());
    }

    private class ared implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            colorBG = 1;
            repaint();
        }
    }

    private class ayellow implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            colorBG = 2;
            repaint();
        }
    }

    private class awhite implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            colorBG = 3;
            repaint();
        }
    }

    private class agray implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            colorBG = 4;
            repaint();
        }
    }

    private class agreen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            colorBG = 5;
            repaint();
        }
    }

    private class arectangle implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            typeDraw = 1;
            repaint();
        }
    }
    private class aoval implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            typeDraw = 2;
            repaint();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new SetShape();
        frame.setTitle("Exercise10_01");
        frame.setLocationRelativeTo(null);//center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setVisible(true);
    }
}