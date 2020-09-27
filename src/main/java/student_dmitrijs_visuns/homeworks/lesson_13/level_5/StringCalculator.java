package student_dmitrijs_visuns.homeworks.lesson_13.level_5;

class StringCalculator {

    int add(String numbers) {
        if (numbers.isBlank()) {
            return 0;
        }

        if (numbers.length()>2) {
          return 1;
        } return 2;
    }


    public static void main(String[] args) {
        String inp = "";
        /*int result = 0;
        String[] splitto = inp.split(",");
        for (String a : splitto) {
            Integer i = Integer.valueOf(a);
            result += i;
        }

        System.out.println(result);*/

        char[] symb = inp.toCharArray();

        int result = 0;
        for (char symbol : symb) {
            if (Character.isDigit(symbol)) {
                result = Character.getNumericValue(symbol) + result;
            }
        } System.out.println(result);

    }
}


