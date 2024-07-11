package io.zipcoder;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class StudentTest extends TestCase {

    public void testGetFirstName() {
    Student student = new Student("Stinky", "McStinky", null);
        Assert.assertEquals("Stinky", student.getFirstName());
    }

    public void testSetFirstName() {
        Student student = new Student("Stinky", "McStinky", null);
        student.setFirstName("Smelly");
        Assert.assertEquals("Smelly", student.getFirstName());
    }

    public void testGetLastName() {
        Student student = new Student("Stinky", "McStinky", null);
        Assert.assertEquals("McStinky", student.getLastName());
    }

    public void testSetLastName() {
        Student student = new Student("Stinky", "McStinky", null);
        student.setLastName("Smelly");
        Assert.assertEquals("Smelly", student.getLastName());
    }

    public void testGetExamScores() {
        ArrayList<Double> score = new ArrayList<>(2);
        score.add(100.0);
        score.add(95.0);
        score.add(123.0);
        score.add(96.0);

        String expected = "Exam Scores: " + '\n' +
                '\t' + "Exam 1 -> 100.0" + '\n' +
                '\t' + "Exam 2 -> 95.0" +'\n' +
                '\t' +"Exam 3 -> 123.0" +'\n' +
                '\t' +"Exam 4 -> 96.0" + '\n' ;

        Student student = new Student("Stinky", "McStinky", score);
        Assert.assertEquals(expected, student.getExamScores());
    }

    public void testGetNumberOfExamsTaken() {
        ArrayList<Double> score = new ArrayList<>(2);
        score.add(0, 20.1);
        score.add(1, 40.1);

        Student student = new Student("Stinky", "McStinky", score);
        Assert.assertEquals(2, student.getNumberOfExamsTaken());
    }

    public void testAddExamScore() {
        ArrayList<Double> scores = new ArrayList<Double>();
        scores.add(20.1);
        scores.add(40.1);

        Student student = new Student("Stinky", "McStinky", scores);
        student.addExamScore(10.1);

        String expected = "Exam Scores: " + '\n' +
                '\t' + "Exam 1 -> 20.1" + '\n' +
                '\t' + "Exam 2 -> 40.1" +'\n' +
                '\t' +"Exam 3 -> 10.1" +'\n';
        //i dont want it to always output string, make a separate method
        //to output only to string and other for only value

        Assert.assertEquals(expected, student.getExamScores());
    }

    public void testSetExamScore() {
        ArrayList<Double> score = new ArrayList<Double>();
        score.add(20.1);
        score.add(40.1);
        score.add(0.0);

        String expected = "Exam Scores: " + '\n' +
                '\t' + "Exam 1 -> 20.1" + '\n' +
                '\t' + "Exam 2 -> 40.1" +'\n' +
                '\t' +"Exam 3 -> 10.1" +'\n';

        Student student = new Student("Stinky", "McStinky", score);
        student.setExamScore(2, 10.1);
        Assert.assertEquals(expected, student.getExamScores());
    }

    public void testGetAverageExamScore() {
        ArrayList<Double> score = new ArrayList<Double>();
        score.add(0, 20.1);
        score.add(1, 40.1);

        Student student = new Student("Stinky", "McStinky", score);
        Assert.assertEquals(30.1, student.getAverageExamScore());
    }
}