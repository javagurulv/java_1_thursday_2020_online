package student_vadims_vladisevs.lesson_13.level_4;

 class GameOfLifeRandomFieldGenerator {

     public boolean[][] generate(int fieldWidth, int fieldHeight){
         boolean[][] field = new boolean[fieldWidth][fieldHeight];
         return fillFieldWithRandomBoolean(field);
     }

     private boolean[][] fillFieldWithRandomBoolean(boolean[][] field){
         for (int i = 0; i < field.length; i++){
             for (int j = 0; j < field[0].length; j++){
                 field[i][j] = getRandomBoolean();
             }
         }
         return field;
     }

     private static boolean getRandomBoolean() {
         return Math.random() < 0.5;
     }
}
