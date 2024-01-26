package bai9.Student;

import BAI7.Student;

public class Students {
    private int studentId;
    private String studentName;
    private String studentClass;
    private String address;
    private float finalScore;

    public Students ( int StudentId, String StudentName, String StudentClass, String Address, float FinalScore){
        this.studentId= StudentId;
        this.studentName= StudentName;
        this.studentClass= StudentClass;
        this.address= Address;
        this.finalScore= FinalScore;


    }

    public void setStudentId(int StudentId) {
      studentId = StudentId;
    }

    public void setStudentName(String StudentName) {
        studentName = StudentName;
    }

    public void setStudentClass(String StudentClass) {
        studentClass = StudentClass;
    }

    public void setAddress(String Address) {
        address = Address;
    }

    public void setFinalScore(float FinalScore) {
        finalScore = FinalScore;
    }

    public int getStudentId() {
        return studentId;
    }


    public String getStudentName() {
        return studentName;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public String getAddress() {
        return address;
    }

    public float getFinalScore() {
        return finalScore;
    }

    public void displayStudentInfo(){
        StringBuilder result= new StringBuilder();
        result.append("Student Id :" ).append(this.studentId).append("\n")
                .append("StudentName:").append(this.studentName).append("\n")
                .append("StudentClass:").append(this.studentClass).append("\n")
                .append("Adress:").append(this.address).append("\n")
                .append("finalScore:").append(this.finalScore).append("\n");
        System.out.println(result);

    }

    public static void main(String[] args) {
//
//        mã sinh viên, tên sinh viên, lớp, địa chỉ, điểm thi cuối khóa.

//        Thêm sinh viên vào tập hợp.
//
//        -         Hiển thị danh sách sinh viên
//
//                -         Cập nhật lại thông tin sinh viên.
//
//        -         Xóa sinh viên khỏi tập hợp.
//
//                -         Tìm kiếm theo tên sinh viên.
//
//                -         Xóa Sinh viên theo index của nó trong tập hợp.

    }
}