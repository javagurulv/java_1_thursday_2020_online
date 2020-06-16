package student_vadim_sokolenko.Lesson2;

import java.util.Scanner;

class Friday0105level1 {

    public static void main(String[] args) {
        //1. get first number from user ''+''

        Scanner myInput = new Scanner(System.in);
        int firstNumber = myInput.nextInt();

        //2. get second number from user''+''
        int secondNumber = myInput.nextInt();

        //3. first number + second number''+''
        int result = firstNumber + secondNumber;

        //4. print result to console''+''
        System.out.println("sum = " + result);

        //5. get fifth number from user''-''
        Scanner myInput2 = new Scanner(System.in);
        int fifthNumber = myInput.nextInt();

        //6.get sixth number from user ''-''
        int sixthNumber = myInput.nextInt();

        //.7 fifth number - sixth number ''-''
        int result2 = fifthNumber - sixthNumber;

        //.8 print result to console''-''
        System.out.println("min = " + result2);

        //.9 get seventh number from user ''*''
        Scanner myInput3 = new Scanner(System.in);
        int seventhNumber = myInput.nextInt();

        //.10 get eight number from user ''*''
        int eightNumber = myInput.nextInt();

        //.11 seventh * eighth number ''*''
        int result3 = seventhNumber * eightNumber;

        //.12 print result to console ''*''
        System.out.println("* = " + result3);

        //.13 get ninth number from user''/''
        Scanner muInput4 = new Scanner(System.in);
        int ninthNumber = myInput.nextInt();

        //.14 get tenth number from user''/''
        int tenthNumber = myInput.nextInt();

        //.15 ninth number / tenth number''/''
        int result4 = ninthNumber / tenthNumber;

        //.16 print result to console''/''
        System.out.println(" /=" + result4);


    }
}
