package JavaAdvanced.ad06DefiningClasses.exercises.P05CarSalesman;

public class Engine {
    private String modelEngine;
    private String powerEngine;

    private int displacementEngine; //optional
    private String efficiencyEngine; //optional

    public Engine(String modelEngine, String powerEngine) {
        this.modelEngine = modelEngine;
        this.powerEngine = powerEngine;
        this.displacementEngine = 0;
        this.efficiencyEngine = "n/a";
    }

    public Engine(String modelEngine, String powerEngine, int displacementEngine) {
        this(modelEngine, powerEngine);
        this.displacementEngine = displacementEngine;
        //  this.efficiencyEngine = "n/a";
    }

    public Engine(String modelEngine, String powerEngine, String efficiencyEngine) {
        this(modelEngine, powerEngine);
        // this.displacementEngine = 0;
        this.efficiencyEngine = efficiencyEngine;
    }

    public Engine(String modelEngine, String powerEngine, int displacementEngine, String efficiencyEngine) {
        this(modelEngine, powerEngine);
        this.displacementEngine = displacementEngine;
        this.efficiencyEngine = efficiencyEngine;
    }

    public String checkIfAbsent(int displacementEngine) {

        if (displacementEngine == 0) {
            return "n/a";
        }
        return String.valueOf(displacementEngine);
    }

    @Override
    public String toString() {
        return String.format("%s:%n" +
                "Power: %s%n" +
                "Displacement: %s%n" +
                "Efficiency: %s", this.modelEngine, this.powerEngine, checkIfAbsent(this.displacementEngine), this.efficiencyEngine);
    }

    /*
    {EngineModel}:
    Power: {EnginePower}
    Displacement: {EngineDisplacement}
    Efficiency: {EngineEfficiency}

     */
}
