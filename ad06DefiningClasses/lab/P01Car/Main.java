package JavaAdvanced.ad06DefiningClasses.lab.P01Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//created by R.M.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countOfCars = Integer.parseInt(scanner.nextLine());


        List<Car> carList = new ArrayList<>();

        while (countOfCars-- > 0) {

            String[] tokens = scanner.nextLine().split("\\s+");
            String brand = tokens[0];
            String model = tokens[1];
            int horsepower = Integer.parseInt(tokens[2]);

            Car car = new Car();

            car.setBrand(brand);
            car.setModel(model);
            car.setHorsePower(horsepower);
            carList.add(car);
        }

        carList.forEach(car -> System.out.println(car.carInfo()));


    }
}
