package JavaAdvanced.ad06DefiningClasses.exercises.P02companyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Department> departmentMap = new HashMap<>();
        while (n-- > 0) {
            String[] employeeInfo = scanner.nextLine().split("\\s+");
            //mandatory
            String name = employeeInfo[0];
            double salary = Double.parseDouble(employeeInfo[1]);
            String position = employeeInfo[2];
            String department = employeeInfo[3];
            //Optional
            String email;
            int age;

            Employee employee = null;

            if (employeeInfo.length == 6) {

                email = employeeInfo[4];
                age = Integer.parseInt(employeeInfo[5]);

                employee = new Employee(name, salary, position, department, email, age);

            } else if (employeeInfo.length == 5) {

                if (employeeInfo[4].contains("@")) {
                    email = employeeInfo[4];
                    employee = new Employee(name, salary, position, department, email);
                } else {
                    age = Integer.parseInt(employeeInfo[4]);
                    employee = new Employee(name, salary, position, department, age);
                }

            } else {
                employee = new Employee(name, salary, position, department);
            }
            departmentMap.putIfAbsent(department, new Department(department));
            departmentMap.get(department).getListOfEmployees().add(employee);
        }

        Map.Entry<String, Department> highestAverageSalaryDepartment = null;
        if (!departmentMap.isEmpty()) {
            highestAverageSalaryDepartment = departmentMap.entrySet().stream()
                    .max(Comparator.comparingDouble(e -> e.getValue().calculateAvgSalary()))
                    .get();
        }


        if (highestAverageSalaryDepartment != null) {
            System.out.printf("Highest Average Salary: %s%n", highestAverageSalaryDepartment.getKey());

            highestAverageSalaryDepartment.getValue().getListOfEmployees().stream()
                    .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                    .forEach(System.out::println);
        }

    }
}
