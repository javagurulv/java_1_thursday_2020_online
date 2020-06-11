package student_aleksey_kodin.lesson7.day6.task12;

class PalindromeTest {
    private static final Palindrome palindrome = new Palindrome();

    public static void main(String[] args) {
        boolean result = palindrome.isPalindrome("racecar");
        printResult(result);
        boolean result2 = palindrome.isPalindrome("Это не палиндром");
        printResult(result2);
    }
    static void printResult(boolean result) {
        if (result) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is't palindrome");
        }
    }
}
