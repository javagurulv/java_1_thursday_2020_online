package student_aleksey_kodin.lesson9.levelx.supertask_1.logic;

import student_aleksey_kodin.lesson9.levelx.supertask_1.Column;
import student_aleksey_kodin.lesson9.levelx.supertask_1.Player;

import java.util.ArrayList;
import java.util.List;

public class IsColumnHaveWinPosition extends SearcherWinPosition {

    @Override
    public boolean searchWinPosition(List<Column> gameArea, Player player) {
        return searchColumns(gameArea, player);
    }

    private boolean searchColumns(List<Column> gameArea, Player player) {
        final int FIRST_COLUMN = 0;
        final int LAST_COLUMN = 7;
        final int MINIMUM_CHIPS_FOR_WIN = 4;
        List<Column> columnHaveMoreFourElements = new ArrayList<>();
        Column foundedColumn;

        for (int i = FIRST_COLUMN; i < LAST_COLUMN; i++) {
            try {
                foundedColumn = Column.getColumn(gameArea, i);
                if (foundedColumn.getColumnFillSize() >= MINIMUM_CHIPS_FOR_WIN) {
                    columnHaveMoreFourElements.add(foundedColumn);
                }
            } catch (IndexOutOfBoundsException ignored) {
            }
        }
        return findWinPosition(columnHaveMoreFourElements, player);
    }

    private boolean findWinPosition(List<Column> columnHaveMoreFourElements, Player player) {
        final int FOUR_IN_ROW = 4;
        final int START_COUNT_CHIPS = 0;

        for (Column column : columnHaveMoreFourElements) {
            int chipsCounter = START_COUNT_CHIPS;
            for (int i = column.getColumnFillSize() - 1; i >= 0; i--) {
                if (column.getChipInColumn(i) == player.getChip()) {
                    chipsCounter++;
                } else {
                    chipsCounter = START_COUNT_CHIPS;
                }
                if (chipsCounter == FOUR_IN_ROW) {
                    return true;
                }
            }
        }
        return false;
    }
}
