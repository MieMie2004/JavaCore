package Bai12;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
//        Viết một chương trình cho phép tạo ra một mảng 10 số nguyên ngẫu nhiên.
//        Cho phép người dùng nhập vào chỉ số của một phần tử và hiển thị giá trị của phần tử đó.
//
//
//                Sử dụng try-catch để hiển thị thông báo
//                nếu người dùng nhập vào chỉ số không hợp lệ (index < 0 hoặc index >= 100
        int[] numbers = new int[10];

        numbers[0] = 16;
        numbers[1] = 15;
        numbers[2] = 41;
        numbers[3] = 61;
        numbers[4] = 85;
        numbers[5] = 84;
        numbers[6] = 95;
        numbers[7] = 70;
        numbers[8] = 62;
        numbers[9] = 55;

        System.out.println("-----NumberCheck----");

        Scanner Numbercheck = new Scanner(System.in);
        System.out.println("index of number");
        int index = Numbercheck.nextInt();


        try {

            int value = numbers[index];
            System.out.println(value);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("error");
        }
    }
}
