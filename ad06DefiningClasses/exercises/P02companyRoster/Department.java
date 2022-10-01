package JavaAdvanced.ad06DefiningClasses.exercises.P02companyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private List<Employee> listOfEmployees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.listOfEmployees = new ArrayList<>();
    }

    public double calculateAvgSalary() {
        return listOfEmployees.stream().mapToDouble(Employee::getSalary).average().orElse(0);
    }

    public List<Employee> getListOfEmployees() {
        return this.listOfEmployees;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }
}
