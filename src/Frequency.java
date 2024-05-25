package day3program;

import java.util.Scanner;

public class Frequency {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Size of An Array");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter The Element");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Frequency of an array is :");
        for(int i = 0 ; i < n  ;i++)
        {
            int count = 1;
            for (int j = i + 1; j < n; j++)
            {
                if (arr[i] == arr[j])
                {
                    count++;
                }
            }
                boolean duplicate = false;
                for (int k = 0; k < i ; k++)
                {
                    if(arr[k] == arr[i])
                    {
                        duplicate = true;
                        break ;
                    }
                }
                if (!duplicate)
                {
                    System.out.println(arr[i] + " is present " + count + " times ");
                }
            }
        }
}
