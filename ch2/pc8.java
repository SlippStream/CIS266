import java.util.Scanner;
public class pc8 {
    public static void main(String[] args) {
        final double countyTax = 0.02, stateTax = 0.055;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the amount of the purchase: ");
        double purchasePrice = in.nextDouble();

        double stateCost = stateTax * purchasePrice;
        double countyCost = countyTax * purchasePrice;
        double totalTax = countyCost + stateCost;

        System.out.println("Purchase amount: $" + purchasePrice);
        System.out.println("State sales tax: $" + stateCost);
        System.out.println("County sales tax: $" + countyCost);
        System.out.println("Total sales tax: $" + totalTax);
        System.out.println("Total cost: $" + (purchasePrice + totalTax));
        in.close();
    }
}