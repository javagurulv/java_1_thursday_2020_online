package student_vadim_sokolenko.Lesson6HomeWorks.Day4;

public class Task17ForLoopStop {

    public static void main(String[] args) {
        for (int i = 0;; i++) {
            System.out.println(i + "Endless Loop");
            if (i == 100) {
                break;
            }
        }
        System.out.println("Endless Loop Stop");

        }
    }

