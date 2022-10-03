package JavaAdvanced.ad06DefiningClasses.exercises.P04RawData;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nCars = Integer.parseInt(scanner.nextLine());

        List<Car> carArrayList = new ArrayList<>();

        while (nCars-- > 0) {
            String[] infoCar = scanner.nextLine().split("\\s+");

            //info for car model
            String model = infoCar[0];

            //info for Engine
            int speedEngine = Integer.parseInt(infoCar[1]);
            int powerEngine = Integer.parseInt(infoCar[2]);
            Engine engine = new Engine(speedEngine, powerEngine);

            //info for Cargo
            int wightCargo = Integer.parseInt(infoCar[3]);
            String typeCargo = infoCar[4];
            Cargo cargo = new Cargo(wightCargo, typeCargo);

            //info for each Tire in loop
            List<Tire> tires = new ArrayList<>();
            for (int i = 5; i < infoCar.length; i += 2) {
                double pressureTire = Double.parseDouble(infoCar[i]);
                int ageTire = Integer.parseInt(infoCar[i + 1]);
                Tire tire = new Tire(pressureTire, ageTire);
                tires.add(tire);
            }
            // new car
            Car car = new Car(model, engine, cargo, tires);
            //add car in the list
            carArrayList.add(car);
        }

        String command = scanner.nextLine();
        //printer for model
        Consumer<Car> carPrinter = car -> System.out.println(car.getModel());
        switch (command) {
            case "fragile":
                //predicate filter only fragile
                Predicate<Car> filterOnlyFragilePredicate = car -> car.getCargo().getTypeCargo().equals("fragile");
                //predicate filter all tires with pressure less than 1
                Predicate<Car> tirePressureIsLessThan1 = car -> car.getTires().stream().anyMatch(tire -> tire.getPressureTire() < 1);

                //print result after all filters
                carArrayList.stream()
                        .filter(filterOnlyFragilePredicate)
                        .filter(tirePressureIsLessThan1)
                        .forEach(carPrinter);
                break;
            case "flamable":
                //filter only flamable
                Predicate<Car> filterOnlyFlamablePredicate = car -> car.getCargo().getTypeCargo().equals("flamable");

                //predicate filter all engines with engine power more than 250
                Predicate<Car> filterAllEnginesWithPowerMoreThan250 = car -> car.getEngine().getPowerEngine() > 250;

                //print result after all filters
                carArrayList.stream()
                        .filter(filterOnlyFlamablePredicate)
                        .filter(filterAllEnginesWithPowerMoreThan250)
                        .forEach(carPrinter);
                break;
        }
    }
}
