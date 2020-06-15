package student_dmitrijs_visuns.homeworks.lesson_7.day_6.task_12;

class PalindromeTest {

    public static void main(String[] args) {
        PalindromeTest newTest = new PalindromeTest();
        newTest.palindromeDetectionTest1();
        newTest.palindromeDetectionTest2();
        newTest.palindromeSpacesAndPunctuationTest();
        newTest.palindromeUppercaseLowercaseTest();
        newTest.palindromeOfNumbersTest();
    }


    public void palindromeDetectionTest1 () {
        Palindrome palindrome = new Palindrome();
        if (palindrome.isPalindrome("racecar")) {
            System.out.println("Palindrome detection test (text IS palindrome) - OK");
        } else {
            System.out.println("Palindrome detection test (text IS palindrome) - FAIL");
        }

    }

    public void palindromeDetectionTest2 () {
        Palindrome palindrome = new Palindrome();
        if (palindrome.isPalindrome("bamboopanda")) {
            System.out.println("Palindrome detection test (text IS NOT palindrome) - FAIL");
        } else {
            System.out.println("Palindrome detection test (text IS NOT palindrome) - OK");
        }

    }

    public void palindromeSpacesAndPunctuationTest () {
        Palindrome palindrome = new Palindrome();
        if (palindrome.isPalindrome("а, роза  упала. на? лапу   азора!")) {
            System.out.println("Palindrome with empty spaces and punctuation test - OK");
        } else {
            System.out.println("Palindrome with empty spaces and punctuation test - FAIL");
        }

    }

    public void palindromeUppercaseLowercaseTest () {
        Palindrome palindrome = new Palindrome();
        if (palindrome.isPalindrome("А Роза уПАЛА на лапУ АЗОРА")) {
            System.out.println("Palindrome uppercase/lowercase letters test - OK");
        } else {
            System.out.println("Palindrome uppercase/lowercase letters test - FAIL");
        }

    }

    public void palindromeOfNumbersTest () {
        Palindrome palindrome = new Palindrome();
        if (palindrome.isPalindrome("12321")) {
            System.out.println("Palindrome made of numbers test - OK");
        } else {
            System.out.println("Palindrome made of numbers test - FAIL");
        }

    }



}
