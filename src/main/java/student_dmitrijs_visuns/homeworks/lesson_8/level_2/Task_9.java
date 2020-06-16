package student_dmitrijs_visuns.homeworks.lesson_8.level_2;

/*Внесите изменения в код программы так,
        чтобы можно было создать экземпляр класса
        ComputerPlayer. Класс ComputerPlayer должен
        наследоваться от класса Player. Изменения
        в код можно вносить только в класс ComputerPlayer.*/

class Task_9 {

    class Player {

        private String name;

        Player(String name) {
            this.name = name;
        }

    }

    class ComputerPlayer extends Player {

        ComputerPlayer (String name) {
            super(name);
        }

    }

}
