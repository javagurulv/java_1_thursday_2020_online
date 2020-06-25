package student_aleksey_kodin.lesson9.levelx.supertask_1;

class Demo {

    public static void main(String[] args) {
        Game game = new Game();
        Player player1 = new Player("Player#1", 1);
        Player player2 = new Player("Player#2", 2);

        game.createGame();
        game.startGame(player1, player2);
    }
}
