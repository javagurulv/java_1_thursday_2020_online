package student_aleksey_kodin.lesson9.levelx.supertask_1.logic;

import org.junit.Test;
import student_aleksey_kodin.lesson9.levelx.supertask_1.Column;
import student_aleksey_kodin.lesson9.levelx.supertask_1.Player;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class IsColumnHaveWinPositionTest {
    List<Column> gameArea = new ArrayList<>();
    IsColumnHaveWinPosition isColumnHaveWinPosition = new IsColumnHaveWinPosition();
    Player player1 = new Player("Name", 1);
    Player player2 = new Player("Name", 2);

    private void prepare() {
        for (int i = 0; i < 7; i++) {
            gameArea.add(new Column(i));
        }
    }

    @Test
    public void columnWinPosition0_3() {
        prepare();
        Column testColumn = Column.getColumn(gameArea, 0);
        testColumn.addChip(player1.getChip());
        testColumn.addChip(player1.getChip());
        testColumn.addChip(player1.getChip());
        testColumn.addChip(player1.getChip());
        boolean result = isColumnHaveWinPosition.searchWinPosition(gameArea, player1);

        assertTrue(result);
    }

    @Test
    public void columnWinPosition1_4() {
        prepare();
        Column testColumn = Column.getColumn(gameArea, 0);
        testColumn.addChip(player2.getChip());
        testColumn.addChip(player1.getChip());
        testColumn.addChip(player1.getChip());
        testColumn.addChip(player1.getChip());
        testColumn.addChip(player1.getChip());
        boolean result = isColumnHaveWinPosition.searchWinPosition(gameArea, player1);

        assertTrue(result);
    }

    @Test
    public void columnWinPosition2_5() {
        prepare();
        Column testColumn = Column.getColumn(gameArea, 0);
        testColumn.addChip(player2.getChip());
        testColumn.addChip(player2.getChip());
        testColumn.addChip(player1.getChip());
        testColumn.addChip(player1.getChip());
        testColumn.addChip(player1.getChip());
        testColumn.addChip(player1.getChip());
        boolean result = isColumnHaveWinPosition.searchWinPosition(gameArea, player1);

        assertTrue(result);
    }

    @Test
    public void columnWinPosition1_4_Position_CanNotBe() {
        prepare();
        Column testColumn = Column.getColumn(gameArea, 0);
        testColumn.addChip(player2.getChip());
        testColumn.addChip(player1.getChip());
        testColumn.addChip(player1.getChip());
        testColumn.addChip(player1.getChip());
        testColumn.addChip(player1.getChip());
        testColumn.addChip(player2.getChip());
        boolean result = isColumnHaveWinPosition.searchWinPosition(gameArea, player1);

        assertTrue(result);
    }

    @Test
    public void columnNoWinPosition() {
        prepare();
        Column testColumn = Column.getColumn(gameArea, 0);
        testColumn.addChip(player2.getChip());
        testColumn.addChip(player1.getChip());
        testColumn.addChip(player2.getChip());
        testColumn.addChip(player1.getChip());
        testColumn.addChip(player2.getChip());
        testColumn.addChip(player2.getChip());
        boolean result = isColumnHaveWinPosition.searchWinPosition(gameArea, player1);

        assertFalse(result);
    }
}