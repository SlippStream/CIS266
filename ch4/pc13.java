//Nick Zimanski - CIS266
//26 September 2020
import java.util.Scanner;
public class pc13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h, w;
        double bmi;

        System.out.print("Please enter your height in inches: ");
        h = in.nextInt();
        System.out.print("Please enter your weight in pounds: ");
        w = in.nextInt();
        bmi = getBMI(h, w);

        if (bmi < 18.5) System.out.println("You are underweight");
        else if (bmi < 25) System.out.println("Your weight is optimal");
        else System.out.println("You are overweight");
        in.close();
    }
    static double getBMI(int h, int w) {
        return w * 703/(h*h);
    }
}