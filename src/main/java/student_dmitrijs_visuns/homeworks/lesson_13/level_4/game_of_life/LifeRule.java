package student_dmitrijs_visuns.homeworks.lesson_13.level_4.game_of_life;

abstract class LifeRule {

    public abstract boolean isActivated (boolean[][] currentGeneration, int row, int column);

}
