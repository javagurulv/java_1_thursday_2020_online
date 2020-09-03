package student_aleksey_kodin.lesson15.level_6.logic;

public class Report {
    private String reportString = "";

    public void addStringToReport(String newString) {
        reportString = reportString + newString;
    }

    public void showReport() {
        System.out.println(reportString);
    }
}
