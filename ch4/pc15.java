//Nick Zimanski - CIS266
//26 September 2020
import java.util.Scanner;
public class pc15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, p;

        System.out.print("How many books have you checked out: ");
        n = in.nextInt();

        switch(n) {
            case 0: p = 0;break;
            case 1: p=5;break;
            case 2: p=15;break;
            case 3: p=30;break;
            default: p=60;
        }
        System.out.println("You have " + p + " points");
        in.close();
    }
}