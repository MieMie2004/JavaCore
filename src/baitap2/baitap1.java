package baitap2;

import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("a");
        int a = number.nextInt();
        System.out.println("b");
        int b= number.nextInt();

        System.out.println(a%b==0 ? "yes": "no");
    }
}
