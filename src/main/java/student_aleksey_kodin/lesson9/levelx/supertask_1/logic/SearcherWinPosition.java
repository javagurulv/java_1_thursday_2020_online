package student_aleksey_kodin.lesson9.levelx.supertask_1.logic;

import student_aleksey_kodin.lesson9.levelx.supertask_1.Column;
import student_aleksey_kodin.lesson9.levelx.supertask_1.Player;

import java.util.List;

public abstract class SearcherWinPosition {

    public abstract boolean searchWinPosition(List<Column> gameArea, Player player);
}
