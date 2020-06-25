package student_diana_miranovica.lesson_7.homework.day_6.task_12;

public class PalindromeTest {

    public static void main(String[] args) {
        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.isPalindromeTest();

    }

    public void isPalindromeTest(){
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindromeReverseTheString("Able was I ere I saw Elba");
        printResult(result);
        boolean result2 = palindrome.isPalindromeReverseTheString("Just a text");
        printResult(result2);
    }

    public void printResult(boolean result){
        if (result){
            System.out.println("It's a palindrome");
        }else {
            System.out.println("It's not a palindrome");
        }
    }
}
