package bai3;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("number :");
        int number = scanner.nextInt();
        int a = 1;

        for (int i = 1; i <= number; i++) {
            a *= i;

        }   System.out.println("giai thừa :" + a);
    }


    }

