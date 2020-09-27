package student_aleksey_kodin.code_review_analyzer.logic;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class TeacherCodeReviewAnalysisTest {
    TeacherCodeReviewAnalysis teacherCodeReviewAnalysis = new TeacherCodeReviewAnalysis();
    Report report = new Report();

    @Test
    public void codeReviewFailed_1() throws ClassNotFoundException {
        List<String> classesPath = Collections.singletonList("student_aleksey_kodin.lesson15.level_5.GildedRose");

        report = teacherCodeReviewAnalysis.getAnalysis(classesPath, "student_aleksey_kodin.lesson15.level_5", report);

        int classesCount = teacherCodeReviewAnalysis.getClassesCount();
        int codeReviewPassed = teacherCodeReviewAnalysis.getCodeReviewPassed();
        int codeReviewFailed = teacherCodeReviewAnalysis.getCodeReviewFailed();
        assertEquals(classesCount, 1);
        assertEquals(codeReviewPassed, 0);
        assertEquals(codeReviewFailed, 1);
    }

    @Test
    public void codeReviewFailed_2() throws ClassNotFoundException {
        List<String> classesPath = Arrays.asList("student_aleksey_kodin.lesson16.level_1_3.logic.Directions",
                "student_aleksey_kodin.lesson16.level_1_3.RoverMoveImpl",
                "student_aleksey_kodin.lesson16.level_4.MarsRover");

        report = teacherCodeReviewAnalysis.getAnalysis(classesPath,
                "student_aleksey_kodin.lesson15.level_5", report);

        int classesCount = teacherCodeReviewAnalysis.getClassesCount();
        int codeReviewPassed = teacherCodeReviewAnalysis.getCodeReviewPassed();
        int codeReviewFailed = teacherCodeReviewAnalysis.getCodeReviewFailed();
        assertEquals(classesCount, 3);
        assertEquals(codeReviewPassed, 0);
        assertEquals(codeReviewFailed, 3);
    }

    @Test
    public void codeReviewPassed_1() throws ClassNotFoundException {
        List<String> classesPath = Arrays.asList("student_aleksey_kodin.lesson16.level_1_3.logic.Directions",
                "student_aleksey_kodin.lesson16.level_1_3.RoverMoveImpl",
                "student_aleksey_kodin.lesson16.level_4.MarsRover",
                "student_aleksey_kodin.lesson15.level_1.WordsService");

        report = teacherCodeReviewAnalysis.getAnalysis(classesPath,
                "student_aleksey_kodin.lesson15.level_5", report);

        int classesCount = teacherCodeReviewAnalysis.getClassesCount();
        int codeReviewPassed = teacherCodeReviewAnalysis.getCodeReviewPassed();
        int codeReviewFailed = teacherCodeReviewAnalysis.getCodeReviewFailed();
        assertEquals(classesCount, 4);
        assertEquals(codeReviewPassed, 1);
        assertEquals(codeReviewFailed, 3);
    }

    @Test
    public void codeReviewPassed_2() throws ClassNotFoundException {
        List<String> classesPath = Arrays.asList("student_aleksey_kodin.lesson16.level_1_3.logic.Directions",
                "student_aleksey_kodin.lesson16.level_1_3.RoverMoveImpl",
                "student_aleksey_kodin.lesson16.level_4.MarsRover",
                "student_aleksey_kodin.lesson15.level_1.WordsService",
                "student_aleksey_kodin.lesson15.level_2.QuadraticEq");

        report = teacherCodeReviewAnalysis.getAnalysis(classesPath,
                "student_aleksey_kodin.lesson15.level_5", report);

        int classesCount = teacherCodeReviewAnalysis.getClassesCount();
        int codeReviewPassed = teacherCodeReviewAnalysis.getCodeReviewPassed();
        int codeReviewFailed = teacherCodeReviewAnalysis.getCodeReviewFailed();
        assertEquals(classesCount, 5);
        assertEquals(codeReviewPassed, 2);
        assertEquals(codeReviewFailed, 3);
    }

    @Test
    public void codeReviewNoAnnotation() throws ClassNotFoundException {
        List<String> classesPath = Arrays.asList("student_aleksey_kodin.lesson2.day1.Task_1",
                "student_aleksey_kodin.lesson2.day1.Task_2",
                "student_aleksey_kodin.lesson2.day2.Task_8");

        report = teacherCodeReviewAnalysis.getAnalysis(classesPath,
                "student_aleksey_kodin.lesson15.level_5", report);

        int classesCount = teacherCodeReviewAnalysis.getClassesCount();
        int codeReviewPassed = teacherCodeReviewAnalysis.getCodeReviewPassed();
        int codeReviewFailed = teacherCodeReviewAnalysis.getCodeReviewFailed();
        assertEquals(classesCount, 0);
        assertEquals(codeReviewPassed, 0);
        assertEquals(codeReviewFailed, 0);
    }
}