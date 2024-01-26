package baitap;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println( "Enter You Birthday :" );
        int birthDay = scanner.nextInt();

        Calendar calendar= Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);

        System.out.println( "year : "+currentYear);

        System.out.println("birthDay : " + birthDay);
        System.out.println("yourBirthday : " +( currentYear - birthDay) );
    }
}
