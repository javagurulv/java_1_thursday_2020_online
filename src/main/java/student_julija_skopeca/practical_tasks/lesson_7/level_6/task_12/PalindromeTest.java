package student_julija_skopeca.practical_tasks.lesson_7.level_6.task_12;

class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
    }

    public void test1() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome("racecar");
        if (result == true) {
            System.out.println("test1 - ok");
        } else {
            System.out.println("test1 - fail");
        }
    }

    public void test2() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome("Le,VEl");
        if (result == true) {
            System.out.println("test2 - ok");
        } else {
            System.out.println("test2 - fail");
        }
    }

    public void test3() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome("sum summus mus");
        if (result == true) {
            System.out.println("test3 - ok");
        } else {
            System.out.println("test3 - fail");
        }
    }

    public void test4() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome("А роза упала, на лапу Азора");
        if (result == true) {
            System.out.println("test4 - ok");
        } else {
            System.out.println("test4 - fail");
        }
    }

    public void test5() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome("Le,VEl alkjd");
        if (result == false) {
            System.out.println("test5 - ok");
        } else {
            System.out.println("test5 - fail");
        }
    }


}
