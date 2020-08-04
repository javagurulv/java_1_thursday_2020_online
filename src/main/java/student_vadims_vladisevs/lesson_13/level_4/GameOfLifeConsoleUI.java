package student_vadims_vladisevs.lesson_13.level_4;

class GameOfLifeConsoleUI {

    private final String ALIVE_CELL = "X";
    private final String DEAD_CELL = "-";

    public void show(boolean[][] field){
        for (int i = 0; i < field.length; i++){
            for (int j = 0; j < field[0].length; j++){
                if (field[i][j]){
                    System.out.print(ALIVE_CELL + " ");
                } else {
                    System.out.print(DEAD_CELL + " ");
                }
            }
            System.out.println("");
        }
        System.out.println("--------------------");
    }

}
