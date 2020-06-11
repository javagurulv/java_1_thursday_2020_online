package student_alexander_bogachenkov.lesson6_28052020.homeworks.day_4.task_16;

class ExitFromForLoop {

    public static void main(String[] args) {

        for (int i = 1; i > 0; i++) {
            System.out.println("This is endless For loop!");
            //выйти из бесконечного цикла можно с помощью оператора break.

            if (i == 10) {
                break;
            }
        }
    }
}
