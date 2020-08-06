package student_alexander_bogachenkov.lesson13_23072020.homeworks.level_5;

class StringCalculator {

    int add(String numbers) throws NumberFormatException {
        if (numbers == null || numbers.equals("")) {
            return 0;
        }
        String[] numbersArray = numbers.split(",");
        int result = 0;
        for (String number : numbersArray) {
            result += Integer.parseInt(number);
        }
        return result;
    }

}
