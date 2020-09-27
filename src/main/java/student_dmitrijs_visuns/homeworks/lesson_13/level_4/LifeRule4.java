package student_dmitrijs_visuns.homeworks.lesson_13.level_4;

class LifeRule4 extends LifeRule {

    private CountAliveNeighbours counter = new CountAliveNeighbours();

    public boolean isActivated (boolean[][] currentGeneration, int row, int column) {
        int aliveNeighbours = counter.count(currentGeneration, row, column);

        if (currentGeneration[row][column]) {
            return true;
        } else if (aliveNeighbours == 3) {
            return true;
        } else return false;
    }
}