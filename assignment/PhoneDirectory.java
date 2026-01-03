import java.util.HashMap;
import java.util.Scanner;
public class PhoneDirectory {
    public static void main(String[] args) {
        HashMap<String, String> directory = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Phone Directory ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone = sc.nextLine();
                    directory.put(name, phone);
                    System.out.println("Contact added successfully.");
                    break;
                case 2:
                    System.out.print("Enter name to search: ");
                    String searchName = sc.nextLine();
                    if (directory.containsKey(searchName)) {
                        System.out.println("Phone Number: " + directory.get(searchName));
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);
        sc.close();
    }
}