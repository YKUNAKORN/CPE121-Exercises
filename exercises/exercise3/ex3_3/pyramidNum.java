package exercises.exercise3.ex3_3;

public class pyramidNum {
    public static void main(String[] args){
        int tab = 9, round = 1, num = 1;

        for(int line = 1; line <= 9; line++) {
            for(int t = 0; t <= tab; t++) {
                System.out.printf("\t");
            }
            for (int j = 1; j <= round; j++) {
                System.out.printf(" %d ",num);
                if (num < 10) {
                    System.out.printf("\t");
                }
                num++;
            }
            round += 2;
            tab--;
            System.out.printf("\n");
        }
    }
}