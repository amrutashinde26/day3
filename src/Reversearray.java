package day3program;

import java.util.Scanner;

/*public class Reversearray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the element int the array : ");
        for(int i = 0; i < n ; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("The Element of an array is : ");
        for (int i = 0 ; i < n ; i++){
            System.out.println(i + " " + a[i]);
        }

        System.out.println("The reversed of an array is : ");
        int t ;
        for(int i = 0 ; i < n/2  ; i++)
        {
            t = a[i];
            a[i]= a[n-i - 1];
            a[n - i-1 ] = a[i];
        }

        System.out.println("The reversed of an array is : ");

        for (int i = 0 ; i < n ; i++)
        {
            System.out.println(a[i]);
        }
    }
}
*/

import java.util.Scanner;

public class Reversearray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int[] a = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        // Display the original array
        System.out.println("The original array:");
        for (int i = 0; i < n; i++) {
            System.out.println( " " + a[i]);
        }

        // Reverse the array
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }

        // Display the reversed array
        System.out.println("The reversed array:");
        for (int i = 0; i < n; i++)
        {
            System.out.println(a[i]);
        }
    }
}

