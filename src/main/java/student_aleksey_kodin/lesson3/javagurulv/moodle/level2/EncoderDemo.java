package student_aleksey_kodin.lesson3.javagurulv.moodle.level2;

import java.util.Random;
import java.util.Scanner;

class EncoderDemo {

    public static void main(String[] args) {

        Encoder encoder = new Encoder();

                encoder.encode((short) new Random().nextInt(255));
                System.out.println(encoder.getCode() + " => " + "'" + encoder.getSymbol() + "'");

                encoder.decode((char) new Random().nextInt(255));
                System.out.println("'" + encoder.getSymbol() + "'" + " => "  + encoder.getCode());

                System.out.println();
                System.out.println("Enter text:");
                String strText = new Scanner(System.in).nextLine();

                System.out.println(strText);
                System.out.println("Use 'For' Loop:");
                System.out.println(ConvertTextToCode(encoder, strText));
                System.out.println("Use Recursion Function:");
                System.out.println(ConvertTextToCodeRecursion(encoder,strText,strText.length()));

    }
     static String ConvertTextToCode(Encoder encoder, String text) {
       StringBuilder strTempText = new StringBuilder();

        for(int iCount = 0; iCount < text.length(); iCount++) {
            encoder.decode(text.charAt(iCount));
            strTempText.append(encoder.getCode()).append(" ");
        }
     return strTempText.toString();
    }

    static String ConvertTextToCodeRecursion(Encoder encoder, String text, int iTextLength) {
    String strCode;
            if (iTextLength == 0) {
                return "";
            }
            encoder.decode(text.charAt(0));
            strCode = encoder.getCode() + " ";
            return strCode + ConvertTextToCodeRecursion(encoder, text.substring(1,iTextLength),iTextLength - 1);
    }
}
