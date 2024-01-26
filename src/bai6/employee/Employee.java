package bai6.employee;

public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private  int salary;
    public Employee(int employeeId, String firstName, String lastName, int salary){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

//    public static void main(String[] args) {
//
//    }
//    public void setEmployeeId(int employeeId) {
//        this.employeeId = employeeId;
//    }
//
    public int getEmployeeId() {
        return employeeId;
    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
    public String getFirstName() {
        return firstName;
    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
    public String getLastName() {
        return lastName;
    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
    public int getSalary() {
        return salary;
    }
    public String getFullName(){
        return this.firstName.concat(" ")+ this.lastName;
    }
}
