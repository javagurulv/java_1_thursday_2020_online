package student_aleksey_kodin.lesson9.levelx.supertask_1.logic;

import org.junit.Test;
import student_aleksey_kodin.lesson9.levelx.supertask_1.Column;
import student_aleksey_kodin.lesson9.levelx.supertask_1.Player;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class IsRowHaveWinPositionTest {
    List<Column> gameArea = new ArrayList<>();
    IsRowHaveWinPosition isRowHaveWinPosition = new IsRowHaveWinPosition();
    Player player1 = new Player("Name", 1);
    Player player2 = new Player("Name", 2);

    private void prepare() {
        for (int i = 0; i < 7; i++) {
            gameArea.add(new Column(i));
        }
    }

    @Test
    public void RowWinPosition_Row_0_Win_0_4() {
        prepare();
        Column testColumn_1 = Column.getColumn(gameArea, 0);
        Column testColumn_2 = Column.getColumn(gameArea, 1);
        Column testColumn_3 = Column.getColumn(gameArea, 2);
        Column testColumn_4 = Column.getColumn(gameArea, 3);

        testColumn_1.addChip(player2.getChip());
        testColumn_2.addChip(player2.getChip());
        testColumn_3.addChip(player2.getChip());
        testColumn_4.addChip(player2.getChip());

        boolean result = isRowHaveWinPosition.searchWinPosition(gameArea, player2);

        assertTrue(result);
    }

    @Test
    public void RowWinPosition_Row_0_Win_1_5() {
        prepare();
        Column testColumn_1 = Column.getColumn(gameArea, 0);
        Column testColumn_2 = Column.getColumn(gameArea, 1);
        Column testColumn_3 = Column.getColumn(gameArea, 2);
        Column testColumn_4 = Column.getColumn(gameArea, 3);
        Column testColumn_5 = Column.getColumn(gameArea, 4);

        testColumn_1.addChip(player1.getChip());
        testColumn_2.addChip(player2.getChip());
        testColumn_3.addChip(player2.getChip());
        testColumn_4.addChip(player2.getChip());
        testColumn_5.addChip(player2.getChip());

        boolean result = isRowHaveWinPosition.searchWinPosition(gameArea, player2);

        assertTrue(result);
    }

    @Test
    public void RowWinPosition_Row_0_Win_2_6() {
        prepare();
        Column testColumn_1 = Column.getColumn(gameArea, 0);
        Column testColumn_2 = Column.getColumn(gameArea, 1);
        Column testColumn_3 = Column.getColumn(gameArea, 2);
        Column testColumn_4 = Column.getColumn(gameArea, 3);
        Column testColumn_5 = Column.getColumn(gameArea, 4);
        Column testColumn_6 = Column.getColumn(gameArea, 5);

        testColumn_1.addChip(player1.getChip());
        testColumn_2.addChip(player1.getChip());
        testColumn_3.addChip(player2.getChip());
        testColumn_4.addChip(player2.getChip());
        testColumn_5.addChip(player2.getChip());
        testColumn_6.addChip(player2.getChip());

        boolean result = isRowHaveWinPosition.searchWinPosition(gameArea, player2);

        assertTrue(result);
    }

    @Test
    public void RowWinPosition_Row_0_Win_3_7() {
        prepare();
        Column testColumn_1 = Column.getColumn(gameArea, 0);
        Column testColumn_2 = Column.getColumn(gameArea, 1);
        Column testColumn_3 = Column.getColumn(gameArea, 2);
        Column testColumn_4 = Column.getColumn(gameArea, 3);
        Column testColumn_5 = Column.getColumn(gameArea, 4);
        Column testColumn_6 = Column.getColumn(gameArea, 5);
        Column testColumn_7 = Column.getColumn(gameArea, 6);

        testColumn_1.addChip(player1.getChip());
        testColumn_2.addChip(player1.getChip());
        testColumn_3.addChip(player1.getChip());
        testColumn_4.addChip(player2.getChip());
        testColumn_5.addChip(player2.getChip());
        testColumn_6.addChip(player2.getChip());
        testColumn_7.addChip(player2.getChip());

        boolean result = isRowHaveWinPosition.searchWinPosition(gameArea, player2);

        assertTrue(result);
    }

    @Test
    public void Row_0_NoWinPosition() {
        prepare();
        Column testColumn_1 = Column.getColumn(gameArea, 0);
        Column testColumn_2 = Column.getColumn(gameArea, 1);
        Column testColumn_3 = Column.getColumn(gameArea, 2);
        Column testColumn_4 = Column.getColumn(gameArea, 3);
        Column testColumn_5 = Column.getColumn(gameArea, 4);
        Column testColumn_6 = Column.getColumn(gameArea, 5);
        Column testColumn_7 = Column.getColumn(gameArea, 6);

        testColumn_1.addChip(player1.getChip());
        testColumn_2.addChip(player2.getChip());
        testColumn_3.addChip(player1.getChip());
        testColumn_4.addChip(player2.getChip());
        testColumn_5.addChip(player1.getChip());
        testColumn_6.addChip(player2.getChip());
        testColumn_7.addChip(player2.getChip());

        boolean result = isRowHaveWinPosition.searchWinPosition(gameArea, player2);

        assertFalse(result);
    }

    @Test
    public void RowWinPosition_Row_1_Win_0_3() {
        prepare();
        Column testColumn_1 = Column.getColumn(gameArea, 0);
        Column testColumn_2 = Column.getColumn(gameArea, 1);
        Column testColumn_3 = Column.getColumn(gameArea, 2);
        Column testColumn_4 = Column.getColumn(gameArea, 3);
        Column testColumn_5 = Column.getColumn(gameArea, 4);
        Column testColumn_6 = Column.getColumn(gameArea, 5);
        Column testColumn_7 = Column.getColumn(gameArea, 6);

        testColumn_1.addChip(player1.getChip());
        testColumn_2.addChip(player2.getChip());
        testColumn_3.addChip(player1.getChip());
        testColumn_4.addChip(player2.getChip());
        testColumn_5.addChip(player1.getChip());
        testColumn_6.addChip(player2.getChip());
        testColumn_7.addChip(player2.getChip());

        testColumn_1.addChip(player2.getChip());
        testColumn_2.addChip(player2.getChip());
        testColumn_3.addChip(player2.getChip());
        testColumn_4.addChip(player2.getChip());

        boolean result = isRowHaveWinPosition.searchWinPosition(gameArea, player2);

        assertTrue(result);
    }

    @Test
    public void RowWinPosition_Row_1_Win_1_4() {
        prepare();
        Column testColumn_1 = Column.getColumn(gameArea, 0);
        Column testColumn_2 = Column.getColumn(gameArea, 1);
        Column testColumn_3 = Column.getColumn(gameArea, 2);
        Column testColumn_4 = Column.getColumn(gameArea, 3);
        Column testColumn_5 = Column.getColumn(gameArea, 4);
        Column testColumn_6 = Column.getColumn(gameArea, 5);
        Column testColumn_7 = Column.getColumn(gameArea, 6);

        testColumn_1.addChip(player1.getChip());
        testColumn_2.addChip(player2.getChip());
        testColumn_3.addChip(player1.getChip());
        testColumn_4.addChip(player2.getChip());
        testColumn_5.addChip(player1.getChip());
        testColumn_6.addChip(player2.getChip());
        testColumn_7.addChip(player2.getChip());

        testColumn_1.addChip(player1.getChip());
        testColumn_2.addChip(player2.getChip());
        testColumn_3.addChip(player2.getChip());
        testColumn_4.addChip(player2.getChip());
        testColumn_5.addChip(player2.getChip());

        boolean result = isRowHaveWinPosition.searchWinPosition(gameArea, player2);

        assertTrue(result);
    }

    @Test
    public void RowWinPosition_Row_1_Win_2_5() {
        prepare();
        Column testColumn_1 = Column.getColumn(gameArea, 0);
        Column testColumn_2 = Column.getColumn(gameArea, 1);
        Column testColumn_3 = Column.getColumn(gameArea, 2);
        Column testColumn_4 = Column.getColumn(gameArea, 3);
        Column testColumn_5 = Column.getColumn(gameArea, 4);
        Column testColumn_6 = Column.getColumn(gameArea, 5);
        Column testColumn_7 = Column.getColumn(gameArea, 6);

        testColumn_1.addChip(player1.getChip());
        testColumn_2.addChip(player2.getChip());
        testColumn_3.addChip(player1.getChip());
        testColumn_4.addChip(player2.getChip());
        testColumn_5.addChip(player1.getChip());
        testColumn_6.addChip(player2.getChip());
        testColumn_7.addChip(player2.getChip());

        testColumn_1.addChip(player1.getChip());
        testColumn_2.addChip(player1.getChip());
        testColumn_3.addChip(player2.getChip());
        testColumn_4.addChip(player2.getChip());
        testColumn_5.addChip(player2.getChip());
        testColumn_6.addChip(player2.getChip());

        boolean result = isRowHaveWinPosition.searchWinPosition(gameArea, player2);

        assertTrue(result);
    }

    @Test
    public void RowWinPosition_Row_1_Win_3_6() {
        prepare();
        Column testColumn_1 = Column.getColumn(gameArea, 0);
        Column testColumn_2 = Column.getColumn(gameArea, 1);
        Column testColumn_3 = Column.getColumn(gameArea, 2);
        Column testColumn_4 = Column.getColumn(gameArea, 3);
        Column testColumn_5 = Column.getColumn(gameArea, 4);
        Column testColumn_6 = Column.getColumn(gameArea, 5);
        Column testColumn_7 = Column.getColumn(gameArea, 6);

        testColumn_1.addChip(player1.getChip());
        testColumn_2.addChip(player2.getChip());
        testColumn_3.addChip(player1.getChip());
        testColumn_4.addChip(player2.getChip());
        testColumn_5.addChip(player1.getChip());
        testColumn_6.addChip(player2.getChip());
        testColumn_7.addChip(player2.getChip());

        testColumn_1.addChip(player1.getChip());
        testColumn_2.addChip(player1.getChip());
        testColumn_3.addChip(player1.getChip());
        testColumn_4.addChip(player2.getChip());
        testColumn_5.addChip(player2.getChip());
        testColumn_6.addChip(player2.getChip());
        testColumn_7.addChip(player2.getChip());

        boolean result = isRowHaveWinPosition.searchWinPosition(gameArea, player2);

        assertTrue(result);
    }

    @Test
    public void Row_1_NoWinPosition() {
        prepare();
        Column testColumn_1 = Column.getColumn(gameArea, 0);
        Column testColumn_2 = Column.getColumn(gameArea, 1);
        Column testColumn_3 = Column.getColumn(gameArea, 2);
        Column testColumn_4 = Column.getColumn(gameArea, 3);
        Column testColumn_5 = Column.getColumn(gameArea, 4);
        Column testColumn_6 = Column.getColumn(gameArea, 5);
        Column testColumn_7 = Column.getColumn(gameArea, 6);

        testColumn_1.addChip(player1.getChip());
        testColumn_2.addChip(player2.getChip());
        testColumn_3.addChip(player1.getChip());
        testColumn_4.addChip(player2.getChip());
        testColumn_5.addChip(player1.getChip());
        testColumn_6.addChip(player2.getChip());
        testColumn_7.addChip(player2.getChip());

        testColumn_1.addChip(player1.getChip());
        testColumn_2.addChip(player2.getChip());
        testColumn_3.addChip(player1.getChip());
        testColumn_4.addChip(player2.getChip());
        testColumn_5.addChip(player1.getChip());
        testColumn_6.addChip(player2.getChip());
        testColumn_7.addChip(player2.getChip());

        boolean result = isRowHaveWinPosition.searchWinPosition(gameArea, player2);

        assertFalse(result);
    }
}