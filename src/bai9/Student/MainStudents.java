package bai9.Student;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainStudents {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
//        stdentclass A01, A02
        Students student1 = new Students(1, " Nguyen Van A", " A01", "HCM", 54);
        Students students1 = new Students(5, "Tran thi B", "A02", "HCM", 80);
        Students students2 = new Students(4, " Pham Van D", "A02 ", " HN", 89);
        Students students3 = new Students(7, "Dang thi D", "A01 ", " DN ", 77);
        Students students4 = new Students(8, "Pham H", "A01", "DN", 99);


// Add student
        students.add(student1);
        students.add(students1);
        students.add(students2);
        students.add(students3);
        students.add(students4);

//        show student
        System.out.println("-----Student Info-----");

        for (Students student : students) {
            student.displayStudentInfo();
        }
//        3. update studentId =4
        for (Students student : students) {
            if (student.getStudentId() == 4) {
                student.setStudentName(" Pham Van D Update");
                student.setStudentClass("A01");
                student.setAddress("HN");
                student.setFinalScore(66);
                break;
            }
        }
        System.out.println("----Student after update StudentId=4---");
        for (Students student : students) {
            student.displayStudentInfo();
        }

//        update studentid=5
        for (Students student : students) {
            if (student.getStudentId() == 5) {
                Students studentUpdate = new Students(5, "Tran Thi B Update", "A01", "HCM", 77);
                int lastIndexOf = students.lastIndexOf(student);
                students.set(lastIndexOf, studentUpdate);
                break;
            }
        }

        System.out.println("---Student after update StudentId= 5---");
        for (Students studentUpdate : students) {
            studentUpdate.displayStudentInfo();

        }

//        4. remove Student= 7
        for (Students student :students){
            if (student.getStudentId()==7){
                int IndexOf= students.indexOf(student);
                students.remove(IndexOf);
                break;
            }
        }
        System.out.println("---student after remove---");
        for (Students student : students) {
            student.displayStudentInfo();

        }

//        tìm kím theo ten sv

        String studentName= "Nguyen Van A";
        Students studentExist = null;

        for (Students student :students) {
            if (student.getStudentName().equals(studentName)){
            studentExist= student;
              break;
            }
        }
        System.out.println("---infomation of  Student "+ studentName+ "-------");
        if (studentExist !=null){
            studentExist.displayStudentInfo();
        }else {
            System.out.println("studentName:"+studentName+"not exist in student list");
        }








    }
}