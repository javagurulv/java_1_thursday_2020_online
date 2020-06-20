package student_julija_skopeca.practical_tasks.lesson_7.level_6.task_12;

class Palindrome {

    public boolean isPalindrome(String text) {
            text = text.toLowerCase();
            text = text.replaceAll("[^a-zA-Zа-яА-Я]", "");
            int textLen = text.length();
            for(int i = 0; i < textLen / 2; i++)
                if(text.charAt(i) != text.charAt(textLen - i - 1))
                    return false;
            return true;
        }

}


//text = text.replaceAll("\\s","");



