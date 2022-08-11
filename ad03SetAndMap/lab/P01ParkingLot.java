package JavaAdvanced.ad03SetAndMap.lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

//created by R.M.
public class P01ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> parkingLot = new LinkedHashSet<>();

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] data = input.split(", ");
            String direction = data[0];
            String carNumber = data[1];

            if (direction.equals("IN")) {
                parkingLot.add(carNumber);
            } else if (direction.equals("OUT")) {
                parkingLot.remove(carNumber);
            }
            input = scanner.nextLine();
        }
        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            parkingLot.forEach(System.out::println);
        }
    }
}
/*
I.	Sets
1.	Parking Lot
Write a program that:
o	Records car numbers for every car that enters the parking lot.
o	Removes car number when the car is out.
When the parking lot is empty, print "Parking Lot is Empty".
Input
The input will be a string in the format "{direction, carNumber}".
The input ends with the string "END".
Output
Print the output with all car numbers, which are in the parking lot.

 */
