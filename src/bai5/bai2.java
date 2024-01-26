package bai5;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
//        Viết phương thức tính diện tích, phương thức tính chu vi hình tròn của bán kính được nhập vào từ bàn phím.
//
//                - Input: r (bán kính hình tròn).
//
//                - Output: diện tích và chu vi hình tròn.
//
//                Kết quả được hiển thị lên console của IDE theo định dạng “Dien tich, chu vi hinh tron voi ban kinh <<r>> lan luot la: <<kết quả diện tích>>, <<kết quả chu vi>>.
        Scanner scanner = new Scanner(System.in);
        System.out.println("r :");
        int r= scanner.nextInt();
        bai2 main= new bai2();

        double chu = main.chuvi(r);

        System.out.println("chuvi:"+chu);

        double s= main.S(r);
        System.out.println(" s :" +s);

    }
    public double chuvi( int r){
        return r * 2 * Math.PI;
    }
    public double S(int r){
        return r*r*Math.PI;
    }
}
