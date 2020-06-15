package student_vadims_vladisevs.lesson7.day_6.Task_12;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome = new Palindrome();

    @Test
    public void isPalindromeV1() {
        boolean result = palindrome.isPalindrome("А роза упала на лапу Азора!");
        assertTrue(result);
    }

    @Test
    public void isPalindromeV2() {
        boolean result = palindrome.isPalindrome("sum summus mus");
        assertTrue(result);
    }

    @Test
    public void isPalindromeV3() {
        boolean result = palindrome.isPalindrome("racecar");
        assertTrue(result);
    }

    @Test
    public void isPalindromeV4() {
        boolean result = palindrome.isPalindrome("Le,VEl");
        assertTrue(result);
    }

    @Test
    public void isPalindromeV5() {
        boolean result = palindrome.isPalindrome("RandOM, TexT!!");
        assertFalse(result);
    }
}