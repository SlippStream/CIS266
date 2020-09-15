//Nick Zimanski - CIS266
//15 September 2020
import java.util.Scanner;
class Car {
    private int yearModel;
    private String make;
    private int speed;

    public Car(int yearModel, String make) {
        this.yearModel=yearModel;
        this.make=make;
        speed = 0;
    }

    int getYearModel() {return yearModel;}
    String getMake() {return make;}
    int getSpeed() {return speed;}

    void accelerate() {speed+=5;}
    void brake() {speed -=5;}
}
public class pc2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Car car = new Car(2007, "Pontiac G6");
        for (int i=0;i<5;i++) {
            car.accelerate();
            System.out.println(car.getSpeed());
        }
        for (int i=0;i<5;i++) {
            car.brake();
            System.out.println(car.getSpeed());
        }
        
        in.close();
    }
}