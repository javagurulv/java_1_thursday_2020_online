package student_dmitrijs_visuns.homeworks.lesson_13.level_4.game_of_life;

class LifeRule3 extends LifeRule {

    private CountAliveNeighbours counter = new CountAliveNeighbours();
    LifeRule2 lifeRule2 = new LifeRule2();

    public boolean isActivated (boolean[][] currentGeneration, int row, int column) {
        int aliveNeighbours = counter.count(currentGeneration, row, column);

        if (!lifeRule2.isActivated(currentGeneration, row, column)) {
            return false;}

        if (aliveNeighbours > 3) {
            return false;
        } else return currentGeneration[row][column];
    }

}