package student_aleksey_kodin.lesson9.levelx.supertask_1.logic;

import org.junit.Test;
import student_aleksey_kodin.lesson9.levelx.supertask_1.Column;
import student_aleksey_kodin.lesson9.levelx.supertask_1.Player;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class IsDrawTest {
    List<Column> gameArea = new ArrayList<>();
    IsDraw isDraw = new IsDraw();

    @Test
    public void checkDraw() {
        prepare();
        fillAllColumns();

        boolean result = isDraw.checkDraw(gameArea);

        assertTrue(result);
    }

    @Test
    public void checkNoDraw() {
        prepare();
        fillColumnsLastColumnEmpty();
        boolean result = isDraw.checkDraw(gameArea);

        assertFalse(result);
    }

    @Test
    public void checkNoDraw_2_Empty_Game_Board() {
        prepare();
        boolean result = isDraw.checkDraw(gameArea);

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

    private void fillColumnsLastColumnEmpty() {
        for (Column column : gameArea) {
            for (int i = 0; i < 5; i++) {
                column.addChip(0);
            }
        }
    }
}