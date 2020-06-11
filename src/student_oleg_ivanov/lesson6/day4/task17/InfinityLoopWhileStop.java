package student_oleg_ivanov.lesson6.day4.task17;

class InfinityLoopWhileStop {
    public static void main(String [] args){
        int i = 1;
        while (i > 0) {
            System.out.println(i + " Infinity loop");
            i++;
            if (i == 20) {
                break;
            }
        }
        System.out.println("Infinity Loop Stop");
    }
}
