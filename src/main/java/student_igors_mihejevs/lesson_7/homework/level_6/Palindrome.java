package student_igors_mihejevs.lesson_7.homework.level_6;

import java.util.Arrays;

public class Palindrome {

    boolean isPalindrome(String text) {
        String lowerCaseText = text.replaceAll("[^A-Za-zА-Яа-я0-9]", "").toLowerCase();
        char[] stringToCharArray = lowerCaseText.toCharArray();
        char[] stringToCharArrayReversed = new StringBuilder(lowerCaseText).reverse().toString().toCharArray();
        return Arrays.equals(stringToCharArray, stringToCharArrayReversed);
    }

}
