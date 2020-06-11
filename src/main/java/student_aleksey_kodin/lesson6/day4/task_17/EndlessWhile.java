package student_aleksey_kodin.lesson6.day4.task_17;

class EndlessWhile {
    public static void main(String[] args) {
        int count = 1;
        while (true) {
            System.out.println(count++);
            if (count == 5) break;
        }
        System.out.println("Break 'while' ");
    }
}
