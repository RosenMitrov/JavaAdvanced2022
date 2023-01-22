package ObjectOrientedProgramming.L01Abstraction.lab.P03StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {

    private Map<String, Student> studentMap;

    public StudentSystem() {
        this.studentMap = new HashMap<>();
    }

    public Map<String, Student> getStudentMap() {
        return this.studentMap;
    }

    public void parseStudent(String... studentInfo) {

        String command = studentInfo[0];
        if (command.equals("Create")) {
            String name = studentInfo[1];

            int age = Integer.parseInt(studentInfo[2]);

            double grade = Double.parseDouble(studentInfo[3]);

            if (!studentMap.containsKey(name)) {
                Student student = new Student(name, age, grade);
                studentMap.put(name, student);
            }

        } else if (command.equals("Show")) {
            String name = studentInfo[1];

            if (studentMap.containsKey(name)) {

                Student student = studentMap.get(name);
                System.out.println(student.getStudentInfo());
            }
        }
    }
}
