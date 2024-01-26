package bai4;

public class mainbai4 {
    public static void main(String[] args) {
        int numbers[] = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        for (int i = 0 ; i < numbers.length; i++) {
            System.out.println("i:"  +numbers[i]);
        }
//       cach 2
        String numbers2[] = { "apple", "samsung", "apple1","samsung1", "apple2", "samsung2"};
        for (int i =0 ; i <numbers.length; i++) {
            System.out.println("number :" + numbers2[i]);
        }

    }
}
