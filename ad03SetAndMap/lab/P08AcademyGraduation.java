package JavaAdvanced.ad03SetAndMap.lab;

import java.util.*;
import java.util.stream.Collectors;

public class P08AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsAndGrades = new TreeMap<>();

        for (int i = 0; i < countStudents; i++) {
            String student = scanner.nextLine();
            List<Double> grades = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
            studentsAndGrades.putIfAbsent(student, new ArrayList<>());
            studentsAndGrades.put(student, grades);
        }

        studentsAndGrades.forEach((student, grades) -> {
            System.out.printf("%s is graduated with ", student);
            double sum = 0;
            for (Double grade : grades) {
                sum += grade;
            }
            double avg = sum / grades.size();
            System.out.println(avg);
        });
    }
}
/*
8.	Academy Graduation
Write a program that:
•	Reads from console number of students for a track.
•	Reads on pair of rows:
o	The first line is the name of the student.
o	The second line is his score for a different number of courses.
•	Print on console "{name} is graduated with {average scores)".

 */