package student_dmitrijs_visuns.homeworks.lesson_9.level_2.task_13;

class Task_13 {

    class ClassX {
        public ClassX(int i) {
            System.out.println(1);
        }
    }

    class ClassY extends ClassX {
        public ClassY(int i) {
            super(i);
            System.out.println(2);
        }
    }

}
