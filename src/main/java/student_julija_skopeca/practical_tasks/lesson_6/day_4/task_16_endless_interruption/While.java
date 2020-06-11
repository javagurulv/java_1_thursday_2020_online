package student_julija_skopeca.practical_tasks.lesson_6.day_4.task_16_endless_interruption;

import java.util.Scanner;

class While {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Keep calm");
            System.out.print("Enter a special number: ");
            int specialNumber = sc.nextInt();
            if (specialNumber == 3){
                break;}
        }
    }
}
