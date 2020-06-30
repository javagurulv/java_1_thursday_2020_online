package student_aleksey_kodin.lesson9.levelx.supertask_1;

import java.util.ArrayList;
import java.util.List;

public class Column {
    private final int index;
    private final List<Integer> chipsInColumn = new ArrayList<>();

    public Column(int index) {
        this.index = index;
    }

    public int getColumnIndex() {
        return index;
    }

    public boolean isFull() {
        int FULL_COLUMN = 6;
        return (chipsInColumn.size() == FULL_COLUMN);
    }

    public int getColumnFillSize() {
        return chipsInColumn.size();
    }

    public void addChip(int playerChip) {
        chipsInColumn.add(playerChip);
    }
    // Этот метод используется только для тестов
    public void addChip(int index, int playerChip) {
        chipsInColumn.add(index, playerChip);
    }

    public int getChipInColumn(int index) {
        return chipsInColumn.get(index);
    }

    public static Column getColumn(List<Column> gameArea, int index) {
        final Column[] currentColumn = new Column[1];
        gameArea.forEach(column -> {
            if (column.getColumnIndex() == index) {
                currentColumn[0] = column;
            }
        });
        return currentColumn[0];
    }
}
