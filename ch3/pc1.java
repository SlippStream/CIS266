//Nick Zimanski - CIS266
//15 September 2020
import java.util.Scanner;
class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employee(final String n, final int i, final String d, final String p) {
        name = n;
        idNumber = i;
        department = d;
        position = p;
    }

    void setName(final String n) {
        name = n;
    }

    String getName() {
        return name;
    }

    void setIdNumber(final int n) {
        idNumber = n;
    }

    int getIdNumber() {
        return idNumber;
    }

    void setDepartment(final String n) {
        department = n;
    }

    String getDepartment() {
        return department;
    }

    void setPosition(final String n) {
        position = n;
    }

    String getPosition() {
        return position;
    }
}

public class pc1 {
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        Employee e[] = { new Employee("Susan Meyers", 47899, "Accounting", "Vice President"),
                        new Employee("Mark Jones", 39119, "IT", "Programmer"),
                        new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer")};
        
        in.close();
    }
}