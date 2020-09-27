package student_dmitrijs_visuns.homeworks.lesson_13.level_4.game_of_life;


class LifeRule2 extends LifeRule {

    private CountAliveNeighbours counter = new CountAliveNeighbours();
    LifeRule1 lifeRule1 = new LifeRule1();

    public boolean isActivated (boolean[][] currentGeneration, int row, int column) {
        int aliveNeighbours = counter.count(currentGeneration, row, column);

        if (!lifeRule1.isActivated(currentGeneration, row, column)) {
            return false;
        } else if ((aliveNeighbours == 2) || (aliveNeighbours == 3)) {
            return true;
        } else return currentGeneration[row][column];
    }
}