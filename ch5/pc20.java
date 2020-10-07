//Nick Zimanski - CIS266
//5 October 2020

import java.util.Scanner;
class Coin {
    private String sideUp;
    Coin() {toss();}
    private void toss() {
        if (Math.random() < .5) sideUp = "Heads";
        else sideUp = "Tails";
    }
    public String getSideUp() {return sideUp;}
}
public class pc20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            System.err.println((new Coin().getSideUp()));
        }
        
        in.close();
    }
}