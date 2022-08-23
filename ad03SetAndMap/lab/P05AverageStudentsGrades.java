package JavaAdvanced.ad03SetAndMap.lab;

import java.util.*;

//created by R.M.
public class P05AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> studentsAndGrades = new TreeMap<>();
        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String[] data = scanner.nextLine().split(" ");
            String studentName = data[0];
            double studentGrade = Double.parseDouble(data[1]);
            studentsAndGrades.putIfAbsent(studentName, new ArrayList<>());
            studentsAndGrades.get(studentName).add(studentGrade);
        }

        for (Map.Entry<String, List<Double>> entry : studentsAndGrades.entrySet()) {
            System.out.printf("%s -> ", entry.getKey());
            double sum = 0;
            for (Double aDouble : entry.getValue()) {
                System.out.printf("%.2f ", aDouble);
                sum+= aDouble;
            }
            List<Double> grades = new ArrayList<>(entry.getValue());
            double avgGrade = sum / grades.size();
            System.out.printf("(avg: %.2f)%n", avgGrade);
        }
    }
}
/*
5.	Average Students Grades
Write a program, which reads the name of a student and their grades and adds them to the student record,
    then prints grades along with their average grade – ordered the output by the names of the students.
Input
On the first line N – the number of students, then on the next N lines student name with grade.

 */