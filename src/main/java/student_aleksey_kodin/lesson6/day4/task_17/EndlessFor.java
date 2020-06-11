package student_aleksey_kodin.lesson6.day4.task_17;

class EndlessFor {

    public static void main(String[] args) {
        for(int count = 0;;count++) {
            System.out.println(count);
            if (count == 5) break;;
        }
        System.out.println("Break 'for' ");
    }
}
