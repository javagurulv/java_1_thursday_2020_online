package student_aleksey_kodin.lesson9.levelx.supertask_1.logic;

import org.junit.Test;
import student_aleksey_kodin.lesson9.levelx.supertask_1.Column;
import student_aleksey_kodin.lesson9.levelx.supertask_1.Player;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class IsDiagonalHaveWinPositionTest {
    List<Column> gameArea = new ArrayList<>();
    IsDiagonalHaveWinPosition isDiagonalHaveWinPosition = new IsDiagonalHaveWinPosition();
    Player player1 = new Player("Name", 1);

    @Test
    public void diagonalWinPosition_Right_1() {
        prepare();
        fillAllColumns();
        Column testColumn_0 = Column.getColumn(gameArea, 0);
        Column testColumn_1 = Column.getColumn(gameArea, 1);
        Column testColumn_2 = Column.getColumn(gameArea, 2);
        Column testColumn_3 = Column.getColumn(gameArea, 3);

        testColumn_3.addChip(0, player1.getChip());
        testColumn_2.addChip(1, player1.getChip());
        testColumn_1.addChip(2, player1.getChip());
        testColumn_0.addChip(3, player1.getChip());

        boolean result = isDiagonalHaveWinPosition.searchWinPosition(gameArea, player1);

        assertTrue(result);
    }

    @Test
    public void diagonalWinPosition_Right_2() {
        prepare();
        fillAllColumns();
        Column testColumn_1 = Column.getColumn(gameArea, 1);
        Column testColumn_2 = Column.getColumn(gameArea, 2);
        Column testColumn_3 = Column.getColumn(gameArea, 3);
        Column testColumn_4 = Column.getColumn(gameArea, 4);

        testColumn_4.addChip(0, player1.getChip());
        testColumn_3.addChip(1, player1.getChip());
        testColumn_2.addChip(2, player1.getChip());
        testColumn_1.addChip(3, player1.getChip());

        boolean result = isDiagonalHaveWinPosition.searchWinPosition(gameArea, player1);

        assertTrue(result);
    }

    @Test
    public void diagonalWinPosition_Right_3() {
        prepare();
        fillAllColumns();
        Column testColumn_2 = Column.getColumn(gameArea, 2);
        Column testColumn_3 = Column.getColumn(gameArea, 3);
        Column testColumn_4 = Column.getColumn(gameArea, 4);
        Column testColumn_5 = Column.getColumn(gameArea, 5);

        testColumn_5.addChip(0, player1.getChip());
        testColumn_4.addChip(1, player1.getChip());
        testColumn_3.addChip(2, player1.getChip());
        testColumn_2.addChip(3, player1.getChip());

        boolean result = isDiagonalHaveWinPosition.searchWinPosition(gameArea, player1);

        assertTrue(result);
    }

    @Test
    public void diagonalWinPosition_Right_4() {
        prepare();
        fillAllColumns();
        Column testColumn_3 = Column.getColumn(gameArea, 3);
        Column testColumn_4 = Column.getColumn(gameArea, 4);
        Column testColumn_5 = Column.getColumn(gameArea, 5);
        Column testColumn_6 = Column.getColumn(gameArea, 6);

        testColumn_6.addChip(0, player1.getChip());
        testColumn_5.addChip(1, player1.getChip());
        testColumn_4.addChip(2, player1.getChip());
        testColumn_3.addChip(3, player1.getChip());

        boolean result = isDiagonalHaveWinPosition.searchWinPosition(gameArea, player1);

        assertTrue(result);
    }

    @Test
    public void diagonalWinPosition_Right_5() {
        prepare();
        fillAllColumns();
        Column testColumn_3 = Column.getColumn(gameArea, 3);
        Column testColumn_4 = Column.getColumn(gameArea, 4);
        Column testColumn_5 = Column.getColumn(gameArea, 5);
        Column testColumn_6 = Column.getColumn(gameArea, 6);

        testColumn_6.addChip(1, player1.getChip());
        testColumn_5.addChip(2, player1.getChip());
        testColumn_4.addChip(3, player1.getChip());
        testColumn_3.addChip(4, player1.getChip());

        boolean result = isDiagonalHaveWinPosition.searchWinPosition(gameArea, player1);

        assertTrue(result);
    }

    @Test
    public void diagonalWinPosition_Right_6() {
        prepare();
        fillAllColumns();
        Column testColumn_3 = Column.getColumn(gameArea, 3);
        Column testColumn_4 = Column.getColumn(gameArea, 4);
        Column testColumn_5 = Column.getColumn(gameArea, 5);
        Column testColumn_6 = Column.getColumn(gameArea, 6);

        testColumn_6.addChip(2, player1.getChip());
        testColumn_5.addChip(3, player1.getChip());
        testColumn_4.addChip(4, player1.getChip());
        testColumn_3.addChip(5, player1.getChip());

        boolean result = isDiagonalHaveWinPosition.searchWinPosition(gameArea, player1);

        assertTrue(result);
    }

    @Test
    public void diagonalWinPosition_Right_7() {
        prepare();
        fillAllColumns();
        Column testColumn_0 = Column.getColumn(gameArea, 0);
        Column testColumn_1 = Column.getColumn(gameArea, 1);
        Column testColumn_2 = Column.getColumn(gameArea, 2);
        Column testColumn_3 = Column.getColumn(gameArea, 3);

        testColumn_0.addChip(4, player1.getChip());
        testColumn_1.addChip(3, player1.getChip());
        testColumn_2.addChip(2, player1.getChip());
        testColumn_3.addChip(1, player1.getChip());

        boolean result = isDiagonalHaveWinPosition.searchWinPosition(gameArea, player1);

        assertTrue(result);
    }

    @Test
    public void diagonalWinPosition_Right_8() {
        prepare();
        fillAllColumns();
        Column testColumn_0 = Column.getColumn(gameArea, 0);
        Column testColumn_1 = Column.getColumn(gameArea, 1);
        Column testColumn_2 = Column.getColumn(gameArea, 2);
        Column testColumn_3 = Column.getColumn(gameArea, 3);

        testColumn_0.addChip(5, player1.getChip());
        testColumn_1.addChip(4, player1.getChip());
        testColumn_2.addChip(3, player1.getChip());
        testColumn_3.addChip(2, player1.getChip());

        boolean result = isDiagonalHaveWinPosition.searchWinPosition(gameArea, player1);

        assertTrue(result);
    }

    @Test
    public void diagonalWinPosition_Right_9() {
        prepare();
        fillAllColumns();
        Column testColumn_1 = Column.getColumn(gameArea, 1);
        Column testColumn_2 = Column.getColumn(gameArea, 2);
        Column testColumn_3 = Column.getColumn(gameArea, 3);
        Column testColumn_4 = Column.getColumn(gameArea, 4);

        testColumn_1.addChip(5, player1.getChip());
        testColumn_2.addChip(4, player1.getChip());
        testColumn_3.addChip(3, player1.getChip());
        testColumn_4.addChip(2, player1.getChip());

        boolean result = isDiagonalHaveWinPosition.searchWinPosition(gameArea, player1);

        assertTrue(result);
    }

    @Test
    public void diagonalWinPosition_Right_10() {
        prepare();
        fillAllColumns();
        Column testColumn_2 = Column.getColumn(gameArea, 2);
        Column testColumn_3 = Column.getColumn(gameArea, 3);
        Column testColumn_4 = Column.getColumn(gameArea, 4);
        Column testColumn_5 = Column.getColumn(gameArea, 5);

        testColumn_2.addChip(5, player1.getChip());
        testColumn_3.addChip(4, player1.getChip());
        testColumn_4.addChip(3, player1.getChip());
        testColumn_5.addChip(2, player1.getChip());

        boolean result = isDiagonalHaveWinPosition.searchWinPosition(gameArea, player1);

        assertTrue(result);
    }

    @Test
    public void diagonalWinPosition_Left_1() {
        prepare();
        fillAllColumns();
        Column testColumn_0 = Column.getColumn(gameArea, 0);
        Column testColumn_1 = Column.getColumn(gameArea, 1);
        Column testColumn_2 = Column.getColumn(gameArea, 2);
        Column testColumn_3 = Column.getColumn(gameArea, 3);

        testColumn_0.addChip(2, player1.getChip());
        testColumn_1.addChip(3, player1.getChip());
        testColumn_2.addChip(4, player1.getChip());
        testColumn_3.addChip(5, player1.getChip());

        boolean result = isDiagonalHaveWinPosition.searchWinPosition(gameArea, player1);

        assertTrue(result);
    }

    @Test
    public void diagonalWinPosition_Left_2() {
        prepare();
        fillAllColumns();
        Column testColumn_0 = Column.getColumn(gameArea, 0);
        Column testColumn_1 = Column.getColumn(gameArea, 1);
        Column testColumn_2 = Column.getColumn(gameArea, 2);
        Column testColumn_3 = Column.getColumn(gameArea, 3);

        testColumn_0.addChip(1, player1.getChip());
        testColumn_1.addChip(2, player1.getChip());
        testColumn_2.addChip(3, player1.getChip());
        testColumn_3.addChip(4, player1.getChip());

        boolean result = isDiagonalHaveWinPosition.searchWinPosition(gameArea, player1);

        assertTrue(result);
    }

    @Test
    public void diagonalWinPosition_Left_3() {
        prepare();
        fillAllColumns();
        Column testColumn_0 = Column.getColumn(gameArea, 0);
        Column testColumn_1 = Column.getColumn(gameArea, 1);
        Column testColumn_2 = Column.getColumn(gameArea, 2);
        Column testColumn_3 = Column.getColumn(gameArea, 3);

        testColumn_0.addChip(0, player1.getChip());
        testColumn_1.addChip(1, player1.getChip());
        testColumn_2.addChip(2, player1.getChip());
        testColumn_3.addChip(3, player1.getChip());

        boolean result = isDiagonalHaveWinPosition.searchWinPosition(gameArea, player1);

        assertTrue(result);
    }

    @Test
    public void diagonalWinPosition_Left_4() {
        prepare();
        fillAllColumns();
        Column testColumn_1 = Column.getColumn(gameArea, 1);
        Column testColumn_2 = Column.getColumn(gameArea, 2);
        Column testColumn_3 = Column.getColumn(gameArea, 3);
        Column testColumn_4 = Column.getColumn(gameArea, 4);

        testColumn_1.addChip(0, player1.getChip());
        testColumn_2.addChip(1, player1.getChip());
        testColumn_3.addChip(2, player1.getChip());
        testColumn_4.addChip(3, player1.getChip());

        boolean result = isDiagonalHaveWinPosition.searchWinPosition(gameArea, player1);

        assertTrue(result);
    }

    @Test
    public void diagonalWinPosition_Left_5() {
        prepare();
        fillAllColumns();
        Column testColumn_2 = Column.getColumn(gameArea, 2);
        Column testColumn_3 = Column.getColumn(gameArea, 3);
        Column testColumn_4 = Column.getColumn(gameArea, 4);
        Column testColumn_5 = Column.getColumn(gameArea, 5);

        testColumn_2.addChip(0, player1.getChip());
        testColumn_3.addChip(1, player1.getChip());
        testColumn_4.addChip(2, player1.getChip());
        testColumn_5.addChip(3, player1.getChip());

        boolean result = isDiagonalHaveWinPosition.searchWinPosition(gameArea, player1);

        assertTrue(result);
    }

    @Test
    public void diagonalWinPosition_Left_6() {
        prepare();
        fillAllColumns();
        Column testColumn_3 = Column.getColumn(gameArea, 3);
        Column testColumn_4 = Column.getColumn(gameArea, 4);
        Column testColumn_5 = Column.getColumn(gameArea, 5);
        Column testColumn_6 = Column.getColumn(gameArea, 6);

        testColumn_3.addChip(0, player1.getChip());
        testColumn_4.addChip(1, player1.getChip());
        testColumn_5.addChip(2, player1.getChip());
        testColumn_6.addChip(3, player1.getChip());

        boolean result = isDiagonalHaveWinPosition.searchWinPosition(gameArea, player1);

        assertTrue(result);
    }

    @Test
    public void diagonalWinPosition_Left_7() {
        prepare();
        fillAllColumns();
        Column testColumn_1 = Column.getColumn(gameArea, 1);
        Column testColumn_2 = Column.getColumn(gameArea, 2);
        Column testColumn_3 = Column.getColumn(gameArea, 3);
        Column testColumn_4 = Column.getColumn(gameArea, 4);

        testColumn_4.addChip(5, player1.getChip());
        testColumn_3.addChip(4, player1.getChip());
        testColumn_2.addChip(3, player1.getChip());
        testColumn_1.addChip(2, player1.getChip());

        boolean result = isDiagonalHaveWinPosition.searchWinPosition(gameArea, player1);

        assertTrue(result);
    }

    @Test
    public void diagonalWinPosition_Left_8() {
        prepare();
        fillAllColumns();
        Column testColumn_2 = Column.getColumn(gameArea, 2);
        Column testColumn_3 = Column.getColumn(gameArea, 3);
        Column testColumn_4 = Column.getColumn(gameArea, 4);
        Column testColumn_5 = Column.getColumn(gameArea, 5);


        testColumn_5.addChip(5, player1.getChip());
        testColumn_4.addChip(4, player1.getChip());
        testColumn_3.addChip(3, player1.getChip());
        testColumn_2.addChip(2, player1.getChip());

        boolean result = isDiagonalHaveWinPosition.searchWinPosition(gameArea, player1);

        assertTrue(result);
    }

    @Test
    public void diagonalWinPosition_Left_9() {
        prepare();
        fillAllColumns();
        Column testColumn_3 = Column.getColumn(gameArea, 3);
        Column testColumn_4 = Column.getColumn(gameArea, 4);
        Column testColumn_5 = Column.getColumn(gameArea, 5);
        Column testColumn_6 = Column.getColumn(gameArea, 6);

        testColumn_6.addChip(5, player1.getChip());
        testColumn_5.addChip(4, player1.getChip());
        testColumn_4.addChip(3, player1.getChip());
        testColumn_3.addChip(2, player1.getChip());

        boolean result = isDiagonalHaveWinPosition.searchWinPosition(gameArea, player1);

        assertTrue(result);
    }

    @Test
    public void diagonalWinPosition_Left_10() {
        prepare();
        fillAllColumns();
        Column testColumn_3 = Column.getColumn(gameArea, 3);
        Column testColumn_4 = Column.getColumn(gameArea, 4);
        Column testColumn_5 = Column.getColumn(gameArea, 5);
        Column testColumn_6 = Column.getColumn(gameArea, 6);

        testColumn_6.addChip(4, player1.getChip());
        testColumn_5.addChip(3, player1.getChip());
        testColumn_4.addChip(2, player1.getChip());
        testColumn_3.addChip(1, player1.getChip());

        boolean result = isDiagonalHaveWinPosition.searchWinPosition(gameArea, player1);

        assertTrue(result);
    }

    @Test
    public void diagonalNoWinPosition_Empty_Game_Board() {
        prepare();

        boolean result = isDiagonalHaveWinPosition.searchWinPosition(gameArea, player1);

        assertFalse(result);
    }

    private void prepare() {
        for (int i = 0; i < 7; i++) {
            gameArea.add(new Column(i));
        }
    }

    private void fillAllColumns() {
        for (Column column : gameArea) {
            for (int i = 0; i < 6; i++) {
                column.addChip(0);
            }
        }
    }
}