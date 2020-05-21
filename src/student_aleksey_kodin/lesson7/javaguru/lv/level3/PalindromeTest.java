package student_aleksey_kodin.lesson7.javaguru.lv.level3;

class PalindromeTest {
    private static final Palindrome palindrome = new Palindrome();


    public static void main(String[] args) {
        System.out.println(palindrome.isPalindrome("жоож"));

        StringBuilder palindrome = new StringBuilder().append("asdfgg").reverse();

       if (palindrome.toString().equals("asdfgg")) {
            System.out.println("Is true");
        } else {
            System.out.println("Is false");
        }
    }
}
