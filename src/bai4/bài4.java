package bai4;

import java.util.Scanner;

public class bài4 {
    public static void main(String[] args) {
//        Chương trình cho phép người dùng nhập giá trị cho các phần tử trong 2 mảng số nguyên cho trước
//         Mảng số nguyên thứ 3 được khai báo có kích thước bằng tổng kích thước của 2 mảng số nguyên đã cho.
//         Viết chương trình gộp giá trị của 2 mảng đã cho vào mảng thứ 3

        Scanner scanner =  new Scanner(System.in);
        System.out.println( " enter n :"); int n = scanner.nextInt();
        System.out.println( " enter a :");int a = scanner.nextInt();

        int number1[] = new int[n];
        System.out.println("Array number 1");
        for (int i = 0 ; i < number1.length; i++){
            System.out.println("number["+i+ "]");
            number1[i] = scanner.nextInt();
        }
        System.out.println("array of number ");
        for (int i = 0 ; i < number1.length; i++){
            System.out.println("number :" + number1[i] );

        }


        int number2[] = new int[a];
        System.out.println("Array number 2");
        for (int i = 0 ; i < number2.length; i++){
            System.out.println("number["+i+ "]");
            number2[i] = scanner.nextInt();
        }        System.out.println("array of number 2");


        for (int i = 0 ; i < number2.length; i++) {
            System.out.println("number :" + number2[i]);
        }


            int length1 = number1.length;
            int length2 = number2.length;



            int  number3[] = new int[length1+length2];
            for (int i= 0 ;i < length1; i++) {
                number3[i] = number1[i];

            }
            for ( int i = 0 ; i < length2; i++){
                number3[length1+i]= number2[i];
            }


        System.out.println("array of number3 ");

        for (int i = 0 ; i <number3.length ; i++ ){
            System.out.println("number["+i+ "]" + number3[i]);
        }


        }
}
