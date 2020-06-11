package student_alexander_bogachenkov.lesson7_04062020.homeworks.day_6.task_12;

class PalindromeTest {

    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.palindromeTest1();
        test.palindromeTest2();
        test.palindromeTest3();
        test.palindromeTest4();
        test.palindromeTest5();
        test.palindromeTest6();
    }

    public void palindromeTest1() {
        Palindrome palindrome = new Palindrome();
        boolean expectedResult = true;
        boolean actualResult = palindrome.isPalindrome("racecar");

        if (actualResult == expectedResult) {
            System.out.println("palindromeTest1 PASSED");
        } else {
            System.out.println("palindromeTest1 FAILED");
        }
    }

    public void palindromeTest2() {
        Palindrome palindrome = new Palindrome();
        boolean expectedResult = true;
        boolean actualResult = palindrome.isPalindrome("level");

        if (actualResult == expectedResult) {
            System.out.println("palindromeTest2 PASSED");
        } else {
            System.out.println("palindromeTest2 FAILED");
        }
    }

    public void palindromeTest3() {
        Palindrome palindrome = new Palindrome();
        boolean expectedResult = true;
        boolean actualResult = palindrome.isPalindrome("sum summus mus");

        if (actualResult == expectedResult) {
            System.out.println("palindromeTest3 PASSED");
        } else {
            System.out.println("palindromeTest3 FAILED");
        }
    }

    public void palindromeTest4() {
        Palindrome palindrome = new Palindrome();
        boolean expectedResult = true;
        boolean actualResult = palindrome.isPalindrome("А роза упала на лапу Азора");

        if (actualResult == expectedResult) {
            System.out.println("palindromeTest4 PASSED");
        } else {
            System.out.println("palindromeTest4 FAILED");
        }
    }

    public void palindromeTest5() {
        Palindrome palindrome = new Palindrome();
        boolean expectedResult = false;
        boolean actualResult = palindrome.isPalindrome("read book");

        if (actualResult == expectedResult) {
            System.out.println("palindromeTest5 PASSED");
        } else {
            System.out.println("palindromeTest5 FAILED");
        }
    }

    public void palindromeTest6() {
        Palindrome palindrome = new Palindrome();
        boolean expectedResult = false;
        boolean actualResult = palindrome.isPalindrome("читать книгу");

        if (actualResult == expectedResult) {
            System.out.println("palindromeTest6 PASSED");
        } else {
            System.out.println("palindromeTest6 FAILED");
        }
    }
}
