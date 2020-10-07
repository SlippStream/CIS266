//Nick Zimanski - CIS266
//4 October 2020
import java.util.Scanner;
class Organism {
    private int startingSize;
    private double avgDailyPopulationIncrease;
    private int days;
    private int currentSize;

    public Organism(int startingSize, int days, double avgDailyPopulationIncrease) {
        this.startingSize=startingSize;
        this.avgDailyPopulationIncrease=avgDailyPopulationIncrease;
        currentSize = startingSize;
        this.days=days;
    }
    public void displayPopSizePerDay() {
        System.out.println("Day         Population Size");
        System.out.println(".....................................");
        for (int i = 1;i<=days;i++) {
            currentSize += currentSize * avgDailyPopulationIncrease;
            System.out.println(i + "             " + currentSize);
        }
    }
}
public class pc6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d, s;
        double a;
        System.out.print("How many days: ");
        d = in.nextInt();
        System.out.print("Enter starting population: ");
        s = in.nextInt();
        System.out.print("Enter avg population growth as a percentage: %");
        a = in.nextDouble();
        a = a / 100;
        Organism o = new Organism(s, d, a);
        o.displayPopSizePerDay();
        in.close();
    }
}