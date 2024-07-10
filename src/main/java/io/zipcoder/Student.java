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

    public ArrayList<Double> getExamScores() {
        for (double score : examScores){
            System.out.println("Exam " + score+1 + " -> " + examScores.get((int) score));
        }
        return examScores;
    }
    public int getNumberOfExamsTaken(){
        return examScores.size();
    }
    public void addExamScore (double examScore){
        if (this.examScores.isEmpty()){
            examScores.add(0,0.0);
            examScores.add(1,0.0);
            examScores.add(2,0.0);
            examScores.add(3,0.0);
        }

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
        for (double score : examScores){
            sum = sum + examScores.get((int) score);
        }
        return sum/examScores.size();
    }

    @Override
    public String toString() {
        return "Student Name: " +
                "firstName='" + firstName + lastName+ '\n' +
                "> Average Score: " + getAverageExamScore() + '\n' +
                getExamScores();
    }

    @Override
    public int compareTo(Object otherStudents) {
        return 0;
    }
}
