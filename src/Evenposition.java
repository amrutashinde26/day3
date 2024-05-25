package day3program;

public class Evenposition {
    public static void main(String args[]){
        int[] a = { 5 , 2, 6, 9, 3, 7, 8};
        for(int i= 0 ; i < a. length ; i++){
            if(a[i] % 2 == 0 )
            {
                System.out.println(a[i]);
            }
        }
    }
}
