//Nick Zimanski - CIS266
//26 September 2020
import java.util.Scanner;
public class pc1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int d = 0;
        System.out.print("Please enter a number: ");
        d = in.nextInt();
        for (int i = 1; i <= d; i++) {
            System.out.println(i);
        }
        in.close();
    }
}