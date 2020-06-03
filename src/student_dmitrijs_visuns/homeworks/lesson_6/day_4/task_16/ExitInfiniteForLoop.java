package student_dmitrijs_visuns.homeworks.lesson_6.day_4.task_16;

class ExitInfiniteForLoop {

    public static void main(String[] args) {

        int i = 0;
        for ( ; ; ) {
            System.out.println("I am INFINITE!");
            i++;

            if (i > 20) {
                System.out.println("Oops... Not infinite");
                break;
            }
        }
    }

}
