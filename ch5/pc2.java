//Nick Zimanski - CIS266
//26 September 2020
import java.util.Scanner;
public class pc2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mph = 40, k = 0;
        System.out.print("For how long did the vehicle travel: ");
        k = in.nextInt();
        System.out.println("Hour       Distance Traveled");
        System.out.println("........................................");
        for (int i = 1; i <= k; i++) {
            System.out.println(i + "           " + mph * i);
        }
        
        in.close();
    }
}