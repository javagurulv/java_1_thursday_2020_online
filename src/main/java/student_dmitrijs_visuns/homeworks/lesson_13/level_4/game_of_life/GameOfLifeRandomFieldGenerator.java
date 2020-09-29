package student_dmitrijs_visuns.homeworks.lesson_13.level_4.game_of_life;

import java.util.Random;

class GameOfLifeRandomFieldGenerator {

   public boolean[][] generate(int fieldWidth, int fieldHeight){
            boolean[][] field = new boolean[fieldWidth + 2][fieldHeight + 2];
            return fillFieldWithRandomBoolean(field);
        }

        private boolean[][] fillFieldWithRandomBoolean(boolean[][] field){
            for (int i = 1; i < field.length -1; i++){
                for (int j = 1; j < field[1].length -1; j++){
                    field[i][j] = getRandomBoolean();
                }
            }
            return field;
        }

        private boolean getRandomBoolean() {
            Random r = new Random();
            boolean random = r.nextBoolean();
            return random;
        }
    }


