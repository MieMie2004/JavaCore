import java.sql.SQLOutput;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//dât type : int , float, boorlean , string, char, date , array , object...
//        nguyen thuy - doi tuong
        int number =10;
        Integer number2 = 20;
        System.out.println ( "number :"+ number + ", number2: "+number2);

        float float1 = 20.2f;
        Float float2 = 20.3f;
      System.out.println("float 1 :" + float1 + ",float2 :" + float2);

        double double1 = 30.2;
        Double double2 = 30.3;
        System.out.println( "double1 :" + double1 + ",double2 :" + double2);

        String studentName = " Nguyen Van A";
        System.out.println( " studentName :" + studentName);

        boolean isTrue = true;
        boolean isFalse = false;
        boolean isTrue1 = true;
        System.out.println("isTrue : " +isTrue + ", isFalse: " + isFalse + " , isTrue1 :" +isTrue1);

//        char char1 = "B ";
//        Character char2 = "C";

        Date date= new Date();
        System.out.println("date :" +date);
        int  a = 10;
        int b = 3;
//        toan tu so hoc
        System.out.println( a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        a = a+1 ;
        System.out.println( " a:" +a);

        a++;
        System.out.println("a after a++ :" +a);

        int c = 20;
        System.out.println("++c : " +(++c));
//        c=c+1
        System.out.println("c++ :" +(c++));
//        c=c+1
        System.out.println( "c: "+ c);

        int d = 49;
        System.out.println("d--: " +(d--));
        System.out.println(("--d :" +(--d) ));
        System.out.println("d :" +d);
//        toan tu so sanh
        a= 24;
        b =33;
        c= 24;
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=c);
        System.out.println(a<=c);
        System.out.println(a==c);
        System.out.println(a!=c);
//        toan tu logic
        if (a==c && b>=33){
            System.out.println("isTrue");
        }else {
            System.out.println("isFalse");
        }
        if (a < 24 || b == 33){
            System.out.println("isTrue");
        }else  {
            System.out.println("isFalse");
        }
//
//
//



    }
}
