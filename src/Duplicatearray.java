package day3program;

import java.util.Scanner;

public class Duplicatearray {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of Array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the element : " );
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("print the elements : " );
        for (int i = 0; i < n; i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("The duplicate elements are : ");
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (a[i] == a[j])
                {
                    System.out.println(a[i]);
                    break;
                }
            }
        }

    }
}
