package student_aleksey_kodin.lesson9.levelx.supertask_1;

import java.util.List;

class Monitor {

    public void printGameBoard(List<Column> gameArea) {
        for (int i = 5; i >= 0; i--) {
            for (Column column : gameArea) {
                try {
                    System.out.print(column.getChipInColumn(i) + " ");
                } catch (IndexOutOfBoundsException e) {
                    System.out.print("| ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------");
        System.out.println("0 1 2 3 4 5 6");
    }
}