package student_dmitrijs_visuns.homeworks.lesson_13.level_4.game_of_life;

class LifeRule4 extends LifeRule {

    private CountAliveNeighbours counter = new CountAliveNeighbours();
    LifeRule3 lifeRule3 = new LifeRule3();

    public boolean isActivated (boolean[][] currentGeneration, int row, int column) {
        int aliveNeighbours = counter.count(currentGeneration, row, column);

        if (lifeRule3.isActivated(currentGeneration, row, column)) {
            return true;
        } else if (aliveNeighbours == 3) {
            return true;
        } else return false;
    }
}