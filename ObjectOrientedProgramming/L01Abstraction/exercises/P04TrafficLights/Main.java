package ObjectOrientedProgramming.L01Abstraction.exercises.P04TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//created by R.M.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] colors = scanner.nextLine().split(" ");

        List<TrafficLight> trafficLightList = new ArrayList<>();
        for (String color : colors) {
            Color currentColor = Color.valueOf(color);
            TrafficLight trafficLight = new TrafficLight(currentColor);
            trafficLightList.add(trafficLight);
        }

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {

            for (TrafficLight trafficLight : trafficLightList) {
                trafficLight.changeColor();
                System.out.print(trafficLight.getColor() + " ");
            }
            System.out.println();
        }
    }
}
/*
Problem 4.	Traffic Lights
Implement a simple state machine in the form of a traffic light.
Every traffic light has three possible signals - red, green, and yellow.
Each traffic light can be updated, which changes the color of its signal (e.g. if it is currently red,
it changes to green, if it is green it changes to yellow). The order of signals is red -> green -> yellow -> red and so on.
On the first line, you will be given multiple traffic light signals in the format "RED GREEN YELLOW".
They may be 3, more, or less than 3. You need to make as many traffic lights as there are signals in the input.
On the second line, you will receive the n number of times you need to change each traffic light's signal.
Your output should consist of n number of lines, including each updated traffic light's signal.
To better understand the problem, see the example below.

 */