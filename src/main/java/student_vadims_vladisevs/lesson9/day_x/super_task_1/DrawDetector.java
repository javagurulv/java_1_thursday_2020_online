package student_vadims_vladisevs.lesson9.day_x.super_task_1;

class DrawDetector {

    public boolean isDraw(String[][] gameField){

        int emptyCellCount = 0;

        for (String[] strings : gameField) {
            for (int j = 0; j < gameField[0].length; j++) {
                if (strings[j].equals("-")) {
                    emptyCellCount++;
                }
            }
        }

        return emptyCellCount == 0;
    }
}
