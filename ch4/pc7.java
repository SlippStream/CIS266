//Nick Zimanski - CIS266
//26 September 2020
import java.util.Scanner;
public class pc7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fatGrams, cals;
        System.out.print("Please enter the total calories in the food item: ");
        cals = in.nextInt();
        System.out.print("Please enter the total grams of fat in the food item: ");
        fatGrams = in.nextInt();
        if (fatGrams > cals) System.err.println("Invalid grams of fat!");
        else {
            System.out.println(getFatCalsFromCals(fatGrams, cals)*100 + "% fat by calories.");
            if (getFatCalsFromCals(fatGrams, cals) < .3) {System.out.println("Low fat.");}
        }
        in.close();
    }
    static double getFatCalsFromCals(int f, int tc) {return (f*9)/(double)tc;}

}