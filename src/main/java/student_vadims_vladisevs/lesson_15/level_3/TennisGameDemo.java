package student_vadims_vladisevs.lesson_15.level_3;

class TennisGameDemo {
    public static void main(String[] args) {
        TennisGame game = new TennisGameImpl("player1", "player2");
        System.out.println(game.score());
        game.wonPoint("player1");
        System.out.println(game.score());
        game.wonPoint("player2");
        System.out.println(game.score());
        game.wonPoint("player1");
        System.out.println(game.score());
        game.wonPoint("player2");
        System.out.println(game.score());
        game.wonPoint("player1");
        System.out.println(game.score());
        game.wonPoint("player2");
        System.out.println(game.score());
        game.wonPoint("player1");
        System.out.println(game.score());
        game.wonPoint("player2");
        System.out.println(game.score());
        game.wonPoint("player2");
        System.out.println(game.score());
        game.wonPoint("player2");
        System.out.println(game.score());

    }
}
