import java.util.Scanner;
public class pc13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double tax = 0.075, tip = 0.18;
        
        System.out.print("Please enter the cost of the meal: $");
        double cost = in.nextDouble();

        System.out.println("Meal Price: $" + cost);
        System.out.println("Tax: $" + cost * tax);
        System.out.println("Tip: $" + cost * tip);
        System.out.println("Total: $" + (cost + (cost * tip) + (cost * tax)));
        in.close();
    }
}