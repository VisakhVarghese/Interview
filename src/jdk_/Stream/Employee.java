package jdk_.Stream;

public class Employee {

    private int empID;
    private String name;
    private int age;
    private String gender;
    private String Designation;
    private int yearOfJoining;
    private int Salary;


//    public Employee() {
//    }

    public Employee(int empID, String name, int age, String gender, String designation, int yearOfJoining, int salary) {
        this.empID = empID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.Designation = designation;
        this.yearOfJoining = yearOfJoining;
        Salary = salary;
    }

    public int getEmpID() {
        return empID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDesignation() {
        return Designation;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public int getSalary() {
        return Salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", Designation='" + Designation + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", Salary=" + Salary +
                '}';
    }
}
