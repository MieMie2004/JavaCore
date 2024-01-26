import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println( "a :");
        int a = number.nextInt();
        System.out.println( "b :");
        int b = number.nextInt();

        System.out.println( "  a > 5 và b < 0 : " + (a > 5 && b<0) );
        System.out.println( ". a <= b và b < 10:"+  (a<=b && b<10));
        System.out.println( " a < 10 hoặc b > 5:" +  ( a<10 || b >5) );
    }
}
