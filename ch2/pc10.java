import java.util.Scanner;
public class pc10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int scores[] = {0,0,0};
        double avg=0;

        System.out.print("Please enter test score 1: ");
        scores[0] = in.nextInt();
        System.out.print("Please enter test score 2: ");
        scores[1] = in.nextInt();
        System.out.print("Please enter test score 3: ");
        scores[2] = in.nextInt();
        avg+=scores[0]+scores[1]+scores[2];
        avg/=3;
        System.out.println("Scores: " + scores[0] + ", " + scores[1] + ", " + scores[2]);
        System.out.println("Average: " + avg);
        in.close();
    }
}