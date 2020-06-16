package student_dmitrijs_visuns.homeworks.lesson_8.level_2;

/*Исправьте код программы так, что бы он компилировался.
        Изменения можно вносить только в класс HumanPlayer.*/


class   Task_8 {

    class Player {

        private String name;

        Player(String name) {
            this.name = name;
        }

    }

    class HumanPlayer extends Player {

        HumanPlayer(String name) {
            super(name);
        }

    }


}
