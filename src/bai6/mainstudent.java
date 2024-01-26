package bai6;

public class mainstudent {
    public static void main(String[] args) {
        student studentdemo = new student();
        studentdemo.setStudentId(100);
        studentdemo.setStudentName("Nguyen Van A");

        int studentId= studentdemo.getStudentId();
        String studentName = studentdemo.getStudentName();
        System.out.println("studentId :" + studentId);
        System.out.println("studentName :" + studentName);

        student student2= new student();
        student2.setStudentId(101);
        student2.setStudentName("nguyen thi b");

        int studentId2= student2.getStudentId();
        String studentName2 = student2.getStudentName();
        System.out.println("studentId :" + studentId2);
        System.out.println("studentName :" + studentName2);

        student student3 =  new student();
        student3.adress2= "hue";
        student3.adress3= "hanoi";
        student3.adress4= "HCM";

//        tinh dong goi trong lap trinh huong doi tuong
//        1. private --> chỉ có thể truy xuất trong class
//        2. ngoài las không thể truy xuất
//        3. public truy xuất mọi nơi
//        protected--> chỉ có thể truy xuất trực tiếp trong class hoặc class kế thừa, package
//        câu lênh kế thừa "extends"
//        4. default --> class , package

//        finnal là bieesn không th tay đổii được
//        ex: finnal int....


//        1. tính bao đóng
//        2. tính kế thừa
//       3. tính da hinh
//         4 . tinh trừu tượng
    }
}
