package day3program;
import java.util.Scanner;

public class Oddposition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] c = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
        {
            c[i] = sc.nextInt();
        }

        System.out.println("The odd elements and their positions in the array are:");
        for (int i = 0; i < n; i++) {
            if (c[i] % 2 != 0) {
                System.out.println("Element at position " + i + ": " + c[i]);
            }
        }
    }
}
