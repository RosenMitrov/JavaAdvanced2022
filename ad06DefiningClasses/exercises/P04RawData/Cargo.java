package JavaAdvanced.ad06DefiningClasses.exercises.P04RawData;

public class Cargo {
    private int weightCargo;
    private String typeCargo;

    public Cargo(int weightCargo, String typeCargo) {
        this.weightCargo = weightCargo;
        this.typeCargo = typeCargo;
    }

    public String getTypeCargo() {
        return this.typeCargo;
    }
}
