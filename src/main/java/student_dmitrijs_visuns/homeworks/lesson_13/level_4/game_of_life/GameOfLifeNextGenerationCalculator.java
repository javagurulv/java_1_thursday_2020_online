package student_dmitrijs_visuns.homeworks.lesson_13.level_4.game_of_life;

class GameOfLifeNextGenerationCalculator {

    public boolean[][] calculate(boolean[][] currentGeneration) {

        LifeRuleDetector detector = new LifeRuleDetector();
        boolean[][] nextGeneration = new boolean[currentGeneration.length][currentGeneration[0].length];

        for (int i = 1; i < currentGeneration.length - 1; i++) {
            for (int j = 1; j < currentGeneration[1].length - 1; j++) {
              nextGeneration[i][j] = detector.IsAlive (currentGeneration, i, j);
            }
        } return nextGeneration;
    }



}
