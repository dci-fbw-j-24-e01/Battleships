package dci.j24e1.group1.battleships;

public class ComputerShips {
    private int[][] computerShips = {
            {0, 0, 0, 1, 0, 0, 2, 2, 0, 0},
            {0, 3, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 3, 0, 1, 0, 0, 2, 2, 0, 0},
            {0, 3, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 4, 4, 4, 4, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 2},
            {0, 0, 0, 0, 0, 3, 3, 3, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    };

    public ComputerShips() {

    }

    public int[][] getComputerShips() {
        return computerShips;
    }
}