
//Nick Zimanski - CIS266
//5 October 2020
import java.io.*;
import java.util.Scanner;
class FileDisplay {
    private File file;
    private Scanner scanner;
    public FileDisplay(String fileName) {
        this.file = new File(fileName);
        try{
        scanner = new Scanner(file);
        } catch(FileNotFoundException e) {System.err.println(e);}
    }
    
    public void displayHead() {
        int k = 1;
        while (scanner.hasNextLine() && k <= 5) {
            System.out.println(scanner.nextLine());
            k++;
        }
        scanner.close();
    }

    public void displayContents() {
        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    public void displayWithLaneNumbers() {
        int k = 1;
        while (scanner.hasNextLine()) {
            System.out.println(k + " " + scanner.nextLine());
            k++;
        }
        scanner.close();
    }
}
public class pc14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        in.close();
    }
}