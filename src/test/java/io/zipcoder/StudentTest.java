package io.zipcoder;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;

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
        score.add(20.1);
        score.add(40.1);

        Student student = new Student("Stinky", "McStinky", score);
        Assert.assertEquals(50.2, student.getExamScores());
    }

    public void testGetNumberOfExamsTaken() {
        ArrayList<Double> score = new ArrayList<>(2);
        score.add(0, 20.1);
        score.add(1, 40.1);

        Student student = new Student("Stinky", "McStinky", score);
        Assert.assertEquals(2, student.getNumberOfExamsTaken());
    }

    public void testAddExamScore() {
        ArrayList<Double> score = new ArrayList<>(3);
        score.add(0, 20.1);
        score.add(1, 40.1);

        Student student = new Student("Stinky", "McStinky", score);
        student.addExamScore(10.1);
        Assert.assertEquals(70.3, student.getExamScores());
    }

    public void testSetExamScore() {
        ArrayList<Double> score = new ArrayList<>(2);
        score.add(0, 20.1);
        score.add(1, 40.1);

        Student student = new Student("Stinky", "McStinky", score);
        student.setExamScore(2, 10.1);
        Assert.assertEquals(70.3, student.getExamScores());
    }

    public void testGetAverageExamScore() {
        ArrayList<Double> score = new ArrayList<>(22);
        score.add(0, 20.1);
        score.add(1, 40.1);

        Student student = new Student("Stinky", "McStinky", score);
        Assert.assertEquals(30.1, student.getAverageExamScore());
    }
}