package ObjectOrientedProgramming.L01Abstraction.exercises.P05JediGalaxy;

public class StarsField {
    private int[][] starsFiled;

    public StarsField(int rows, int cols) {
        this.starsFiled = new int[rows][cols];
        this.fillInStarsField(rows, cols);
    }


    private void fillInStarsField(int rows, int cols) {
        int value = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                this.starsFiled[row][col] = value++;

            }
        }
    }

    public  boolean isInBound(int row, int col) {
        return row >= 0 && row < this.starsFiled.length && col >= 0 && col < this.starsFiled[row].length;
    }

    public int getValue(int row, int col) {
        return this.starsFiled[row][col];
    }

    public void setValue(int row, int col, int newValue) {
        this.starsFiled[row][col] = newValue;
    }

    public int getCollLength() {
        return this.starsFiled[1].length;
    }
}
