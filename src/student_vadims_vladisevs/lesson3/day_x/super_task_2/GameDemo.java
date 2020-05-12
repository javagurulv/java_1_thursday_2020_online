package student_vadims_vladisevs.lesson3.day_x.super_task_2;

class GameDemo {
    public static void main(String[] args) {

        Game game = new Game();

        for (int i = 1; i < 10; i++) {
            System.out.println("Roll count: " + i);
            game.roll();
            System.out.println("Result: " + game.score());
            System.out.println("----------");
        }

        game.finalRoll();
    }
}