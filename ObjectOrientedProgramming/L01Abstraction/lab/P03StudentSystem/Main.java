package ObjectOrientedProgramming.L01Abstraction.lab.P03StudentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentSystem studentSystem = new StudentSystem();
        String input = scanner.nextLine();
        while (!input.equals("Exit")) {

            String[] tokens = input.split(" ");

            studentSystem.parseStudent(tokens);

            input = scanner.nextLine();
        }
    }
}
