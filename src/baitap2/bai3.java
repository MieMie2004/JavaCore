package baitap2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner kWh= new Scanner(System.in);

        System.out.println("kWh:");
        int kWh1 = kWh.nextInt();
        if (kWh1>=0 && kWh1<=50 ){
            System.out.println( kWh1 * 1.678 );
        } else  if (kWh1>=51 && kWh1<=100 ){
            System.out.println( kWh1 * 1.734 );
        }  else  if (kWh1>=101 && kWh1<=200 ){
            System.out.println( kWh1 * 2.014 );
        } else  if (kWh1>=201 && kWh1<=300 ){
            System.out.println( kWh1 * 2.536);
        } else  if (kWh1>=301 && kWh1<=400 ){
            System.out.println( kWh1 * 2.834 );
        } else  if (kWh1>=401 ){
            System.out.println( kWh1 * 2.927 );
        }

    }
}
