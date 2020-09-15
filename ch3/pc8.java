//Nick Zimanski - CIS266
//15 September 2020

import java.util.Scanner;
class TestScores {
    private int scores[] = new int[3];

    void setScore(int id, int score) {scores[id-1] = score;}
 
    double getAvgScore() {return (scores[0] + scores[1] + scores[2])/3;}
}
public class pc8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TestScores t = new TestScores();
        
        System.out.print("Please enter test score 1: ");
        t.setScore(1, in.nextInt());
        System.out.print("Please enter test score 2: ");
        t.setScore(2, in.nextInt());
        System.out.print("Please enter test score 3: ");
        t.setScore(3, in.nextInt());

        System.out.println("Average: " + t.getAvgScore());
        
        in.close();
    }
}