//Nick Zimanski - CIS266
//26 September 2020

import java.util.Scanner;
class TestScores {
    private int scores[] = new int[3];

    void setScore(int id, int score) {scores[id-1] = score;}
 
    double getAvgScore() {return (scores[0] + scores[1] + scores[2])/3;}
    char getLetterGrade() {
        double l = getAvgScore();
        char c;
        if (l > 90) c='A'; 
        else if (l > 80) c='B'; 
        else if (l > 70) c='C'; 
        else if (l > 80) c='D'; 
        else c='F';

        return c;
    }
}
public class pc3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TestScores t = new TestScores();
        
        System.out.print("Please enter test score 1: ");
        t.setScore(1, in.nextInt());
        System.out.print("Please enter test score 2: ");
        t.setScore(2, in.nextInt());
        System.out.print("Please enter test score 3: ");
        t.setScore(3, in.nextInt());

        System.out.println("Average: " + t.getAvgScore() + " (" + t.getLetterGrade() + ")");
        
        in.close();
    }
}