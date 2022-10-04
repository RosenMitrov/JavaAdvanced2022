package JavaAdvanced.ad06DefiningClasses.exercises.P05CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nLines = Integer.parseInt(scanner.nextLine());
        Map<String, Engine> engineMap = new HashMap<>();
        while (nLines-- > 0) {
            //"{Model} {Power} {Displacement} {Efficiency}.split(" ");
            String[] infoEngine = scanner.nextLine().split(" ");
            String modelEngine = infoEngine[0];
            String powerEngine = infoEngine[1];
            int displacement;
            String efficiency;
            Engine engine = null;

            switch (infoEngine.length) {
                case 4:
                    displacement = Integer.parseInt(infoEngine[2]);
                    efficiency = infoEngine[3];
                    engine = new Engine(modelEngine, powerEngine, displacement, efficiency);
                    break;
                case 3:
                    if (Character.isDigit(infoEngine[2].charAt(0))) {
                        displacement = Integer.parseInt(infoEngine[2]);
                        engine = new Engine(modelEngine, powerEngine, displacement);
                    } else {
                        efficiency = infoEngine[2];
                        engine = new Engine(modelEngine, powerEngine, efficiency);
                    }
                    break;
                case 2:
                    engine = new Engine(modelEngine, powerEngine);
                    break;
            }
            if (engine != null) {
                engineMap.put(modelEngine, engine);
            }

        }

        nLines = Integer.parseInt(scanner.nextLine());

        List<Car> carList = new ArrayList<>();

        while (nLines-- > 0) {
            String[] infoCar = scanner.nextLine().split(" ");
            String modelCar = infoCar[0];
            String powerCar = infoCar[1];
            int weightCar;
            String colorCar;

            Car car = null;

            switch (infoCar.length) {
                case 4:
                    weightCar = Integer.parseInt(infoCar[2]);
                    colorCar = infoCar[3];
                    car = new Car(modelCar, engineMap.get(powerCar), weightCar, colorCar);
                    break;
                case 3:
                    if (Character.isDigit(infoCar[2].charAt(0))) {
                        weightCar = Integer.parseInt(infoCar[2]);
                        car = new Car(modelCar, engineMap.get(powerCar), weightCar);
                    } else {
                        colorCar = infoCar[2];
                        car = new Car(modelCar, engineMap.get(powerCar), colorCar);
                    }
                    break;
                case 2:
                    car = new Car(modelCar, engineMap.get(powerCar));
                    break;
            }
            if (car != null) {
                carList.add(car);
            }
        }

        carList.forEach(System.out::println);
    }
}
