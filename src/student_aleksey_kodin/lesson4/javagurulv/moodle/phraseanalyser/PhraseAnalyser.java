package student_aleksey_kodin.lesson4.javagurulv.moodle.phraseanalyser;

class PhraseAnalyser {

    public String analyse(String text) {
        int iTextLength = text.length();

        String substring = text.substring(iTextLength - 11,iTextLength);

        if (text.startsWith("Make") && substring.equals("great again")) {
            return "It stands no chance";
        }else if (text.startsWith("Make") || substring.equals("great again")) {
            return "It could be worse";
        } else {
            return "It is fine, really";
        }
    }
}
