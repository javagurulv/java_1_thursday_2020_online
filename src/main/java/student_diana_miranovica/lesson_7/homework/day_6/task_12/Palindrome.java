package student_diana_miranovica.lesson_7.homework.day_6.task_12;

 class Palindrome {

     boolean isPalindrome(String text){
         String clean = text.replaceAll("[ 0-9,А-Я,а-я,A-Z,a-z]","").toLowerCase();
         int length = clean.length();
         int forward = 0;
         int backward = length -1;
         while (backward > forward){
             char forwardChar = clean.charAt(forward++);
             char backwardChar = clean.charAt(backward--);
             if (forwardChar != backwardChar)
                 return false;
         }
         return true;
     }
     public boolean isPalindromeReverseTheString(String text) {
         StringBuilder reverse = new StringBuilder();
         String clean = text.replaceAll("\\s+", "").toLowerCase();
         char[] plain = clean.toCharArray();
         for (int i = plain.length - 1; i >= 0; i--) {
             reverse.append(plain[i]);
         }
         return (reverse.toString()).equals(clean);
     }
}
