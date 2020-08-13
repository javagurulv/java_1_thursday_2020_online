package student_aleksey_kodin.lesson13.level3;

class GameOfLifeNextGenerationCalculator {
    public boolean[][] calculateNextGeneration(boolean[][] currentGeneration) {
        boolean[][] nextGeneration = currentGeneration.clone();

        for (int i = 0; i < currentGeneration.length; i++) {
            for (int j = 0; j < currentGeneration[0].length; j++) {

                int aliveNeighbour = countAliveCell(currentGeneration, i, j);

                if (aliveNeighbour < 2) {
                    nextGeneration[i][j] = false;
                }
                if (aliveNeighbour > 3) {
                    nextGeneration[i][j] = false;
                }
                if (!currentGeneration[i][j] && aliveNeighbour == 3) {
                    nextGeneration[i][j] = true;
                }
                if (currentGeneration[i][j]) {
                    if ((aliveNeighbour == 2) || (aliveNeighbour == 3)) {
                        nextGeneration[i][j] = true;
                    }
                }
            }
        }
        return nextGeneration;
    }

    public int countAliveCell(boolean[][] currentGeneration, int currentColumn, int currentRow) {
        final int rowPosition = 1;
        int totalAliveCell = 0;

        totalAliveCell += checkCellLeftSide(currentGeneration, currentColumn, currentRow);

        totalAliveCell += checkCellRightSide(currentGeneration, currentColumn, currentRow);

        totalAliveCell += checkCellSide(currentGeneration, currentColumn, currentRow - rowPosition);

        totalAliveCell += checkCellSide(currentGeneration, currentColumn, currentRow + rowPosition);

        return totalAliveCell;
    }

    private int checkCellLeftSide(boolean[][] currentGeneration, int currentColumn, int currentRow) {
        int aliveCell = 0;
        try {
            if (currentGeneration[currentColumn - 1][currentRow]) {
                aliveCell++;
            }
        } catch (IndexOutOfBoundsException ignored) {
        }
        return aliveCell;
    }

    private int checkCellRightSide(boolean[][] currentGeneration, int currentColumn, int currentRow) {
        int aliveCell = 0;
        try {
            if (currentGeneration[currentColumn + 1][currentRow]) {
                aliveCell++;
            }
        } catch (IndexOutOfBoundsException ignored) {
        }
        return aliveCell;
    }

    private int checkCellSide(boolean[][] currentGeneration, int currentColumn, int currentRow) {
        int aliveCell = 0;
        for (int i = currentColumn - 1; i < currentColumn + 2; i++) {
            try {
                if (currentGeneration[i][currentRow]) {
                    aliveCell++;
                }
            } catch (IndexOutOfBoundsException ignored) {
            }
        }
        return aliveCell;
    }
}
