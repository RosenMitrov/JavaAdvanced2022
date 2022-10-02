package JavaAdvanced.ad06DefiningClasses.exercises.P03SpeedRacing;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCars = Integer.parseInt(scanner.nextLine());

        Map<String, Car> carsMap = new LinkedHashMap<>();

        for (int i = 0; i < countCars; i++) {
            String[] info = scanner.nextLine().split("\\s+");
            String model = info[0];
            int fuelAmount = Integer.parseInt(info[1]);
            double fuelCost = Double.parseDouble(info[2]);

            Car car = new Car(model, fuelAmount, fuelCost);
            carsMap.put(model, car);
        }

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split(" ");
            String model = tokens[1];
            int distance = Integer.parseInt(tokens[2]);
            Car car = carsMap.get(model);

            if (car.hasEnoughFuel(distance)) {
                car.drive(distance);

            } else {
                System.out.println("Insufficient fuel for the drive");
            }


            input = scanner.nextLine();
        }
        carsMap.forEach((key, value) -> System.out.println(value));
    }

}
