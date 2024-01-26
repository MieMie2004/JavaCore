package bai3;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
//        viết chương trình nhập vào 1 số
//        nguyên rồi in ra màn hình tất cả các ước số của số đó
//         ước là số đó có thể chia hê cho nhưng số nào
        Scanner scanner = new Scanner(System.in);
        System.out.println( " enter Number :");
        int number= scanner.nextInt();
        for (int i= 1 ; i<= number ; i++ ){
            if (number % i ==0){
                System.out.println( "ước của : "+ number+ "là:" + i);
            }
        }
//         bài tập thêm : tìm bội của n nhập vào từ bàn phím với điều kiện
//        bội đó nhỏ hớn <1000 , tìm ra bội  s nhỏ nhất và bội số lớn nhất <1000



    }
}
