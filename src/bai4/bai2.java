package bai4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
//        1 viet chuong tinh khoi tao mang so gom n phan tu khac nhau
//        2.viet chuong trinh hien thi ra phan tu trong mang
//      3.  chuong trinh hien thi ra dc phan tu co gia tri lon nhat va nho nhat va vi tri car phan tu do trong mang
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n :");
        int n = scanner.nextInt();
        int number[] = new int[n];
        for (int i = 0; i < number.length; i++) {
            System.out.println("number[" + i + "]");
            number[i] = scanner.nextInt();
        }
        for (int i = 0; i < number.length; i++) {
            System.out.println("number :" + number[i]);
            ;
        }
        int max = 0;
        int indexOfMax = 0;

        int min = number[0];
        int indexOfMin = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
                indexOfMax = i;

            }
            if (number[i] < min) {
                min = number[i];
                indexOfMin = i;
            }


        }  System.out.println("number max :" + max);
        System.out.println( " index of max : " + indexOfMax);


        System.out.println("number min :" + min);
        System.out.println( " index of min : " + indexOfMin);


    }
}
