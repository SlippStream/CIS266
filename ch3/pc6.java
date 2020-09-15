//Nick Zimanski - CIS266
//15 September 2020
import java.util.Scanner;
class Payroll {
    private String employeeName;
    private int idNumber;
    private double hourlyPayRate;
    private int hoursWorked;

    void setEmployeeName(String e) {employeeName =e;}
    String getEmployeeName() {return employeeName;}
    void setIdNumber(int e) {idNumber=e;}
    int getIdNumber() {return idNumber;}
    void setHourlyPayRate(double e) {hourlyPayRate =e;}
    double getHourlyPayRate() {return hourlyPayRate;}
    void setHoursWorked(int e) {hoursWorked =e;}
    int getHoursWorked() {return hoursWorked;}

    double getGrossPay() {return hoursWorked * hourlyPayRate;}
}
public class pc6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        Payroll r = new Payroll();

        System.out.print("Please enter the employee's name: ");
        r.setEmployeeName(in.nextLine());
        System.out.print("Please enter the employee's hourly pay rate: ");
        r.setHourlyPayRate(in.nextDouble());
        System.out.print("Please enter the employee's ID number: ");
        r.setIdNumber(in.nextInt());
        System.out.print("Please enter the employee's hours worked: ");
        r.setHoursWorked(in.nextInt());
        System.out.println("$" + r.getGrossPay());

        in.close();
    }
}