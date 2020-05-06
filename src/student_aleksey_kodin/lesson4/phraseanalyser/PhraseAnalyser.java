package student_aleksey_kodin.lesson4.phraseanalyser;

public class PhraseAnalyser {

    public String analyse(String text) {

        String substring = text.substring(text.length() - 11, text.length());

        if (text.startsWith("Make") && substring.equals("great again")) {
            return "It stands no chance";
        }else if (text.startsWith("Make") || substring.equals("great again")){
            return "It could be worse";
        } else {
            return "It is fine, really";
        }
    }
}
