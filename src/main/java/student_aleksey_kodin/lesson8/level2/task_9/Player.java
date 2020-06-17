package student_aleksey_kodin.lesson8.level2.task_9;

class Player {
        private String name;

        Player(String name) {
            this.name = name;
        }

    static class ComputerPlayer extends Player {
            ComputerPlayer() {
                super("Player");
            }

    }
}
