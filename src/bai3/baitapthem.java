package bai3;

import java.util.Scanner;

public class baitapthem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "number :");
        int number= scanner.nextInt();
        int boinhonhat = 1;
        int boilonnhat = 1;
        for (int i  = 1 ; i  <1000 ; i++){
            if ( i % number == 0 ){
                System.out.println("bội của number :" +number + ": " + i ) ;
                if (boilonnhat <1000);{
                    System.out.println("bội Lớn nhất : " + number + ":" );
                }
            }
        }

    }
}
