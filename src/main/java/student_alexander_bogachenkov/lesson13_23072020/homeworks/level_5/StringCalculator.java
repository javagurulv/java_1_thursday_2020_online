package student_alexander_bogachenkov.lesson13_23072020.homeworks.level_5;

class StringCalculator {

    int add(String numbers) throws NumberFormatException {

        if (numbers == null || numbers.equals("")) {
            return 0;
        }
        char[] array = numbers.toCharArray();
        int result = 0;
        for (char number : array) {
            if (Character.isDigit(number)) {
                result += Character.digit(number, 10);
            }
        }
        return result;
    }

}
