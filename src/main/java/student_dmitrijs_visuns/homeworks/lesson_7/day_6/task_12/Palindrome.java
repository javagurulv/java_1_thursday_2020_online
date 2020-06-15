package student_dmitrijs_visuns.homeworks.lesson_7.day_6.task_12;

import java.util.Arrays;

class Palindrome {

    public boolean isPalindrome(String text) {
        return Arrays.equals(createCharArrayFromText(text), createReversedCharArrayFromText(text));
    }

    public char[] createCharArrayFromText (String text) {
        String transformedText = text.replaceAll("[^A-Za-zА-Яа-я0-9]", "").toLowerCase();
        char[] charArrayFromText = transformedText.toCharArray();
        return charArrayFromText;
    }


    public char[] createReversedCharArrayFromText (String text) {
        String transformedText = text.replaceAll("[^A-Za-zА-Яа-я0-9]", "").toLowerCase();
        String reversedText = new StringBuilder(transformedText).reverse().toString();
        char[] reversedCharArrayFromText = reversedText.toCharArray();
        return reversedCharArrayFromText;
    }


}
