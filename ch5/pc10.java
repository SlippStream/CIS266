//Nick Zimanski - CIS266
//4 October 2020

import java.util.Scanner;
class SavingsAccount {
    private double startingAmount;
    private double currentBalance;
    private double interestRate;
    public SavingsAccount(double interestRate, double startingAmount) {
        this.startingAmount=startingAmount;
        currentBalance=startingAmount;
        this.interestRate=interestRate;
    }
    public void withdraw(double amount) {
        currentBalance-=amount;
    }
    public void deposit(double amount) {
        currentBalance+=amount;
    }
    public void calcInterest() {
        currentBalance += currentBalance * (interestRate/12);
    } 
    public double getCurrentBalance() {return currentBalance;}  
}
public class pc10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double w, d, ir, sa;
        System.out.print("Please enter the annual interest rate: %");
        ir = in.nextDouble();
        System.out.print("Please enter your starting balance: $");
        sa = in.nextDouble();
        ir = ir/100;
        SavingsAccount savings = new SavingsAccount(ir, sa);
        for (int i=0;i<12;i++) {
            System.out.print("How much did you withdraw this month: $");
            w = in.nextDouble();
            savings.withdraw(w);
            System.out.print("How much did you deposit this month: $");
            d = in.nextDouble();
            savings.deposit(d);
            savings.calcInterest();
            System.out.println("Balance: $" + savings.getCurrentBalance());
        }
        
        in.close();
    }
}