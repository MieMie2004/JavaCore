package bai4;

import java.util.Arrays;
import java.util.Scanner;

public class bài5 {
    public static void main(String[] args) {
//        Viết chương trình thực hiện các công việc như sau :
//        a. Nhập một mảng a gồm n phần tử kiểu nguyên int
//
//        b. Tính tổng số dương lẻ mảng a
//
//        c. Nhập phần tử k, tìm xem k có xuất hiện trong mảng a không. Nếu có chỉ ra phần tử ở vị trí đầu tiên
//
//        d. Sắp sếp mảng a theo thứ tự tăng dần..
//
//        e. Chèn phần tử p vào mảng a sao cho mảng a vẫn đảm bảo tăng dần và xuất lại mảng

        Scanner scanner= new Scanner(System.in);

        System.out.println("enter n" );
        int n = scanner.nextInt();

        int number[] = new int[n];
        int total = 0;
        System.out.println("Enter the elements of the array: ");
        for ( int i =0 ; i<n ; i++){
            System.out.println( "number["+i+ "]");
            number[i]= scanner.nextInt();
        }
//        total so le :
        for (int i=0 ; i< number.length; i++){
            System.out.println("a :" + number[i]);
        }
        for (int i=0 ; i< number.length; i++){
        if ( number[i]>0 &&number[i]%2  !=0)
        {
            total += number[i];
            System.out.println("total :" +total);}
        }
//        int check = -1;
        System.out.println("k :");
        int k = scanner.nextInt();
//        for (int i=0 ; i!=check; i< number.length; i++){
//            System.out.println(number[i]==k ? "yes" : "no");
        int check = -1;
        for (int i = 0; i < n; i++) {
            if (number[i] == k) {
                check = i;
                break;
            }
        }
        if (check != -1) {
            System.out.println(k + " is found at index " + check);
        } else {
            System.out.println(k + " is not found in the array");
        }

        // Sắp xếp mảng a theo thứ tự tăng dần
        Arrays.sort(number);
        System.out.println("Sorted array: " + Arrays.toString(number));

        // Chèn phần tử p vào mảng a sao cho mảng a vẫn đảm bảo tăng dần và xuất lại mảng
        System.out.print("Enter a number to insert: ");
        int p = scanner.nextInt();
        int[] newArray = new int[n + 1];
        int i = 0;
        while (i < n && number[i] < p) {
            newArray[i] = number[i];
            i++;
        }
        newArray[i] = p;
        while (i < n) {
            newArray[i + 1] = number[i];
            i++;
        }
        System.out.println("Array after inserting " + p + ": " + Arrays.toString(newArray));

        }




}
