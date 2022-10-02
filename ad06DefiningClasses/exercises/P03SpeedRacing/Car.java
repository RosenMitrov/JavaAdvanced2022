package JavaAdvanced.ad06DefiningClasses.exercises.P03SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCost;
    private int distance;

    public Car(String model, int fuelAmount, double fuelCost) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCost = fuelCost;
        this.distance = 0;
    }

    public boolean hasEnoughFuel(int distance) {
        double neededFuel = calculateNeededFuel(distance);
        return this.fuelAmount >= neededFuel;
    }

    public double calculateNeededFuel(int distance) {
        return this.fuelCost * distance;
    }

    public void drive(int distance) {
        double neededFuel = calculateNeededFuel(distance);
        fuelAmount -= neededFuel;
        this.distance += distance;

    }

    public String getModel() {
        return this.model;
    }

    public int getDistance() {
        return this.distance;
    }

    public double getFuelAmount() {
        return this.fuelAmount;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", getModel(), getFuelAmount(), getDistance());
    }
}

