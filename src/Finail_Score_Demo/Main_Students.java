package Finail_Score_Demo;

import Bai12.UseException;
import bai9.Student.Students;

import java.io.StringReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main_Students {
    public static void main(String[] args) {

//
//
//        System.out.println("Student FirstName");
//        String StudentFirstName = scanner.nextLine();
//        System.out.println("Student LastName");
//        String StudentLastName = scanner.nextLine();
//
        System.out.println("-------------------");
        List<Student> Students= new ArrayList<>();
        Scanner scanner= new Scanner(System.in);

        for (int i= 0; i<2;i++){
            int studentId;
            boolean duplicateStudentId = true;
            do {
                System.out.println("show StudentID");
                studentId= scanner.nextInt();
                try{
                    for (Student item: Students){
                        if (item.getStudentId()== studentId){
                            throw new UseException("StudentId cannot duplicate");
                        }

                    }duplicateStudentId= false;
                }catch (UseException ex){
                    System.out.println(ex.getMessage());
                }
            }while (duplicateStudentId);
            scanner.nextLine();
            System.out.println("StudentID:"+studentId);

            String gender = "";
            boolean validationGender = true;
            do {
                System.out.print("gender: ");
                gender = scanner.nextLine();
                try {
                    if (!gender.equals("male") && !gender.equals("female")) {
                        throw new UseException("Gender not validation");
                    }
                    validationGender = false;
                } catch (UseException ex) {
                    System.out.println(ex.getMessage());
                }
            } while (validationGender);
            System.out.println("gender: " + gender);

            Date birthday = null;
            boolean valitionBirthDay = true;
            SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
            do {
                System.out.println("birthday :");
                String StudentBirthday = scanner.nextLine();

                try{
                    birthday = format.parse(StudentBirthday);
                    if (birthday.after(new Date())){
                        throw new UseException("Birthday not validation");
                    }
                    valitionBirthDay = false;
                }catch (UseException ex){
                    System.out.println(ex.getMessage());
                }catch (ParseException ex){
                    System.out.println(ex.getMessage());
                }
            }while (valitionBirthDay);
            System.out.println("birthday:" +birthday);

            System.out.println("FinalScore:");
            float FinalScore= scanner.nextFloat();

            System.out.println("practiceScore");
            Float practiceScore = scanner.nextFloat();
            boolean valitionScore = true;

            do {
                try {
                    if (FinalScore<0 && FinalScore>=10) {
                        throw new UseException("FinalScore<0 && FinalScore>=10" );
                    }valitionScore =false;

                }catch (UseException ex){
                    System.out.println(ex.getMessage());
                }catch (InputMismatchException ex){
                    System.out.println(ex.getMessage());
                }catch (NullPointerException ex){
                    System.out.println(ex.getMessage());
                }
            }while (valitionScore);
            System.out.println("FinalScore :"+FinalScore);
            do {
                try {
                    if (practiceScore<0 && practiceScore>=10){
                        throw new UseException( " practiceScore<0&& practiceScore>=10");

                    }valitionScore= false;
                }catch (UseException ex){
                    System.out.println(ex.getMessage());
                }catch (InputMismatchException ex){
                    System.out.println(ex.getMessage());
                }catch (NullPointerException ex){
                    System.out.println(ex.getMessage());
                }
            }while (valitionScore);
            System.out.println("practiceScore"+practiceScore);

            String studentLastName =null;
            boolean validiationstudentLastName = true;
            do {
                try {
                    System.out.println("student Last Name: ");
                    studentLastName = scanner.nextLine();
                    if (studentLastName.isBlank()) {
                        ; //isBlank là trống : không co ky tu nao
                        throw new UseException("student last name cannot blank");
                    }

                    validiationstudentLastName = false;

                } catch (UseException ex) {
                    System.out.println(ex.getMessage());
                }
            }while (validiationstudentLastName) ;

            String studentFirstName = null;
            boolean validiationstudentFirstName = true;
            do {
                try {
                    System.out.println("student First Name: ");
                    studentFirstName = scanner.nextLine();
                    if (studentFirstName.isBlank()) {
                        ; //isBlank là trống : không co ky tu nao
                        throw new UseException("student last name cannot blank");
                    }
                    validiationstudentFirstName = false;
                } catch (UseException ex) {
                    System.out.println(ex.getMessage());
                }
            }while (validiationstudentFirstName) ;


            Student students = new Student();
            students.setStudentId(studentId);
            students.setAddress("");
            students.setGender(gender);
            students.setStudentFirstName(studentFirstName);
            students.setStudentLastName(studentLastName);
            students.setPracticeScore(practiceScore);
            students.setFinalScore(FinalScore);
            students.setBirthday(birthday);
            Students.add(students);
        }
        //        //show
        Students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                String studentNameO1 = o1.getStudentFirstName();
                String studentNameO2 = o2.getStudentFirstName();

                if (studentNameO1.equals(studentNameO2)) {
                    String lastNameO1 = o1.getStudentLastName();
                    String lastNameO2 = o2.getStudentLastName();

                    //1: o1 > 02
                    //-1: o1 < 02
                    //0: o1 == o2
                    return lastNameO1.compareTo(lastNameO2);
                } else {
                    return studentNameO1.compareTo(studentNameO2);
                }
            }
        });
        System.out.println("------Display Student infor ---------");
        for (Student students :Students){
            students.displayinfor();
        }

//        3.
        System.out.print("enter higher avg score: ");
        float higherAvgScore = scanner.nextFloat();
        for (Student student : Students) {
            if (student.getAvgScore() >= higherAvgScore) {
                student.displayinfor();
            }
        }

        System.out.print("enter less than avg score: ");
        float lessThanAvgScore = scanner.nextFloat();
        for (Student student : Students) {
            if (student.getAvgScore() <= lessThanAvgScore) {
                student.displayinfor();
            }
        }

//        System.out.println("--LIST OF STUDENT SORT BY AVG SCORE DESCENDING");
        Students.sort(Comparator.comparingDouble(Student::getAvgScore).reversed());
        for (Student student : Students) {
            if (student.getAvgScore() >= higherAvgScore) {
                student.displayinfor();
            }
        }
//        4 .hs bất thường:
//        + Có DiemCuoiKhoa hoặc DiemThucTap <= 5 điểm
////
////	+ DiemCuoiKhoa và DiemThucTap chênh nhau >= 3 điểm
////
////	+ DiemTB <= 6.5 điểm
        System.out.println("học sinh cá biệt :");
        for (Student student : Students) {
            if (student.getAvgScore() >= 6.5) {
                student.displayinfor();
            }else if (student.getFinalScore()>5||student.getPracticeScore()>5){
                student.displayinfor();
            }else if (Math.abs((student.getFinalScore())-(student.getPracticeScore()))>=3){
                student.displayinfor();
            }
        }

    }
}