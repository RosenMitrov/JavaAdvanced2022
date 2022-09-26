package JavaAdvanced.ad06DefiningClasses.lab.P02CarConstructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        List<CarConstructors> carsList = new ArrayList<>();

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String brand = tokens[0];

            CarConstructors car;
            if (tokens.length == 1) {
                car = new CarConstructors(brand);
            } else {
                String model = tokens[1];
                int horsepower = Integer.parseInt(tokens[2]);
                car = new CarConstructors(brand, model, horsepower);
            }
            carsList.add(car);
        }


        carsList.forEach(car -> System.out.println(car.carInfo()));
    }
}
