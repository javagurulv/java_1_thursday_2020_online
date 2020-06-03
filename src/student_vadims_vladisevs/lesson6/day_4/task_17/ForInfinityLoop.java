package student_vadims_vladisevs.lesson6.day_4.task_17;

class ForInfinityLoop {
    public static void main(String[] args) {

        for (int i = 0; ; i++){
            System.out.println("Infinity loop!");

            if (i == 10){
                break;
            }
        }
        System.out.println("Infinity loop was stopped!");
    }
}
