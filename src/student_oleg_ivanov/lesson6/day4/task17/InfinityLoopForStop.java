package student_oleg_ivanov.lesson6.day4.task17;

class InfinityLoopForStop {
    public static void main(String[] args){
        for (int i = 0;; i++) {
            System.out.println(i + " Infinity loop");
            if (i == 20) {
                break;
            }
        }
        System.out.println("Infinity Loop Stop");
    }
}
