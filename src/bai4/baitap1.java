package bai4;

import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n: ");
        int n =scanner.nextInt();
        int number[] = new int[n];
        for ( int i =0 ; i<n ; i++){
            System.out.println( "number["+i+ "]");
            number[i]= scanner.nextInt();
        }
       int count = 0;

        for (int i=0 ; i< number.length; i++){
            if (number[i] >=10 ){

            System.out.println("number >=10 :" + number[i]);
            count++;

            }

        }  System.out.println("count number :" +count);
        
    }
}
