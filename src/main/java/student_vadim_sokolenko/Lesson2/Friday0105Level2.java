package student_vadim_sokolenko.Lesson2;

import java.util.Scanner;

class Friday0105Level2 {

    public static void main(String[] args) {

        //1. get first number from user ''+''
        Scanner myInput = new Scanner(System.in);
        float firstNumber = myInput.nextFloat();

        //2. get second number from user''+''
        float secondNumber = myInput.nextFloat();

        //3. first number + second number''+''
        float result = firstNumber + secondNumber;

        //4. print result to console''+''
        System.out.println("sum = " + result);

        //5. get fifth number from user''-''
        Scanner myInput2 = new Scanner(System.in);
        float fifthNumber = myInput.nextFloat();

        //6.get sixth number from user ''-''
        float sixthNumber = myInput.nextFloat();

        //.7 fifth number - sixth number ''-''
        float result2 = fifthNumber - sixthNumber;

        //.8 print result to console''-''
        System.out.println("min = " + result2);

        //.9 get seventh number from user ''*''
        Scanner myInput3 = new Scanner(System.in);
        float seventhNumber = myInput.nextFloat();

        //.10 get eight number from user ''*''
        float eightNumber = myInput.nextFloat();

        //.11 seventh * eighth number ''*''
        float result3 = seventhNumber * eightNumber;

        //.12 print result to console ''*''
        System.out.println("* = " + result3);

        //.13 get ninth number from user''/''
        Scanner muInput4 = new Scanner(System.in);
        float ninthNumber = myInput.nextFloat();

        //.14 get tenth number from user''/''
        float tenthNumber = myInput.nextFloat();

        //.15 ninth number / tenth number''/''
        float result4 = ninthNumber / tenthNumber;

        //.16 print result to console''/''
        System.out.println(" / =" + result4);


    }
}
