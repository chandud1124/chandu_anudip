import java.util.Scanner;
public class number {
    public static void main(String[] args)
    {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter a number");
        int num = Scanner.nextInt();
        if (num >= 0)
        {
            System.out.println("The number is Positive");
        }
        else
        {
            System.out.println("The number is Negative");
        }
    }
}
        