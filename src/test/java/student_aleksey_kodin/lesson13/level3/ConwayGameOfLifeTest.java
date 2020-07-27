package student_aleksey_kodin.lesson13.level3;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConwayGameOfLifeTest {

    private final GameOfLifeNextGenerationCalculator conwayGameOfLife = new GameOfLifeNextGenerationCalculator();
    private final boolean[][] field = new boolean[3][3];

    @Test
    public void numberAliveCell_0() {
        field[1][1] = true;
        int result = conwayGameOfLife.countAliveCell(field,1,1);

        assertEquals(result,0);
    }

    @Test
    public void numberAliveCell_1_v1() {
        field[1][1] = true;
        field[0][1] = true;
        int result = conwayGameOfLife.countAliveCell(field,1,1);

        assertEquals(result,1);
    }

    @Test
    public void numberAliveCell_1_v2() {
        field[1][1] = true;
        field[2][1] = true;
        int result = conwayGameOfLife.countAliveCell(field,1,1);

        assertEquals(result,1);
    }

    @Test
    public void numberAliveCell_1_v3() {
        field[1][1] = true;
        field[0][0] = true;
        int result = conwayGameOfLife.countAliveCell(field,1,1);

        assertEquals(result,1);
    }

    @Test
    public void numberAliveCell_1_v4() {
        field[1][1] = true;
        field[0][1] = true;
        int result = conwayGameOfLife.countAliveCell(field,1,1);

        assertEquals(result,1);
    }

    @Test
    public void numberAliveCell_1_v5() {
        field[1][1] = true;
        field[0][2] = true;
        int result = conwayGameOfLife.countAliveCell(field,1,1);

        assertEquals(result,1);
    }

    @Test
    public void numberAliveCell_1_v6() {
        field[1][1] = true;
        field[2][0] = true;
        int result = conwayGameOfLife.countAliveCell(field,1,1);

        assertEquals(result,1);
    }

    @Test
    public void numberAliveCell_1_v7() {
        field[1][1] = true;
        field[2][1] = true;
        int result = conwayGameOfLife.countAliveCell(field,1,1);

        assertEquals(result,1);
    }

    @Test
    public void numberAliveCell_1_v8() {
        field[1][1] = true;
        field[2][2] = true;
        int result = conwayGameOfLife.countAliveCell(field,1,1);

        assertEquals(result,1);
    }

    @Test
    public void numberAliveCell_2_v1() {
        field[1][1] = true;
        field[0][1] = true;
        field[0][2] = true;
        int result = conwayGameOfLife.countAliveCell(field,1,1);

        assertEquals(result,2);
    }

    @Test
    public void numberAliveCell_2_v2() {
        field[1][1] = true;
        field[0][0] = true;
        field[0][1] = true;
        int result = conwayGameOfLife.countAliveCell(field,1,1);

        assertEquals(result,2);
    }

    @Test
    public void numberAliveCell_2_v3() {
        field[1][1] = true;
        field[0][1] = true;
        field[0][2] = true;
        int result = conwayGameOfLife.countAliveCell(field,1,1);

        assertEquals(result,2);
    }

    @Test
    public void numberAliveCell_2_v4() {
        field[1][1] = true;
        field[0][0] = true;
        field[0][2] = true;
        int result = conwayGameOfLife.countAliveCell(field,1,1);

        assertEquals(result,2);
    }

    @Test
    public void numberAliveCell_2_v5() {
        field[1][1] = true;
        field[2][0] = true;
        field[2][1] = true;
        int result = conwayGameOfLife.countAliveCell(field,1,1);

        assertEquals(result,2);
    }

    @Test
    public void numberAliveCell_2_v6() {
        field[1][1] = true;
        field[2][1] = true;
        field[2][2] = true;
        int result = conwayGameOfLife.countAliveCell(field,1,1);

        assertEquals(result,2);
    }

    @Test
    public void numberAliveCell_2_v7() {
        field[1][1] = true;
        field[2][0] = true;
        field[2][2] = true;
        int result = conwayGameOfLife.countAliveCell(field,1,1);

        assertEquals(result,2);
    }

    @Test
    public void numberAliveCell_3_v1() {
        field[1][1] = true;
        field[0][0] = true;
        field[0][1] = true;
        field[0][2] = true;
        int result = conwayGameOfLife.countAliveCell(field,1,1);

        assertEquals(result,3);
    }

    @Test
    public void numberAliveCell_3_v2() {
        field[1][1] = true;
        field[0][1] = true;
        field[0][2] = true;
        field[1][2] = true;
        int result = conwayGameOfLife.countAliveCell(field,1,1);

        assertEquals(result,3);
    }

    @Test
    public void numberAliveCell_3_v3() {
        field[1][1] = true;
        field[1][2] = true;
        field[2][2] = true;
        field[2][1] = true;
        int result = conwayGameOfLife.countAliveCell(field,1,1);

        assertEquals(result,3);
    }

    @Test
    public void numberAliveCell_3_v4() {
        field[1][1] = true;
        field[2][2] = true;
        field[2][1] = true;
        field[2][0] = true;
        int result = conwayGameOfLife.countAliveCell(field,1,1);

        assertEquals(result,3);
    }

    @Test
    public void numberAliveCell_3_v5() {
        field[1][1] = true;
        field[1][2] = true;
        field[0][2] = true;
        field[0][1] = true;
        int result = conwayGameOfLife.countAliveCell(field,1,1);

        assertEquals(result,3);
    }

    @Test
    public void numberAliveCell_3_v6() {
        field[1][1] = true;
        field[0][1] = true;
        field[0][0] = true;
        field[1][0] = true;
        int result = conwayGameOfLife.countAliveCell(field,1,1);

        assertEquals(result,3);
    }

    @Test
    public void numberAliveCell_3_v7() {
        field[1][1] = true;
        field[0][0] = true;
        field[0][2] = true;
        field[2][0] = true;
        int result = conwayGameOfLife.countAliveCell(field,1,1);

        assertEquals(result,3);
    }

    @Test
    public void numberAliveCell_3_v8() {
        field[1][1] = true;
        field[2][2] = true;
        field[2][0] = true;
        field[0][1] = true;
        int result = conwayGameOfLife.countAliveCell(field,1,1);

        assertEquals(result,3);
    }

    @Test
    public void numberAliveCell_3_v9() {
        field[1][1] = true;
        field[1][0] = true;
        field[0][1] = true;
        field[1][2] = true;
        int result = conwayGameOfLife.countAliveCell(field,1,1);

        assertEquals(result,3);
    }

    @Test
    public void numberAliveCell_3_v10() {
        field[1][1] = true;
        field[2][0] = true;
        field[2][1] = true;
        field[2][2] = true;
        int result = conwayGameOfLife.countAliveCell(field,1,1);

        assertEquals(result,3);
    }

    @Test
    public void numberAliveCell_3_v11() {
        fillTrue();
        int result = conwayGameOfLife.countAliveCell(field,0,0);

        assertEquals(result,3);
    }

    @Test
    public void numberAliveCell_3_v12() {
        fillTrue();
        int result = conwayGameOfLife.countAliveCell(field,2,0);

        assertEquals(result,3);
    }

    @Test
    public void numberAliveCell_3_v13() {
        fillTrue();
        int result = conwayGameOfLife.countAliveCell(field,2,2);

        assertEquals(result,3);
    }

    @Test
    public void numberAliveCell_3_v14() {
        fillTrue();
        int result = conwayGameOfLife.countAliveCell(field,0,2);

        assertEquals(result,3);
    }

    @Test
    public void numberAliveCell_5_v1() {
        fillTrue();
        int result = conwayGameOfLife.countAliveCell(field,0,1);

        assertEquals(result,5);
    }

    @Test
    public void numberAliveCell_5_v2() {
        fillTrue();
        int result = conwayGameOfLife.countAliveCell(field,2,1);

        assertEquals(result,5);
    }

    @Test
    public void numberAliveCell_5_v3() {
        fillTrue();
        int result = conwayGameOfLife.countAliveCell(field,1,2);

        assertEquals(result,5);
    }

    @Test
    public void numberAliveCell_5_v4() {
        fillTrue();
        int result = conwayGameOfLife.countAliveCell(field,0,1);

        assertEquals(result,5);
    }


    @Test
    public void numberAliveCell_8_v1() {
        fillTrue();
        int result = conwayGameOfLife.countAliveCell(field,1,1);

        assertEquals(result,8);
    }

    private void fillTrue() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                field[i][j] = true;
            }
        }
    }
}