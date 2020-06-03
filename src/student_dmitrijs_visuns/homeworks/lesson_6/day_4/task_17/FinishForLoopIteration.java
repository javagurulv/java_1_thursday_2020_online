package student_dmitrijs_visuns.homeworks.lesson_6.day_4.task_17;

class FinishForLoopIteration {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};
        for (int i : array) {
            if (i == 40) {
                continue;
            }
            System.out.println(i);
        }

    }
}
