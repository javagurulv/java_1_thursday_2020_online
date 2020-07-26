package student_aleksey_kodin.lesson13.level5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class StringCalculator {
    int add(String numbers) {
        Pattern p = Pattern.compile("(\\d+)");
        Matcher m = p.matcher(numbers);

        int sum = 0;
        while (m.find()) {
            sum += Integer.parseInt(m.group(1));
        }
        return sum;
    }
}
