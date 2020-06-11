package student_vadim_sokolenko.Lesson6HomeWorks.Day4;

public class Task17WhileLoopStop {

    public static void main(String[] args) {
        int i = 1;
        while (i>0){
            System.out.println(i + " Endless loop");
            i++;
            if(i==99){
                break;
            }
            System.out.println("Endless Loop stops at 99");
        }
    }
}
