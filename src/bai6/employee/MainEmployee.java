package bai6.employee;

import java.util.Arrays;
import java.util.Comparator;

public class MainEmployee {
    public static void main(String[] args) {

        Employee employee0= new Employee(1,"nguyen", "van",200);
        Employee employee1= new Employee(20,"tran", "thanh",300);
        Employee employee2= new Employee(4 , "nguyen","hoang",500);
        Employee employee3= new Employee(6, "Pham ","anh",700);
        Employee employee4= new Employee(10,"Hoang", "bao", 300);
        System.out.println( employee0.getEmployeeId());
        System.out.println(employee0.getFullName());
        System.out.println( employee0.getSalary());
        System.out.println(employee0.getSalary());
//b
        Employee[] employees= new Employee[5];
        employees[0] = employee0;
        employees[1]= employee1;
        employees[2]= employee2;
        employees[3]= employee3;
        employees[4]= employee4;

       for (Employee item : employees){
           System.out.println(item);
       }


//        c
        System.out.println("Employee after Ascending order");
        Arrays.sort(employees, Comparator.comparing(Employee::getEmployeeId));
        for ( Employee item : employees){
            System.out.println(item);
        }
        System.out.println( " Employee after Descerding oder");
        Arrays.sort(employees,Comparator.comparing(Employee::getEmployeeId).reversed());
        for (Employee itemEmployee : employees) {
            System.out.println(itemEmployee);
        }

        /*int lengthOfEmployees = employees.length;
        for (int i = 0; i < lengthOfEmployees; i ++) {
            for (int j = 0; j < lengthOfEmployees; j ++) {
                 if (employees[j].getId() < employees[i].getId()) {
                     Employee temporaryEmployee = employees[i];
                     employees[i] = employees[j];
                     employees[j] = temporaryEmployee;
                 }
            }
        }
        System.out.println("---EMPLOYEES AFTER ASCENDING ORDER---");
        for (Employee itemEmployee : employees) {
            System.out.println(itemEmployee);
        }*/
    }
}

