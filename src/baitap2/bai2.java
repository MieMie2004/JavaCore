package baitap2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("cạnh 1:");
        int number1 = number.nextInt();
        System.out.println("cạnh 2 :");
        int number2 = number.nextInt();
        System.out.println(" cạnh 3:");
        int number3 = number.nextInt();

        System.out.println("tam giac :");
         if (number1 >0 & number2>0 & number3 >0) {
//             System.out.println("true");
         } else if (number1 ==0 & number2 ==0 & number3==0 ) {
//             System.out.println("false");
         }
     System.out.println((number1+number2)>=number3? "yes" : "no");


    };


//        System.out.println((number1+number3)> number2 ? "yes" :"no" );
////        System.out.println((number3+number2)>number1? "yes " : "no");
//        boolean dk1 = number1 >0 & number2>0 & number3 >0;
//        boolean dk2 = (number1 + number2 > number3) || (number1 + number3 > number2) || (number2+number3>number1);
//        boolean dkFinal = dk1 & dk2;
//        System.out.println("La tam giac: "+dkFinal);

//    }
}
