package student_aleksey_kodin.lesson6.dayx.supertask2.tictactoe;

class Game {
    void game(Player player_1, Player player_2) {

        GameBoard gameBoard = new GameBoard();
        int[][] board = gameBoard.createGameBoard();

        player_1 = findPlayerWhoMoveFirst(player_1, player_2);
        player_2 = findPlayerWhoMoveSecond(player_1, player_2);

        WinPosition winPosition = new WinPosition();
        DrawPosition drawPosition = new DrawPosition();
        ComputerMove computerMove = new ComputerMove();
        HumanMove humanMove = new HumanMove();

        gameBoard.printGameBoardToConsole(board);

        while (true) {

            if (player_1.isPlayerHuman()) {
                humanMove.humanMove(player_1, board);
            } else if (computerMove.isComputerCanWin(board, player_1)) {
                board[computerMove.getRowWinPosition()][computerMove.getColumnWinPosition()] = player_1.getPlayerFigure();
                gameBoard.printGameBoardToConsole(board);
            } else if (computerMove.isCanWinOpponent(board, player_2)) {
                board[computerMove.getRowDefencePosition()][computerMove.getColumnDefencePosition()] = player_1.getPlayerFigure();
                gameBoard.printGameBoardToConsole(board);
            } else {
                computerMove.simpleNextMove(board, player_1);
                gameBoard.printGameBoardToConsole(board);
            }

            if (winPosition.checkToWin(board, player_1)) {
                break;
            }
            if ((drawPosition.checkToDraw(board))) {
                gameBoard.printGameBoardToConsole(board);
                break;
            }

            if (player_2.isPlayerHuman()) {
                humanMove.humanMove(player_2, board);
            } else if (computerMove.isComputerCanWin(board, player_2)) {
                board[computerMove.getRowWinPosition()][computerMove.getColumnWinPosition()] = player_2.getPlayerFigure();
                gameBoard.printGameBoardToConsole(board);
            } else if (computerMove.isCanWinOpponent(board, player_1)) {
                board[computerMove.getRowDefencePosition()][computerMove.getColumnDefencePosition()] = player_2.getPlayerFigure();
                gameBoard.printGameBoardToConsole(board);
            } else {
                computerMove.simpleNextMove(board, player_2);
                gameBoard.printGameBoardToConsole(board);
            }

            if (winPosition.checkToWin(board, player_2)) {
                break;
            }
            if ((drawPosition.checkToDraw(board))) {
                gameBoard.printGameBoardToConsole(board);
                break;
            }
        }
    }

    private Player findPlayerWhoMoveFirst(Player player_1, Player player_2) {
        if (player_1.isPlayerMoveFirst()) {
            return player_1;
        }
        return player_2;
    }

    private Player findPlayerWhoMoveSecond(Player player_1, Player player_2) {
        if (!player_1.isPlayerMoveFirst()) {
            return player_1;
        }
        return player_2;
    }
}
