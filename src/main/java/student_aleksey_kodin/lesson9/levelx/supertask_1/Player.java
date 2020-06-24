package student_aleksey_kodin.lesson9.levelx.supertask_1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Player {
    private final String name;
    private final int chip;

    public Player(String name, int chip) {
        this.name = name;
        this.chip = chip;
    }

    public String getName() {
        return name;
    }

    public int getChip() {
        return chip;
    }

    public List<Column> makeMove(List<Column> gameArea) {
        int columnInput;
        Column currentColumn;

        System.out.println(getName() + " please enter column number: ");
        while (true) {
            try {
                columnInput = new Scanner(System.in).nextInt();
                currentColumn = Column.getColumn(gameArea, columnInput);

                try {
                    if (currentColumn.isFull()) {
                        System.out.println("Column " + currentColumn.getColumnIndex() + " full." +
                                "Please enter another columns");
                    } else {
                        break;
                    }
                } catch (NullPointerException e) {
                    System.out.println("Illegal move. Try again");
                }
            } catch (InputMismatchException e) {
                System.out.println(getName() + " please enter column numbers from 0 to 6");
            }
        }
        currentColumn.addChip(getChip());
        return gameArea;
    }
}
