package io.zipcoder;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;

public class ClassroomTest extends TestCase {

    public void testMaxStudentsConstructor(){
        int expected = 12;

        Classroom classroom = new Classroom(expected);
        int actual = classroom.getStudents().length;

        Assert.assertEquals(expected, actual);
    }

    public void testNullConstructor(){
        int expected = 30;

        Classroom classroom = new Classroom(expected);
        int actual = classroom.getStudents().length;

        Assert.assertEquals(expected, actual);
    }


    public void testGetStudents() {

        Student nafNoodle = new Student("Naf", "Noodle", null);
        Student dipDoodle = new Student("Dip", "doodle", null);
        Student[] students = {nafNoodle, dipDoodle};
        Classroom classroom = new Classroom(students);

        Assert.assertEquals(classroom.getStudents(), students);
    }

    public void testGetAverageExamScore() {
        ArrayList<Double> nafScores = new ArrayList<>();
        nafScores.add(20.0);
        nafScores.add(121.2);
        ArrayList<Double> dipScores = new ArrayList<>();
        nafScores.add(3.1);
        nafScores.add(12.3);

        Student nafNoodle = new Student("Naf", "Noodle", nafScores);
        Student dipDoodle = new Student("Dip", "doodle", dipScores);
        Student[] students = {nafNoodle, dipDoodle};
        Classroom classroom = new Classroom(students);
        double expected = (nafNoodle.getAverageExamScore() + dipDoodle.getAverageExamScore()) /2;

        Assert.assertEquals(expected, classroom.getAverageExamScore(), 0.5);
    }

    public void testAddStudent() {
        ArrayList<Double> nafScores = new ArrayList<>();
        nafScores.add(20.0);
        nafScores.add(121.2);
        Student nafNoodle = new Student("Naf", "Noodle", nafScores);

        Classroom classroom = new Classroom(1);
        classroom.addStudent(nafNoodle);

       String expected = "Exam Scores: " + '\n' +
                '\t' + "Exam 1 -> 20.0" + '\n' +
                '\t' + "Exam 2 -> 121.2" +'\n';
        Assert.assertEquals(expected, classroom.getStudents()[0].getExamScores());
    }

    public void testRemoveStudent(){
        ArrayList<Double> nafScores = new ArrayList<>();
        nafScores.add(20.0);
        nafScores.add(121.2);
        ArrayList<Double> dipScores = new ArrayList<>();
        dipScores.add(3.1);
        dipScores.add(12.3);
        Student nafNoodle = new Student("Naf", "Noodle", nafScores);
        Student dipDoodle = new Student("Dip", "doodle", dipScores);

        Classroom classroom = new Classroom(2);
        classroom.addStudent(nafNoodle);
        classroom.addStudent(dipDoodle);
        classroom.removeStudent("Dip", "doodle");



        Assert.assertEquals(1, classroom.getStudents().length);
    }

    public void testSortStudentByScore() {
        ArrayList<Double> nafScores = new ArrayList<>();
        nafScores.add(20.0);
        ArrayList<Double> dipScores = new ArrayList<>();
        dipScores.add(3.1);
        Student nafNoodle = new Student("Naf", "Noodle", nafScores);
        Student dipDoodle = new Student("Dip", "doodle", dipScores);

        Classroom classroom = new Classroom(new Student[]{dipDoodle, nafNoodle});

        Student[] actual = classroom.getStudentsByScore();

        Assert.assertEquals("Dip", actual[0].getFirstName());

    }


}
