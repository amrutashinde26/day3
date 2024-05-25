package day3program;

import java.util.Scanner;



public class Printelement
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array:");
        n = sc.nextInt();
        int[] a = new int[n]; // Adjust the array size based on user input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Elements of the array:");
        for (int i = 0; i < n; i++)
        {
            System.out.println(a[i]);
        }
    }
}


