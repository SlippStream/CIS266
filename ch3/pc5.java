//Nick Zimanski - CIS266
//15 September 2020
import java.util.Scanner;
class RetailItem {
    private String description;
    private int unitsOnHand;
    private double price;

    public RetailItem(String d, int u, double p) {
        description=d;
        unitsOnHand=u;
        price=p;
    }
    
    void setDescription(String d) {description = d;}
    String getDescription() {return description;}
    void setUnitsOnHand(int d) {unitsOnHand = d;}
    int getUnitsOnHand() {return unitsOnHand;}
    void setPrice(double d) {price = d;}
    double getPrice() {return price;}
}
public class pc5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        RetailItem items[] = {
            new RetailItem("Jacket", 12, 59.95),
            new RetailItem("Designer Jeans", 40, 34.95),
            new RetailItem("Shirt", 20, 24.95)};
        in.close();
    }
}