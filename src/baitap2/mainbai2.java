package baitap2;

public class mainbai2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        if (a < b) {
            System.out.println("a<b : success");
        } else {
            System.out.println("a> b :false");
        }
        if (a > b || a == 2) {
            System.out.println("a>b || a== 1: isTrue");
        } else if (a<b && b == 10) {
            System.out.println("a<b && b =10 isTrue");

        }
//  switch- care
//        khong sd cho truonghop so sanh <>>=<=
//        no chi sd cho ss hoac phu dinh lai

        String name = "Admin";
        switch (name){
            case "admin1 " :{
                System.out.println("admin1 is True ");
                break;}
            case "admin": {
                System.out.println("admin is True ");
                break;
            }
            case "admin2" : {
                System.out.println("admin2 is True");
                break;
            }
            default: {
                System.out.println("default");
            }

        }
//        toan tu b3 ngoi
        int number1= 1;
        int  number2 = 20;
        int number3 = 54;
        if (number1 < number2) {
            System.out.println("true");
        }else {
            System.out.println("false"); }
        System.out.println(number1<number2 ? (number1<number3 ? "true":"false") : "isTrue" );
        }

}
