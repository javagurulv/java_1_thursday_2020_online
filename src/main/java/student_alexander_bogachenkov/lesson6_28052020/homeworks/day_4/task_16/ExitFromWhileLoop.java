package student_alexander_bogachenkov.lesson6_28052020.homeworks.day_4.task_16;

class ExitFromWhileLoop {

    public static void main(String[] args) {

        int i = 1;
        while (i > 0) {
            System.out.println("This is endless While loop!");
            i++;
            //выйти из бесконечного цикла можно с помощью оператора break.

            if (i == 10) {
                break;
            }
        }
    }
}
