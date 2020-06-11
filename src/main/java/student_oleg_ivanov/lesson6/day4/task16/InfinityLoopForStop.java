package student_oleg_ivanov.lesson6.day4.task16;

class InfinityLoopForStop {
    public static void main(String[] args){
        for (int i = 0;; i++) {
            System.out.println("Infinity loop");
            break;
        }
        System.out.println("Infinity Loop Stop");
    }
}
