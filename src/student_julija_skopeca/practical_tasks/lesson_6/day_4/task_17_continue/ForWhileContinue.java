package student_julija_skopeca.practical_tasks.lesson_6.day_4.task_17_continue;

class ForWhileContinue {

    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++){
            System.out.println(i + ": before continue!");
            if (i > 2)
                continue;
            System.out.println("     "+ i + ": with continue");
        }



        int i=1;
        while(i<=10){
            if(i==5){
               i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }


}

