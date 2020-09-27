package student_dmitrijs_visuns.homeworks.lesson_13.level_4.game_of_life;

class GameOfLifeConsoleUI {

        final String ALIVE_CELL = "0";
        final String DEAD_CELL = ".";

        public void show(boolean[][] field){
            System.out.println("--------------------");

            for (int i = 1; i < field.length - 1; i++){
                for (int j = 1; j < field[1].length -1; j++){
                    if (field[i][j]){
                        System.out.print(ALIVE_CELL + " ");
                    } else {
                        System.out.print(DEAD_CELL + " ");
                    }
                }
               System.out.println("");
            }
            System.out.println("--------------------");
            System.out.println("NEXT GENERATION:");
        }

    }

