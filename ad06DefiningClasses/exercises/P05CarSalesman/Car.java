package JavaAdvanced.ad06DefiningClasses.exercises.P05CarSalesman;

public class Car {
    private String modelCar;
    private Engine engineCar;
    private int weightCar; //optional
    private String colorCar; //optional\

    public Car(String modelCar, Engine engineCar) {
        this.modelCar = modelCar;
        this.engineCar = engineCar;
        this.weightCar = 0;
        this.colorCar = "n/a";
    }

    public Car(String modelCar, Engine engineCar, int weightCar) {
        this(modelCar, engineCar);
        this.weightCar = weightCar;
     //   this.colorCar = "n/a";
    }

    public Car(String modelCar, Engine engineCar, String colorCar) {
        this(modelCar, engineCar);
      //  this.weightCar = 0;
        this.colorCar = colorCar;
    }

    public Car(String modelCar, Engine engineCar, int weightCar, String colorCar) {
        this.modelCar = modelCar;
        this.engineCar = engineCar;
        this.weightCar = weightCar;
        this.colorCar = colorCar;
    }

    private String checkIfAbsent(int weightCar) {
        if (weightCar == 0) {
            return "n/a";
        }
        return String.valueOf(weightCar);
    }

    /*
    {CarModel}:
    {EngineModel}:
    Power: {EnginePower}
    Displacement: {EngineDisplacement}
    Efficiency: {EngineEfficiency}
    Weight: {CarWeight}
    Color: {CarColor}
     */

    @Override
    public String toString() {
        return String.format("%s:%n" +
                "%s%n" +
                "Weight: %s%n" +
                "Color: %s", this.modelCar, this.engineCar, checkIfAbsent(this.weightCar), this.colorCar);
    }

    public Engine getEngineCar() {
        return this.engineCar;
    }
}
