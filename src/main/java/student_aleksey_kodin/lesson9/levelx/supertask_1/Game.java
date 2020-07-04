package student_aleksey_kodin.lesson9.levelx.supertask_1;

import student_aleksey_kodin.lesson9.levelx.supertask_1.logic.*;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final List<Column> gameArea = new ArrayList<>();
    private final List<SearcherWinPosition> checkWin = new ArrayList<>();
    private final Monitor monitor = new Monitor();

    public Game() {
        IsColumnHaveWinPosition isColumnHaveWinPosition = new IsColumnHaveWinPosition();
        IsRowHaveWinPosition isRowHaveWinPosition = new IsRowHaveWinPosition();
        IsDiagonalHaveWinPosition isDiagonalHaveWinPosition = new IsDiagonalHaveWinPosition();
        checkWin.add(isColumnHaveWinPosition);
        checkWin.add(isRowHaveWinPosition);
        checkWin.add(isDiagonalHaveWinPosition);
    }

    public void createGame() {
        for (int i = 0; i < 7; i++) {
            gameArea.add(new Column(i));
        }
        monitor.printGameBoard(gameArea);
    }

    public void startGame(Player player_1, Player player_2) {
        IsDraw isDraw = new IsDraw();  // это не то место где надо создавать инстанцию таких классов
		// IsDraw - это класс который не содержит данные, а содержит алгоритм обработки данных
		// такие классы надо создавать в момент инициализации программы, а не в момент выполнения

        while (true) {
            List<Column> gameAreaAfterMovePlayer1 = player_1.makeMove(gameArea);
            monitor.printGameBoard(gameAreaAfterMovePlayer1);
            if (checkWin(checkWin, gameArea, player_1)) {
                System.out.println(player_1.getName() + " win");
                break;
            } else if (isDraw.checkDraw(gameArea)) {
                System.out.println("DRAW!!!");
                break;
            }

            List<Column> gameAreaAfterMovePlayer2 = player_2.makeMove(gameArea);
            monitor.printGameBoard(gameAreaAfterMovePlayer2);
            if (checkWin(checkWin, gameArea, player_2)) {
                System.out.println(player_2.getName() + " win");
                break;
            } else if (isDraw.checkDraw(gameArea)) {
                System.out.println("DRAW!!!");
                break;
            }
        }
    }

    private boolean checkWin(List<SearcherWinPosition> checkWin, List<Column> gameArea, Player player) {
        for (SearcherWinPosition searchWin : checkWin) {
            if (searchWin.searchWinPosition(gameArea, player)) {
                return true;
            }
        }
        return false;
    }
}
