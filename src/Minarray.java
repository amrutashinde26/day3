package day3program;

public class Minarray {
    public static void main(String args[]){
        int min = 0 ;
        int[] a = {6 , -5, -2 ,9 , 6, 3};
        for(int i = 0; i < a.length ; i++){
            if(a[i]< min){
                min = a[i];
            }
            if(min == 0){
                System.out.println(min);
                break;
            }
        }
        System.out.println(min);
    }
}
  