package student_aleksey_kodin.lesson7.javaguru.lv.moodle.level3;

class PalindromeTest {
    private static final Palindrome palindrome = new Palindrome();


    public static void main(String[] args) {
        System.out.println(palindrome.isPalindrome("cooooc"));

        StringBuilder palindrome = new StringBuilder().append("cooooc").reverse();

       if (palindrome.toString().equals("cooooc")) {
            System.out.println("Is true");
        } else {
            System.out.println("Is false");
        }
    }
}
