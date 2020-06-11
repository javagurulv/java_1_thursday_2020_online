package student_oleg_ivanov.lesson6.day4.task16;

class InfinityLoopWhileStop {
    public static void main(String [] args){
        int i = 1;
        while (i > 0) {
            System.out.println("Infinity loop");
            i++;
            break;
        }
        System.out.println("Infinity Loop Stop");
    }
}
