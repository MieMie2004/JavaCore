package bai3;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("number :");
        int number = scanner.nextInt();

        while (number>0){

            System.out.println("valid number:"+ number);
             number = scanner.nextInt();
        }
        System.out.println( "invalid number :" + number);


    }
}
