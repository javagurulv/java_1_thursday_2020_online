package student_aleksey_kodin.lesson6.day4.task_16;

class EndlessFor {

    public static void main(String[] args) {
        endless:
        for(int count = 0;;count++) {
            System.out.println(count);
            break endless;
        }
       System.out.println("Break 'for' ");
    }
}
