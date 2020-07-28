package student_aleksey_kodin.lesson13.level4;

import java.util.Random;

class GameOfLifeRandomFieldGenerator {
    public boolean[][] generate(int fieldWidth, int fieldHeight) {
        boolean[][] field = new boolean[fieldWidth][fieldHeight];

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                field[i][j] = new Random().nextBoolean();
            }
        }
        return field;
    }
}
