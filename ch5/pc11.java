//Nick Zimanski - CIS266
import java.io.*;
import java.util.Scanner;
public class pc11 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(0.02, 500);
        Scanner read;
        try {
            File dFile = new File("ch5/Deposits.txt");
            read = new Scanner(dFile);
            while(read.hasNextLine()) {
                double date = read.nextDouble();
                savings.deposit(date);
            }
            read.close();
        } catch(FileNotFoundException e) {System.err.println(e);}
        try {
            File wFile = new File("ch5/Withdrawals.txt");
            read = new Scanner(wFile);
            while(read.hasNextLine()) {
                double date = read.nextDouble();
                savings.deposit(date);
            }
            read.close();
        } catch(FileNotFoundException e) {System.err.println(e);}
        System.out.println("$" + savings.getCurrentBalance());
    }
}