package student_vadims_vladisevs.lesson_13.level_3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConwayGameOfLifeTest {

    private ConwayGameOfLife conwayGameOfLife = new ConwayGameOfLife();

    @Test
    public void ruleOne_v1(){
        boolean[][] field = new boolean[][]{  {false, false, false},
                                              {false, true, false},
                                              {false, false, false}};
        boolean[][] nextGeneration = conwayGameOfLife.calculateNextGeneration(field);
        assertFalse( nextGeneration[1][1]);
    }

    @Test
    public void ruleOne_v2(){
        boolean[][] field = new boolean[][]{  {false, false, false},
                                              {false, true, true},
                                              {false, false, false}};
        boolean[][] nextGeneration = conwayGameOfLife.calculateNextGeneration(field);
        assertFalse(nextGeneration[1][1]);
        assertFalse(nextGeneration[1][2]);
    }

    @Test
    public void ruleTwo_v1(){
        boolean[][] field = new boolean[][]{    {false, true, false},
                                                {true, true, true},
                                                {false, true, false}};
        boolean[][] nextGeneration = conwayGameOfLife.calculateNextGeneration(field);
        assertFalse(nextGeneration[1][1]);
    }

    @Test
    public void ruleTwo_v2(){
        boolean[][] field = new boolean[][]{       {true, true, true},
                                                   {true, true, true},
                                                   {true, true, true}};
        boolean[][] nextGeneration = conwayGameOfLife.calculateNextGeneration(field);
        assertFalse(nextGeneration[1][1]);
    }

    @Test
    public void ruleThree_v1(){
        boolean[][] field = new boolean[][]{       {false, true, false},
                                                   {false, true, true},
                                                   {false, true, false}};
        boolean[][] nextGeneration = conwayGameOfLife.calculateNextGeneration(field);
        assertTrue(nextGeneration[1][1]);
    }

    @Test
    public void ruleThree_v2(){
        boolean[][] field = new boolean[][]{    {false, false, false},
                                                {false, true, true},
                                                {false, true, false}};
        boolean[][] nextGeneration = conwayGameOfLife.calculateNextGeneration(field);
        assertTrue(nextGeneration[1][1]);
    }

    @Test
    public void ruleFour_v1(){
        boolean[][] field = new boolean[][]{  {false, false, false},
                                              {true, false, true},
                                              {false, true, false}};
        boolean[][] nextGeneration = conwayGameOfLife.calculateNextGeneration(field);
        assertTrue(nextGeneration[1][1]);
    }

    @Test
    public void ruleFour_v2(){
        boolean[][] field = new boolean[][]{    {true, true, true},
                                                {false, false, false},
                                                {false, false, false}};
        boolean[][] nextGeneration = conwayGameOfLife.calculateNextGeneration(field);
        assertTrue(nextGeneration[1][1]);
    }

    @Test
    public void calculateNextGeneration_v1() {

        boolean[][] field = new boolean[][]{{false, true, false},
                                            {false, true, false},
                                            {false, true, false}};

        boolean[][] actual = conwayGameOfLife.calculateNextGeneration(field);

        boolean[][] expected =  new boolean[][]{{false, false, false},
                                                {true, true, true},
                                                {false, false, false},};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void calculateNextGeneration_v2() {

        boolean[][] field = new boolean[][]{{false, false, false, false, false},
                                            {false, false, true, false, false},
                                            {false, false, true, false, false},
                                            {false, false, true, false, false},
                                            {false, false, false, false, false}};

        boolean[][] actual = conwayGameOfLife.calculateNextGeneration(field);

        boolean[][] expected =  new boolean[][]{{false, false, false, false, false},
                                                {false, false, false, false, false},
                                                {false, true, true, true, false},
                                                {false, false, false, false, false},
                                                {false, false, false, false, false}};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void calculateNextGeneration_v3() {

        boolean[][] field = new boolean[][]{{false, false, false, false, false},
                                            {false, false, true, false, false},
                                            {false, false, false, false, false},
                                            {false, false, true, false, false},
                                            {false, false, false, false, false}};

        boolean[][] actual = conwayGameOfLife.calculateNextGeneration(field);

        boolean[][] expected =  new boolean[][]{{false, false, false, false, false},
                                                {false, false, false, false, false},
                                                {false, false, false, false, false},
                                                {false, false, false, false, false},
                                                {false, false, false, false, false}};

        assertArrayEquals(expected, actual);
    }
}