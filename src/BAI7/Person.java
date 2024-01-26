package BAI7;

public class Person {
    private String Name;
    private int Age;
    private String Address;


    public Person (String Name, int Age, String Address){
        this.Address= Address;
        this.Age=Age;
        this.Name= Name;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName(){
        return Name;
    }
    public int getAge(){
        return Age;
    }
    public String getAddress(){
        return Address;
    }
    public String display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ")
                .append(this.Name)
                .append("\n")
                .append("Age: ")
                .append(this.Age)
                .append("\n")
                .append("Address: ")
                .append(this.Address)
                .append("\n");
        return sb.toString();
    }

}
