package BAI7;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Comparator;

public class MainTeacher  {
    public static void main(String[] args) {


        Teacher teacher= new Teacher(" Nguyen Dac Nhan ", 32, "Da Nang", 1000);
        Teacher teacher1= new Teacher("Tran Van B",35 , " Ha Noi" , 2000);
        Teacher teacher2= new Teacher(" Pham Thi C", 55, "HCM",1300);
        Teacher teacher3= new Teacher(" Hoang D", 44,"can tho", 500);
        Teacher teacher4= new Teacher("Dang G", 35, "Ca Mau ", 555);

        Teacher[] teachers= new Teacher[5];
        teachers[0]= teacher;
        teachers[1]= teacher1;
        teachers[2]=teacher2;
        teachers[3]= teacher3;
        teachers[4]= teacher4;

        Student student= new Student("Hoang Thi B", 15 ," Da Nang", 8.5);
        Student student1= new Student("Tran Van D", 14, "Da Nang",6.5 );
        Student student2= new Student( " Nguyen thi A", 18 ,"HCM", 7.7);
        Student student3= new Student( " Bach D", 15, "Can Tho", 8.8);
        Student student4 = new Student("Pham van D", 16, " Ha Noi ", 6.6);

        Student[] students= new Student[5];
        students[0]= student;
        students[1]= student1;
        students[2]= student2;
        students[3]= student3;
        students[4]= student4;
        for (Teacher item : teachers){
            System.out.println("---------------show Teacher-------------");
            System.out.println(item.display());
        }
        for (Student profile : students){
            System.out.println("--------Show Student---------");
            System.out.println(profile.display());
        }
//        d.
        System.out.println(" ------Top 3 Teacher have higher salary :------");
        Arrays.sort(teachers, Comparator.comparingInt(Teacher::getSalary).reversed());
        Teacher[] higherSalary= new Teacher[3];
        for ( int i = 0; i < teachers.length; i++){
            if (i==3){
                break;
            }
            higherSalary[i]= teachers[i];
        }
        for (Teacher itemTeacher : higherSalary){
            System.out.println( itemTeacher.display());

        }
//        e.
        System.out.println("--------------Top 3 Student have the Age is less---------");
        Arrays.sort(students, Comparator.comparingInt(Student::getAge).reversed());
        Student[] lessAgeStudent= new  Student[3];
        for ( int i = 0 ; i < students.length; i++){
            if (i==3){
                break;
            }
           lessAgeStudent[i]= students[i];

        }for (Student profile : lessAgeStudent ){
            System.out.println(profile.display());
        }









    }


}
