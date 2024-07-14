package io.zipcoder;

import java.util.ArrayList;

public class Student implements Comparable{
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public Student() {
        ArrayList<Double> scores = new ArrayList<>(5);
        examScores = scores;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExamScores() {
        String examScoresString = "Exam Scores: " + '\n';

        for (int i = 0; i < this.examScores.size(); i++) {
            examScoresString += '\t' + "Exam " + (i+1) + " -> " + examScores.get(i) + '\n';
        }

//        for (double score : examScores) {
//            System.out.println("Exam " +  + " -> " + examScores.get((int) score));
//        }
        return examScoresString;
    }
    public int getNumberOfExamsTaken(){
        return examScores.size();
    }
    public void addExamScore (double examScore){
        examScores.add(examScore);
    }
    public void setExamScore (int examNumber, double newScore){
        examScores.set(examNumber,newScore);
    }
    public double getAverageExamScore(){
        double sum = 0;
        if (examScores.isEmpty()){
            return 0.0;
        }
        for (int i = 0; i < examScores.size(); i++){
            sum = sum + examScores.get(i);
        }
        return sum / examScores.size();
    }

    @Override
    public String toString() {
        return "Student Name:" +
                "firstName='" + firstName  +
                ", lastName='" + lastName + '\n' +
                " Average Score: " + getAverageExamScore() + '\n' +
                getExamScores();
    }

    @Override
    public int compareTo(Object otherStudents) {
        Student otherStudent = (Student) otherStudents;
        if (this.getAverageExamScore() > otherStudent.getAverageExamScore()) {
            return 1;
        } else if (this.getAverageExamScore() == otherStudent.getAverageExamScore()) {

            return 0;
        }
        return -1;

        //use this to compare the examscores
        //compare one student's examscore to another
    }
}
