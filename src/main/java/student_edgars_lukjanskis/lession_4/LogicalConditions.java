package student_edgars_lukjanskis.lession_4;

class LogicalConditions {


    public static void main(String[] args) {
        int number = 10;

        boolean isBiggerThan10 = number > 10;
        boolean isLessThan20 = number < 20;

        // && - and
        boolean inInterval = isBiggerThan10 && isLessThan20;

        inInterval = (number > 10) && (number < 20);

        // || - or
        inInterval = (number < 10) || (number > 20);

        if ((number < 10) || (number > 20)){
            System.out.println("Out of Range !");
        }

        if ((number > 10) && (number < 20)){
            System.out.println("In Range !");
        }



    }

}
