package bai3;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("number :");
         int a=0;
         for (int i=1 ; i<100 ; i++){
             if (i%3 ==0 || i%7==0 ){
                 System.out.println("số có thể  chia hêt cho 3 vaf 7 :"  + a);
                 a++;
             }
         }



    }
}
