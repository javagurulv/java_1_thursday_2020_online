package student_aleksey_kodin.lesson6.day4.task_16;

class EndlessWhile {
    public static void main(String[] args) {
        int count = 1;
        endless:
        while (true) {
            System.out.println(count++);
            break endless;
        }
        System.out.println("Break 'while' ");
    }
}
