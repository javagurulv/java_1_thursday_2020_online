package student_vadims_vladisevs.lesson7.day_6.Task_12;

import java.util.Arrays;

class Palindrome {

    public boolean isPalindrome(String text){
        char[] charArray = modifyText(text).toCharArray();
        char[] rotatedArray = arrayRotation(modifyText(text).toCharArray());
        return Arrays.equals(charArray,rotatedArray);
    }

    public String modifyText(String text){
        text = text.replaceAll("\\s", "");
        text = text.replaceAll("[^a-zA-Zа-яА-Я]", "");
        return text.toLowerCase();
    }

    public char[] arrayRotation(char[] array){
        for (int i = 0; i < array.length / 2; i++){
            char tempValue = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = tempValue;
        }
        return array;
    }
}
