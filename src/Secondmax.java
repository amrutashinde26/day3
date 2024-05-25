package day3program;

import java.util.Scanner;

public class Secondmax
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter The size of the element ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println(" Enter the element ");
        for (int i = 0 ; i< n; i++)
        {
            a[i] = sc.nextInt();
        }
      System.out.println("Print the Array ");
        for(int i = 0;i<n ; i++)
        {
            System.out.println(a[i]);
        }
      //  System.out.println("find max ");
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for(int i= 0 ; i < n; i++)
        {
            if(a[i]> max)
            {
                secondmax = max ;
                max = a[i];
            }
            else if (a[i] > secondmax && secondmax != max)
            {
                secondmax = a[i];
            }
        }
        if(secondmax == max)
        {
            System.out.println("There is no Second Max element In The Array");
        }
        else
        {
            System.out.println("The Second Max Element Is " + secondmax);
        }
    }
}
