import java.util.Scanner;
public class pc17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name, city, college, job, animal, petName, age;
        System.out.print("Please enter your name: ");
        name = in.nextLine();
        System.out.print("Please enter your age: ");
        age = in.nextLine();
        System.out.print("Please enter a city: ");
        city = in.nextLine();
        System.out.print("Please enter a college: ");
        college = in.nextLine();
        System.out.print("Please enter a job: ");
        job = in.nextLine();
        System.out.print("Please enter your favorite animal: ");
        animal = in.nextLine();
        System.out.print("Please enter your pet's name: ");
        petName = in.nextLine();

        System.out.println("There once was a person named " + name + " who lived in " + city + ". At the age of " + age + ",\n" +name+" went to college at " + college +". " + name+" graduated and went to work as a\n" + job + ". Then, " + name+" adopted a(n) " +animal + " named " + petName +". They both lived\nhappily ever after!");
        in.close();
    }
}