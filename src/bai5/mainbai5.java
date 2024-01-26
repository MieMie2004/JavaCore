package bai5;

public class mainbai5 {
    public int sum(int a, int b){
        return a+b;
    }
    public boolean check(int a, int b){
        if ( a>b){
            return true;
        }return false;

    }
    public  void  print( int a, int b){
        System.out.println("a:"+a+"b:"+b);
    }
    public static  int tich(int a, int b){
        return a*b ;
    }

    public static void main(String[] args) {
//       cần khởi tạo đối tượng
        mainbai5 main = new mainbai5();
        int result = main.sum( 5 ,  6);
        System.out.println("result:" +result);

        boolean check= main.check(10,  11 );
        System.out.println("check:"+check);

//        khong can khoi tao doi tuong
        int tich= mainbai5.tich(5,6);
        System.out.println("tich :"+ tich);
    }

}
