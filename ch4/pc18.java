//Nick Zimanski - CIS266
//26 September 2020
import java.util.Scanner;
class RoulettePocket {
    private int pocketNum;
    public RoulettePocket(int num) {
        pocketNum = num;
    }
    String getPocketColor() {
        if (pocketNum != 0) {
            if (pocketNum >= 1 || pocketNum <= 10) {
                if (pocketNum % 2 == 0) return "Black";
                else return "Red";
            }
            if (pocketNum >= 11 || pocketNum <= 18) {
                if (pocketNum % 2 == 0) return "Red";
                else return "Black";
            }
            if (pocketNum >= 19 || pocketNum <= 28) {
                if (pocketNum % 2 == 0) return "Black";
                else return "Red";
            }
            if (pocketNum >= 29 || pocketNum <= 36) {
                if (pocketNum % 2 == 0) return "Red";
                else return "Black";
            }
        }
        return "White";
    }
}
public class pc18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.print("Please enter a number between 0 and 36: ");
        n = in.nextInt();
        if (n < 0 || n > 36) {System.err.println("Invalid Number!");}
        else {
            RoulettePocket r = new RoulettePocket(n);
            System.out.println(r.getPocketColor());
        }
        in.close();
    }
}