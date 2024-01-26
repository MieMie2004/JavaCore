package BAI7;

public class Teacher extends Person {



        private int salary;

    public Teacher(String Name , int Age, String address, int salaryItem){
            super(Name, Age, address);
            this.salary = salaryItem;
        }

        public int getSalary () {
            return salary;
        }

        public void setSalary ( int salary){
            this.salary = salary;
        }

        @Override
        public String display () {
            return super.display().concat("Salary: ").concat(String.valueOf(this.salary));


    }


}
