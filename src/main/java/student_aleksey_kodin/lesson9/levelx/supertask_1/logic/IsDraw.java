package student_aleksey_kodin.lesson9.levelx.supertask_1.logic;

import student_aleksey_kodin.lesson9.levelx.supertask_1.Column;

import java.util.List;

public class IsDraw {  // IsDrawDetector??

    public boolean checkDraw(List<Column> gameArea) {

        int counterFillingColumns = 0;
        for (int i = 0; i < 7; i++) {
            if (Column.getColumn(gameArea, i).isFull()) {
                counterFillingColumns++;
            }
        }
        return counterFillingColumns == 7;
    }
}
