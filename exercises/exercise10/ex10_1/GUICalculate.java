package exercises.exercise10.ex10_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUICalculate extends JFrame{
    JTextField n1 = new JTextField(5);
    JTextField n2 = new JTextField(5);
    JTextField ans = new JTextField(5);
    JButton add = new JButton("Add");
    JButton sub = new JButton("Subtract");
    JButton mul = new JButton("Multiply");
    JButton div = new JButton("Divide");

    public GUICalculate(){
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(2,1));
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());

        p1.add(new JLabel("Number 1"));
        p1.add(n1);
        p1.add(new JLabel("Number 2"));
        p1.add(n2);
        p1.add(new JLabel("Result"));
        p1.add(ans);
        ans.setHorizontalAlignment(JTextField.RIGHT);

        p2.add(add);
        p2.add(sub);
        p2.add(mul);
        p2.add(div);

        p.add(p1);
        p.add(p2);
        add(p);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                double num1 = Integer.parseInt(n1.getText());
                double num2 = Integer.parseInt(n2.getText());
                ans.setText(String.format("%.1f",num1+num2));
            }
        });

        sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                double num1 = Integer.parseInt(n1.getText());
                double num2 = Integer.parseInt(n2.getText());
                ans.setText(String.format("%.1f",num1-num2));
            }
        });

        mul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                double num1 = Integer.parseInt(n1.getText());
                double num2 = Integer.parseInt(n2.getText());
                ans.setText(String.format("%.1f",num1*num2));
            }
        });

        div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                double num1 = Integer.parseInt(n1.getText());
                double num2 = Integer.parseInt(n2.getText());
                ans.setText(String.format("%.1f",num1/num2));
            }
        });
    }

    public static void main (String[] args) {
        JFrame frame = new GUICalculate();
        frame.setTitle("Exercise10_01");
        frame.setSize(370,120);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}