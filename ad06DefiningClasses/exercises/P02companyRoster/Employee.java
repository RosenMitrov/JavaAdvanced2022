package JavaAdvanced.ad06DefiningClasses.exercises.P02companyRoster;

public class Employee {
    private String name;
    private double salary;
    private String position;
    private String department;
    private String email;
    private int age;

    /*
     name, salary, position,  department -> mandatory
      email and аge -> optional
     */

    public Employee(String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = "n/a";
        this.age = -1;
    }


    public Employee(String name, double salary, String position, String department, String email) {
        //Constructor chaining
        this(name, salary, position, department);
        this.email = email;
    }

    public Employee(String name, double salary, String position, String department, int age) {
        //Constructor chaining
        this(name, salary, position, department);
        this.age = age;
    }

    public Employee(String name, double salary, String position, String department, String email, int age) {
        this(name, salary, position, department, email);
        this.age = age;
    }

    public String getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s %d", this.name, this.salary, this.email, this.age);
    }
}
