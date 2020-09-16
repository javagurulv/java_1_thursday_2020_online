package student_igors_mihejevs.lesson_7.homework.level_6;

import org.junit.Test;
import static org.junit.Assert.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class PalindromeTest {

    @Test
    public void checkIfIsPalindrome() {
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.isPalindrome("rAceCar"));
        assertTrue(palindrome.isPalindrome("rAce,,,Ca:::r"));
        assertTrue(palindrome.isPalindrome("А роза упала на лапу Азора"));
    }

    @Test
    public void checkIfIsNotPalindrome() {
        Palindrome palindrome = new Palindrome();
        assertFalse(palindrome.isPalindrome("It's not palindrome"));
    }

}