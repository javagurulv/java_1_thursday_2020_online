package student_alexander_bogachenkov.lesson7_04062020.homeworks.day_6.task_12;

import java.util.Arrays;

class Palindrome {

    public boolean isPalindrome(String text) {
        String cleanText = text.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        String lowerCased = cleanText.toLowerCase();
        String reversed = new StringBuilder(lowerCased).reverse().toString();
        char[] arr = lowerCased.toCharArray();
        char[] reversedArr = reversed.toCharArray();
        return Arrays.equals(arr, reversedArr);
    }
}
