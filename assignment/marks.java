package assignment;
import java.util.Scanner;
public class marks {
    public static void main(String[] args) 
    {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter marks");
        int marks = Scanner.nextInt();
        if (marks >= 91)
        {
            System.out.println("1,Distinction");
        }
        else if (marks >= 80 && marks <= 90)
        {
            System.out.println("Distinction");
        }
        else if (marks >= 61 && marks <= 80)
        {
            System.out.println("First Class");
        }
        else if (marks >= 41 && marks <= 60)
        {
            System.out.println("Second Class");
        }
        else if (marks >= 35 && marks <= 40)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}