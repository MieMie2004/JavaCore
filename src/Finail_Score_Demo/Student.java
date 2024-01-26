package Finail_Score_Demo;

import bai9.Student.Students;

import java.util.Date;

public class Student {
//    Một trường học cần 1 chương trình quản lý sinh viên:
//
//        - Mỗi sinh viên sẽ có các thông tin sau nhập từ bàn phím:
//
//        + MaSV: mã sinh viên
//
//	+ Ho: họ của sinh vien
//
//	+ Ten: tên của sinh viên
//
//	+ GioiTinh: giới tính của sinh viên (Nam/Nữ)
//
//	+ NgaySinh: ngày sinh của sinh viên
//
//	+ DiaChi: địa chỉ của sinh viên
//
//	+ DiemCuoiKhoa: điểm cuối khóa của sinh viên
//
//	+ DiemThucTap: điểm đạt được trong quá trình thực tập của sinh viên
//
//	+ DiemTB: điểm trung bình, được tính bằng (DiemCuoiKhoa * 2 + DiemThucTap)/3
    private int studentId;
    private String studentFirstName;
    private String studentLastName;
    private String Gender;
    private Date birthday;
    private String  Address;
    private float finalScore;
    private float practiceScore;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getAddress() {
        return Address;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getGender() {
        return Gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setFinalScore(float finalScore) {
        this.finalScore = finalScore;
    }

    public float getFinalScore() {
        return finalScore;
    }

    public void setPracticeScore(float practiceScore) {
        this.practiceScore = practiceScore;
    }

    public float getPracticeScore() {
        return practiceScore;
    }

    public  float getAvgScore(){
        return (this.finalScore*2+this.practiceScore)/3;
    }

    public void displayinfor() {
        StringBuilder result= new StringBuilder();
        result.append("Student Id :" ).append(this.studentId).append("\n")
                .append("StudentName:").append(this.studentLastName).append("\n")
                .append("StudentFirstName:").append(this.studentFirstName).append("\n")
                .append("adrress: ").append(this.Address).append("\n")
                .append("Birthday:").append(this.birthday).append("\n")
                .append("avgScore:").append(getAvgScore()).append("\n");
        System.out.println(result);

    }


    //
//
//
//            - Các chức năng cần có của chương trình:
//
//            1. Cho phép nhập sinh viên vào hệ thống và lưu trữ. (50 điểm)
//
//    Thực hiện validate dữ liệu khi nhập vào:
//
//            + MaSV không được trùng lặp (10 điểm)
//
//	+ GioiTinh chỉ được phép nhập Nam hoặc Nu (5 điểm)
//
//	+ NgaySinh phải đúng format MM/dd/yyyy và phải nhỏ hơn ngày hiện tại (5 điểm)
//
//	+ DiemCuoiKhoa, DiemThucTap phải là số thập phân > 0 và <= 10 (5 điểm)
//
//            + Xây dựng được exception bắt riêng cho từng lỗi validate ở trên (10 điểm)
//
//    Nếu chỉ nhập được dữ liệu mà không validate thì chỉ được tối đa 15 điểm.
//
//    Khi nhập DiemCuoiKhoa và DiemThucTap thì phải tính toán DiemTB của sinh viên sau đó mới lưu sinh viên vào hệ thống. (không tính DiemTB thì bị trừ 5 điểm)
//
//            2. Hiển thị danh sách sinh viên: (15 điểm)
//
//            + Yêu cầu hiển thị đầy đủ thông tin của sinh viên
//
//	+ Danh sách sinh viên cần được sắp xếp tăng dần theo tên, trường hợp trùng tên thì tăng dần theo họ
//
//3. Tìm kiếm sinh viên dựa theo điểm số (15 điểm)
//
//	+ Cho phép nhập vào Điểm trung bình cao nhất và điểm trung bình thấp nhất, sau đó tìm ra tất cả các sinh viên có DiemTB thỏa mãn hiển thị lên màn hình. (10 điểm)
//
//            + Sắp xếp danh sách sinh viên hiển thị giảm dần theo DiemTB (5 điểm)
//
//4. Thống kê các sinh viên bất thường và hiển thị thông tin các sinh viên đó lên màn hình(10 điểm)
//
//    Sinh viên bất thường là sinh viên thỏa mãn một trong các điều kiện dưới đây
//
//	+ Có DiemCuoiKhoa hoặc DiemThucTap <= 5 điểm
//
//	+ DiemCuoiKhoa và DiemThucTap chênh nhau >= 3 điểm
//
//	+ DiemTB <= 6.5 điểm
//
//5. Xây dựng menu cho chương trình để dễ dàng thao tác (5 điểm)
//
//
//6. Coding convention (5 điểm)


}
