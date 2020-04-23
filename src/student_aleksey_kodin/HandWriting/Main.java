package student_aleksey_kodin.HandWriting;

public class Main {

    public static void main(String[] args) {
        HandWriting clsHandWriting = new HandWriting();

        for (float i=25.45f; i<20000.45f; i = i+100) {
            clsHandWriting.setHandWriting(String.valueOf(i));
            System.out.println(clsHandWriting.getDigits() + " " + clsHandWriting.getHandWriting());
        }
        clsHandWriting.setHandWriting("999999,99");
        System.out.println(clsHandWriting.getDigits());
        System.out.println(clsHandWriting.getHandWriting());
    }
}
