package baitap;

import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("number :" );
         int number2 = number.nextInt();
       System.out.println("number :");

         int number1 = number.nextInt();

        System.out.println("total :" + (number2+number1) );
        System.out.println("hieu :" +(number2-number1));
        System.out.println("tich :" + (number2* number1));
        System.out.println("/:" + (number2/number1));
        System.out.println("%" + ( number2%number1));
    }
}
