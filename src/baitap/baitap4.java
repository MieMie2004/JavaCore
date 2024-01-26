package baitap;

import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println( "number :");
        int number1 = number.nextInt();
        System.out.println( "number :");
        int  number2 = number.nextInt();
        System.out.println( number1 == number2 );
        System.out.println(number1 != number2);
        System.out.println(number1 > number2);
        System.out.println(number1 < number2);
        System.out.println(number1 <= number2);
        System.out.println(number1 >=number2);

    }
}
