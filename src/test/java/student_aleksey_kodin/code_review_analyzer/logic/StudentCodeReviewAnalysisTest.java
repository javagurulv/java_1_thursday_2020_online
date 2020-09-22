package student_aleksey_kodin.code_review_analyzer.logic;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StudentCodeReviewAnalysisTest {
    StudentCodeReviewAnalysis studentCodeReviewAnalysis = new StudentCodeReviewAnalysis();
    Report report = new Report();

    @Test
    public void testStudentMakeAnswer_1() throws ClassNotFoundException {
        List<String> classesPath = Collections.singletonList("student_aleksey_kodin.lesson15.level_5.GildedRose");

        report = studentCodeReviewAnalysis.getAnalysis(classesPath,
                "student_aleksey_kodin.lesson15.level_5", report);

        int answersCount = studentCodeReviewAnalysis.getCodeReviewAnswers();
        assertEquals(answersCount, 1);
    }

    @Test
    public void testStudentMakeAnswer_2() throws ClassNotFoundException {
        List<String> classesPath = Arrays.asList("student_aleksey_kodin.lesson16.level_1_3.logic.Directions",
                "student_aleksey_kodin.lesson16.level_1_3.RoverMoveImpl",
                "student_aleksey_kodin.lesson16.level_4.MarsRover");

        report = studentCodeReviewAnalysis.getAnalysis(classesPath,
                "student_aleksey_kodin.lesson15.level_5", report);

        int answersCount = studentCodeReviewAnalysis.getCodeReviewAnswers();
        assertEquals(answersCount, 3);
    }

    @Test
    public void testStudentNoAnswer() throws ClassNotFoundException {
        List<String> classesPath = Collections.singletonList("student_aleksey_kodin.lesson15.level_5.Item");

        report = studentCodeReviewAnalysis.getAnalysis(classesPath, "student_aleksey_kodin.lesson15.level_5", report);

        int answersCount = studentCodeReviewAnalysis.getCodeReviewAnswers();
        assertEquals(answersCount, 0);
    }
}