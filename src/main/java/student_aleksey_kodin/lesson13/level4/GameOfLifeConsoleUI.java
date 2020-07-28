package student_aleksey_kodin.lesson13.level4;

class GameOfLifeConsoleUI {
    public void show(boolean[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (!field[j][i]) {
                    System.out.print("0 ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println("[ Next Generation ]");
    }
}
