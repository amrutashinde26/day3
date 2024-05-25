package day3program;

public class Maxarray {
    public static void main(String args[]) {
        int[] a = {5, -7, -2, 9, 3, 7};
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];

                if (max == 9) {
                    System.out.println(max);
                    break;

                }
            }
        }
           /* if(max  == 9 ){
                System.out.println(max);
                break;

            }*/


        System.out.println(max);
    }

}