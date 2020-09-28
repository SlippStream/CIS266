//Nick Zimanski - CIS266
//26 September 2020
import java.util.Scanner;
public class pc1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        String s = "";
    
            System.out.print("Please enter a number between 1 and 10: ");
            n= in.nextInt();
            if (n < 1 || n > 10) {System.out.println("the number was not between 1 and 10!");}
        
        switch(n) {
            case 1: s="I";break;
            case 2: s="II";break;
            case 3: s="III";break;
            case 4: s="IV";break;
            case 5: s="V";break;
            case 6: s="VI";break;
            case 7: s="VII";break;
            case 8: s="VIII";break;
            case 9: s="IX";break;
            case 10: s="X";
        }
        System.out.println(s);
        in.close();
    }
}