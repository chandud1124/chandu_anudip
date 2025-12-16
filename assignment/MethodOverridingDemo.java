
import java.util.Scanner;

class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}


class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Dog {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}


public class MethodOverridingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Animal, 2 for Dog, 3 for Cat:");
        int choice = sc.nextInt();

        Animal animal;
        if (choice == 1) {
            animal = new Animal();
        } else if (choice == 2) {
            animal = new Dog();
        } else if (choice == 3) {
            animal = new Cat();
        } else {
            System.out.println("Invalid choice");
            return;
        }

        animal.makeSound();
    }
}