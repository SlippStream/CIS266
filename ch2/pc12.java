import java.util.Scanner;
public class pc12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter the name of your favorite city: ");
        String city = in.nextLine();

        System.out.println(city.length());
        System.out.println(city.toUpperCase());
        System.out.println(city.toLowerCase());
        System.out.println(city.substring(0,1));
        in.close();
    }
}