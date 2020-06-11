package student_aleksey_kodin.lesson7.javaguru.lv.moodle.level3;

import java.util.Arrays;

class Palindrome {
    public boolean isPalindrome(String text) {
        char[] readyStringForReverse = prepareString(text);
        char[] reverseString = reverseString(readyStringForReverse);
        char[] referenceString = prepareString(text);

        return Arrays.equals(referenceString, reverseString);
    }
    private char[] prepareString(String stringForEqual) {
        stringForEqual = stringForEqual.replaceAll("[^a-zA-Zа-яА-Я]","")
                                       .replaceAll("\\s","")
                                       .toLowerCase();
        return stringForEqual.toCharArray();
    }
    private char[] reverseString(char[] arrayToReverse) {
        for (int count = 0; count < arrayToReverse.length / 2; count++) {
            char tempSaveLastArrayElement = arrayToReverse[arrayToReverse.length - 1 - count];

            arrayToReverse[arrayToReverse.length - 1 - count] = arrayToReverse[count];
            arrayToReverse[count] = tempSaveLastArrayElement;
        }
    return arrayToReverse;
    }
}
