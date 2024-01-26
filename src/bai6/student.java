package bai6;

import java.util.Date;

public class student {
    private int studentId;
    private String studentName;
//    private boolean gender;
    private String address;
    public  String adress2;
    protected String adress3;
    String adress4;
//    private Date date;

    public void  setStudentId(int valuestudentId){
        studentId=valuestudentId;
    }
    public void setStudentName(String  valuestudentName){
        studentName = valuestudentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}
