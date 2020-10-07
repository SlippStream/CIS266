//Nick Zimanski - CIS266
//5 October 2020
import java.util.Scanner;
public class pc16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double budget, expenses = 0, response;

        System.out.print("Please enter this month's budget: $");
        budget = in.nextDouble();
        
        do {
            System.out.print("Please enter one of this month's expenses (or 0 to quit): $");
            response = in.nextDouble();
            expenses += response;
        } while(response > 0);

        if (budget > expenses) System.out.println("You are $" + (budget-expenses) + " under budget"); 
        else System.out.println("You are $" + (expenses - budget) + " over budget");
        in.close();
    }
}