package student_aleksey_kodin.lessonx.bowling_game.logic;

public class Report {
    private String report = "";

    public void addStringToReport(String newString) {
        report += newString;
    }

    public void showReport() {
        System.out.println(report);
    }
}
