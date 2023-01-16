package ObjectOrientedProgramming.L01Abstraction.exercises.P05JediGalaxy;

public class Galaxy {
    private StarsField field;

    public Galaxy(StarsField field) {
        this.field = field;
    }

    public long moveJedi(long sum, int currentJediRow, int currentJediCol) {
        while (currentJediRow >= 0 && currentJediCol < field.getCollLength()) {
            if (field.isInBound(currentJediRow, currentJediCol)) {
                sum += field.getValue(currentJediRow, currentJediCol);
            }
            currentJediCol++;
            currentJediRow--;
        }
        return sum;
    }

    public void moveEvil(int currentEvilRow, int currentEvilCol) {
        while (currentEvilRow >= 0 && currentEvilCol >= 0) {
            if (field.isInBound(currentEvilRow, currentEvilCol)) {
                field.setValue(currentEvilRow, currentEvilCol, 0);
            }
            currentEvilRow--;
            currentEvilCol--;
        }
    }
}
