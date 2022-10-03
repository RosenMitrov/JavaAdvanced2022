package JavaAdvanced.ad06DefiningClasses.exercises.P04RawData;

public class Engine {
    private int speedEngine;
    private int powerEngine;

    public Engine(int speedEngine, int powerEngine) {
        this.speedEngine = speedEngine;
        this.powerEngine = powerEngine;
    }

    public int getPowerEngine() {
        return this.powerEngine;
    }
}
