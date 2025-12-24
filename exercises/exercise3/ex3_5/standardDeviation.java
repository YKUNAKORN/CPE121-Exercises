package exercises.exercise3.ex3_5;

import javax.swing.JOptionPane;

public class standardDeviation {
    public static void main (String[] args) {
        String totalStudent = JOptionPane.showInputDialog(null, "Enter the number of total students: ");
        int toStringTotalStudent = Integer.parseInt(totalStudent);
        String scoreStudent1 = JOptionPane.showInputDialog(null, "Enter scores of student No 1: ");
        float toStringScoreStudent1 = Float.parseFloat(scoreStudent1);
        String scoreStudent2 = JOptionPane.showInputDialog(null, "Enter scores of student No 2: ");
        float toStringScoreStudent2 = Float.parseFloat(scoreStudent2);
        String scoreStudent3 = JOptionPane.showInputDialog(null, "Enter scores of student No 3: ");
        float toStringScoreStudent3 = Float.parseFloat(scoreStudent3);

        float xBar = ((toStringScoreStudent1 + toStringScoreStudent2 + toStringScoreStudent3) / toStringTotalStudent);
        double stdPow = ((Math.pow((toStringScoreStudent1 - xBar), 2) + Math.pow((toStringScoreStudent2 - xBar), 2) + Math.pow((toStringScoreStudent3 - xBar), 2)) / toStringTotalStudent);
        double stdSqrt = Math.sqrt(stdPow);
        JOptionPane.showMessageDialog(null, "Mean value of student score: " + xBar);
        JOptionPane.showMessageDialog(null, "S.D value of student score: " + stdSqrt);
    }
}