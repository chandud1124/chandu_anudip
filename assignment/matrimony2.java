package assignment;
import java.util.Scanner;

public class matrimony {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Gender:");
        System.out.println("1. Male");
        System.out.println("2. Female");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        switch (choice) {
            case 1:  // Male
                if (age >= 21)
                    System.out.println("Eligible for marriage");
                else
                    System.out.println("Not eligible for marriage");
                break;

            case 2:  // Female
                if (age >= 18)
                    System.out.println("Eligible for marriage");
                else
                    System.out.println("Not eligible for marriage");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}