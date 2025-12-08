package assignment;
import java.util.Scanner;

public class Array3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][][] = new int[2][2][5];

        for (int branch = 0; branch < 2; branch++) {
            for (int batch = 0; batch < 2; batch++) {
                for (int student = 0; student < 5; student++) {
                    System.out.println("enter marks of student from branch " + branch + " batch " + batch + " student " + student);
                    arr[branch][batch][student] = sc.nextInt();
                }
            }
        }

        for (int branch = 0; branch < 2; branch++) {
            System.out.println("branch " + branch + ":");
            for (int batch = 0; batch < 2; batch++) {
                System.out.println("  batch " + batch + ":");
                for (int student = 0; student < 5; student++) {
                    System.out.println("    marks of student " + student + " is " + arr[branch][batch][student]);
                }
            }
        }
    }
}