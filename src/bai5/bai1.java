package bai5;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
//        Viết phương thức trả về bình phương của một số được nhập vào từ bàn phím.
//
//        - Input: n (n là số bất kỳ).
//
//                - Output: bình phương của n.
//
//        Kết quả được hiển thị lên console của IDE theo định dạng “Binh phuong cua so <<n>> là: <<kết quả>>.
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        bai1 main = new bai1();

        double binhphuong = Math.pow(n,2);
        System.out.println("Binh phuong cua so" +n+ "là:"+binhphuong );


    }
}
