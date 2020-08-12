package student_aleksey_kodin.lesson6.dayx.supertask2.tictactoe;

class start {
    public static void main(String[] args) {

        Player player_1 = new Player("Player 1", true, false, 0);
        Player player_2 = new Player("Player 2", false, false, 1);

        Game game = new Game();

        game.game(player_1, player_2);

    }
}
