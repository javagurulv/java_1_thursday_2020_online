package student_dmitrijs_visuns.homeworks.lesson_13.level_5;

class StringCalculator {

    int add(String numbers) {

        if (numbers.isBlank()) {
            return 0;
        }

        char[] chars = numbers.toCharArray();

        int result = 0;
        for (char c : chars) {
            if (Character.isDigit(c)) {
                result = Character.getNumericValue(c) + result;
            }
        } return result;
    }
}


