package student_igors_mihejevs.lesson_6.day_4;

public class Task_17 {

    public static void main(String[] args) {

        for (int i = 0; i <=10; i++) {
            if (i == 5 ) continue;
            System.out.println("For : " + i);
        }
        int i = 0;
        while (i <= 10) {
            if (i == 5) {
                i++;
                continue;
            }
            System.out.println("While : " + i);
            i++;
        }
    }

}
