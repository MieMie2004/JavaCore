package Bai12;

public class MainException {
    public static void main(String[] args) {
        int number=11;
        try{
            System.out.println(10/2);
        }catch (NumberFormatException exception){
            System.out.println("error");
        }catch (ArithmeticException e){
            System.out.println("error");
        }finally {
            System.out.println("finally");
        }
        System.out.println("abc");


        int age = 9;
        try{
            if (age<10){
                throw new UseException("khong du tuoi");
            }
            System.out.println("welcome to website");
        }catch (UseException useException){
            System.out.println(useException.getMessage());
        }
    }

}
