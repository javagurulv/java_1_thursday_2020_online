package student_diana_miranovica.lesson4.lesson_code;

 class LogicalConditions {
    public static void main(String[] args) {
        int number = 10;



        boolean isLessThen20 = number < 20;
        boolean isBiggerThen10 = number >10;

        // && - and
        boolean inInterval = isBiggerThen10 && isLessThen20;

        inInterval = (number >10) && ( number < 20);

        // || - or
       inInterval = (number < 10) || (number >20);


        if((number < 10) || (number > 20)){
            System.out.println("Out of diapason");

        }
        if((number > 10) && (number < 20)){
            System.out.println("Inside diapason");

        }

    }
}
