package student_vadim_sokolenko.Lesson4;

class LogicalConditions {

    public static void main(String[] args) {

        int number = 10;

        boolean isPositive = number > 0;

        boolean isBiggerThen10 = number > 10;
        boolean isLessThen20 = number < 20;

        boolean inInterval = isBiggerThen10 && isLessThen20;

        inInterval = (number > 10) && (number < 20);

        inInterval = number > 10 && number < 20;

        inInterval = (number > 10) || (number < 20);

        if((inInterval = (number > 10) && (number < 20))){
            System.out.println("Out of diapazon");
        }
        if ((inInterval = (number > 10) && (number < 20))){
            System.out.println("Inside of Diapazon");}




        }
    }

