package student_julija_skopeca.practical_tasks.lesson_7.level_6.task_10;

class PowerCalculator {

    public int exponentation(int enteredNumber, int degree){
        int result = enteredNumber;
        for (int i = 1; i < degree; i++){
            result *= enteredNumber;
        }
        return result;
    }
}
