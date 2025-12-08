package assignment;
import java .util.Scanner;

public class matrimony {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter gender (male/female): ");
        String gender = sc.next().toLowerCase();
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if ((gender.equals("male") && age >= 21) || (gender.equals("female") && age >= 18)) {
            System.out.println("Eligible for marriage");
        } else {
            System.out.println("Not eligible for marriage");
        }
    }
}    
